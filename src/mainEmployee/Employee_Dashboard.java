/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mainEmployee;

import java.awt.*;
import javax.swing.*;
import main.LoginPage;

public class Employee_Dashboard extends javax.swing.JFrame {

    Color DefaultColor, ClickedColor;
    
    public Employee_Dashboard() {
        initComponents();
        
        DefaultColor  = new Color(48, 48, 48);
        ClickedColor = new Color(97, 97, 97);
        
        Dashboard_Menu.setBackground(ClickedColor);
        Payslip_Menu.setBackground(DefaultColor);
        Attendance_Menu.setBackground(DefaultColor);
        Logout_Menu.setBackground(DefaultColor);
    }

    public void updateUnameAndPos(String strU) {
        lblEmpUname.setText(strU);
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblEmpUname = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Dashboard_Menu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Payslip_Menu = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Attendance_Menu = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Logout_Menu = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(48, 48, 48));
        jPanel2.setPreferredSize(new java.awt.Dimension(180, 600));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ANGELO MIGUEL\\Documents\\icons8\\icons8-account-48.png")); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 15, -1, -1));

        lblEmpUname.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblEmpUname.setForeground(new java.awt.Color(255, 255, 255));
        lblEmpUname.setText("jLabel2");
        jPanel2.add(lblEmpUname, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, 20));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 160, 20));

        Dashboard_Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Dashboard_MenuMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Dashboard_MenuMousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ANGELO MIGUEL\\Documents\\icons8\\icons8-person-30.png")); // NOI18N
        jLabel2.setText("  Personal ");
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout Dashboard_MenuLayout = new javax.swing.GroupLayout(Dashboard_Menu);
        Dashboard_Menu.setLayout(Dashboard_MenuLayout);
        Dashboard_MenuLayout.setHorizontalGroup(
            Dashboard_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Dashboard_MenuLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        Dashboard_MenuLayout.setVerticalGroup(
            Dashboard_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Dashboard_MenuLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(Dashboard_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 180, 50));

        Payslip_Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Payslip_MenuMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Payslip_MenuMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\ANGELO MIGUEL\\Documents\\icons8\\icons8-payslip-30.png")); // NOI18N
        jLabel3.setText("  Payslip");

        javax.swing.GroupLayout Payslip_MenuLayout = new javax.swing.GroupLayout(Payslip_Menu);
        Payslip_Menu.setLayout(Payslip_MenuLayout);
        Payslip_MenuLayout.setHorizontalGroup(
            Payslip_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Payslip_MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        Payslip_MenuLayout.setVerticalGroup(
            Payslip_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Payslip_MenuLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(Payslip_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 180, 50));

        Attendance_Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Attendance_MenuMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Attendance_MenuMousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\ANGELO MIGUEL\\Documents\\icons8\\icons8-id-verified-30.png")); // NOI18N
        jLabel4.setText("  Attendance");

        javax.swing.GroupLayout Attendance_MenuLayout = new javax.swing.GroupLayout(Attendance_Menu);
        Attendance_Menu.setLayout(Attendance_MenuLayout);
        Attendance_MenuLayout.setHorizontalGroup(
            Attendance_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Attendance_MenuLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        Attendance_MenuLayout.setVerticalGroup(
            Attendance_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Attendance_MenuLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(Attendance_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 180, 50));

        Logout_Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Logout_MenuMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\ANGELO MIGUEL\\Documents\\icons8\\icons8-logout-30.png")); // NOI18N
        jLabel5.setText("  Logout");

        javax.swing.GroupLayout Logout_MenuLayout = new javax.swing.GroupLayout(Logout_Menu);
        Logout_Menu.setLayout(Logout_MenuLayout);
        Logout_MenuLayout.setHorizontalGroup(
            Logout_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Logout_MenuLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        Logout_MenuLayout.setVerticalGroup(
            Logout_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Logout_MenuLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(Logout_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 180, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(920, 631));
        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, -30, 920, 630));

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

    private void Dashboard_MenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Dashboard_MenuMousePressed
        Dashboard_Menu.setBackground(ClickedColor);
        Payslip_Menu.setBackground(DefaultColor);
        Attendance_Menu.setBackground(DefaultColor);
        Logout_Menu.setBackground(DefaultColor);
    }//GEN-LAST:event_Dashboard_MenuMousePressed

    private void Payslip_MenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Payslip_MenuMousePressed
        Dashboard_Menu.setBackground(DefaultColor);
        Payslip_Menu.setBackground(ClickedColor);
        Attendance_Menu.setBackground(DefaultColor);
        Logout_Menu.setBackground(DefaultColor);
    }//GEN-LAST:event_Payslip_MenuMousePressed

    private void Attendance_MenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Attendance_MenuMousePressed
        Dashboard_Menu.setBackground(DefaultColor);
        Payslip_Menu.setBackground(DefaultColor);
        Attendance_Menu.setBackground(ClickedColor);
        Logout_Menu.setBackground(DefaultColor);
    }//GEN-LAST:event_Attendance_MenuMousePressed

    private void Dashboard_MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Dashboard_MenuMouseClicked
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_Dashboard_MenuMouseClicked

    private void Payslip_MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Payslip_MenuMouseClicked
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_Payslip_MenuMouseClicked

    private void Attendance_MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Attendance_MenuMouseClicked
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_Attendance_MenuMouseClicked

    private void Logout_MenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Logout_MenuMousePressed
        int rep = JOptionPane.showConfirmDialog(this,"Do you want to logout?", "Logout Account",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        switch (rep) {
            case JOptionPane.YES_OPTION -> {
                new LoginPage().setVisible(true);
                this.dispose();
            }
            case JOptionPane.NO_OPTION -> this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            default -> this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_Logout_MenuMousePressed

    
    
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

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee_Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Attendance_Menu;
    private javax.swing.JPanel Dashboard_Menu;
    private javax.swing.JPanel Logout_Menu;
    private javax.swing.JPanel Payslip_Menu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JLabel lblEmpUname;
    // End of variables declaration//GEN-END:variables
}
