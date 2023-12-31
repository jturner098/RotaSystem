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
public class StaffMainMenu extends javax.swing.JFrame {
    DAO db = new DAO();
    static User user;
    /**
     * Creates new form StaffMainMenu
     */
    public StaffMainMenu(User user) {
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
        ShiftsHeader = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ShiftList = new javax.swing.JTable();
        Title = new javax.swing.JLabel();
        btnViewRota = new javax.swing.JButton();
        btnYourShifts = new javax.swing.JButton();
        btnSubmitHolidayRequest = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(710, 520));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        ShiftsHeader.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        ShiftsHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ShiftsHeader.setText("[USER]'s upcoming shifts");

        ShiftList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Start Time", "End Time", "Location"
            }
        ));
        ShiftList.setEnabled(false);
        jScrollPane2.setViewportView(ShiftList);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                    .addComponent(ShiftsHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ShiftsHeader)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        btnYourShifts.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        btnYourShifts.setText("Your Calendar");
        btnYourShifts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYourShiftsActionPerformed(evt);
            }
        });

        btnSubmitHolidayRequest.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        btnSubmitHolidayRequest.setText("Submit Holiday Request");
        btnSubmitHolidayRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitHolidayRequestActionPerformed(evt);
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/copyofrotasystem/images/Bayside_Cabin_-_Logo__3_-removebg-preview.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/copyofrotasystem/images/Bayside_Cabin_-_Wordart__1_-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnViewRota, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSubmitHolidayRequest, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addComponent(btnYourShifts, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnLogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(btnViewRota, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnYourShifts, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnSubmitHolidayRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewRotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewRotaActionPerformed
        StaffRotaView srv = new StaffRotaView(user); // When the view rota button is pressed, the screen is initialised, storing the user details in it
        srv.setVisible(true); // The view rota screen becomes visible
        dispose(); // The main menu will be closed. Should it need to be opened again, the back button can be pressed by the user
    }//GEN-LAST:event_btnViewRotaActionPerformed

    private void btnSubmitHolidayRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitHolidayRequestActionPerformed
       HolidayRequestForm hrf = new HolidayRequestForm(user); // When the submit holidy request button is pressed, the screen is initialised, storing the user details in it
       hrf.setVisible(true); // The holiday request form becomes visible
       dispose(); // The main menu will be closed. Should it need to be opened again, the back button can be pressed by the user
    }//GEN-LAST:event_btnSubmitHolidayRequestActionPerformed

    private void btnYourShiftsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYourShiftsActionPerformed
        YourCalendar calendar = new YourCalendar(user); // When the your shifts button is pressed, the screen is initialised, storing the user details in it
        calendar.setVisible(true); // The your shifts screen becomes visible
        dispose(); // The main menu will be closed. Should it need to be opened again, the back button can be pressed by the user
    }//GEN-LAST:event_btnYourShiftsActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
       LoginScreen login = new LoginScreen();
       login.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Title.setText("Welcome, " + user.getFirstName());
        ShiftsHeader.setText(user.getFirstName() + "'s upcoming shifts");
        try {
            ResultSet rs = db.UpcomingShifts(user.getID());
            System.out.println(rs);
            while (rs.next()) {
                String location = rs.getString("location");
                String date = rs.getString("shiftdate");
                String startTime = rs.getString("starttime");
                String endTime = rs.getString("endtime");
                String tableData[] = {date, startTime, endTime, location};
                
                
                DefaultTableModel dtm = (DefaultTableModel) ShiftList.getModel();
                dtm.addRow(tableData);
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
                new StaffMainMenu(user).setVisible(true);
            }
        }); 
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ShiftList;
    public javax.swing.JLabel ShiftsHeader;
    public javax.swing.JLabel Title;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSubmitHolidayRequest;
    private javax.swing.JButton btnViewRota;
    private javax.swing.JButton btnYourShifts;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
