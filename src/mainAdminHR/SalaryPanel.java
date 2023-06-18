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

public class SalaryPanel extends javax.swing.JPanel {

    Connection con; 
    PreparedStatement pst;
    ResultSet rs;
    
    public void Connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/db_employeemgmt", "root", "");
        } catch (ClassNotFoundException e) {
            Logger.getLogger(SalaryPanel.class.getName()).log(Level.SEVERE, null, e);
        } catch (SQLException e) {
            Logger.getLogger(SalaryPanel.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void Fetch() {
        try {
            int q;
            pst = con.prepareStatement("SELECT * FROM tbl_payroll");
            rs = pst.executeQuery();
            ResultSetMetaData rss = rs.getMetaData();
            q = rss.getColumnCount();
            
            DefaultTableModel dtm = (DefaultTableModel)tableSalary.getModel();
            dtm.setRowCount(0);
            
            while(rs.next()) {
                Vector v2 = new Vector();
                for(int y = 1; y <= q; y++) {
                    v2.add(rs.getString("emp_id"));
                    v2.add(rs.getString("emp_name"));
                    v2.add(rs.getString("emp_basicpay"));
                    v2.add(rs.getString("emp_absences"));
                    v2.add(rs.getString("emp_lates"));  
                    v2.add(rs.getString("emp_overtime"));  
                    v2.add(rs.getString("emp_grosspay"));                    
                    v2.add(rs.getString("emp_tax"));                    
                    v2.add(rs.getString("emp_deduction"));
                    v2.add(rs.getString("emp_netpay"));                    
                }
                dtm.addRow(v2);
            }
        }catch(SQLException e) {
            Logger.getLogger(SalaryPanel.class.getName()).log(Level.SEVERE, null, e);           
        }
    }
    
    public void Filter() {
        
        String searchText = tfFilter.getText();
        
        try {
            int y; 
            pst = con.prepareStatement("SELECT * FROM tbl_payroll WHERE emp_id LIKE '%"+searchText+"%'");
            rs = pst.executeQuery();
            ResultSetMetaData rss = rs.getMetaData();
            y = rss.getColumnCount();
            
            DefaultTableModel dtm = (DefaultTableModel)tableSalary.getModel();
            dtm.setRowCount(0);
            
            while(rs.next()) {
                Vector v2 = new Vector();
                for(int x = 1; x <= y; x++) {
                    v2.add(rs.getString("emp_id"));
                    v2.add(rs.getString("emp_name"));
                    v2.add(rs.getString("emp_basicpay"));
                    v2.add(rs.getString("emp_absences"));
                    v2.add(rs.getString("emp_lates"));  
                    v2.add(rs.getString("emp_overtime"));  
                    v2.add(rs.getString("emp_grosspay"));                    
                    v2.add(rs.getString("emp_tax"));                    
                    v2.add(rs.getString("emp_deduction"));
                    v2.add(rs.getString("emp_netpay"));              
                }
                dtm.addRow(v2);
            }
        }catch(SQLException e) {
            Logger.getLogger(SalaryPanel.class.getName()).log(Level.SEVERE, null, e); 
        }
    }
    
    public SalaryPanel() {
        initComponents();
        Connect();
        Fetch();
        
        tableSalary.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tableSalary.getTableHeader().setOpaque(false);
        tableSalary.getTableHeader().setBackground(new Color(250, 250, 250));
        tableSalary.getTableHeader().setForeground(new Color(69, 69, 69));
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableSalary = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnAddSalary = new javax.swing.JButton();
        btnEditSalary = new javax.swing.JButton();
        btnDeleteSalary = new javax.swing.JButton();
        lblRefresh = new javax.swing.JLabel();
        tfFilter = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tableSalary.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Employee Name", "Basic Pay", "Absences", "Lates", "Total Overtime", "Gross Pay", "Tax", "Deduction", "Net Pay"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableSalary.setRowHeight(50);
        tableSalary.setSelectionBackground(new java.awt.Color(153, 153, 153));
        tableSalary.setShowGrid(true);
        jScrollPane1.setViewportView(tableSalary);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("Employee Payroll");

        btnAddSalary.setText("Add");
        btnAddSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSalaryActionPerformed(evt);
            }
        });

        btnEditSalary.setText("Edit");
        btnEditSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditSalaryActionPerformed(evt);
            }
        });

        btnDeleteSalary.setText("Delete");
        btnDeleteSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteSalaryActionPerformed(evt);
            }
        });

        lblRefresh.setIcon(new javax.swing.ImageIcon("C:\\Users\\ANGELO MIGUEL\\Documents\\icons8\\icons8-refresh-30.png")); // NOI18N
        lblRefresh.setToolTipText("Refresh Table");
        lblRefresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRefreshMouseClicked(evt);
            }
        });

        tfFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFilterActionPerformed(evt);
            }
        });
        tfFilter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfFilterKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Search Employee ID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblRefresh)
                .addGap(18, 18, 18)
                .addComponent(btnAddSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnEditSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnDeleteSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 908, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRefresh, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAddSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEditSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDeleteSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSalaryActionPerformed
        new AddEmployeeSalary().setVisible(true);
    }//GEN-LAST:event_btnAddSalaryActionPerformed

    private void lblRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRefreshMouseClicked
        Fetch();
    }//GEN-LAST:event_lblRefreshMouseClicked

    private void tfFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFilterActionPerformed
        
    }//GEN-LAST:event_tfFilterActionPerformed

    private void tfFilterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfFilterKeyReleased
        Filter();
    }//GEN-LAST:event_tfFilterKeyReleased

    private void btnEditSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditSalaryActionPerformed
        new EditEmployeeSalary().setVisible(true);
    }//GEN-LAST:event_btnEditSalaryActionPerformed

    private void btnDeleteSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteSalaryActionPerformed
        new DeleteEmployeeSalary().setVisible(true);
    }//GEN-LAST:event_btnDeleteSalaryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddSalary;
    private javax.swing.JButton btnDeleteSalary;
    private javax.swing.JButton btnEditSalary;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRefresh;
    private javax.swing.JTable tableSalary;
    private javax.swing.JTextField tfFilter;
    // End of variables declaration//GEN-END:variables
}
