/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.copyofrotasystem;


import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author josephturner
 */
public class StaffMainMenu extends javax.swing.JFrame {
    String firstName;
    int staffID;
    /**
     * Creates new form StaffMainMenu
     */
    public StaffMainMenu() {
        initComponents();
    }
    
    public void SetName(String name) {
        this.firstName = name;
    }
    
    public String GetName() {
        return firstName;
    }
    
    public void SetID(int id) {
        this.staffID = id;
    }
    
    public int GetID() {
        return staffID;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        ShiftList = new javax.swing.JList<>();
        Title = new javax.swing.JLabel();
        btnViewRota = new javax.swing.JButton();
        btnYourShifts = new javax.swing.JButton();
        btnSubmitHolidayRequest = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ShiftsHeader.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        ShiftsHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ShiftsHeader.setText("[USER]'s shifts");

        jScrollPane1.setViewportView(ShiftList);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(ShiftsHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ShiftsHeader)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
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
        btnYourShifts.setText("Your Shifts");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSubmitHolidayRequest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnYourShifts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(374, 374, 374)
                    .addComponent(btnViewRota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(16, 16, 16)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnYourShifts, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnSubmitHolidayRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(157, 157, 157)
                    .addComponent(btnViewRota, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(306, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewRotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewRotaActionPerformed
        StaffRotaView srv = new StaffRotaView();
        srv.setVisible(true);
        this.setVisible(false);
        srv.SetName(firstName);
        srv.SetID(GetID());
    }//GEN-LAST:event_btnViewRotaActionPerformed

    private void btnSubmitHolidayRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitHolidayRequestActionPerformed
       HolidayRequestForm hrf = new HolidayRequestForm();
       hrf.setVisible(true);
       setVisible(false);
       hrf.SetName(firstName);
       hrf.SetID(GetID());
    }//GEN-LAST:event_btnSubmitHolidayRequestActionPerformed

    private void btnYourShiftsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYourShiftsActionPerformed
        YourShifts shifts = new YourShifts();
        shifts.setVisible(true);
        this.setVisible(false);
        shifts.SetName(firstName);
        shifts.SetID(GetID());
    }//GEN-LAST:event_btnYourShiftsActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
       LoginScreen login = new LoginScreen();
       login.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    /**
     * @param args the command line arguments
     */
    public void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffMainMenu().setVisible(true);
            }
        });
        ArrayList<String> shifts = new ArrayList<>();
        DefaultListModel DLM = new DefaultListModel();
        DLM.addElement("hello");
        ShiftList.setModel(DLM);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/RotaSystem", "root", "root");
            Statement st = con.createStatement();
            String q = "SELECT * FROM tblStaff";
            ResultSet rs = st.executeQuery (q);
            while (rs.next()) {
                shifts.add(rs.getString("Date") + " - " + rs.getString("StartTime") + " - " + rs.getString("EndTime") + " - " + rs.getString("Location"));
            }
            ShiftList.setModel(DLM);
            con.close();
            } catch(Exception e) {
                DLM.addElement(e);
        }

        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JList<String> ShiftList;
    public javax.swing.JLabel ShiftsHeader;
    public javax.swing.JLabel Title;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSubmitHolidayRequest;
    private javax.swing.JButton btnViewRota;
    private javax.swing.JButton btnYourShifts;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
