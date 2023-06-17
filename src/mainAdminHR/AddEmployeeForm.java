/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mainAdminHR;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class AddEmployeeForm extends javax.swing.JFrame {

    Connection con; 
    PreparedStatement pst;
    ResultSet rs;
    
    public void Connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/db_employeemgmt", "root", "");
        } catch (ClassNotFoundException e) {
            Logger.getLogger(AddEmployeeForm.class.getName()).log(Level.SEVERE, null, e);
        } catch (SQLException e) {
            Logger.getLogger(AddEmployeeForm.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public AddEmployeeForm() {
        Connect();
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        tfEmpName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfEmpStat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfEmpAddr = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfEmpEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfEmpCont = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfEmpDept = new javax.swing.JTextField();
        tfEmpPos = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfEmpUname = new javax.swing.JTextField();
        tfEmpPass = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        tfEmpID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(550, 510));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("New Employee Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 16, -1, -1));

        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Please fill out the information below.");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 45, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 80, 664, 10));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Personal Information");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 96, -1, -1));
        jPanel1.add(tfEmpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 131, 260, 30));

        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 167, -1, -1));
        jPanel1.add(tfEmpStat, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 131, 200, 30));

        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Employee Status");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 167, -1, -1));
        jPanel1.add(tfEmpAddr, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 195, 635, 30));

        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Address");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 231, -1, -1));
        jPanel1.add(tfEmpEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 259, 200, 30));

        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Email");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 295, -1, -1));
        jPanel1.add(tfEmpCont, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 259, 200, 30));

        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Contact Number");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 295, -1, -1));
        jPanel1.add(tfEmpDept, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 259, 200, 30));
        jPanel1.add(tfEmpPos, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 323, 200, 30));

        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Department");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 295, -1, -1));

        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Position");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 359, -1, -1));
        jPanel1.add(tfEmpUname, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 323, 200, 30));
        jPanel1.add(tfEmpPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 323, 200, 30));

        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("Username");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 359, -1, -1));

        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("Password");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 359, -1, -1));

        btnSubmit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSubmit.setText("SUBMIT");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 150, 40));

        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("Employee ID");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 167, -1, -1));
        jPanel1.add(tfEmpID, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 140, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        
        if(tfEmpID.getText().isEmpty() || tfEmpName.getText().isEmpty() || tfEmpStat.getText().isEmpty() || tfEmpAddr.getText().isEmpty() || tfEmpEmail.getText().isEmpty() || tfEmpCont.getText().isEmpty() || tfEmpDept.getText().isEmpty() || tfEmpPos.getText().isEmpty() || tfEmpUname.getText().isEmpty() || tfEmpPass.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(null, "Please Fill Out the Form", "Complete The Form",JOptionPane.ERROR_MESSAGE);
        }else if(!tfEmpID.getText().matches("[0-9]+")) {
            JOptionPane.showMessageDialog(null, "Numbers are only allowed in Employee ID", "Error Input Value",JOptionPane.ERROR_MESSAGE);
            tfEmpID.setText("");
            tfEmpID.requestFocus();
        }else {
            try{
                String empID = tfEmpID.getText();
                String empName = tfEmpName.getText();
                String empStatus = tfEmpStat.getText();
                String empAddress = tfEmpAddr.getText();
                String empEmail = tfEmpEmail.getText();
                String empContact = tfEmpCont.getText();
                String empDepartment = tfEmpDept.getText();
                String empPosition = tfEmpPos.getText();
                
                String empUsername = tfEmpUname.getText();
                String empPassword = tfEmpPass.getText();
            
                pst = con.prepareStatement("INSERT INTO tbl_employees(emp_id, emp_name, emp_status, emp_address, emp_email, emp_contact, emp_department, emp_position, emp_username, emp_password) VALUES(?,?,?,?,?,?,?,?,?,?)");
                pst.setString(1, empID);
                pst.setString(2, empName);
                pst.setString(3, empStatus);
                pst.setString(4, empAddress);
                pst.setString(5, empEmail);
                pst.setString(6, empContact);
                pst.setString(7, empDepartment);
                pst.setString(8, empPosition);
                pst.setString(9, empUsername);
                pst.setString(10, empPassword);
                
                int k = pst.executeUpdate();
            
                if(k == 1) {
                    JOptionPane.showMessageDialog(this, "Employee Added Successfully. Please Refresh the Table");
                    tfEmpID.setText("");
                    tfEmpName.setText("");
                    tfEmpStat.setText("");
                    tfEmpAddr.setText("");
                    tfEmpEmail.setText("");
                    tfEmpCont.setText("");
                    tfEmpDept.setText("");
                    tfEmpPos.setText("");
        
                    tfEmpUname.setText(""); 
                    tfEmpPass.setText("");
                    
                    this.dispose();
                }else {
                    JOptionPane.showMessageDialog(this, "Employee Addition Failed");
                }
            }catch(SQLException e) {
                Logger.getLogger(AddEmployeeForm.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int rep = JOptionPane.showConfirmDialog(this,"Do you wish to close this form?", "Cancel Add Employee Form",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        switch (rep) {
            case JOptionPane.YES_OPTION -> this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            case JOptionPane.NO_OPTION -> this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            default -> this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosing

    
    
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
            java.util.logging.Logger.getLogger(AddEmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployeeForm().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField tfEmpAddr;
    private javax.swing.JTextField tfEmpCont;
    private javax.swing.JTextField tfEmpDept;
    private javax.swing.JTextField tfEmpEmail;
    private javax.swing.JTextField tfEmpID;
    private javax.swing.JTextField tfEmpName;
    private javax.swing.JTextField tfEmpPass;
    private javax.swing.JTextField tfEmpPos;
    private javax.swing.JTextField tfEmpStat;
    private javax.swing.JTextField tfEmpUname;
    // End of variables declaration//GEN-END:variables
}
