/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mainAdminHR;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class EditEmployeeAttendance extends javax.swing.JFrame {

    Connection con; 
    PreparedStatement pst;
    ResultSet rs;
    
    public void Connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/db_employeemgmt", "root", "");
        } catch (ClassNotFoundException e) {
            Logger.getLogger(EditEmployeeAttendance.class.getName()).log(Level.SEVERE, null, e);
        } catch (SQLException e) {
            Logger.getLogger(EditEmployeeAttendance.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    
    public EditEmployeeAttendance() {
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
        btnSave = new javax.swing.JButton();
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("Please Enter Employee ID");

        tfEmpID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmpIDActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Edit Attendance Record");

        tfEmpName.setEditable(false);
        tfEmpName.setFocusable(false);

        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Name");

        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Time Out");

        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Overtime (Hours)");

        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Absent");

        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Date");

        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("Time In");

        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText("Late (Minutes)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 699, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(tfEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(tfEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(22, 22, 22)
                            .addComponent(tfDate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(250, 250, 250)
                            .addComponent(jLabel10))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(tfTimeIn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfTimeOut, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfOvertime, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addGap(119, 119, 119)
                            .addComponent(jLabel7)
                            .addGap(109, 109, 109)
                            .addComponent(jLabel8))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(tfAbsent, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(tfLate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(121, 121, 121)
                            .addComponent(jLabel14))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(242, 242, 242)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 499, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(14, 14, 14)
                    .addComponent(tfEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(25, 25, 25)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jLabel3)
                    .addGap(13, 13, 13)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(6, 6, 6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(jLabel10))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfTimeIn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfTimeOut, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfOvertime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(8, 8, 8)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel13)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8))
                    .addGap(26, 26, 26)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfAbsent, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfLate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9)
                        .addComponent(jLabel14))
                    .addGap(54, 54, 54)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void tfEmpIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmpIDActionPerformed
        try {
            String getEmpID = tfEmpID.getText();
            pst = con.prepareStatement("SELECT * FROM tbl_attendance WHERE emp_id =?");
            pst.setString(1, getEmpID);
            rs = pst.executeQuery();
            
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            
            if(rs.next() == true) {
                tfEmpName.setText(rs.getString(2));
                try {
                    tfDate.setDate(sdf.parse(rs.getString(3)));
                } catch (ParseException ex) {
                    Logger.getLogger(EditEmployeeAttendance.class.getName()).log(Level.SEVERE, null, ex);
                }
                tfTimeIn.setText(rs.getString(4));
                tfTimeOut.setText(rs.getString(5));
                tfOvertime.setText(rs.getString(6));
                tfLate.setText(rs.getString(7));
                tfAbsent.setText(rs.getString(8));
            }else {
                JOptionPane.showMessageDialog(this, "Employee ID does not exist. Please try again.", "ID cannot be found", JOptionPane.ERROR_MESSAGE);
                tfEmpID.setText("");
                tfEmpName.setText("");
                tfDate.setDate(null);
                tfTimeIn.setText("");
                tfTimeOut.setText("");
                tfOvertime.setText("");
                tfLate.setText("");
                tfAbsent.setText("");
            }
        }catch(SQLException e) {
            Logger.getLogger(EditEmployeeAttendance.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_tfEmpIDActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

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

                pst = con.prepareStatement("UPDATE tbl_attendance SET emp_id=?, emp_name=?, date=?, timein=?, timeout=?, overtime=?, late=?, absent=? WHERE emp_id=?");
                pst.setString(1, empID);
                pst.setString(2, empName);
                pst.setString(3, date);
                pst.setString(3, date);
                pst.setString(4, timeIn);
                pst.setString(5, timeOut);
                pst.setString(6, overT);
                pst.setString(7, late);
                pst.setString(8, absent);
                
                pst.setString(9, empID);

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
                Logger.getLogger(EditEmployeeAttendance.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int rep = JOptionPane.showConfirmDialog(this,"Do you wish to close this form?", "Cancel Edit Attendance Form",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
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
            java.util.logging.Logger.getLogger(EditEmployeeAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditEmployeeAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditEmployeeAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditEmployeeAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditEmployeeAttendance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
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
