/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package forAdmin;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class AccountsTab extends javax.swing.JPanel {
    
    Connection con;
    PreparedStatement pst; 
    ResultSet rs;
    
    
    public void Connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/db_employeemgmt", "root", "");
        } catch (ClassNotFoundException e) {
            Logger.getLogger(AccountsTab.class.getName()).log(Level.SEVERE, null, e);
        } catch (SQLException e) {
            Logger.getLogger(AccountsTab.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void Fetch() {
        try {
            pst = con.prepareStatement("SELECT * FROM employee_accounts");
            rs = pst.executeQuery();
            
            int q;
            ResultSetMetaData rss = rs.getMetaData();
            q = rss.getColumnCount();
            
            DefaultTableModel dtm = (DefaultTableModel)
            
            tableAccounts.getModel();
            dtm.setRowCount(0);
            
            while(rs.next()) {
                Vector v2 = new Vector();
                for(int y = 1; y <= q; y++) {
                    v2.add(rs.getString("emp_id"));
                    v2.add(rs.getString("emp_role"));
                    v2.add(rs.getString("emp_name"));
                    v2.add(rs.getString("emp_username"));
                    v2.add(rs.getString("emp_password"));
                    v2.add(rs.getString("emp_date_created"));
                }
                dtm.addRow(v2);
            }
                
        }catch(SQLException e) {
            Logger.getLogger(AccountsTab.class.getName()).log(Level.SEVERE, null, e);           
        }
    }
    
    public AccountsTab() {
        initComponents();
        Connect();
        Fetch();
       
        tableAccounts.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tableAccounts.getTableHeader().setOpaque(false);
        tableAccounts.getTableHeader().setBackground(new Color(255, 255, 255));
        tableAccounts.getTableHeader().setForeground(new Color(101,101,101));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAccounts = new javax.swing.JTable();
        tfSearchAccounts = new javax.swing.JTextField();
        btnNewAccount = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblRefresh = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableAccounts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ROLE", "NAME", "USERNAME", "PASSWORD", "DATE CREATED"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableAccounts.setRowHeight(40);
        tableAccounts.setShowHorizontalLines(true);
        tableAccounts.getTableHeader().setReorderingAllowed(false);
        tableAccounts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableAccountsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableAccounts);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1100, 360));

        tfSearchAccounts.setForeground(new java.awt.Color(153, 153, 153));
        tfSearchAccounts.setText("Search Accounts");
        tfSearchAccounts.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfSearchAccountsFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfSearchAccountsFocusLost(evt);
            }
        });
        tfSearchAccounts.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfSearchAccountsKeyReleased(evt);
            }
        });
        jPanel1.add(tfSearchAccounts, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 97, 250, 30));

        btnNewAccount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNewAccount.setText("New Account");
        btnNewAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewAccountActionPerformed(evt);
            }
        });
        jPanel1.add(btnNewAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 85, -1, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ANGELO MIGUEL\\Documents\\icons8\\icons8-employees-60.png")); // NOI18N
        jLabel1.setText("  Accounts");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        lblRefresh.setIcon(new javax.swing.ImageIcon("C:\\Users\\ANGELO MIGUEL\\Documents\\icons8\\icons8-refresh-30.png")); // NOI18N
        lblRefresh.setToolTipText("Refresh Table");
        lblRefresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRefreshMouseClicked(evt);
            }
        });
        jPanel1.add(lblRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 90, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void tableAccountsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableAccountsMouseClicked
        try {
            SelectedAccountForm saf = new SelectedAccountForm();

            int index = tableAccounts.getSelectedRow();
            DefaultTableModel dtm = (DefaultTableModel)tableAccounts.getModel();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            String id = dtm.getValueAt(index, 0).toString();
            String role = dtm.getValueAt(index, 1).toString();
            String name = dtm.getValueAt(index, 2).toString();
            String username = dtm.getValueAt(index, 3).toString();
            String password = dtm.getValueAt(index, 4).toString();
            String dateCreated = dtm.getValueAt(index, 5).toString();
            saf.setVisible(true);
            saf.pack();
            saf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            saf.tfEmpID.setText(id);
            saf.tfEmpName.setText(name);
            saf.tfEmpRole.setText(role);
            saf.tfEmpUname.setText(username);
            saf.tfEmpPass.setText(password);
            saf.dcDateCreated.setDate(sdf.parse(dateCreated));

        } catch (ParseException ex) {
            Logger.getLogger(AccountsTab.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tableAccountsMouseClicked

    private void tfSearchAccountsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfSearchAccountsFocusGained
        if(tfSearchAccounts.getText().equals("Search Accounts")) {
            tfSearchAccounts.setText("");
            tfSearchAccounts.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_tfSearchAccountsFocusGained

    private void tfSearchAccountsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfSearchAccountsFocusLost
        if(tfSearchAccounts.getText().equals("")) {
            tfSearchAccounts.setText("Search Accounts");
            tfSearchAccounts.setForeground(new Color(174,178,182));
        }
    }//GEN-LAST:event_tfSearchAccountsFocusLost

    private void tfSearchAccountsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchAccountsKeyReleased
        String searchText = tfSearchAccounts.getText();
        try {
            int y;
            pst = con.prepareStatement("SELECT * FROM employee_accounts WHERE emp_id LIKE '%"+ searchText + "%' OR emp_role LIKE '%"+ searchText + "%' OR emp_name LIKE '%"+ searchText + "%'");
            rs = pst.executeQuery();
            ResultSetMetaData rss = rs.getMetaData();
            y = rss.getColumnCount();

            DefaultTableModel dtm = (DefaultTableModel)tableAccounts.getModel();
            dtm.setRowCount(0);

            while(rs.next()) {
                Vector v2 = new Vector();
                for(int x = 1; x <= y; x++) {
                    v2.add(rs.getString("emp_id"));
                    v2.add(rs.getString("emp_role"));
                    v2.add(rs.getString("emp_name"));
                    v2.add(rs.getString("emp_username"));
                    v2.add(rs.getString("emp_password"));
                    v2.add(rs.getString("emp_date_created"));
                }
                dtm.addRow(v2);
            }
        }catch(SQLException e) {
            Logger.getLogger(AccountsTab.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_tfSearchAccountsKeyReleased

    private void btnNewAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewAccountActionPerformed
        new AddAccountForm().setVisible(true);
    }//GEN-LAST:event_btnNewAccountActionPerformed

    private void lblRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRefreshMouseClicked
        Fetch();
    }//GEN-LAST:event_lblRefreshMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNewAccount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRefresh;
    private javax.swing.JTable tableAccounts;
    private javax.swing.JTextField tfSearchAccounts;
    // End of variables declaration//GEN-END:variables
}
