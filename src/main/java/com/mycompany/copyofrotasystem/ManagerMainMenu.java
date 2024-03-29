/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.copyofrotasystem;


import javax.swing.*;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josephturner
 */
public class ManagerMainMenu extends javax.swing.JFrame {
    DAO db = new DAO();
    static User user;
    /**
     * Creates new form StaffMainMenu
     */
    public ManagerMainMenu(User user) {
        initComponents();
        this.user = user;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        NewTimeOffHeader = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        RequestList = new javax.swing.JTable();
        Title = new javax.swing.JLabel();
        btnViewRota = new javax.swing.JButton();
        btnReviewHolidayRequests = new javax.swing.JButton();
        btnCalculateStaffPay = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnEditRota = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        NewTimeOffHeader.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        NewTimeOffHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NewTimeOffHeader.setText("New Time Off Requests to Approve:");

        RequestList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Staff Name", "Start Date", "End Date", "Reason"
            }
        ));
        RequestList.setEnabled(false);
        jScrollPane2.setViewportView(RequestList);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(NewTimeOffHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NewTimeOffHeader)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                .addContainerGap())
        );

        Title.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Welcome, [USER]");

        btnViewRota.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        btnViewRota.setText("View Rota");
        btnViewRota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewRotaActionPerformed(evt);
            }
        });

        btnReviewHolidayRequests.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 22)); // NOI18N
        btnReviewHolidayRequests.setText("Review Holiday Requests");
        btnReviewHolidayRequests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReviewHolidayRequestsActionPerformed(evt);
            }
        });

        btnCalculateStaffPay.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        btnCalculateStaffPay.setText("Calculate Staff Pay");
        btnCalculateStaffPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateStaffPayActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(128, 191, 180));
        btnLogout.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnEditRota.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        btnEditRota.setText("Edit Rota");
        btnEditRota.setPreferredSize(new java.awt.Dimension(306, 57));
        btnEditRota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditRotaActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/copyofrotasystem/images/Bayside_Cabin_-_Logo__3_-removebg-preview.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/copyofrotasystem/images/Bayside_Cabin_-_Wordart__1_-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnEditRota, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnViewRota, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnReviewHolidayRequests, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCalculateStaffPay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(243, 243, 243))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(8, 8, 8)))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnViewRota, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnEditRota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnReviewHolidayRequests, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnCalculateStaffPay, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewRotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewRotaActionPerformed
        ManagerRotaView mrv = new ManagerRotaView(user); // Creates an instance of the View Rota screen using the user's details as a parameter
        mrv.setVisible(true); // Makes the View Rota screen visible
        dispose(); // Closes the main menu
    }//GEN-LAST:event_btnViewRotaActionPerformed

    private void btnCalculateStaffPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateStaffPayActionPerformed
       CalculateStaffPay csp = new CalculateStaffPay(user); // Creates an instance of the Calculate Staff Pay screen using the user's details as a parameter
       csp.setVisible(true); // Makes the Calculate Staff Pay screen visible
       dispose(); // Closes the main menu
    }//GEN-LAST:event_btnCalculateStaffPayActionPerformed

    private void btnReviewHolidayRequestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReviewHolidayRequestsActionPerformed
        ReviewHolidayRequests rhr = new ReviewHolidayRequests(user); // Creates an instance of the Review Holiday Requests screen using the user's details as a parameter
        rhr.setVisible(true); // Makes the Review Holiday Requests screen visible
        this.dispose(); // Closes the main menu
    }//GEN-LAST:event_btnReviewHolidayRequestsActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
       LoginScreen login = new LoginScreen(); // Creates a new instance of Login Screen
       login.setVisible(true); // Makes the Login Screen visible
       this.dispose(); // Closes the main menu
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void btnEditRotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditRotaActionPerformed
       EditRota er = new EditRota(user); // Creates a new instance of the Edit Rota screen, using the details of the currently logged in user as a parameter
       er.setVisible(true); // Makes the Edit Rota screen visible
       dispose(); // Closes the main menu
    }//GEN-LAST:event_btnEditRotaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Title.setText("Welcome, " + user.getFirstName());
        try {
            ResultSet rs = db.NewRequests(); // SQL Statement - Selects all unapproved requests from the database
            while (rs.next()) { // For each record selected
                String name = rs.getString("firstname") + " " + rs.getString("surname"); // Store the record's first name and surname as one string
                String startDate = rs.getString("requeststartdate"); // Store the request's start date
                String endDate = rs.getString("requestenddate"); // Store the request's end date
                String reason = rs.getString("reason"); // Store the reason for the request
                String tableData[] = {name, startDate, endDate, reason}; // Store the request details as a string array
                
                
                DefaultTableModel dtm = (DefaultTableModel) RequestList.getModel(); // 
                dtm.addRow(tableData); // Adds request to the table
        }
        } catch(Exception e) {
            
        }
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerMainMenu(user).setVisible(true);
            }
        }); 
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel NewTimeOffHeader;
    private javax.swing.JTable RequestList;
    public javax.swing.JLabel Title;
    private javax.swing.JButton btnCalculateStaffPay;
    private javax.swing.JButton btnEditRota;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnReviewHolidayRequests;
    private javax.swing.JButton btnViewRota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
