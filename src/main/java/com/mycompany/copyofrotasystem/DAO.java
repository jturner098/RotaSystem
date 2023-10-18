/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.copyofrotasystem;
import static com.mycompany.copyofrotasystem.HolidayRequestForm.user;
import java.sql.*;

/**
 *
 * @author josephturner
 */
public class DAO {
    private static final String CONN_URL = "jdbc:mysql://computing.gfmat.org:3306/";
    private static final String DB_NAME = "RotaSystem";
    private static final String USER = "2022d_JTurner";
    private static final String PASSWORD = "JBmz8nwJe63FmUcq";
    
    public static ResultSet GetUserDetails() throws SQLException {
        String sql = "SELECT * FROM tblstaff";

        Connection con = DriverManager.getConnection(CONN_URL + DB_NAME, USER, PASSWORD);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        return rs;
     
    }
    
    public static ResultSet UserShifts() throws SQLException {
        String sql = "SELECT tblshift.locationid, location, shiftdate, starttime, endtime FROM tblshift, tbllocation WHERE tblshift.locationid = tbllocation.locationid;";
        
        Connection con = DriverManager.getConnection(CONN_URL + DB_NAME, USER, PASSWORD);
        System.out.println("Connection Made");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        return rs;
        }
    
    public static ResultSet RotaShifts(String date) throws SQLException {
        String sql = "SELECT tblshift.shiftid, tblstaff.firstname, tblstaff.surname, tblshift.locationid, location, shiftdate, starttime, endtime FROM tblshift, tbllocation, tblstaff WHERE tblshift.locationid = tbllocation.locationid AND tblshift.staffid = tblstaff.staffid AND shiftdate = '" + date + "';";
        
        Connection con = DriverManager.getConnection(CONN_URL + DB_NAME, USER, PASSWORD);
        System.out.println("Connection Made");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        return rs; 
    }
    
    public static int SubmitRequest(User user, String startDate, String endDate, String reason) throws SQLException {
        
        String sql = "INSERT INTO tbltimeoffrequests(staffid, requeststartdate, requestenddate, reason) VALUES('" + user.getID() + "', '" + startDate + "', '" + endDate + "', '" + reason + "');";
        
        
        Connection con = DriverManager.getConnection(CONN_URL + DB_NAME, USER, PASSWORD);
        System.out.println("Connection Made");
        Statement st = con.createStatement();
        int result = st.executeUpdate(sql);
        return result;        
    }
    
    }

    


