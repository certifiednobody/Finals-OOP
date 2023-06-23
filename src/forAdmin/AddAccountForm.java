/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forAdmin;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class AddAccountForm extends javax.swing.JFrame {

    Connection con; 
    PreparedStatement pst;
    ResultSet rs;
    
    public void Connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/db_employeemgmt", "root", "");
        } catch (ClassNotFoundException e) {
            Logger.getLogger(AddAccountForm.class.getName()).log(Level.SEVERE, null, e);
        } catch (SQLException e) {
            Logger.getLogger(AddAccountForm.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public AddAccountForm() {
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
        tfEmpName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfEmpRole = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfEmpUname = new javax.swing.JTextField();
        tfEmpPass = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        tfEmpID = new javax.swing.JTextField();
        dcDateCreated = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();

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
        jLabel1.setText("New Account Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 16, -1, -1));

        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Please fill out the information below.");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 45, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 80, 590, 10));
        jPanel1.add(tfEmpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 300, 30));

        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));
        jPanel1.add(tfEmpRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 250, 30));

        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Role");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));
        jPanel1.add(tfEmpUname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 250, 30));
        jPanel1.add(tfEmpPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 250, 30));

        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("Username");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("Password");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, -1, -1));

        btnSubmit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSubmit.setText("SUBMIT");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 150, 40));

        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("Employee ID");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));

        tfEmpID.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(tfEmpID, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 250, 30));
        jPanel1.add(dcDateCreated, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 200, 30));

        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Date Created");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        if(tfEmpID.getText().isEmpty() ||tfEmpName.getText().isEmpty() || tfEmpRole.getText().isEmpty() || tfEmpUname.getText().isEmpty() || tfEmpPass.getText().isEmpty() || dcDateCreated.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Please Fill Out the Form", "Complete The Form",JOptionPane.ERROR_MESSAGE);
        }else {
            try{
                java.util.Date d = dcDateCreated.getDate();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                
                String empID = tfEmpID.getText();
                String empRole = tfEmpRole.getText();
                String empName = tfEmpName.getText();
                String empUsername = tfEmpUname.getText();
                String empPassword = tfEmpPass.getText();
                String empDateHired = sdf.format(d);
                
                pst = con.prepareStatement("INSERT INTO employee_accounts(emp_id, emp_role, emp_name, emp_username, emp_password, emp_date_created) VALUES(?,?,?,?,?,?)");
                pst.setString(1, empID);
                pst.setString(2, empRole);
                pst.setString(3, empName);
                pst.setString(4, empUsername);
                pst.setString(5, empPassword);
                pst.setString(6, empDateHired);
                
                int k = pst.executeUpdate();
            
                if(k == 1) {
                    JOptionPane.showMessageDialog(this, "Account Added Successfully. Please Refresh the Table");
                    tfEmpID.setText("");
                    tfEmpRole.setText("");
                    tfEmpName.setText("");
                    tfEmpUname.setText(""); 
                    tfEmpPass.setText("");
                    dcDateCreated.setDate(null);
                    
                    this.dispose();
                }
            }catch(SQLException e) {
                Logger.getLogger(AddAccountForm.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int rep = JOptionPane.showConfirmDialog(this,"Do you wish to close this form?", "Cancel Add Employee Form",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        switch (rep) {
            case JOptionPane.YES_OPTION -> this.setDefaultCloseOperation(AddAccountForm.DISPOSE_ON_CLOSE);
            case JOptionPane.NO_OPTION -> this.setDefaultCloseOperation(AddAccountForm.DO_NOTHING_ON_CLOSE);
            default -> this.setDefaultCloseOperation(AddAccountForm.DO_NOTHING_ON_CLOSE);
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
            java.util.logging.Logger.getLogger(AddAccountForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddAccountForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddAccountForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddAccountForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddAccountForm().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnSubmit;
    private com.toedter.calendar.JDateChooser dcDateCreated;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField tfEmpID;
    private javax.swing.JTextField tfEmpName;
    private javax.swing.JTextField tfEmpPass;
    private javax.swing.JTextField tfEmpRole;
    private javax.swing.JTextField tfEmpUname;
    // End of variables declaration//GEN-END:variables
}
