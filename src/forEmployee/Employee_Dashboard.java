/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forEmployee;

import java.sql.*;
import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import main.LoginPage;

public class Employee_Dashboard extends javax.swing.JFrame {

    public static String gl_emp_id = "";
    
    Connection con; 
    PreparedStatement pst;
    ResultSet rs;
    
    public void Connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/db_employeemgmt", "root", "");
        } catch (ClassNotFoundException e) {
            Logger.getLogger(Employee_Dashboard.class.getName()).log(Level.SEVERE, null, e);
        } catch (SQLException e) {
            Logger.getLogger(Employee_Dashboard.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void top(String param_emp_id) {
        try {
            pst = con.prepareStatement("SELECT * FROM employee_accounts WHERE emp_id=?");
            pst.setString(1, param_emp_id);
            rs = pst.executeQuery();
            
            if(rs.next() == true) {
                lblRole.setText(rs.getString(3));
                lblUsername.setText(rs.getString(5));
            }
            
        }catch(SQLException e) {
            Logger.getLogger(Employee_Dashboard.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public Employee_Dashboard() {
        initComponents();
        Connect();
        top(gl_emp_id);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblLogout = new javax.swing.JLabel();
        lblLogout1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        personalInfo2 = new forEmployee.PersonalInfo();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ANGELO MIGUEL\\Documents\\icons8\\icons8-account-48.png")); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 5, -1, 50));

        lblRole.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblRole.setText("Role");
        jPanel2.add(lblRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        lblUsername.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        lblUsername.setText("Username");
        jPanel2.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 320, 20));

        jSeparator1.setBackground(new java.awt.Color(242, 244, 246));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 59, 1100, -1));
        jPanel2.add(lblLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 15, -1, -1));

        lblLogout1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ANGELO MIGUEL\\Documents\\icons8\\icons8-logout-30.png")); // NOI18N
        lblLogout1.setToolTipText("Logout ");
        lblLogout1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLogout1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogout1MouseClicked(evt);
            }
        });
        jPanel2.add(lblLogout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 15, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jTabbedPane1.addTab("Personal Information", personalInfo2);

        jPanel3.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 1100, 540));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1100, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblLogout1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogout1MouseClicked
        int rep = JOptionPane.showConfirmDialog(this,"Do you want to logout?", "Logout Account",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        switch (rep) {
            case JOptionPane.YES_OPTION -> {
                new LoginPage().setVisible(true);
                this.dispose();
            }
            case JOptionPane.NO_OPTION -> this.setDefaultCloseOperation(Employee_Dashboard.DO_NOTHING_ON_CLOSE);
            default -> this.setDefaultCloseOperation(Employee_Dashboard.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_lblLogout1MouseClicked

    
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
            java.util.logging.Logger.getLogger(Employee_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee_Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblLogout1;
    public javax.swing.JLabel lblRole;
    public javax.swing.JLabel lblUsername;
    private forEmployee.PersonalInfo personalInfo2;
    // End of variables declaration//GEN-END:variables
}
