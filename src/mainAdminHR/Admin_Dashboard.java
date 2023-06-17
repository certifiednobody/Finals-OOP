/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mainAdminHR;

import java.awt.*;
import javax.swing.*;
import main.LoginPage;

public class Admin_Dashboard extends javax.swing.JFrame {

    Color DefaultColor, ClickedColor;
    
    public Admin_Dashboard() {
        initComponents();
        
        DefaultColor  = new Color(48, 48, 48);
        ClickedColor = new Color(97, 97, 97);
        
        Dashboard_Menu.setBackground(ClickedColor);
        Employee_Menu.setBackground(DefaultColor);
        Salary_Menu.setBackground(DefaultColor);
        Attendance_Menu.setBackground(DefaultColor);
        Logout_Menu.setBackground(DefaultColor);
    }

    public void update_username(String str) {
        adminUsername.setText(str);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Dashboard_Menu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Employee_Menu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Salary_Menu = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Attendance_Menu = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        adminUsername = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Logout_Menu = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        dashboardPanel1 = new mainAdminHR.DashboardPanel();
        employeesPanel2 = new mainAdminHR.EmployeesPanel();
        salaryPanel1 = new mainAdminHR.SalaryPanel();
        attendancePanel2 = new mainAdminHR.AttendancePanel();

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

        jPanel3.setBackground(new java.awt.Color(48, 48, 48));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Dashboard_Menu.setPreferredSize(new java.awt.Dimension(168, 50));
        Dashboard_Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Dashboard_MenuMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Dashboard_MenuMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Dashboard_MenuMouseReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ANGELO MIGUEL\\Documents\\icons8\\icons8-home-30.png")); // NOI18N
        jLabel2.setText("  Dashboard");
        jLabel2.setPreferredSize(new java.awt.Dimension(168, 40));

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
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel3.add(Dashboard_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 180, -1));

        Employee_Menu.setPreferredSize(new java.awt.Dimension(180, 50));
        Employee_Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Employee_MenuMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Employee_MenuMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ANGELO MIGUEL\\Documents\\icons8\\icons8-employees-30.png")); // NOI18N
        jLabel1.setText("  Employees");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setPreferredSize(new java.awt.Dimension(168, 40));

