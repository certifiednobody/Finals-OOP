/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mainAdminHR;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class DeleteEmployeeForm extends javax.swing.JFrame {

    Connection con; 
    PreparedStatement pst;
    ResultSet rs;
    
    public void Connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/db_employeemgmt", "root", "");
        } catch (ClassNotFoundException e) {
            Logger.getLogger(DeleteEmployeeForm.class.getName()).log(Level.SEVERE, null, e);
        } catch (SQLException e) {
            Logger.getLogger(DeleteEmployeeForm.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public DeleteEmployeeForm() {
        Connect();
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        tfEmpName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfEmpAddy = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfEmpStat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfEmpEmail = new javax.swing.JTextField();
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
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnDeleteEmployee = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("Delete Employee");

        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Please enter the Employee ID you want to delete.");

        tfID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIDActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Personal Information");

        tfEmpName.setEditable(false);
        tfEmpName.setFocusable(false);

        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Name");

        tfEmpAddy.setEditable(false);
        tfEmpAddy.setFocusable(false);

        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Address");

        tfEmpStat.setEditable(false);
        tfEmpStat.setFocusable(false);

        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Employee Status");

        tfEmpEmail.setEditable(false);
        tfEmpEmail.setFocusable(false);

        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Email");

        tfEmpPos.setEditable(false);
        tfEmpPos.setFocusable(false);

        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Position");

        tfEmpCon.setEditable(false);
        tfEmpCon.setFocusable(false);

        tfEmpDept.setEditable(false);
        tfEmpDept.setFocusable(false);

        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Contanct Number");

        tfEmpID.setEditable(false);
        tfEmpID.setFocusable(false);

        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Employee ID");

        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("Department");

        tfEmpUname.setEditable(false);
        tfEmpUname.setFocusable(false);

        tfEmpPass.setEditable(false);
        tfEmpPass.setFocusable(false);

        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("Username");

        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("Password");

        btnDeleteEmployee.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDeleteEmployee.setText("DELETE");
        btnDeleteEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteEmployeeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(jLabel2))
                        .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(tfEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfEmpStat, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(14, 14, 14)
                            .addComponent(tfEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(246, 246, 246)
                            .addComponent(jLabel6)
                            .addGap(127, 127, 127)
                            .addComponent(jLabel10))
                        .addComponent(tfEmpAddy, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(tfEmpEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfEmpCon, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfEmpDept, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(189, 189, 189)
                            .addComponent(jLabel9)
                            .addGap(122, 122, 122)
                            .addComponent(jLabel11))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(tfEmpPos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfEmpUname, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfEmpPass, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(175, 175, 175)
                            .addComponent(jLabel12)
                            .addGap(189, 189, 189)
                            .addComponent(jLabel13))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(252, 252, 252)
                            .addComponent(btnDeleteEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(4, 4, 4)
                    .addComponent(jLabel2)
                    .addGap(19, 19, 19)
                    .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(jLabel3)
                    .addGap(13, 13, 13)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfEmpStat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(6, 6, 6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel6)
                        .addComponent(jLabel10))
                    .addGap(10, 10, 10)
                    .addComponent(tfEmpAddy, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(6, 6, 6)
                    .addComponent(jLabel5)
                    .addGap(10, 10, 10)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfEmpEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfEmpCon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfEmpDept, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(6, 6, 6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addComponent(jLabel9)
                        .addComponent(jLabel11))
                    .addGap(10, 10, 10)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfEmpPos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfEmpUname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfEmpPass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(6, 6, 6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8)
                        .addComponent(jLabel12)
                        .addComponent(jLabel13))
                    .addGap(32, 32, 32)
                    .addComponent(btnDeleteEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int rep = JOptionPane.showConfirmDialog(this,"Do you wish to close this form?", "Cancel Delete Employee Form",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        switch (rep) {
            case JOptionPane.YES_OPTION -> this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            case JOptionPane.NO_OPTION -> this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            default -> this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosing

    private void btnDeleteEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteEmployeeActionPerformed
        
        if(tfID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter a valid Employee ID", "Complete The Form",JOptionPane.ERROR_MESSAGE);
        }else if(tfEmpID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please press ENTER");
            tfID.requestFocus();
        }else {
            try {
                String getID = tfID.getText();
                pst = con.prepareStatement("DELETE FROM tbl_employees WHERE emp_id =?");
                pst.setString(1, getID);
            
                int k = pst.executeUpdate();
            
                if(k == 1) {
                    EmployeesPanel ep = new EmployeesPanel();
                    ep.Fetch();
                    JOptionPane.showMessageDialog(this, "Employee data successfully deleted. Please Refresh the Table");
                    
                    tfID.setText("");
                    
                    tfEmpID.setText("");
                    tfEmpName.setText("");
                    tfEmpStat.setText("");
                    tfEmpAddy.setText("");
                    tfEmpEmail.setText("");
                    tfEmpCon.setText("");
                    tfEmpDept.setText("");
                    tfEmpPos.setText("");
                    tfEmpUname.setText("");
                    tfEmpPass.setText("");
                    
                    this.dispose();
                    
                }else {
                    JOptionPane.showMessageDialog(this, "Employee data failed to delete");
                }
                
            }catch(SQLException e) {
                Logger.getLogger(DeleteEmployeeForm.class.getName()).log(Level.SEVERE, null, e);            
            }
        }
        
    }//GEN-LAST:event_btnDeleteEmployeeActionPerformed

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
                tfEmpEmail.setText(rs.getString(5));
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
                tfEmpEmail.setText("");
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
            java.util.logging.Logger.getLogger(DeleteEmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteEmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteEmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteEmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteEmployeeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteEmployee;
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
    private javax.swing.JTextField tfEmpAddy;
    private javax.swing.JTextField tfEmpCon;
    private javax.swing.JTextField tfEmpDept;
    private javax.swing.JTextField tfEmpEmail;
    private javax.swing.JTextField tfEmpID;
    private javax.swing.JTextField tfEmpName;
    private javax.swing.JTextField tfEmpPass;
    private javax.swing.JTextField tfEmpPos;
    private javax.swing.JTextField tfEmpStat;
    private javax.swing.JTextField tfEmpUname;
    private javax.swing.JTextField tfID;
    // End of variables declaration//GEN-END:variables
}
