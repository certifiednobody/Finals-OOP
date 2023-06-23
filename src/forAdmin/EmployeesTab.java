/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package forAdmin;

import java.awt.*;
import java.sql.*;
import java.text.ParseException;
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class EmployeesTab extends javax.swing.JPanel {

    Connection con;
    PreparedStatement pst; 
    ResultSet rs;
    
    
    public void Connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/db_employeemgmt", "root", "");
        } catch (ClassNotFoundException e) {
            Logger.getLogger(EmployeesTab.class.getName()).log(Level.SEVERE, null, e);
        } catch (SQLException e) {
            Logger.getLogger(EmployeesTab.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void Fetch() {
        try {
            pst = con.prepareStatement("SELECT * FROM employees");
            rs = pst.executeQuery();
            
            int q;
            ResultSetMetaData rss = rs.getMetaData();
            q = rss.getColumnCount();
            
            DefaultTableModel dtm = (DefaultTableModel)
            
            tableEmployees.getModel();
            dtm.setRowCount(0);
            
            while(rs.next()) {
                Vector v2 = new Vector();
                for(int y = 1; y <= q; y++) {
                    v2.add(rs.getString("id"));
                    v2.add(rs.getString("name"));
                    v2.add(rs.getString("status"));
                    v2.add(rs.getString("department"));
                    v2.add(rs.getString("position"));
                    v2.add(rs.getString("phone_number"));
                    v2.add(rs.getString("email"));
                    v2.add(rs.getString("date_hired"));
                }
                dtm.addRow(v2);
            }
                
        }catch(SQLException e) {
            Logger.getLogger(EmployeesTab.class.getName()).log(Level.SEVERE, null, e);           
        }
    }
    
    
    public EmployeesTab() {
        initComponents();
        Connect();
        Fetch();
        
        tableEmployees.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tableEmployees.getTableHeader().setOpaque(false);
        tableEmployees.getTableHeader().setBackground(new Color(255, 255, 255));
        tableEmployees.getTableHeader().setForeground(new Color(101,101,101));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEmployees = new javax.swing.JTable();
        tfSearchEmployees = new javax.swing.JTextField();
        btnAddEmployee = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblRefresh = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableEmployees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "STATUS", "DEPARTMENT", "POSITION", "CONTACT NUMBER", "EMAIL", "DATE HIRED"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableEmployees.setRowHeight(40);
        tableEmployees.setShowHorizontalLines(true);
        tableEmployees.getTableHeader().setReorderingAllowed(false);
        tableEmployees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableEmployeesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableEmployees);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1100, 360));

        tfSearchEmployees.setForeground(new java.awt.Color(153, 153, 153));
        tfSearchEmployees.setText("Search Employees");
        tfSearchEmployees.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfSearchEmployeesFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfSearchEmployeesFocusLost(evt);
            }
        });
        tfSearchEmployees.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfSearchEmployeesKeyReleased(evt);
            }
        });
        jPanel1.add(tfSearchEmployees, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 97, 250, 30));

        btnAddEmployee.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAddEmployee.setText("Add Employee");
        btnAddEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEmployeeActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 85, -1, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ANGELO MIGUEL\\Documents\\icons8\\icons8-employees-60.png")); // NOI18N
        jLabel1.setText("  Employees");
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

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 500));
    }// </editor-fold>//GEN-END:initComponents

    private void tableEmployeesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableEmployeesMouseClicked
        try {
            SelectedEmployeeForm sef = new SelectedEmployeeForm();

            int index = tableEmployees.getSelectedRow();
            DefaultTableModel dtm = (DefaultTableModel)tableEmployees.getModel();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            String id = dtm.getValueAt(index, 0).toString();
            String name = dtm.getValueAt(index, 1).toString();
            String status = dtm.getValueAt(index, 2).toString();
            String department = dtm.getValueAt(index, 3).toString();
            String position = dtm.getValueAt(index, 4).toString();
            String phone_number = dtm.getValueAt(index, 5).toString();            
            String email = dtm.getValueAt(index, 6).toString();
            String date_hired = dtm.getValueAt(index, 7).toString();
            
            String sanitizedNumber = phone_number.replaceAll("[^0-9]", "");
            String convertedNumber = sanitizedNumber.replaceFirst("^63", "0");
            
            sef.setVisible(true);
            sef.pack();
            sef.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            
            sef.tfEmpID.setText(id);
            sef.tfFullName.setText(name);
            sef.tfEmpStatus.setText(status);
            sef.tfDepartment.setText(department);
            sef.tfPosition.setText(position);
            sef.tfPhoneNum.setText(convertedNumber);
            sef.tfEmail.setText(email);
            sef.dcDateHired.setDate(sdf.parse(date_hired));

        }catch (ParseException ex) {
            Logger.getLogger(EmployeesTab.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tableEmployeesMouseClicked

    private void tfSearchEmployeesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfSearchEmployeesFocusGained
        if(tfSearchEmployees.getText().equals("Search Employees")) {
            tfSearchEmployees.setText("");
            tfSearchEmployees.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_tfSearchEmployeesFocusGained

    private void tfSearchEmployeesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfSearchEmployeesFocusLost
        if(tfSearchEmployees.getText().equals("")) {
            tfSearchEmployees.setText("Search Employees");
            tfSearchEmployees.setForeground(new Color(174,178,182));
        }
    }//GEN-LAST:event_tfSearchEmployeesFocusLost

    private void tfSearchEmployeesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchEmployeesKeyReleased
        String searchText = tfSearchEmployees.getText();
        try {
            int y;
            pst = con.prepareStatement("SELECT * FROM employees WHERE id LIKE '%"+ searchText + "%' OR name LIKE '%"+ searchText + "%' OR status LIKE '%"+ searchText + "%' OR department LIKE '%"+ searchText + "%'OR position LIKE '%"+ searchText + "%' OR date_hired LIKE '%"+ searchText + "%'");
            rs = pst.executeQuery();
            ResultSetMetaData rss = rs.getMetaData();
            y = rss.getColumnCount();

            DefaultTableModel dtm = (DefaultTableModel)tableEmployees.getModel();
            dtm.setRowCount(0);

            while(rs.next()) {
                Vector v2 = new Vector();
                for(int x = 1; x <= y; x++) {
                    v2.add(rs.getString("id"));
                    v2.add(rs.getString("name"));
                    v2.add(rs.getString("status"));
                    v2.add(rs.getString("department"));
                    v2.add(rs.getString("postion"));
                    v2.add(rs.getString("phone_number"));
                    v2.add(rs.getString("email"));
                    v2.add(rs.getString("date_hired"));
                }
                dtm.addRow(v2);
            }
        }catch(SQLException e) {
            Logger.getLogger(EmployeesTab.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_tfSearchEmployeesKeyReleased

    private void btnAddEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEmployeeActionPerformed
        new AddEmployeeForm().setVisible(true);
    }//GEN-LAST:event_btnAddEmployeeActionPerformed

    private void lblRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRefreshMouseClicked
        Fetch();
    }//GEN-LAST:event_lblRefreshMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEmployee;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRefresh;
    private javax.swing.JTable tableEmployees;
    private javax.swing.JTextField tfSearchEmployees;
    // End of variables declaration//GEN-END:variables
}
