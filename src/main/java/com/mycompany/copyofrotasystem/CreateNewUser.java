/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.copyofrotasystem;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josephturner
 */
public class CreateNewUser extends javax.swing.JFrame {
    DAO db = new DAO(); // Creates an instance of the Database Access Object
    /**
     * Creates new form CreateNewUser
     */
    public CreateNewUser() {
        initComponents();

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NewUserHolidayForm = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        StartDate = new javax.swing.JLabel();
        StartDateField = new javax.swing.JTextField();
        EndDate = new javax.swing.JLabel();
        EndDateField = new javax.swing.JTextField();
        Reason = new javax.swing.JLabel();
        ReasonField = new javax.swing.JTextField();
        btnSubmitHolidayRequest = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        HolidayErrorMessage = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        subPersonalDetails = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        lblSurname = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        FirstNameField = new javax.swing.JTextField();
        SurnameField = new javax.swing.JTextField();
        UsernameField = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        lblConfirmPassword = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        ConfirmPasswordField = new javax.swing.JPasswordField();
        subSecurityQuestion = new javax.swing.JLabel();
        PasswordRequirementBox = new javax.swing.JScrollPane();
        lblPasswordRequirement = new javax.swing.JTextArea();
        lblSecQuestion = new javax.swing.JLabel();
        SecurityQuestionField = new javax.swing.JComboBox<>();
        lblSecQAnswer = new javax.swing.JLabel();
        SecQAnswerField = new javax.swing.JTextField();
        subTimeOff = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        RequestList = new javax.swing.JTable();
        btnAddNewHoliday = new javax.swing.JButton();
        btnCreateNewUser = new javax.swing.JButton();
        ErrorMessage = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();

        NewUserHolidayForm.setSize(new java.awt.Dimension(398, 390));

        jPanel2.setPreferredSize(new java.awt.Dimension(386, 378));
        jPanel2.setSize(new java.awt.Dimension(386, 378));

        StartDate.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        StartDate.setText("Start Date:");

        StartDateField.setBorder(null);

        EndDate.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        EndDate.setText("End Date:");

        EndDateField.setBorder(null);

        Reason.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        Reason.setText("Reason:");

        ReasonField.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        ReasonField.setBorder(null);
        ReasonField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReasonFieldActionPerformed(evt);
            }
        });

        btnSubmitHolidayRequest.setBackground(new java.awt.Color(128, 191, 180));
        btnSubmitHolidayRequest.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btnSubmitHolidayRequest.setText("Submit");
        btnSubmitHolidayRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitHolidayRequestActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel1.setText("Dates must be written in the form YYYY-MM-DD");

        HolidayErrorMessage.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        HolidayErrorMessage.setForeground(new java.awt.Color(255, 0, 0));

        btnBack.setBackground(new java.awt.Color(128, 191, 180));
        btnBack.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(HolidayErrorMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSubmitHolidayRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(EndDate)
                                    .addComponent(Reason))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(EndDateField)
                                    .addComponent(ReasonField, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(StartDate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(StartDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel1))))
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StartDate)
                    .addComponent(StartDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EndDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EndDate))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Reason)
                    .addComponent(ReasonField, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HolidayErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubmitHolidayRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout NewUserHolidayFormLayout = new javax.swing.GroupLayout(NewUserHolidayForm.getContentPane());
        NewUserHolidayForm.getContentPane().setLayout(NewUserHolidayFormLayout);
        NewUserHolidayFormLayout.setHorizontalGroup(
            NewUserHolidayFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewUserHolidayFormLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        NewUserHolidayFormLayout.setVerticalGroup(
            NewUserHolidayFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewUserHolidayFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(900, 700));

        Title.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        Title.setText("New User - Details");

        subPersonalDetails.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        subPersonalDetails.setText("Personal Details");

        lblFirstName.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lblFirstName.setText("First Name:");

        lblSurname.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lblSurname.setText("Surname:");

        lblUsername.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lblUsername.setText("Username:");

        lblPassword.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lblPassword.setText("Password:");

        lblConfirmPassword.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lblConfirmPassword.setText("Confirm Password:");

        subSecurityQuestion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        subSecurityQuestion.setText("Security Question");

        lblPasswordRequirement.setEditable(false);
        lblPasswordRequirement.setColumns(20);
        lblPasswordRequirement.setRows(5);
        lblPasswordRequirement.setText("Your password must contain:\n- 8+ Characters\n- An uppercase character\n- A number\n- A special character");
        PasswordRequirementBox.setViewportView(lblPasswordRequirement);

        lblSecQuestion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lblSecQuestion.setText("Select a Question:");

        lblSecQAnswer.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        lblSecQAnswer.setText("Answer:");
        lblSecQAnswer.setToolTipText("");

        subTimeOff.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        subTimeOff.setText("Pre-existing Holidays and Time Off");

        RequestList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Start Date", "End Date", "Reason"
            }
        ));
        jScrollPane1.setViewportView(RequestList);

        btnAddNewHoliday.setBackground(new java.awt.Color(128, 191, 180));
        btnAddNewHoliday.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        btnAddNewHoliday.setText("Add New Holiday");
        btnAddNewHoliday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewHolidayActionPerformed(evt);
            }
        });

        btnCreateNewUser.setBackground(new java.awt.Color(128, 191, 180));
        btnCreateNewUser.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btnCreateNewUser.setText("Create New User");
        btnCreateNewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateNewUserActionPerformed(evt);
            }
        });

        ErrorMessage.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        ErrorMessage.setForeground(new java.awt.Color(255, 51, 51));
        ErrorMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ErrorMessage.setToolTipText("");

        BackButton.setBackground(new java.awt.Color(128, 191, 180));
        BackButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        BackButton.setText("Back");
        BackButton.setToolTipText("");
        BackButton.setPreferredSize(new java.awt.Dimension(103, 54));
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(btnAddNewHoliday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPassword)
                            .addComponent(lblFirstName))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(lblConfirmPassword)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ConfirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Title)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(PasswordRequirementBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(FirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(30, 30, 30)
                                            .addComponent(lblSurname)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(subPersonalDetails)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(SurnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(30, 30, 30)
                                                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(subSecurityQuestion)))))
                                .addGap(18, 18, 18)
                                .addComponent(UsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblSecQuestion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SecurityQuestionField, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(lblSecQAnswer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SecQAnswerField, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(92, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(subTimeOff)
                .addGap(220, 220, 220))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(210, 210, 210)
                        .addComponent(btnCreateNewUser, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(ErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Title)
                .addGap(18, 18, 18)
                .addComponent(subPersonalDetails)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstName)
                    .addComponent(lblSurname)
                    .addComponent(FirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SurnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsername)
                    .addComponent(UsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(lblConfirmPassword)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConfirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordRequirementBox, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(subSecurityQuestion)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSecQuestion)
                    .addComponent(SecurityQuestionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSecQAnswer)
                    .addComponent(SecQAnswerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(subTimeOff)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddNewHoliday, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCreateNewUser, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 894, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddNewHolidayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewHolidayActionPerformed
        NewUserHolidayForm.setVisible(true); // Opens the Add New Holiday screen
        jPanel2.setVisible(true); // Opens the Add New Holiday screen
    }//GEN-LAST:event_btnAddNewHolidayActionPerformed

    private void ReasonFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReasonFieldActionPerformed

    }//GEN-LAST:event_ReasonFieldActionPerformed

    private void btnSubmitHolidayRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitHolidayRequestActionPerformed
        try {
            String startDate = StartDateField.getText(); // Gets start date for holiday from Start Date field
            String endDate = EndDateField.getText(); // Gets end date for holiday from Start Date field
            String reason = ReasonField.getText(); // Gets reason for holiday from Start Date field

            if (StartDateField.getText().equals("") || EndDateField.getText().equals("") || ReasonField.getText().equals("")) { // If any of the fields are empty
                HolidayErrorMessage.setText("All fields must be filled!"); // An error message is displayed
            }
            else {
                String[] tableData = {startDate, endDate, reason}; // Stores the information about the holiday request in a string
                DefaultTableModel dtm = (DefaultTableModel) RequestList.getModel(); 
                dtm.addRow(tableData); // Adds request to the Requests table on the Create New User screen
                NewUserHolidayForm.dispose(); // Closes the Add New Holiday Request screen
            }
        } catch(Exception e) {

        }
    }//GEN-LAST:event_btnSubmitHolidayRequestActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            ResultSet rs = db.SecurityQuestions(); // SQL Statement - Selects all of the security questions from the database
            while (rs.next()) {
                String question = rs.getString("securityquestion"); // Creates a string of the security question in the current iteration of the ResultSet
                SecurityQuestionField.addItem(question);  // Adds the security question to the Security Question combo box               
            }
 
        } catch(Exception e) {
            
        }
        
    }//GEN-LAST:event_formWindowOpened

    private void btnCreateNewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateNewUserActionPerformed
    if (FirstNameField.getText().equals("")) { // If the First Name field is empty
        ErrorMessage.setText("Error - First Name is missing!");
    }
    else if (SurnameField.getText().equals("")) { // If the Surname field is empty
        ErrorMessage.setText("Error - Surname is missing!");
    }
    else if (UsernameField.getText().equals("")) { // If the Username field is empty
        ErrorMessage.setText("Error - Username is missing!");
    }
    else try {
        if (db.CheckUsernames(UsernameField.getText()) == true) { // If the Username entered by the user already exists within the database
            ErrorMessage.setText("Error - Username is already in use!");
        }
        else if (PasswordField.getText().equals("")) { // If the Password field is empty
            ErrorMessage.setText("Error - Password is missing!");
        }
        else if (!CheckPassword(PasswordField.getText())) { // If the Password field does not meet the criteria - Checked using CheckPassword method
            ErrorMessage.setText("Error - Password does not meet requirements!");
        }
        else if (!(ConfirmPasswordField.getText().equals(PasswordField.getText()))) { // // If the Password field does not match the Confirm Password field
            ErrorMessage.setText("Error - Passwords must match!");
        }
        else if (SecQAnswerField.getText().equals("")) { // If the Security Question Answer field is empty
            ErrorMessage.setText("Error - Security Question Answer is missing!");
        }
        else {
            String SecQ = (String) SecurityQuestionField.getSelectedItem(); // Stores the security question that the user selected
            try {
                int userSuccess = db.CreateUser(FirstNameField.getText(), SurnameField.getText(), UsernameField.getText(), 
                        PasswordField.getText(), SecQ, SecQAnswerField.getText()); // SQL Statement - Creates a new record in the User table of the database
                if (userSuccess == 1) { // If the record is saved successfully
                    
                    int staffID = db.ReturnStaffID(FirstNameField.getText(), SurnameField.getText()); // SQL Statement - Returns the staffID of the new staff member
                    
                    for (int i = 0; i < RequestList.getRowCount() - 1; i++) { // Iterates through the list of holiday requests submitted by the user
                        DefaultTableModel dtm = (DefaultTableModel)RequestList.getModel();
                        String startDate = (dtm.getValueAt(i, 0).toString()); // Stores Start Date of holiday request in current iteration of the for loop
                        String endDate = (dtm.getValueAt(i, 1).toString()); // Stores End Date of holiday request in current iteration of the for loop
                        String reason = (dtm.getValueAt(i, 2).toString()); // Stores reason for holiday request in current iteration of the for loop
                        db.SubmitRequest(staffID, startDate, endDate, reason); // SQL Statement - Creates a new record in the Holiday Request table of the database
                        
                    }
                    LoginScreen ls = new LoginScreen(); // Creates a new instance of the Login Screen
                    ls.setVisible(true); // Makes the Login Screen visible
                    dispose(); // Closes the Create New User screen
                } else { 
                    ErrorMessage.setText("Error inserting into database!"); // Displays an error message if the user record is not inserted into the database
                }
            } catch(Exception e) {
                ErrorMessage.setText(e.getMessage()); // Displays any SQL errors that occur
            }
        }
    } catch (SQLException ex) {
        Logger.getLogger(CreateNewUser.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnCreateNewUserActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        LoginScreen ls = new LoginScreen(); // Creates a new instance of the Login Screen
        ls.setVisible(true); // Makes the Login Screen visible
        this.dispose(); // Closes the Create New User screen
    }//GEN-LAST:event_BackButtonActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        NewUserHolidayForm.setVisible(false); // Closes the Add New Holiday screen
        jPanel2.setVisible(false); // Closes the Add New Holiday screen
    }//GEN-LAST:event_btnBackActionPerformed
    
    private boolean CheckPassword(String password) {
        Boolean uppercase = false;
        Boolean number = false;
        Boolean special = false;
        Boolean length = false;
        if (password.length() >= 8) {
            length = true; // If the password is longer than or equal to 8 characters, it meets the length check
        } else {
            return false;
        }
        char[] characters = password.toCharArray(); // Turns the user's password into a character array
        for (char character : characters) { // For every character in the password
            if (Character.isUpperCase(character)) {
                uppercase = true; // If the character is an uppercase letter, the password meets the uppercase check
            }
            if (Character.isDigit(character)) {
                number = true; // If the character is a digit, the password meets the number check
            }
            if (!Character.isLetterOrDigit(character)) {
                special = true; // If the character isn't a letter or digit, it is a character, sothe password meets the special character check
            }
        }
        if (uppercase == true && number == true && special == true && length == true) {
            return true; // If all the checks are met, the password is accepted
        } else {
            return false; // If not all the checks are met, the password is rejected
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreateNewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateNewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateNewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateNewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateNewUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JPasswordField ConfirmPasswordField;
    private javax.swing.JLabel EndDate;
    private javax.swing.JTextField EndDateField;
    private javax.swing.JLabel ErrorMessage;
    private javax.swing.JTextField FirstNameField;
    private javax.swing.JLabel HolidayErrorMessage;
    private javax.swing.JFrame NewUserHolidayForm;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JScrollPane PasswordRequirementBox;
    private javax.swing.JLabel Reason;
    private javax.swing.JTextField ReasonField;
    private javax.swing.JTable RequestList;
    private javax.swing.JTextField SecQAnswerField;
    private javax.swing.JComboBox<String> SecurityQuestionField;
    private javax.swing.JLabel StartDate;
    private javax.swing.JTextField StartDateField;
    private javax.swing.JTextField SurnameField;
    private javax.swing.JLabel Title;
    private javax.swing.JTextField UsernameField;
    private javax.swing.JButton btnAddNewHoliday;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateNewUser;
    private javax.swing.JButton btnSubmitHolidayRequest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblConfirmPassword;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JTextArea lblPasswordRequirement;
    private javax.swing.JLabel lblSecQAnswer;
    private javax.swing.JLabel lblSecQuestion;
    private javax.swing.JLabel lblSurname;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel subPersonalDetails;
    private javax.swing.JLabel subSecurityQuestion;
    private javax.swing.JLabel subTimeOff;
    // End of variables declaration//GEN-END:variables
}
