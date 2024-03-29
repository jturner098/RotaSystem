/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.copyofrotasystem;

import java.sql.*;
import java.time.LocalDate;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josephturner
 */
public class StaffRotaView extends javax.swing.JFrame {
    DAO db;
    static User user;
    LocalDate date;
    /**
     * Creates new form StaffRotaView
     */
    public StaffRotaView(User user) {
        initComponents();
        this.user = user;
        date = LocalDate.now();
        DateField.setText(String.valueOf(date));
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
        Title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        RotaTable = new javax.swing.JTable();
        btnGenerateRota = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnForwardDate = new javax.swing.JButton();
        btnBackDate = new javax.swing.JButton();
        DateField = new javax.swing.JTextField();
        btnViewShifts = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        Title.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        Title.setText("View Rota");

        RotaTable.setAutoCreateRowSorter(true);
        RotaTable.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        RotaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ShiftID", "Staff Member", "Location", "Date", "Start Time", "End Time"
            }
        ));
        jScrollPane1.setViewportView(RotaTable);

        btnGenerateRota.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnGenerateRota.setText("Generate Rota");
        btnGenerateRota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateRotaActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(128, 191, 180));
        btnBack.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.setToolTipText("");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel1.setText("Date:");

        btnForwardDate.setText(">");
        btnForwardDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForwardDateActionPerformed(evt);
            }
        });

        btnBackDate.setText("<");
        btnBackDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackDateActionPerformed(evt);
            }
        });

        DateField.setText("jTextField1");

        btnViewShifts.setBackground(new java.awt.Color(128, 191, 180));
        btnViewShifts.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btnViewShifts.setText("View Your Shifts");
        btnViewShifts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewShiftsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(263, 263, 263)
                                .addComponent(btnBackDate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnGenerateRota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DateField))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnForwardDate))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(261, 261, 261)
                                .addComponent(Title)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnViewShifts, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(323, 323, 323))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnForwardDate)
                    .addComponent(btnBackDate)
                    .addComponent(DateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnGenerateRota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnViewShifts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerateRotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateRotaActionPerformed
        try {
            DefaultTableModel dtm = (DefaultTableModel) RotaTable.getModel();
            dtm.setRowCount(0); // Clears the rota table
            ResultSet rs = db.RotaShifts((String) DateField.getText());  // SQL Statement - Selects the shifts that are happening on the date  
            while (rs.next()) { // For each selected shift
                String shiftID = rs.getString("shiftid"); // Stores the shift's ID number
                String name = rs.getString("firstname") + " " + rs.getString("surname"); // Stores the name of the staff member doing the shift
                String location = rs.getString("location"); // Stores the shift's location
                String shiftDate = rs.getString("shiftdate"); // Stores the shift's date
                String startTime = rs.getString("starttime"); // Stores the shift's start time
                String endTime = rs.getString("endtime"); // Stores the shift's end time
                
                
                String tableData[] = {shiftID, name, location, shiftDate, startTime, endTime}; // Stores the shift information in a single string array
                
                dtm.addRow(tableData); // Adds shift to Rota Table

            }
            } catch(Exception e) {
                
        }        
    }//GEN-LAST:event_btnGenerateRotaActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        StaffMainMenu smm = new StaffMainMenu(user); // Creates an instance of the Staff Main Menu, using the staff member's details as a parameter
        smm.setVisible(true); // Makes the Staff Main Menu visible
        dispose(); // Closes the View Rota screen
    }//GEN-LAST:event_btnBackActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
/*
        

        */
    }//GEN-LAST:event_formWindowActivated

    private void btnBackDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackDateActionPerformed
        date = date.plusDays(-1); // Subtracts one day from the date in the Date field
        DateField.setText(String.valueOf(date)); // Displays the new date
    }//GEN-LAST:event_btnBackDateActionPerformed

    private void btnForwardDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForwardDateActionPerformed
        date = date.plusDays(1); // Adds one day to the date in the Date field
        DateField.setText(String.valueOf(date)); // Displays the new date
    }//GEN-LAST:event_btnForwardDateActionPerformed

    private void btnViewShiftsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewShiftsActionPerformed
        YourCalendar yc = new YourCalendar(user); // Creates an instance of the Your Calendar screen, using the staff member's details as a parameter
        yc.setVisible(true); // Makes the Your Calendar screen visible
        dispose(); // Closes the View Rota screen
    }//GEN-LAST:event_btnViewShiftsActionPerformed

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
            java.util.logging.Logger.getLogger(StaffRotaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffRotaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffRotaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffRotaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffRotaView(user).setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DateField;
    javax.swing.JTable RotaTable;
    private javax.swing.JLabel Title;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBackDate;
    private javax.swing.JButton btnForwardDate;
    private javax.swing.JButton btnGenerateRota;
    private javax.swing.JButton btnViewShifts;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
