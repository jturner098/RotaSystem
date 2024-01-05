/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.copyofrotasystem;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author josephturner
 */
public class ReviewHolidayRequests extends javax.swing.JFrame {
DAO db = new DAO();
String firstName;
int staffID;
static User user;
    /**
     * Creates new form YourShifts
     */
    public ReviewHolidayRequests(User user) {
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
        lblInstruction1 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        RequestTable = new javax.swing.JTable();
        btnConfirmChanges = new javax.swing.JButton();
        lblInstruction2 = new javax.swing.JLabel();
        ErrorMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblInstruction1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblInstruction1.setText("To approve a request, write 'Approved' in the Status field. To deny, write 'Denied' (Case Sensitive)");

        lblTitle.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        lblTitle.setText("Review Holiday Requests");

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

        RequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RequestID", "StaffID", "Staff Name", "Start Date", "End Date", "Reason", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(RequestTable);

        btnConfirmChanges.setBackground(new java.awt.Color(128, 191, 180));
        btnConfirmChanges.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btnConfirmChanges.setText("Confirm Changes");
        btnConfirmChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmChangesActionPerformed(evt);
            }
        });

        lblInstruction2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblInstruction2.setText("Approved Requests will be saved, Denied Requests will be deleted");

        ErrorMessage.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        ErrorMessage.setForeground(new java.awt.Color(255, 51, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(178, 178, 178)
                                .addComponent(btnConfirmChanges))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addComponent(lblTitle))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(lblInstruction2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(lblInstruction1)))
                        .addGap(0, 56, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addComponent(ErrorMessage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInstruction1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInstruction2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnConfirmChanges, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        ManagerMainMenu mmm = new ManagerMainMenu(user);
        mmm.setVisible(true);
        dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            ResultSet rs = db.GetRequests();
            while (rs.next()) {
                String requestID = rs.getString("requestid");
                String staffID = rs.getString("staffid");
                String name = rs.getString("firstname") + " " + rs.getString("surname");
                String startDate = rs.getString("requeststartdate");
                String endDate = rs.getString("requestenddate");
                String reason = rs.getString("reason");
                String status = rs.getString("requeststatus");
                String tableData[] = {requestID, staffID, name, startDate, endDate, reason, status};
                
                
                DefaultTableModel dtm = (DefaultTableModel) RequestTable.getModel();
                dtm.addRow(tableData);
        }
        } catch(Exception e) {
            
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnConfirmChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmChangesActionPerformed
        for (int i = 0; i < RequestTable.getRowCount(); i++) {
                DefaultTableModel dtm = (DefaultTableModel)RequestTable.getModel();
                String requestID = (dtm.getValueAt(i, 0).toString());
                String staffID = (dtm.getValueAt(i,1).toString());
                String startDate = (dtm.getValueAt(i, 3).toString());
                String endDate = (dtm.getValueAt(i, 4).toString());
                String reason = (dtm.getValueAt(i,5).toString());
                String status = (dtm.getValueAt(i,6).toString());
                String[] request = {requestID, staffID, startDate, endDate, reason, status};
                try {
                    if (status.equals("Denied")) {
                        db.DeleteRequest(Integer.parseInt(requestID));
                    }
                    int result = db.UpdateRequest(request);
                } catch(Exception e) {
                    ErrorMessage.setText(e.getMessage());
                }
                        
                        
        }
        ErrorMessage.setText("Changes made!");
    }//GEN-LAST:event_btnConfirmChangesActionPerformed

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
            java.util.logging.Logger.getLogger(ReviewHolidayRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReviewHolidayRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReviewHolidayRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReviewHolidayRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReviewHolidayRequests(user).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel ErrorMessage;
    private javax.swing.JTable RequestTable;
    private javax.swing.JButton btnConfirmChanges;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblInstruction1;
    private javax.swing.JLabel lblInstruction2;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}