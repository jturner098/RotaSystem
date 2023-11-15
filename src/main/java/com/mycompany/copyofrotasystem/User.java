/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.copyofrotasystem;

/**
 *
 * @author josephturner
 */
public class User {
    private static int staffID;
    private static String firstName;
    private static String surname;
    private static String username;
    private static String password;
    private static int securityQID;
    private static String securityQAnswer;
    private static float rateOfPay;
    private static String userLevel;
    
    public User(int staffID, String firstName, String surname, String username, String password, int securityQID, String securityQAnswer, float rateOfPay, String userLevel) {
        this.staffID = staffID;
        this.firstName = firstName;
        this.surname = surname;
        this.username = username;
        this.password = password;
        this.securityQID = securityQID;
        this.securityQAnswer = securityQAnswer;
        this.rateOfPay = rateOfPay;
        this.userLevel = userLevel;
    }
    
    public User(int staffID, String firstName, String surname, String username, String password, int securityQID, String securityQAnswer) {
        this.staffID = staffID;
        this.firstName = firstName;
        this.surname = surname;
        this.username = username;
        this.password = password;
        this.securityQID = securityQID;
        this.securityQAnswer = securityQAnswer;
    }

    public String getFirstName() {
        return firstName;
    }
    
    public int getID() {
        return staffID;
    }
    
}
