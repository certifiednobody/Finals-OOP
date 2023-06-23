/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forAdmin;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class SelectedAccountForm extends javax.swing.JFrame {

    Connection con; 
    PreparedStatement pst;
    ResultSet rs;
    
    public void Connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/db_employeemgmt", "root", "");
        } catch (ClassNotFoundException e) {
            Logger.getLogger(SelectedAccountForm.class.getName()).log(Level.SEVERE, null, e);
        } catch (SQLException e) {
            Logger.getLogger(SelectedAccountForm.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public SelectedAccountForm() {
        Connect();
        initComponents();
        
        btnSave.setVisible(false);
        btnCancel.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnEdit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        tfEmpName = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        tfEmpRole = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfEmpUname = new javax.swing.JTextField();
        tfEmpPass = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tfEmpID = new javax.swing.JTextField();
        dcDateCreated = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();

        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Name");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 510));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEdit.setText("EDIT");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel1.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 100, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("Account Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 16, -1, -1));

        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Please fill out the information below.");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 45, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 80, 600, 10));

        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 100, 40));

        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 100, 40));

        btnCancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancel.setText("CANCEL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 100, 40));
        jPanel1.add(tfEmpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 300, 30));

        jLabel15.setForeground(new java.awt.Color(153, 153, 153));
        jLabel15.setText("Name");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));
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

        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("Employee ID");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));

        tfEmpID.setEditable(false);
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int rep = JOptionPane.showConfirmDialog(this,"Do you wish to close this form?", "Close This Form",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        switch (rep) {
            case JOptionPane.YES_OPTION -> this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            case JOptionPane.NO_OPTION -> this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            default -> this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosing

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        tfEmpID.setEditable(true);
        tfEmpRole.setEditable(true);
        tfEmpName.setEditable(true);
        dcDateCreated.setEnabled(true);
        tfEmpUname.setEditable(true);
        tfEmpPass.setEditable(true);
        
        btnSave.setVisible(true);
        btnCancel.setVisible(true);
        btnEdit.setEnabled(false);
        btnDelete.setEnabled(false);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if(tfEmpID.getText().isEmpty() ||tfEmpRole.getText().isEmpty() || tfEmpName.getText().isEmpty() || tfEmpUname.getText().isEmpty() || tfEmpPass.getText().isEmpty() || dcDateCreated.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Please Fill Out the Form", "Complete The Form",JOptionPane.ERROR_MESSAGE);
        }else {
            try {
                java.util.Date d = dcDateCreated.getDate();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                
                String empID = tfEmpID.getText();
                String empRole = tfEmpRole.getText();
                String empName = tfEmpName.getText();
                String dateCreated = sdf.format(d);
                String empUsername = tfEmpUname.getText();
                String empPassword = tfEmpPass.getText();

                pst = con.prepareStatement("UPDATE employee_accounts SET emp_ID=?, emp_role=?, emp_name=?, emp_username=?, emp_password=?, emp_date_created=? WHERE emp_id=?");
                pst.setString(1, empID);
                pst.setString(2, empRole);
                pst.setString(3, empName);
                pst.setString(4, empUsername);
                pst.setString(5, empPassword);
                pst.setString(6, dateCreated);
                
                pst.setString(7, empID);
                
                int k = pst.executeUpdate();
                if(k == 1) {
                    JOptionPane.showMessageDialog(this, "Account has been updated Successfully. Please Refresh the Table");
                    tfEmpID.setText("");
                    tfEmpRole.setText("");
                    tfEmpName.setText("");
                    tfEmpUname.setText(""); 
                    tfEmpPass.setText("");
                    dcDateCreated.setDate(null);

                    this.dispose();
                }
            }catch(SQLException e) {
                Logger.getLogger(SelectedAccountForm.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        try {
            pst = con.prepareStatement("SELECT * FROM employee_accounts");
            rs = pst.executeQuery();
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            
            if(rs.next() == true) {
                tfEmpID.setText(rs.getString(2));
                tfEmpRole.setText(rs.getString(3));
                tfEmpName.setText(rs.getString(4));
                tfEmpUname.setText(rs.getString(5));
                tfEmpPass.setText(rs.getString(6));
                try {
                    dcDateCreated.setDate(sdf.parse(rs.getString(7)));
                } catch (ParseException ex) {
                    Logger.getLogger(SelectedAccountForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(SelectedAccountForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        tfEmpID.setEditable(false);
        tfEmpRole.setEditable(false);
        tfEmpName.setEditable(false);
        tfEmpUname.setEditable(false);
        tfEmpPass.setEditable(false);
        dcDateCreated.setEnabled(false);
        
        btnSave.setVisible(false);
        btnCancel.setVisible(false);
        btnEdit.setEnabled(true);
        btnDelete.setEnabled(true);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int rep = JOptionPane.showConfirmDialog(this,"Do you really want to delete this account?", "Delete Account",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        switch (rep) {
            case JOptionPane.YES_OPTION:
                try {
                    String getID = tfEmpID.getText();
                    pst = con.prepareStatement("DELETE FROM employee_accounts WHERE emp_id =?");
                    pst.setString(1, getID);
                    
                    int k = pst.executeUpdate();
                    
                    if(k == 1) {
                        JOptionPane.showMessageDialog(this, "Account successfully Deleted. Please Refresh the Table");
                        
                        tfEmpID.setText("");
                        tfEmpRole.setText("");
                        tfEmpName.setText("");
                        tfEmpUname.setText("");
                        tfEmpPass.setText("");
                        dcDateCreated.setDate(null);
                        
                        this.dispose();
                    }
                }catch(SQLException e) {
                    Logger.getLogger(SelectedAccountForm.class.getName()).log(Level.SEVERE, null, e);
                }   this.setDefaultCloseOperation(SelectedAccountForm.DISPOSE_ON_CLOSE);
                break;
            case JOptionPane.NO_OPTION:
                this.setDefaultCloseOperation(SelectedAccountForm.DO_NOTHING_ON_CLOSE);
                break;
            default:
                this.setDefaultCloseOperation(SelectedAccountForm.DO_NOTHING_ON_CLOSE);
                break;
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(SelectedAccountForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectedAccountForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectedAccountForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectedAccountForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectedAccountForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    public com.toedter.calendar.JDateChooser dcDateCreated;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JTextField tfEmpID;
    public javax.swing.JTextField tfEmpName;
    public javax.swing.JTextField tfEmpPass;
    public javax.swing.JTextField tfEmpRole;
    public javax.swing.JTextField tfEmpUname;
    // End of variables declaration//GEN-END:variables
}
