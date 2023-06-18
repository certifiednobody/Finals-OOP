/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mainAdminHR;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class AddEmployeeAttendance extends javax.swing.JFrame {

    Connection con; 
    PreparedStatement pst;
    ResultSet rs;
    
    public void Connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/db_employeemgmt", "root", "");
        } catch (ClassNotFoundException e) {
            Logger.getLogger(AddEmployeeAttendance.class.getName()).log(Level.SEVERE, null, e);
        } catch (SQLException e) {
            Logger.getLogger(AddEmployeeAttendance.class.getName()).log(Level.SEVERE, null, e);
        }
    }
   
    public AddEmployeeAttendance() {
        initComponents();
        Connect();
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfEmpID = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        tfEmpName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfTimeIn = new javax.swing.JTextField();
        tfTimeOut = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfOvertime = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfLate = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        tfAbsent = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tfDate = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();

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
        jLabel3.setText("Add Attendance Record");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 130, -1, -1));

        tfEmpName.setEditable(false);
        tfEmpName.setFocusable(false);
        jPanel1.add(tfEmpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 160, 260, 30));

        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 196, -1, -1));
        jPanel1.add(tfTimeIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 230, 140, 30));
        jPanel1.add(tfTimeOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 230, 140, 30));

        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Time Out");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 268, -1, -1));
        jPanel1.add(tfOvertime, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 230, 140, 30));

        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Overtime (Hours)");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 268, -1, -1));
        jPanel1.add(tfLate, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 310, 140, 30));

        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Absent");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 350, -1, -1));

        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Date");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 196, -1, -1));

        btnSubmit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSubmit.setText("SUBMIT");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 150, 40));
        jPanel1.add(tfAbsent, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 310, 140, 30));

        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("Time In");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 268, -1, -1));
        jPanel1.add(tfDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 140, 30));

        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText("Late (Minutes)");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 350, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
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
            }else {
                JOptionPane.showMessageDialog(this, "Employee ID does not exist. Please try again.", "ID cannot be found", JOptionPane.ERROR_MESSAGE);
                tfEmpID.setText("");
                tfEmpName.setText("");
            }
        }catch(SQLException e) {
            Logger.getLogger(AddEmployeeAttendance.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_tfEmpIDActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        
        if(tfEmpID.getText().isEmpty() || tfDate.getDate() == null || tfTimeIn.getText().isEmpty() || tfTimeOut.getText().isEmpty() || tfOvertime.getText().isEmpty() || tfLate.getText().isEmpty() || tfAbsent.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Fill Out the Form", "Complete The Form",JOptionPane.ERROR_MESSAGE);
        }else if(tfEmpID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter a valid Employee ID", "Complete The Form",JOptionPane.ERROR_MESSAGE);
        }else if(tfEmpName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please press ENTER");
            tfEmpID.requestFocus();
        }else {
            try {
                java.util.Date d = tfDate.getDate();
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                
                String empID = tfEmpID.getText();
                String empName = tfEmpName.getText();
                String date = sdf.format(d);
                String timeIn = tfTimeIn.getText();
                String timeOut = tfTimeOut.getText();
                String overT = tfOvertime.getText();
                String absent = tfAbsent.getText();
                String late = tfLate.getText();

                pst = con.prepareStatement("INSERT INTO tbl_attendance(emp_id, emp_name, date, timein, timeout, overtime, late, absent) VALUES(?,?,?,?,?,?,?,?)");
                pst.setString(1, empID);
                pst.setString(2, empName);
                pst.setString(3, date);
                pst.setString(4, timeIn);
                pst.setString(5, timeOut);
                pst.setString(6, overT);
                pst.setString(7, late);
                pst.setString(8, absent);

                int k = pst.executeUpdate();

                if(k == 1) {
                    JOptionPane.showMessageDialog(this, "Data Added Successfully. Please Refresh the Table");
                    tfEmpID.setText("");
                    tfEmpName.setText("");
                    tfDate.setDate(null);
                    tfTimeIn.setText("");
                    tfTimeOut.setText("");
                    tfOvertime.setText("");
                    tfAbsent.setText("");
                    tfLate.setText("");

                    this.dispose();
                }else {
                    JOptionPane.showMessageDialog(this, "Data Addition Failed");
                }
            }catch(SQLException e) {
                Logger.getLogger(AddEmployeeAttendance.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int rep = JOptionPane.showConfirmDialog(this,"Do you wish to close this form?", "Cancel Add Attendance Form",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
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
            java.util.logging.Logger.getLogger(AddEmployeeAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployeeAttendance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField tfAbsent;
    private com.toedter.calendar.JDateChooser tfDate;
    private javax.swing.JTextField tfEmpID;
    private javax.swing.JTextField tfEmpName;
    private javax.swing.JTextField tfLate;
    private javax.swing.JTextField tfOvertime;
    private javax.swing.JTextField tfTimeIn;
    private javax.swing.JTextField tfTimeOut;
    // End of variables declaration//GEN-END:variables
}
