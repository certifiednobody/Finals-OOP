/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forEmployee;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ChangePasswordForm extends javax.swing.JFrame {

    public static String gl_emp_id;
    
    Connection con; 
    PreparedStatement pst;
    ResultSet rs;
    
    public void Connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/db_employeemgmt", "root", "");
        } catch (ClassNotFoundException e) {
            Logger.getLogger(ChangePasswordForm.class.getName()).log(Level.SEVERE, null, e);
        } catch (SQLException e) {
            Logger.getLogger(ChangePasswordForm.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public ChangePasswordForm() {
        initComponents();
        Connect();
        
        lblNewPass.setVisible(false);
        tfNewPass.setVisible(false);
        btnChange.setVisible(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        tfEmpID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfOldPass = new javax.swing.JTextField();
        lblNewPass = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        tfNewPass = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnChange = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("Change Account Password");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 16, -1, -1));

        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Please fill out the information below.");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 45, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 80, 460, 10));
        jPanel1.add(tfEmpID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 250, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("ID:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, -1));
        jPanel1.add(tfOldPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 250, 30));

        lblNewPass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNewPass.setText("New Password:");
        jPanel1.add(lblNewPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 220, -1, -1));

        btnSubmit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSubmit.setText("SUBMIT");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 150, 40));
        jPanel1.add(tfNewPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 250, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Current Password:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        btnChange.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnChange.setText("CHANGE");
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });
        jPanel1.add(btnChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 150, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        String empID = tfEmpID.getText();
        String pass = tfOldPass.getText();
        int x = 0;
        
        if(tfEmpID.getText().isEmpty() || tfOldPass.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Fill Out the Form", "Complete The Form",JOptionPane.ERROR_MESSAGE);
        }else {
            try {
                pst = con.prepareStatement("SELECT * FROM employee_accounts WHERE emp_id='"+empID+"' AND emp_password='"+pass+"'");
                rs = pst.executeQuery();
                
                while(rs.next()) {
                    String id = rs.getString(2);
                    String password = rs.getString(6);
                    
                    if(empID.equals(id) && pass.equals(password)) {
                        x++;
                        
                        JOptionPane.showMessageDialog(null, "Enter your new Password");
        
                        lblNewPass.setVisible(true);
                        tfNewPass.setVisible(true);
                        
                        tfEmpID.setEditable(false);
                        tfOldPass.setEditable(false);
                        
                        btnChange.setVisible(true);
                        btnSubmit.setVisible(false);
                        
                    }else {
                        tfEmpID.setText("");
                        tfOldPass.setText("");
                    }
                }   
            } catch (SQLException ex) {  
                Logger.getLogger(ChangePasswordForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        if(tfNewPass.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Enter your New Password", "Complete The Form",JOptionPane.ERROR_MESSAGE);
        }else {
            try {
                String newpass = tfNewPass.getText();
                
                pst = con.prepareStatement("UPDATE employee_accounts SET emp_password=? WHERE emp_id=?");
                pst.setString(1,newpass);
                pst.setString(2, gl_emp_id);
                
                int k = pst.executeUpdate();
                
                if(k == 1) {
                    JOptionPane.showMessageDialog(this, "Password Successfully Changed.");
                    this.dispose();
                }
                    
            } catch (SQLException ex) {
                Logger.getLogger(ChangePasswordForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_btnChangeActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(ChangePasswordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePasswordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePasswordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePasswordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePasswordForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChange;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblNewPass;
    private javax.swing.JTextField tfEmpID;
    private javax.swing.JTextField tfNewPass;
    private javax.swing.JTextField tfOldPass;
    // End of variables declaration//GEN-END:variables
}
