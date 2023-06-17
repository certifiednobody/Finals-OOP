/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mainAdminHR;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class EditEmployeeForm extends javax.swing.JFrame {

    Connection con; 
    PreparedStatement pst;
    ResultSet rs;
    
    public void Connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/db_employeemgmt", "root", "");
        } catch (ClassNotFoundException e) {
            Logger.getLogger(EditEmployeeForm.class.getName()).log(Level.SEVERE, null, e);
        } catch (SQLException e) {
            Logger.getLogger(EditEmployeeForm.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public EditEmployeeForm() {
        Connect();
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        tfEmpName = new javax.swing.JTextField();
        tfEmpAddy = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfEmpStat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfEmpEm = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfEmpPos = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfEmpCon = new javax.swing.JTextField();
        tfEmpDept = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfEmpID = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tfEmpUname = new javax.swing.JTextField();
        tfEmpPass = new javax.swing.JTextField();
        lbl = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();

        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Name");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 510));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("Update Employee");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 16, -1, -1));

        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Please enter the Employee ID you want to edit.");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 45, -1, -1));

        tfID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIDActionPerformed(evt);
            }
        });
        jPanel1.add(tfID, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 80, 140, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 130, 664, 10));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Personal Information");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 150, -1, -1));
        jPanel1.add(tfEmpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 180, 260, 30));
        jPanel1.add(tfEmpAddy, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 242, 635, 30));

        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Address");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 278, -1, -1));
        jPanel1.add(tfEmpStat, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 180, 200, 30));

        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Employee Status");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 216, -1, -1));
        jPanel1.add(tfEmpEm, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 304, 200, 30));

        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Email");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 340, -1, -1));
        jPanel1.add(tfEmpPos, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 366, 200, 30));

        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Position");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 402, -1, -1));
        jPanel1.add(tfEmpCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 304, 200, 30));
        jPanel1.add(tfEmpDept, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 304, 200, 30));

        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Contanct Number");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 340, -1, -1));
        jPanel1.add(tfEmpID, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 140, 30));

        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Employee ID");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 216, -1, -1));

        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("Department");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 340, -1, -1));
        jPanel1.add(tfEmpUname, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 366, 200, 30));
        jPanel1.add(tfEmpPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 366, 200, 30));

        lbl.setForeground(new java.awt.Color(153, 153, 153));
        lbl.setText("Username");
        jPanel1.add(lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 402, -1, -1));

        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("Password");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 402, -1, -1));

        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 150, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
        int rep = JOptionPane.showConfirmDialog(this,"Do you wish to close this form?", "Cancel Edit Employee Form",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        switch (rep) {
            case JOptionPane.YES_OPTION -> this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            case JOptionPane.NO_OPTION -> this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            default -> this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosing

    private void tfIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIDActionPerformed
        try {
            String inpempID = tfID.getText();
            pst = con.prepareStatement("SELECT * FROM tbl_employees WHERE emp_id =?");
            pst.setString(1, inpempID);
            rs = pst.executeQuery();
            
            if(rs.next() == true) {
                tfEmpID.setText(rs.getString(1));
                tfEmpName.setText(rs.getString(2));
                tfEmpStat.setText(rs.getString(3));
                tfEmpAddy.setText(rs.getString(4));
                tfEmpEm.setText(rs.getString(5));
                tfEmpCon.setText(rs.getString(6));
                tfEmpDept.setText(rs.getString(7));
                tfEmpPos.setText(rs.getString(8));
                tfEmpUname.setText(rs.getString(9));
                tfEmpPass.setText(rs.getString(10));
                
            }else {
                JOptionPane.showMessageDialog(this, "Employee ID does not exist. Please try again.", "ID cannot be found", JOptionPane.ERROR_MESSAGE);
                
                tfID.setText("");
                
                tfEmpID.setText("");
                tfEmpName.setText("");
                tfEmpStat.setText("");
                tfEmpAddy.setText("");
                tfEmpEm.setText("");
                tfEmpCon.setText("");
                tfEmpDept.setText("");
                tfEmpPos.setText("");
                tfEmpUname.setText("");
                tfEmpPass.setText("");
            }
            
        }catch(SQLException e) {
            Logger.getLogger(DeleteEmployeeForm.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_tfIDActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if(tfID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter a valid Employee ID", "Complete The Form",JOptionPane.ERROR_MESSAGE);
        }else if(tfEmpID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please press ENTER");
            tfID.requestFocus();
        }else {
            try {
                String empID = tfEmpID.getText();
                String empName = tfEmpName.getText();
                String empStatus = tfEmpStat.getText();
                String empAddress = tfEmpAddy.getText();
                String empEmail = tfEmpEm.getText();
                String empContact = tfEmpCon.getText();
                String empDepartment = tfEmpDept.getText();
                String empPosition = tfEmpPos.getText();
            
                String empUsername = tfEmpUname.getText();
                String empPassword = tfEmpPass.getText(); 
            
                String getEmpID = tfID.getText();
            
                pst = con.prepareStatement("UPDATE tbl_employees SET emp_ID=?, emp_name=?, emp_status=?, emp_address=?, emp_email=?, emp_contact=?, emp_department=?, emp_position=?, emp_username=?, emp_password=? WHERE emp_id=?");
            
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
            
                pst.setString(11, getEmpID);
            
                int k = pst.executeUpdate();
                if(k == 1) {
                    JOptionPane.showMessageDialog(this, "Employee has been updated Successfully. Please Refresh the Table");
                    
                    tfEmpID.setText("");
                    tfEmpName.setText("");
                    tfEmpStat.setText("");
                    tfEmpAddy.setText("");
                    tfEmpEm.setText("");
                    tfEmpCon.setText("");
                    tfEmpDept.setText("");
                    tfEmpPos.setText("");
                    tfEmpUname.setText("");
                    tfEmpPass.setText("");
                    
                    tfID.setText("");
                
                    this.dispose();
                }
            }catch(SQLException e) {
                Logger.getLogger(DeleteEmployeeForm.class.getName()).log(Level.SEVERE, null, e);            
            }
        }
        
    }//GEN-LAST:event_btnSaveActionPerformed

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
            java.util.logging.Logger.getLogger(EditEmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditEmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditEmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditEmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditEmployeeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JLabel lbl;
    private javax.swing.JTextField tfEmpAddy;
    private javax.swing.JTextField tfEmpCon;
    private javax.swing.JTextField tfEmpDept;
    private javax.swing.JTextField tfEmpEm;
    private javax.swing.JTextField tfEmpID;
    private javax.swing.JTextField tfEmpName;
    private javax.swing.JTextField tfEmpPass;
    private javax.swing.JTextField tfEmpPos;
    private javax.swing.JTextField tfEmpStat;
    private javax.swing.JTextField tfEmpUname;
    private javax.swing.JTextField tfID;
    // End of variables declaration//GEN-END:variables
}
