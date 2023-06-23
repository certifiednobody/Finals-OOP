/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forAdmin;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class SelectedEmployeeForm extends javax.swing.JFrame {

    Connection con; 
    PreparedStatement pst;
    ResultSet rs;
    
    public void Connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/db_employeemgmt", "root", "");
        } catch (ClassNotFoundException e) {
            Logger.getLogger(SelectedEmployeeForm.class.getName()).log(Level.SEVERE, null, e);
        } catch (SQLException e) {
            Logger.getLogger(SelectedEmployeeForm.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public SelectedEmployeeForm() {
        initComponents();
        Connect();
        
        btnSave.setVisible(false);
        btnCancel.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        tfFullName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfEmpID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfDepartment = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tfPosition = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tfEmpStatus = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        dcDateHired = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfPhoneNum = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("Employee Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 16, -1, -1));

        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Please fill out the information below.");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 45, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 80, 560, 10));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Contact Information");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        tfFullName.setEditable(false);
        tfFullName.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(tfFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 250, 30));

        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Full Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 155, -1, -1));

        tfEmpID.setEditable(false);
        tfEmpID.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(tfEmpID, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 200, 30));

        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Employee ID");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 155, -1, -1));

        tfDepartment.setEditable(false);
        tfDepartment.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(tfDepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 250, 30));

        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("Department");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 225, -1, -1));

        tfPosition.setEditable(false);
        tfPosition.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(tfPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 250, 30));

        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("Position");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 225, -1, -1));

        tfEmpStatus.setEditable(false);
        tfEmpStatus.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(tfEmpStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 250, 30));

        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText("Employee Status");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 295, -1, -1));

        dcDateHired.setEnabled(false);
        jPanel1.add(dcDateHired, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 150, 30));

        jLabel15.setForeground(new java.awt.Color(153, 153, 153));
        jLabel15.setText("Date Hired");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Personal Information");
        jLabel6.setToolTipText("");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 88, -1, -1));

        tfEmail.setEditable(false);
        tfEmail.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(tfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 250, 30));

        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Email");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        tfPhoneNum.setEditable(false);
        tfPhoneNum.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(tfPhoneNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 250, 30));

        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Phone Number");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, -1, -1));

        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEdit.setText("EDIT");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel1.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 100, 40));

        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 100, 40));

        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, 100, 40));

        btnCancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancel.setText("CANCEL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, 100, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int rep = JOptionPane.showConfirmDialog(this,"Do you wish to close this form?", "Close This Form",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        switch (rep) {
            case JOptionPane.YES_OPTION -> this.setDefaultCloseOperation(SelectedEmployeeForm.DISPOSE_ON_CLOSE);
            case JOptionPane.NO_OPTION -> this.setDefaultCloseOperation(SelectedEmployeeForm.DO_NOTHING_ON_CLOSE);
            default -> this.setDefaultCloseOperation(SelectedEmployeeForm.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosing

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        tfEmpID.setEditable(true);
        tfFullName.setEditable(true);
        tfEmpStatus.setEditable(true);
        tfDepartment.setEditable(true);
        tfPosition.setEditable(true);
        dcDateHired.setEnabled(true);
        tfPhoneNum.setEditable(true);
        tfEmail.setEditable(true);
        
        btnSave.setVisible(true);
        btnCancel.setVisible(true);
        btnEdit.setEnabled(false);
        btnDelete.setEnabled(false);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        
        if(tfEmpID.getText().isEmpty() ||tfFullName.getText().isEmpty() || tfDepartment.getText().isEmpty() || tfPosition.getText().isEmpty() || tfEmpStatus.getText().isEmpty() || dcDateHired.getDate() == null || tfEmail.getText().isEmpty() || tfPhoneNum.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Fill Out the Form", "Complete The Form",JOptionPane.ERROR_MESSAGE);
        }else if(tfPhoneNum.getText().length() != 11) {
            JOptionPane.showMessageDialog(null, "Please enter a valid 11-digit number.", "Error Input Value",JOptionPane.ERROR_MESSAGE);
            tfPhoneNum.requestFocus();
        }else if(!tfEmail.getText().matches(regex)) {
            JOptionPane.showMessageDialog(null, "Please enter a valid email address.", "Error Input Value",JOptionPane.ERROR_MESSAGE);
            tfEmail.requestFocus();
        }else {
            try {
                java.util.Date d = dcDateHired.getDate();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                
                String empID = tfEmpID.getText();
                String empFullName = tfFullName.getText();
                String empStat = tfEmpStatus.getText();
                String empDept = tfDepartment.getText();
                String empPos = tfPosition.getText();
                String empCont = tfPhoneNum.getText().replaceAll("[^0-9]", "");
                String empEm = tfEmail.getText();
                String dateCreated = sdf.format(d);

                String formattedPN = "+63 " + empCont.substring(1,4)+ " " + empCont.substring(4,7) + " " + empCont.substring(7); 
                
                pst = con.prepareStatement("UPDATE employees SET id=?, name=?, status=?, department=?, position=?, phone_number=?, email=?, date_hired=? WHERE id=?");
                pst.setString(1, empID);
                pst.setString(2, empFullName);
                pst.setString(3, empStat);
                pst.setString(4, empDept);
                pst.setString(5, empPos);
                pst.setString(6, formattedPN);
                pst.setString(7, empEm);
                pst.setString(8, dateCreated);
                
                pst.setString(9, empID);
                
                int k = pst.executeUpdate();
                if(k == 1) {
                    JOptionPane.showMessageDialog(this, "Employee has been Updated Successfully. Please Refresh the Table");
                    tfEmpID.setText("");
                    tfFullName.setText("");
                    tfEmpStatus.setText("");
                    tfDepartment.setText(""); 
                    tfPosition.setText("");
                    tfPhoneNum.setText(""); 
                    tfEmail.setText("");
                    dcDateHired.setDate(null);

                    this.dispose();
                }
            }catch(SQLException e) {
                Logger.getLogger(SelectedEmployeeForm.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        try {
            pst = con.prepareStatement("SELECT * FROM employees");
            rs = pst.executeQuery();
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            
            if(rs.next() == true) {
                tfEmpID.setText(rs.getString(1));
                tfFullName.setText(rs.getString(2));
                tfEmpStatus.setText(rs.getString(3));
                tfDepartment.setText(rs.getString(4));
                tfPosition.setText(rs.getString(5));
                tfPhoneNum.setText(rs.getString(6));
                tfEmail.setText(rs.getString(7));
                try {
                    dcDateHired.setDate(sdf.parse(rs.getString(8)));
                } catch (ParseException ex) {
                    Logger.getLogger(SelectedEmployeeForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(SelectedEmployeeForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        tfEmpID.setEditable(false);
        tfFullName.setEditable(false);
        tfEmpStatus.setEditable(false);
        tfDepartment.setEditable(false);
        tfPosition.setEditable(false);
        dcDateHired.setEnabled(false);
        tfPhoneNum.setEditable(false);
        tfEmail.setEditable(false);
        
        btnSave.setVisible(false);
        btnCancel.setVisible(false);
        btnEdit.setEnabled(true);
        btnDelete.setEnabled(true);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int rep = JOptionPane.showConfirmDialog(this,"Do you really want to delete this employee?", "Delete Employee Data",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        switch (rep) {
            case JOptionPane.YES_OPTION:
                try {
                    String getID = tfEmpID.getText();
                    pst = con.prepareStatement("DELETE FROM employees WHERE emp_id =?");
                    pst.setString(1, getID);
                    
                    int k = pst.executeUpdate();
                    
                    if(k == 1) {
                        JOptionPane.showMessageDialog(this, "Employee data successfully Deleted. Please Refresh the Table");
                        
                        tfEmpID.setText("");
                        tfFullName.setText("");
                        tfEmpStatus.setText("");
                        tfDepartment.setText(""); 
                        tfPosition.setText("");
                        tfPhoneNum.setText(""); 
                        tfEmail.setText("");
                        dcDateHired.setDate(null);
                        
                        this.dispose();
                    }
                }catch(SQLException e) {
                    Logger.getLogger(SelectedEmployeeForm.class.getName()).log(Level.SEVERE, null, e);
                }   this.setDefaultCloseOperation(SelectedEmployeeForm.DISPOSE_ON_CLOSE);
                break;
            case JOptionPane.NO_OPTION:
                this.setDefaultCloseOperation(SelectedEmployeeForm.DO_NOTHING_ON_CLOSE);
                break;
            default:
                this.setDefaultCloseOperation(SelectedEmployeeForm.DO_NOTHING_ON_CLOSE);
                break;
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

   
    
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
            java.util.logging.Logger.getLogger(SelectedEmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectedEmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectedEmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectedEmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectedEmployeeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    public com.toedter.calendar.JDateChooser dcDateHired;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JTextField tfDepartment;
    public javax.swing.JTextField tfEmail;
    public javax.swing.JTextField tfEmpID;
    public javax.swing.JTextField tfEmpStatus;
    public javax.swing.JTextField tfFullName;
    public javax.swing.JTextField tfPhoneNum;
    public javax.swing.JTextField tfPosition;
    // End of variables declaration//GEN-END:variables
}