        javax.swing.GroupLayout Employee_MenuLayout = new javax.swing.GroupLayout(Employee_Menu);
        Employee_Menu.setLayout(Employee_MenuLayout);
        Employee_MenuLayout.setHorizontalGroup(
            Employee_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Employee_MenuLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        Employee_MenuLayout.setVerticalGroup(
            Employee_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel3.add(Employee_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 180, 50));

        Salary_Menu.setPreferredSize(new java.awt.Dimension(180, 50));
        Salary_Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Salary_MenuMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Salary_MenuMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\ANGELO MIGUEL\\Documents\\icons8\\icons8-payroll-30.png")); // NOI18N
        jLabel3.setText("  Payroll");
        jLabel3.setPreferredSize(new java.awt.Dimension(168, 40));

        javax.swing.GroupLayout Salary_MenuLayout = new javax.swing.GroupLayout(Salary_Menu);
        Salary_Menu.setLayout(Salary_MenuLayout);
        Salary_MenuLayout.setHorizontalGroup(
            Salary_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Salary_MenuLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        Salary_MenuLayout.setVerticalGroup(
            Salary_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel3.add(Salary_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, -1, -1));

        Attendance_Menu.setPreferredSize(new java.awt.Dimension(180, 50));
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
        jLabel4.setPreferredSize(new java.awt.Dimension(168, 40));

        javax.swing.GroupLayout Attendance_MenuLayout = new javax.swing.GroupLayout(Attendance_Menu);
        Attendance_Menu.setLayout(Attendance_MenuLayout);
        Attendance_MenuLayout.setHorizontalGroup(
            Attendance_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Attendance_MenuLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        Attendance_MenuLayout.setVerticalGroup(
            Attendance_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel3.add(Attendance_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, -1, -1));
        Attendance_Menu.getAccessibleContext().setAccessibleName("");

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\ANGELO MIGUEL\\Documents\\icons8\\icons8-account-48.png")); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 15, -1, -1));

        adminUsername.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        adminUsername.setForeground(new java.awt.Color(255, 255, 255));
        adminUsername.setText("Username");
        jPanel3.add(adminUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, 20));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Admin");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 160, 20));

        Logout_Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Logout_MenuMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Logout_MenuMousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\ANGELO MIGUEL\\Documents\\icons8\\icons8-logout-30.png")); // NOI18N
        jLabel6.setText("  Logout");
        jLabel6.setPreferredSize(new java.awt.Dimension(168, 40));

        javax.swing.GroupLayout Logout_MenuLayout = new javax.swing.GroupLayout(Logout_Menu);
        Logout_Menu.setLayout(Logout_MenuLayout);
        Logout_MenuLayout.setHorizontalGroup(
            Logout_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Logout_MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
        Logout_MenuLayout.setVerticalGroup(
            Logout_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel3.add(Logout_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 180, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 600));

        jTabbedPane1.addTab("tab1", dashboardPanel1);
        jTabbedPane1.addTab("tab2", employeesPanel2);
        jTabbedPane1.addTab("tab5", salaryPanel1);

        javax.swing.GroupLayout attendancePanel2Layout = new javax.swing.GroupLayout(attendancePanel2);
        attendancePanel2.setLayout(attendancePanel2Layout);
        attendancePanel2Layout.setHorizontalGroup(
            attendancePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 920, Short.MAX_VALUE)
        );
        attendancePanel2Layout.setVerticalGroup(
            attendancePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 599, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab4", attendancePanel2);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, -30, 920, 630));

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

    private void Employee_MenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Employee_MenuMousePressed
        Dashboard_Menu.setBackground(DefaultColor);
        Employee_Menu.setBackground(ClickedColor);
        Salary_Menu.setBackground(DefaultColor);
        Attendance_Menu.setBackground(DefaultColor);
        Logout_Menu.setBackground(DefaultColor);
    }//GEN-LAST:event_Employee_MenuMousePressed

    private void Employee_MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Employee_MenuMouseClicked
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_Employee_MenuMouseClicked

    private void Salary_MenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Salary_MenuMousePressed
        Dashboard_Menu.setBackground(DefaultColor);
        Employee_Menu.setBackground(DefaultColor);
        Salary_Menu.setBackground(ClickedColor);
        Attendance_Menu.setBackground(DefaultColor);        
        Logout_Menu.setBackground(DefaultColor);
    }//GEN-LAST:event_Salary_MenuMousePressed

    private void Salary_MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Salary_MenuMouseClicked
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_Salary_MenuMouseClicked

    private void Attendance_MenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Attendance_MenuMousePressed
        Dashboard_Menu.setBackground(DefaultColor);
        Employee_Menu.setBackground(DefaultColor);
        Salary_Menu.setBackground(DefaultColor);
        Attendance_Menu.setBackground(ClickedColor);
        Logout_Menu.setBackground(DefaultColor);
    }//GEN-LAST:event_Attendance_MenuMousePressed

    private void Attendance_MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Attendance_MenuMouseClicked
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_Attendance_MenuMouseClicked

    private void Dashboard_MenuMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Dashboard_MenuMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Dashboard_MenuMouseReleased

    private void Dashboard_MenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Dashboard_MenuMousePressed
        Dashboard_Menu.setBackground(ClickedColor);
        Employee_Menu.setBackground(DefaultColor);
        Salary_Menu.setBackground(DefaultColor);
        Attendance_Menu.setBackground(DefaultColor);
        Logout_Menu.setBackground(DefaultColor);
    }//GEN-LAST:event_Dashboard_MenuMousePressed

    private void Dashboard_MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Dashboard_MenuMouseClicked
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_Dashboard_MenuMouseClicked

    private void Logout_MenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Logout_MenuMousePressed

    }//GEN-LAST:event_Logout_MenuMousePressed

    private void Logout_MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Logout_MenuMouseClicked
        
        int rep = JOptionPane.showConfirmDialog(this,"Do you want to logout?", "Logout Account",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        switch (rep) {
            case JOptionPane.YES_OPTION -> {
                new LoginPage().setVisible(true);
                this.dispose();
            }
            case JOptionPane.NO_OPTION -> this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            default -> this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_Logout_MenuMouseClicked

    
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
    private javax.swing.JPanel Attendance_Menu;
    private javax.swing.JPanel Dashboard_Menu;
    private javax.swing.JPanel Employee_Menu;
    private javax.swing.JPanel Logout_Menu;
    private javax.swing.JPanel Salary_Menu;
    public javax.swing.JLabel adminUsername;
    private mainAdminHR.AttendancePanel attendancePanel2;
    private mainAdminHR.DashboardPanel dashboardPanel1;
    private mainAdminHR.EmployeesPanel employeesPanel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private mainAdminHR.SalaryPanel salaryPanel1;
    // End of variables declaration//GEN-END:variables
}
