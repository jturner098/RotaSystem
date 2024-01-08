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
        String sql = "SELECT * FROM tblstaff;";
        
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
        String sql = "SELECT shiftid, staffid, tblshift.locationid, location, shiftdate, starttime, endtime "
                + "FROM tblshift, tbllocation "
                + "WHERE staffid = '" + staffid + "' "
                + "AND tblshift.locationid = tbllocation.locationid "
                + "ORDER BY shiftdate ASC;";

        return DAO.ExecuteQuery(sql);
        }
    
    public static ResultSet UserShiftsBetweenDates(int staffid, String startDate, String endDate) throws SQLException {
        String sql = "SELECT shiftid, staffid, tblshift.locationid, location, shiftdate, starttime, endtime "
                + "FROM tblshift, tbllocation "
                + "WHERE staffid = '" + staffid + "' "
                + "AND tblshift.locationid = tbllocation.locationid "
                + "AND shiftdate BETWEEN '" + startDate + "' AND '" + endDate + "' "
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
    
    public static int SubmitRequest(int staffID, String startDate, String endDate, String reason) throws SQLException {
        
        String sql = "INSERT INTO tbltimeoffrequests(staffid, requeststartdate, requestenddate, reason) "
                + "VALUES('" + staffID + "', '" + startDate + "', '" + endDate + "', '" + reason + "');";
        
        
        Connection con = DriverManager.getConnection(CONN_URL + DB_NAME, USER, PASSWORD);
        System.out.println("Connection Made");
        Statement st = con.createStatement();
        int result = st.executeUpdate(sql);
        return result;        
    }
    
    public static ResultSet GenerateStaffList() throws SQLException {
        String sql = "SELECT staffid, surname, firstname FROM tblstaff;";
        
        return DAO.ExecuteQuery(sql);
    }
    
    public static ResultSet CalculateStaffPay(int staffID) throws SQLException {
        String sql = "SELECT starttime, endtime, firstname, surname, tblstaff.staffid, rateofpay "
                + "FROM tblshift, tblstaff "
                + "WHERE tblstaff.staffid = " + staffID + " "
                + "AND tblshift.staffid = tblstaff.staffid;";

        return DAO.ExecuteQuery(sql);
    }
    
    public static ResultSet SecurityQuestions() throws SQLException {
        String sql = "SELECT securityquestion "
                + "FROM tblsecurityquestion;";
        
        return DAO.ExecuteQuery(sql);
    }
    
    public static int CreateUser(String firstname, String surname, String username, String password, String secQ, String secQAnswer) throws SQLException{
        int secqid = DAO.ReturnSecQID(secQ);
        String sql = "INSERT INTO tblstaff(surname, firstname, username, userpassword, secqid, secqanswer, rateofpay, userlevel) " +
                "VALUES ('" + surname + "', '" + firstname + "', '" + username + "', '" + password + "', " + secqid + ", '" + secQAnswer + "', 6.50, 'Staff');";
        
        Connection con = DriverManager.getConnection(CONN_URL + DB_NAME, USER, PASSWORD);
        Statement st = con.createStatement();
        int result = st.executeUpdate(sql);
        return result; 
    }

    public static int ReturnSecQID(String secQ) throws SQLException{
        int secqid = 0;
        String sql = "SELECT securityquestionid " +
                "FROM tblsecurityquestion " +
                "WHERE securityquestion = '" + secQ + "';";
        ResultSet rs = DAO.ExecuteQuery(sql);
        
        while (rs.next()) {
            secqid = rs.getInt("securityquestionid");
        }
        return secqid;
    }
    
    public static int ReturnStaffID(String firstName, String surname) throws SQLException{
         int staffid = 0;
         ResultSet rs = DAO.ExecuteQuery("SELECT staffid FROM tblstaff WHERE firstname = '" + firstName + "' AND surname = '" + surname + "';");
         while (rs.next()) {
            staffid = rs.getInt("staffid");
         }
         
         return staffid;
    }
    
    
    public static boolean CheckUsernames(String username) throws SQLException{
        boolean matching = false;
        ResultSet rs = DAO.ExecuteQuery("SELECT username FROM tblstaff;");
        while (rs.next()) {
            String dbUser = rs.getString("username");
            if (dbUser.equals(username)) {
                matching = true;      
            }
        }
        return matching;
    }
    
    public static ResultSet ReturnSecQ(String username)  throws SQLException {
        String sql = "SELECT secqid, securityquestion, secqanswer "
                + "FROM tblstaff, tblsecurityquestion "
                + "WHERE tblstaff.username = '" + username + "' "
                + "AND tblstaff.secqid = tblsecurityquestion.securityquestionid;";
                return DAO.ExecuteQuery(sql);
    }
    
    public static int ChangePassword(String username, String password) throws SQLException {
        String sql = "UPDATE tblstaff "
                + "SET userpassword = '" + password + "' "
                + "WHERE username = '" + username + "';";
        
        Connection con = DriverManager.getConnection(CONN_URL + DB_NAME, USER, PASSWORD);
        Statement st = con.createStatement();
        int result = st.executeUpdate(sql);
        return result;             
    }
    
    public static ResultSet NewRequests() throws SQLException {
        String sql = "SELECT requestid, tblstaff.staffid, firstname, surname, tbltimeoffrequests.requestid, requeststartdate, requestenddate, reason "
                + "FROM tblstaff, tbltimeoffrequests "
                + "WHERE tblstaff.staffid = tbltimeoffrequests.staffid "
                + "ORDER BY requestid DESC;";

        return DAO.ExecuteQuery(sql);
    }
    
    
    public static float CalculateHoursWorked(String startTime, String endTime) {
        String[] startTimeParts = startTime.split(":");
        String[] endTimeParts = endTime.split(":");
        
        float startTimeHours = Integer.valueOf(startTimeParts[0]) + (Integer.valueOf(startTimeParts[1]) / 60);
        float endTimeHours = Integer.valueOf(endTimeParts[0]) + (Integer.valueOf(endTimeParts[1]) / 60);
        float hoursWorked = endTimeHours - startTimeHours;
        return hoursWorked;
    }
    
    public static ResultSet GenerateLocations() throws SQLException {
        String sql = "SELECT * FROM tbllocation";
        
        return DAO.ExecuteQuery(sql);
    }
    
    public static ResultSet UpcomingHoliday(int staffID) throws SQLException {
        LocalDate date = LocalDate.now(); 
        String sql = "SELECT staffid, requeststartdate, requestenddate, reason "
                + "FROM tbltimeoffrequests "
                + "WHERE requeststatus = 'Approved' "
                + "AND staffid = " + staffID + " "
                + "AND requeststartdate BETWEEN '" + date + "' AND '" + date.plusDays(30) + "';";
        
        return DAO.ExecuteQuery(sql);
    }
    
    public static int SubmitShift(int staffID, int locationID, String date, String startTime, String endTime) throws SQLException {
        
        String sql = "INSERT INTO tblshift(staffid, locationid, starttime, endtime, shiftdate) "
                + "VALUES('" + staffID + "', '" + locationID + "', '" + startTime + "', '" + endTime + "', '" + date + "');";
        
        
        Connection con = DriverManager.getConnection(CONN_URL + DB_NAME, USER, PASSWORD);
        System.out.println("Connection Made");
        Statement st = con.createStatement();
        int result = st.executeUpdate(sql);

        return result;        
    }
        
        public static int UpdateShift(String[] shift) throws SQLException {
        int locationID = DAO.ReturnLocationID(shift[4]);
        String sql = "UPDATE tblshift "
                + "SET shiftdate = '" + shift[1] + "', starttime = '" + shift[2] + "', endtime = '" + shift[3] + "', locationid = '" + locationID + "' "
                + "WHERE shiftid = '" + shift[0] + "';";
        
        
        Connection con = DriverManager.getConnection(CONN_URL + DB_NAME, USER, PASSWORD);
        System.out.println("Connection Made");
        Statement st = con.createStatement();
        int result = st.executeUpdate(sql);

        return result;              
        }
        
        public static int ReturnLocationID(String location) throws SQLException {
        int locationID = 0;
        String sql = "SELECT locationid " +
                "FROM tbllocation " +
                "WHERE location = '" + location + "';";
        ResultSet rs = DAO.ExecuteQuery(sql);
        
        while (rs.next()) {
            locationID = rs.getInt("locationid");
        }
        return locationID;
        }
        
        public static ResultSet GetRequests() throws SQLException {
            String sql = "SELECT requestid, tblstaff.staffid, firstname, surname, tbltimeoffrequests.requestid, requeststartdate, "
                + "requestenddate, reason, requeststatus "
                + "FROM tblstaff, tbltimeoffrequests "
                + "WHERE tblstaff.staffid = tbltimeoffrequests.staffid "
                + "AND requeststatus = '';";
                

            return DAO.ExecuteQuery(sql);
        }
        
        public static int DeleteRequest(int requestID) throws SQLException {
            String sql = "DELETE FROM tbltimeoffrequests "
                    + "WHERE requestid = '" + requestID + "';";
            
            Connection con = DriverManager.getConnection(CONN_URL + DB_NAME, USER, PASSWORD);
            System.out.println("Connection Made");
            Statement st = con.createStatement();
            int result = st.executeUpdate(sql);

        return result; 
        }
        
        public static int UpdateRequest(String[] request) throws SQLException {
        String sql = "UPDATE tbltimeoffrequests "
                + "SET staffid = '" + request[1] + "', requeststartdate = '" + request[2] 
                + "', requestenddate = '" + request[3] + "', reason = '" + request[4] + "', requeststatus = '" + request[5] + "' "
                + "WHERE requestid = '" + request[0] + "';";
        
        Connection con = DriverManager.getConnection(CONN_URL + DB_NAME, USER, PASSWORD);
        System.out.println("Connection Made");
        Statement st = con.createStatement();
        int result = st.executeUpdate(sql);

        return result; 
        }
        
        

    
    }

    


