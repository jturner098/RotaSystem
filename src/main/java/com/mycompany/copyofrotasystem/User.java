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
    private int staffID;
    private String firstName;
    private String surname;
    private String username;
    private String password;
    private int securityQID;
    private String securityQAnswer;
    private float rateOfPay;
    private String userLevel;
    
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
    
    public String getFirstName() {
        return firstName;
    }
}
