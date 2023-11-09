/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.copyofrotasystem;
import java.sql.*;
import java.time.LocalDate;

/**
 *
 * @author josephturner
 */
public class DAO {
    private static final String CONN_URL = "jdbc:mysql://computing.gfmat.org:3306/";
    private static final String DB_NAME = "RotaSystem";
    private static final String USER = "2022d_JTurner";
    private static final String PASSWORD = "JBmz8nwJe63FmUcq";
    
    public static ResultSet ExecuteQuery(String sql) throws SQLException {
        Connection con = DriverManager.getConnection(CONN_URL + DB_NAME, USER, PASSWORD);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        return rs;        
    }
    public static ResultSet GetUserDetails() throws SQLException {
        String sql = "SELECT * FROM tblstaff";
        
        return DAO.ExecuteQuery(sql);
    }
   
    public static ResultSet UpcomingShifts(int staffid) throws SQLException {
        LocalDate date = LocalDate.now();
        String sql = "SELECT staffid, tblshift.locationid, location, shiftdate, starttime, endtime "
                + "FROM tblshift, tbllocation "
                + "WHERE staffid = '" + staffid + "' "
                + "AND tblshift.locationid = tbllocation.locationid "
                + "AND shiftdate BETWEEN '" + date + "' AND '" + (date.plusDays(7) + "'"
                + "ORDER BY shiftdate ASC;");

        return DAO.ExecuteQuery(sql);
        }
    
    public static ResultSet UserShifts(int staffid) throws SQLException {
        String sql = "SELECT staffid, tblshift.locationid, location, shiftdate, starttime, endtime "
                + "FROM tblshift, tbllocation "
                + "WHERE staffid = '" + staffid + "' "
                + "AND tblshift.locationid = tbllocation.locationid"
                + "ORDER BY shiftdate ASC;";

        return DAO.ExecuteQuery(sql);
        }
    
    public static ResultSet RotaShifts(String date) throws SQLException {
        String sql = "SELECT tblshift.shiftid, tblstaff.firstname, tblstaff.surname, tblshift.locationid, location, shiftdate, starttime, endtime "
                + "FROM tblshift, tbllocation, tblstaff "
                + "WHERE tblshift.locationid = tbllocation.locationid "
                + "AND tblshift.staffid = tblstaff.staffid "
                + "AND shiftdate = '" + date + "';";
        
        return DAO.ExecuteQuery(sql); 
    }
    
    public static int SubmitRequest(User user, String startDate, String endDate, String reason) throws SQLException {
        
        String sql = "INSERT INTO tbltimeoffrequests(staffid, requeststartdate, requestenddate, reason) "
                + "VALUES('" + user.getID() + "', '" + startDate + "', '" + endDate + "', '" + reason + "');";
        
        
        Connection con = DriverManager.getConnection(CONN_URL + DB_NAME, USER, PASSWORD);
        System.out.println("Connection Made");
        Statement st = con.createStatement();
        int result = st.executeUpdate(sql);
        return result;        
    }
    
    public static ResultSet GenerateStaffList() throws SQLException {
        String sql = "SELECT surname, firstname FROM tblstaff;";
        
        return DAO.ExecuteQuery(sql);
    }
    
    public static ResultSet CalculateStaffPay(String firstname, String surname) throws SQLException {
        String sql = "SELECT starttime, endtime, firstname, surname, staffid, rateofpay "
                + "FROM tblshift, tblstaff "
                + "WHERE firstname = '" + firstname + "' AND surname = '" + surname + "'"
                + "AND tblshift.staffid = tblstaff.staffid;";

        return DAO.ExecuteQuery(sql);
    }
    
    public static ResultSet SecurityQuestions() throws SQLException {
        String sql = "SELECT securityquestion "
                + "FROM tblsecurityquestion";
        
        return DAO.ExecuteQuery(sql);
    }
    
    public static int CreateUser(String firstname, String surname, String username, String password, String secQ, String secQAnswer) throws SQLException{
        int secqid = 0;
        String sql = "SELECT securityquestionid " +
                "FROM tblsecurityquestion " +
                "WHERE securityquestion = '" + secQ + "';";
        ResultSet rs = DAO.ExecuteQuery(sql);
        
        while (rs.next()) {
            secqid = rs.getInt("securityquestionid");
        }
        sql = "INSERT INTO tblstaff(surname, firstname, username, userpassword, secqid, secqanswer, rateofpay, userlevel) " +
                "VALUES ('" + surname + "', '" + firstname + "', '" + username + "', '" + password + "', " + secqid + ", '" + secQAnswer + "', 6.50, 'User';";
        
        Connection con = DriverManager.getConnection(CONN_URL + DB_NAME, USER, PASSWORD);
        Statement st = con.createStatement();
        int result = st.executeUpdate(sql);
        return result; 
    }
    
    }

    


