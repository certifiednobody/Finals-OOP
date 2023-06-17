/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mainAdminHR;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class AddEmployeeSalary extends javax.swing.JFrame {

    Connection con; 
    PreparedStatement pst;
    ResultSet rs;
    
    public void Connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/db_employeemgmt", "root", "");
        } catch (ClassNotFoundException e) {
            Logger.getLogger(AddEmployeeSalary.class.getName()).log(Level.SEVERE, null, e);
        } catch (SQLException e) {
            Logger.getLogger(AddEmployeeSalary.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public AddEmployeeSalary() {
        initComponents();
        Connect();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfEmpID = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        tfEmpName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfEmpPos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfBasicPay = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfHours = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfDaysWorked = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfTax = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfDeduction = new javax.swing.JTextField();
        tfGross = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tfNetSalary = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

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
        jLabel1.setText("Please Enter Employee ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 16, -1, -1));

        tfEmpID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmpIDActionPerformed(evt);
            }
        });
        jPanel1.add(tfEmpID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 55, 140, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 110, 664, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Payroll System");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 130, -1, -1));

        tfEmpName.setEditable(false);
        tfEmpName.setFocusable(false);
        jPanel1.add(tfEmpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 160, 260, 30));

        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 196, -1, -1));

        tfEmpPos.setEditable(false);
        tfEmpPos.setFocusable(false);
        jPanel1.add(tfEmpPos, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 160, 200, 30));

        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Employee Position");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 196, -1, -1));
        jPanel1.add(tfBasicPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 230, 140, 30));

        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Basic Pay");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 268, -1, -1));
        jPanel1.add(tfHours, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 230, 140, 30));

        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Hours per Day");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 268, -1, -1));
        jPanel1.add(tfDaysWorked, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 230, 140, 30));

        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Total Days Worked");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 268, -1, -1));
        jPanel1.add(tfTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 310, 140, 30));

        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Tax of Monthly Wage");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 350, -1, -1));
        jPanel1.add(tfDeduction, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 310, 140, 30));
        jPanel1.add(tfGross, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 230, 160, 30));

        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Gross Salary");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 268, -1, -1));

        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("Deduction");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 350, -1, -1));
        jPanel1.add(tfNetSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 310, 160, 30));

        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("Net Salary");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 350, -1, -1));

        btnSubmit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSubmit.setText("SUBMIT");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 150, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfEmpIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmpIDActionPerformed
        try {
            String getEmpID = tfEmpID.getText();
            pst = con.prepareStatement("SELECT * FROM tbl_employees WHERE emp_id =?");
            pst.setString(1, getEmpID);
            rs = pst.executeQuery();
            
            if(rs.next() == true) {
                tfEmpName.setText(rs.getString(2));
                tfEmpPos.setText(rs.getString(8));
            }else {
                JOptionPane.showMessageDialog(this, "Employee ID does not exist. Please try again.", "ID cannot be found", JOptionPane.ERROR_MESSAGE);
                tfEmpID.setText("");
                tfEmpName.setText("");
                tfEmpPos.setText("");
            }
        }catch(SQLException e) {
            Logger.getLogger(AddEmployeeSalary.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_tfEmpIDActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        if(tfEmpID.getText().isEmpty() || tfBasicPay.getText().isEmpty() || tfHours.getText().isEmpty() || tfDaysWorked.getText().isEmpty() || tfGross.getText().isEmpty() || tfTax.getText().isEmpty() || tfDeduction.getText().isEmpty() || tfNetSalary.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Fill Out the Form", "Complete The Form",JOptionPane.ERROR_MESSAGE);
        }else if(tfEmpID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter a valid Employee ID", "Complete The Form",JOptionPane.ERROR_MESSAGE);
        }else if(tfEmpName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please press ENTER");
            tfEmpID.requestFocus();
        }else {
            try {
                String empID = tfEmpID.getText();
                String empName = tfEmpName.getText();
                String empPos = tfEmpPos.getText();
                
                String empBP = tfBasicPay.getText();
                String empHrs = tfHours.getText();
                String empDW = tfDaysWorked.getText();
                String empGS = tfGross.getText();
                String empT = tfTax.getText();
                String empD = tfDeduction.getText();
                String empNS = tfNetSalary.getText();
                
                pst = con.prepareStatement("INSERT INTO tbl_payroll(emp_id, emp_name, emp_pos, emp_basicpay, emp_hoursperday, emp_daysworked, emp_grosssalary, emp_tax, emp_deduction, emp_netsalary) VALUES(?,?,?,?,?,?,?,?,?,?)");
                pst.setString(1, empID);
                pst.setString(2, empName);
                pst.setString(3, empPos);
                pst.setString(4, empBP);
                pst.setString(5, empHrs);
                pst.setString(6, empDW);
                pst.setString(7, empGS);
                pst.setString(8, empT);
                pst.setString(9, empD);
                pst.setString(10, empNS);
                
                int k = pst.executeUpdate();
                
                if(k == 1) {
                    JOptionPane.showMessageDialog(this, "Data Added Successfully. Please Refresh the Table");
                    tfEmpID.setText("");
                    tfEmpName.setText("");
                    tfEmpPos.setText("");
                    tfBasicPay.setText("");
                    tfHours.setText("");
                    tfDaysWorked.setText("");
                    tfGross.setText("");
                    tfTax.setText("");
                    tfDeduction.setText("");
                    tfNetSalary.setText("");
                    
                    this.dispose();
                }else {
                    JOptionPane.showMessageDialog(this, "Data Addition Failed");
                }
            }catch(SQLException e) {
                Logger.getLogger(AddEmployeeSalary.class.getName()).log(Level.SEVERE, null, e);            
            }
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int rep = JOptionPane.showConfirmDialog(this,"Do you wish to close this form?", "Cancel Add Salary Form",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
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
            java.util.logging.Logger.getLogger(AddEmployeeSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployeeSalary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JTextField tfBasicPay;
    private javax.swing.JTextField tfDaysWorked;
    private javax.swing.JTextField tfDeduction;
    private javax.swing.JTextField tfEmpID;
    private javax.swing.JTextField tfEmpName;
    private javax.swing.JTextField tfEmpPos;
    private javax.swing.JTextField tfGross;
    private javax.swing.JTextField tfHours;
    private javax.swing.JTextField tfNetSalary;
    private javax.swing.JTextField tfTax;
    // End of variables declaration//GEN-END:variables
}
