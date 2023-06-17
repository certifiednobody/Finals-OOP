/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package mainAdminHR;

import java.awt.*;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class EmployeesPanel extends javax.swing.JPanel {

    Connection con; 
    PreparedStatement pst;
    ResultSet rs;
    
    public void Connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/db_employeemgmt", "root", "");
        } catch (ClassNotFoundException e) {
            Logger.getLogger(EmployeesPanel.class.getName()).log(Level.SEVERE, null, e);
        } catch (SQLException e) {
            Logger.getLogger(EmployeesPanel.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void Fetch() {
        try {
            int q;
            pst = con.prepareStatement("SELECT * FROM tbl_employees");
            rs = pst.executeQuery();
            ResultSetMetaData rss = rs.getMetaData();
            q = rss.getColumnCount();
            
            DefaultTableModel dtm = (DefaultTableModel)tableEmployees.getModel();
            dtm.setRowCount(0);
            
            while(rs.next()) {
                Vector v2 = new Vector();
                for(int y = 1; y <= q; y++) {
                    v2.add(rs.getString("emp_id"));
                    v2.add(rs.getString("emp_status"));
                    v2.add(rs.getString("emp_name"));
                    v2.add(rs.getString("emp_department"));
                    v2.add(rs.getString("emp_position"));
                    v2.add(rs.getString("emp_email"));
                    v2.add(rs.getString("emp_address"));
                    v2.add(rs.getString("emp_contact"));                    
                }
                dtm.addRow(v2);
            }
        }catch(SQLException e) {
            Logger.getLogger(EmployeesPanel.class.getName()).log(Level.SEVERE, null, e);           
        }
    }
    
    public void Filter() {
        
        String searchText = tfFilter.getText();
        
        try {
            int y; 
            pst = con.prepareStatement("SELECT * FROM tbl_employees WHERE emp_id LIKE '%"+searchText+"%'");
            rs = pst.executeQuery();
            ResultSetMetaData rss = rs.getMetaData();
            y = rss.getColumnCount();
            
            DefaultTableModel dtm = (DefaultTableModel)tableEmployees.getModel();
            dtm.setRowCount(0);
            
            while(rs.next()) {
                Vector v3 = new Vector();
                for(int x = 1; x <= y; x++) {
                    v3.add(rs.getString("emp_id"));
                    v3.add(rs.getString("emp_status"));
                    v3.add(rs.getString("emp_name"));
                    v3.add(rs.getString("emp_department"));
                    v3.add(rs.getString("emp_position"));
                    v3.add(rs.getString("emp_email"));
                    v3.add(rs.getString("emp_address"));
                    v3.add(rs.getString("emp_contact"));                    
                }
                dtm.addRow(v3);
            }
        }catch(SQLException e) {
            Logger.getLogger(EmployeesPanel.class.getName()).log(Level.SEVERE, null, e); 
        }
    }
    
    public EmployeesPanel() {
        initComponents();
        Connect();
        Fetch();
        
        tableEmployees.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tableEmployees.getTableHeader().setOpaque(false);
        tableEmployees.getTableHeader().setBackground(new Color(250, 250, 250));
        tableEmployees.getTableHeader().setForeground(new Color(69, 69, 69));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableEmployees = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnAddEmployee = new javax.swing.JButton();
        btnDeleteEmployee = new javax.swing.JButton();
        btnEditEmployee = new javax.swing.JButton();
        lblRefresh = new javax.swing.JLabel();
        tfFilter = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(920, 530));
        setPreferredSize(new java.awt.Dimension(920, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableEmployees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Employee Status", "Name", "Department", "Position", "Email", "Address", "Contact"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableEmployees.setRowHeight(50);
        tableEmployees.setSelectionBackground(new java.awt.Color(153, 153, 153));
        tableEmployees.setShowGrid(true);
        tableEmployees.setShowVerticalLines(false);
        tableEmployees.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableEmployees);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 163, 908, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("Company Employees");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        btnAddEmployee.setIcon(new javax.swing.ImageIcon("C:\\Users\\ANGELO MIGUEL\\Documents\\icons8\\icons8-employee-25.png")); // NOI18N
        btnAddEmployee.setText("  Add Employee");
        btnAddEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEmployeeActionPerformed(evt);
            }
        });
        add(btnAddEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 145, 40));

        btnDeleteEmployee.setIcon(new javax.swing.ImageIcon("C:\\Users\\ANGELO MIGUEL\\Documents\\icons8\\icons8-delete-employee-25.png")); // NOI18N
        btnDeleteEmployee.setText("Delete Employee");
        btnDeleteEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteEmployeeActionPerformed(evt);
            }
        });
        add(btnDeleteEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, -1, 40));

        btnEditEmployee.setIcon(new javax.swing.ImageIcon("C:\\Users\\ANGELO MIGUEL\\Documents\\icons8\\icons8-edit-employee-25.png")); // NOI18N
        btnEditEmployee.setText("  Edit Employee");
        btnEditEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditEmployeeActionPerformed(evt);
            }
        });
        add(btnEditEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 145, 40));

        lblRefresh.setIcon(new javax.swing.ImageIcon("C:\\Users\\ANGELO MIGUEL\\Documents\\icons8\\icons8-refresh-30.png")); // NOI18N
        lblRefresh.setToolTipText("Refresh Table");
        lblRefresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRefreshMouseClicked(evt);
            }
        });
        add(lblRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 58, -1, -1));

        tfFilter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfFilterKeyReleased(evt);
            }
        });
        add(tfFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 150, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Search Employee ID:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 100, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEmployeeActionPerformed
        new AddEmployeeForm().setVisible(true);
    }//GEN-LAST:event_btnAddEmployeeActionPerformed

    private void btnDeleteEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteEmployeeActionPerformed
        new DeleteEmployeeForm().setVisible(true);       
    }//GEN-LAST:event_btnDeleteEmployeeActionPerformed

    private void btnEditEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditEmployeeActionPerformed
        new EditEmployeeForm().setVisible(true);       
    }//GEN-LAST:event_btnEditEmployeeActionPerformed

    private void lblRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRefreshMouseClicked
        Fetch();
    }//GEN-LAST:event_lblRefreshMouseClicked

    private void tfFilterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfFilterKeyReleased
        Filter();
    }//GEN-LAST:event_tfFilterKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEmployee;
    private javax.swing.JButton btnDeleteEmployee;
    private javax.swing.JButton btnEditEmployee;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRefresh;
    public javax.swing.JTable tableEmployees;
    private javax.swing.JTextField tfFilter;
    // End of variables declaration//GEN-END:variables
}
