/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forAdmin;

import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import main.LoginPage;

public class Admin_Dashboard extends javax.swing.JFrame {
    
    Connection con; 
    PreparedStatement pst;    
    ResultSet rs;    

    
    
    public void Connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/db_employeemgmt", "root", "");
        } catch (ClassNotFoundException e) {
            Logger.getLogger(Admin_Dashboard.class.getName()).log(Level.SEVERE, null, e);
        } catch (SQLException e) {
            Logger.getLogger(Admin_Dashboard.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void update_username(String str) {
        adminUsername.setText(str);
    }
    
    public Admin_Dashboard() {
        initComponents();
        Connect();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        adminUsername = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        accountsTab1 = new forAdmin.AccountsTab();
        employeesTab1 = new forAdmin.EmployeesTab();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(250, 252, 254));
        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\ANGELO MIGUEL\\Documents\\icons8\\icons8-account-48.png")); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 5, -1, 50));

        adminUsername.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        adminUsername.setForeground(new java.awt.Color(24, 33, 48));
        adminUsername.setText("Username");
        jPanel3.add(adminUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, 20));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(24, 33, 48));
        jLabel7.setText("Administrator");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        lblLogout.setIcon(new javax.swing.ImageIcon("C:\\Users\\ANGELO MIGUEL\\Documents\\icons8\\icons8-logout-30.png")); // NOI18N
        lblLogout.setToolTipText("Logout ");
        lblLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
        });
        jPanel3.add(lblLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 15, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(242, 244, 246));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 59, 1100, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jTabbedPane2.setPreferredSize(new java.awt.Dimension(1100, 499));
        jTabbedPane2.addTab("Accounts", accountsTab1);
        jTabbedPane2.addTab("Employees", employeesTab1);

        jPanel2.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 1100, 540));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1100, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        int rep = JOptionPane.showConfirmDialog(this,"Do you want to logout?", "Logout Account",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        switch (rep) {
            case JOptionPane.YES_OPTION -> {
                new LoginPage().setVisible(true);
                this.dispose();
            }
            case JOptionPane.NO_OPTION -> this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            default -> this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_lblLogoutMouseClicked
    
    
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
            java.util.logging.Logger.getLogger(Admin_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Dashboard().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private forAdmin.AccountsTab accountsTab1;
    public javax.swing.JLabel adminUsername;
    private forAdmin.EmployeesTab employeesTab1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel lblLogout;
    // End of variables declaration//GEN-END:variables
}
