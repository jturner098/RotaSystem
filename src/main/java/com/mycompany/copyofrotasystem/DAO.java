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
        Connection con = DriverManager.getConnection(CONN_URL + DB_NAME, USER, PASSWORD); // Establish a connection to the SQL database using the login details
        Statement st = con.createStatement(); // Create a statement to be run in the SQL server
        ResultSet rs = st.executeQuery(sql); // Store the records generated from running the statement
        return rs;  // Returns the ResultSet      
    }
    public static ResultSet GetUserDetails() throws SQLException {
        String sql = "SELECT * FROM tblstaff;"; // Select all of the details for each record in the Staff table
        
        return DAO.ExecuteQuery(sql);
    }
   
    public static ResultSet UpcomingShifts(int staffid) throws SQLException {
        LocalDate date = LocalDate.now(); // Stores the current date
        String sql = "SELECT staffid, tblshift.locationid, location, shiftdate, starttime, endtime " // Select shift details for each record in the Shift and Location table
                + "FROM tblshift, tbllocation "
                + "WHERE staffid = '" + staffid + "' " // Where staffID matches the user that's logged in
                + "AND tblshift.locationid = tbllocation.locationid "
                + "AND shiftdate BETWEEN '" + date + "' AND '" + (date.plusDays(7) + "'" // Where shift is in the next 7 days
                + "ORDER BY shiftdate ASC;"); // Sort in date order

        return DAO.ExecuteQuery(sql);
        }
    
    public static ResultSet UserShifts(int staffid) throws SQLException {
        String sql = "SELECT shiftid, staffid, tblshift.locationid, location, shiftdate, starttime, endtime " // Select shift details for each record in the Shift and Location table
                + "FROM tblshift, tbllocation "
                + "WHERE staffid = '" + staffid + "' " // Where staffID matches the user that's logged in
                + "AND tblshift.locationid = tbllocation.locationid "
                + "ORDER BY shiftdate ASC;"; // Sort in date order

        return DAO.ExecuteQuery(sql);
        }
    
    public static ResultSet UserShiftsBetweenDates(int staffid, String startDate, String endDate) throws SQLException {
        String sql = "SELECT shiftid, staffid, tblshift.locationid, location, shiftdate, starttime, endtime " // Select shift details for each record in the Shift and Location table
                + "FROM tblshift, tbllocation "
                + "WHERE staffid = '" + staffid + "' " // Where staffID matches the user that's logged in
                + "AND tblshift.locationid = tbllocation.locationid "
                + "AND shiftdate BETWEEN '" + startDate + "' AND '" + endDate + "' " // Where shift is between the two dates given as parameters by the user
                + "ORDER BY shiftdate ASC;"; // Sort in date order

        return DAO.ExecuteQuery(sql);
        }
    
    public static ResultSet RotaShifts(String date) throws SQLException {
        String sql = "SELECT tblshift.shiftid, tblstaff.firstname, tblstaff.surname, tblshift.locationid, location, shiftdate, starttime, endtime " // Select shift details for each record in the Shift, Location and User table
                + "FROM tblshift, tbllocation, tblstaff "
                + "WHERE tblshift.locationid = tbllocation.locationid "
                + "AND tblshift.staffid = tblstaff.staffid "
                + "AND shiftdate = '" + date + "';"; // Where shift is on the date given as a parameter by the user
        
        return DAO.ExecuteQuery(sql); 
    }
    
    public static int SubmitRequest(User user, String startDate, String endDate, String reason) throws SQLException {
        
        String sql = "INSERT INTO tbltimeoffrequests(staffid, requeststartdate, requestenddate, reason) "
                + "VALUES('" + user.getID() + "', '" + startDate + "', '" + endDate + "', '" + reason + "');"; // Insert new Holiday Request into database
        
        
        Connection con = DriverManager.getConnection(CONN_URL + DB_NAME, USER, PASSWORD); // Establish a connection to the SQL database using the login details
        Statement st = con.createStatement(); // Create a statement to be run in the SQL server
        int result = st.executeUpdate(sql); // Stores whether the statement was executed successfully as an integer - 1 for successful, 0 for unsuccessful
        return result;        
    }
    
    public static int SubmitRequest(int staffID, String startDate, String endDate, String reason) throws SQLException {
        
        String sql = "INSERT INTO tbltimeoffrequests(staffid, requeststartdate, requestenddate, reason) "
                + "VALUES('" + staffID + "', '" + startDate + "', '" + endDate + "', '" + reason + "');"; // Insert new Holiday Request into database
        
        
        Connection con = DriverManager.getConnection(CONN_URL + DB_NAME, USER, PASSWORD); // Establish a connection to the SQL database using the login details
        Statement st = con.createStatement(); // Create a statement to be run in the SQL server
        int result = st.executeUpdate(sql); // Stores whether the statement was executed successfully as an integer - 1 for successful, 0 for unsuccessful
        return result;        
    }
    
    public static ResultSet GenerateStaffList() throws SQLException {
        String sql = "SELECT staffid, surname, firstname FROM tblstaff;"; // Select the staffID, Surname and First name for each record in the Staff table
        
        return DAO.ExecuteQuery(sql);
    }
    
    public static ResultSet CalculateStaffPay(int staffID) throws SQLException {
        String sql = "SELECT starttime, endtime, firstname, surname, tblstaff.staffid, rateofpay " // Seleect shift details for each record in the Shift table
                + "FROM tblshift, tblstaff "
                + "WHERE tblstaff.staffid = " + staffID + " " // Where staffID matches the user that's currently logged in
                + "AND tblshift.staffid = tblstaff.staffid;";

        return DAO.ExecuteQuery(sql);
    }
    
    public static ResultSet SecurityQuestions() throws SQLException {
        String sql = "SELECT securityquestion " // Select the security question for each record in the Security Question table
                + "FROM tblsecurityquestion;";
        
        return DAO.ExecuteQuery(sql);
    }
    
    public static int CreateUser(String firstname, String surname, String username, String password, String secQ, String secQAnswer) throws SQLException{
        int secqid = DAO.ReturnSecQID(secQ); // SQL Statement - Returns the Security Question ID for the Security Question that the user selected
        String sql = "INSERT INTO tblstaff(surname, firstname, username, userpassword, secqid, secqanswer, rateofpay, userlevel) " + // Inserts new User into database
                "VALUES ('" + surname + "', '" + firstname + "', '" + username + "', '" + password + "', " + secqid + ", '" + secQAnswer + "', 6.50, 'Staff');";
        
        Connection con = DriverManager.getConnection(CONN_URL + DB_NAME, USER, PASSWORD); // Establish a connection to the SQL database using the login details
        Statement st = con.createStatement(); // Create a statement to be run in the SQL server
        int result = st.executeUpdate(sql); // Stores whether the statement was executed successfully as an integer - 1 for successful, 0 for unsuccessful
        return result; 
    }

    public static int ReturnSecQID(String secQ) throws SQLException{
        int secqid = 0;
        String sql = "SELECT securityquestionid " + // Select the ID for each record in the Security Question table
                "FROM tblsecurityquestion " +
                "WHERE securityquestion = '" + secQ + "';"; // Where security question matches the question that the user selected during sign up
        ResultSet rs = DAO.ExecuteQuery(sql);
        
        while (rs.next()) {
            secqid = rs.getInt("securityquestionid"); // Security Question ID is equal to the ID of the security question selected by the user
        }
        return secqid; // Return the ID of the security question
    }
    
    public static int ReturnStaffID(String firstName, String surname) throws SQLException{
         int staffid = 0;
         ResultSet rs = DAO.ExecuteQuery("SELECT staffid " // Select the ID for each record in the Staff table
                 + "FROM tblstaff "
                 + "WHERE firstname = '" + firstName + "' " // Where First Name is the same as the user's first name
                 + "AND surname = '" + surname + "';"); // Where Surname is the same as the user's surname
         while (rs.next()) {
            staffid = rs.getInt("staffid"); // Staff ID is equal to the ID of the user
         }
         
         return staffid;
    }
    
    
    public static boolean CheckUsernames(String username) throws SQLException{
        boolean matching = false;
        ResultSet rs = DAO.ExecuteQuery("SELECT username FROM tblstaff;"); // Select the Username for each record in the Staff table
        while (rs.next()) { // For each username in the table
            String dbUser = rs.getString("username"); // Stores the current username 
            if (dbUser.equals(username)) { // If the username that user entered matches the username currently selected from the table
                matching = true;    
            }
        }
        return matching;
    }
    
    public static ResultSet ReturnSecQ(String username)  throws SQLException {
        String sql = "SELECT secqid, securityquestion, secqanswer " // Select the security question details for each record in the Staff table
                + "FROM tblstaff, tblsecurityquestion "
                + "WHERE tblstaff.username = '" + username + "' " // Where username is the same as the username of the currently logged in user
                + "AND tblstaff.secqid = tblsecurityquestion.securityquestionid;";
                return DAO.ExecuteQuery(sql);
    }
    
    public static int ChangePassword(String username, String password) throws SQLException {
        String sql = "UPDATE tblstaff "
                + "SET userpassword = '" + password + "' " // Change the password to the new password that the user enters
                + "WHERE username = '" + username + "';"; // Only change the password of the logged in user
        
        Connection con = DriverManager.getConnection(CONN_URL + DB_NAME, USER, PASSWORD); // Establish a connection to the SQL database using the login details
        Statement st = con.createStatement(); // Create a statement to be run in the SQL server
        int result = st.executeUpdate(sql); // Stores whether the statement was executed successfully as an integer - 1 for successful, 0 for unsuccessful
        return result;             
    }
    
    public static ResultSet NewRequests() throws SQLException {
        String sql = "SELECT requestid, tblstaff.staffid, firstname, surname, tbltimeoffrequests.requestid, requeststartdate, requestenddate, reason " // Select the request details for each record in the Time Off Request table
                + "FROM tblstaff, tbltimeoffrequests "
                + "WHERE tblstaff.staffid = tbltimeoffrequests.staffid "
                + "ORDER BY requestid DESC;"; // Sort by most recent request

        return DAO.ExecuteQuery(sql);
    }
    
    
    public static float CalculateHoursWorked(String startTime, String endTime) {
        String[] startTimeParts = startTime.split(":"); // Splits the start time into the hours and minutes
        String[] endTimeParts = endTime.split(":"); // Splits the end time into the hours and minutes
        
        float startTimeHours = Integer.valueOf(startTimeParts[0]) + (Integer.valueOf(startTimeParts[1]) / 60); // Converts the start time into a float value
        float endTimeHours = Integer.valueOf(endTimeParts[0]) + (Integer.valueOf(endTimeParts[1]) / 60); // Comverts the end time into a float value
        float hoursWorked = endTimeHours - startTimeHours; // Subtract start time from end time to work out number of hours worked during a shift
        return hoursWorked;
    }
    
    public static ResultSet GenerateLocations() throws SQLException {
        String sql = "SELECT * FROM tbllocation"; // Select all of the details for each record in the Location table
        
        return DAO.ExecuteQuery(sql);
    }
    
    public static ResultSet UpcomingHoliday(int staffID) throws SQLException {
        LocalDate date = LocalDate.now(); // Stores the current date
        String sql = "SELECT staffid, requeststartdate, requestenddate, reason " // Select the request details for each record in the Requests table
                + "FROM tbltimeoffrequests "
                + "WHERE requeststatus = 'Approved' " // Where the request has been approved
                + "AND staffid = " + staffID + " " // Where Staff ID matches the staff member's ID
                + "AND requeststartdate BETWEEN '" + date + "' AND '" + date.plusDays(30) + "';"; // Where requests are within the next month
        
        return DAO.ExecuteQuery(sql);
    }
    
    public static int SubmitShift(int staffID, int locationID, String date, String startTime, String endTime) throws SQLException {
        
        String sql = "INSERT INTO tblshift(staffid, locationid, starttime, endtime, shiftdate) " // Insert new Shift into database
                + "VALUES('" + staffID + "', '" + locationID + "', '" + startTime + "', '" + endTime + "', '" + date + "');";
        
        
        Connection con = DriverManager.getConnection(CONN_URL + DB_NAME, USER, PASSWORD); // Establish a connection to the SQL database using the login details 
        Statement st = con.createStatement(); // Create a statement to be run in the SQL server
        int result = st.executeUpdate(sql); // Stores whether the statement was executed successfully as an integer - 1 for successful, 0 for unsuccessful

        return result;        
    }
        
        public static int UpdateShift(String[] shift) throws SQLException {
        int locationID = DAO.ReturnLocationID(shift[4]); // SQL Statement - Returns the Location ID for the selected shift
        String sql = "UPDATE tblshift "
                + "SET shiftdate = '" + shift[1] + "', starttime = '" + shift[2] + "', endtime = '" + shift[3] + "', locationid = '" + locationID + "' " // Update all of the shift information
                + "WHERE shiftid = '" + shift[0] + "';"; // Only change the details of the selected shift
        
        
        Connection con = DriverManager.getConnection(CONN_URL + DB_NAME, USER, PASSWORD); // Establish a connection to the SQL database using the login details
        Statement st = con.createStatement(); // Create a statement to be run in the SQL server
        int result = st.executeUpdate(sql); // Stores whether the statement was executed successfully as an integer - 1 for successful, 0 for unsuccessful

        return result;              
        }
        
        public static int ReturnLocationID(String location) throws SQLException {
        int locationID = 0;
        String sql = "SELECT locationid " + // Select the Location ID for each record in the table
                "FROM tbllocation " +
                "WHERE location = '" + location + "';"; // Where location is equal to the location parameter
        ResultSet rs = DAO.ExecuteQuery(sql);
        
        while (rs.next()) { // For each record returned
            locationID = rs.getInt("locationid"); // LocationID is equal to the LocationID from the record
        }
        return locationID;
        }
        
        public static ResultSet GetRequests() throws SQLException {
            String sql = "SELECT requestid, tblstaff.staffid, firstname, surname, tbltimeoffrequests.requestid, requeststartdate, " // Select the request details for each record in the Request table
                + "requestenddate, reason, requeststatus "
                + "FROM tblstaff, tbltimeoffrequests "
                + "WHERE tblstaff.staffid = tbltimeoffrequests.staffid "
                + "AND requeststatus <> 'Approved';"; // Where requests have not been approved yet
                

            return DAO.ExecuteQuery(sql);
        }
        
        public static int DeleteRequest(int requestID) throws SQLException {
            String sql = "DELETE FROM tbltimeoffrequests " // Delete record from Request table
                    + "WHERE requestid = '" + requestID + "';"; // Where Request ID equals the requestID parameter
            
            Connection con = DriverManager.getConnection(CONN_URL + DB_NAME, USER, PASSWORD); // Establish a connection to the SQL database using the login details
            Statement st = con.createStatement(); // Create a statement to be run in the SQL server
            int result = st.executeUpdate(sql); // Stores whether the statement was executed successfully as an integer - 1 for successful, 0 for unsuccessful

        return result; 
        }
        
        public static int UpdateRequest(String[] request) throws SQLException {
        String sql = "UPDATE tbltimeoffrequests "
                + "SET staffid = '" + request[1] + "', requeststartdate = '" + request[2] 
                + "', requestenddate = '" + request[3] + "', reason = '" + request[4] + "', requeststatus = '" + request[5] + "' " // Update all of the shift information
                + "WHERE requestid = '" + request[0] + "';"; // Only change the details of the selected request
        
        Connection con = DriverManager.getConnection(CONN_URL + DB_NAME, USER, PASSWORD); // Establish a connection to the SQL database using the login details
        Statement st = con.createStatement(); // Create a statement to be run in the SQL server
        int result = st.executeUpdate(sql); // Stores whether the statement was executed successfully as an integer - 1 for successful, 0 for unsuccessful

        return result; 
        }
        
        

    
    }

    


