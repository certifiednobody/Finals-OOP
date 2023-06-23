/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package forEmployee;

import java.awt.*;
import java.io.File;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Profile extends javax.swing.JPanel {
    
    public static int globalID = 0;
    
    File f = null;
    String path = null;
    private ImageIcon format = null;
    String fname = null;
    int s = 0;
    byte[] pimage = null;
    
    Connection con; 
    PreparedStatement pst;
    ResultSet rs;
    
    public void Connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/db_employeemgmt", "root", "");
        } catch (ClassNotFoundException e) {
            Logger.getLogger(Profile.class.getName()).log(Level.SEVERE, null, e);
        } catch (SQLException e) {
            Logger.getLogger(Profile.class.getName()).log(Level.SEVERE, null, e);
        }
        
        cbGender.setSelectedItem(null);
    }
    public void fetchData(int param_id) {
        try {
            String getID = String.valueOf(param_id);
            pst = con.prepareStatement("SELECT * FROM tbl_accounts WHERE emp_id=?");
            pst.setString(1, getID);
            rs = pst.executeQuery();
            
            if(rs.next() == true) {
                String empID = rs.getString(1);
                String empName = rs.getString(2);
                String empStat = rs.getString(3);
                String empDept = rs.getString(4);
                String empPos = rs.getString(5);
                
                String empCont = rs.getString(6);
                String empEmail = rs.getString(7);
                
                lblEmpID.setText(empID);
                lblEmpName.setText(empName);
                lblEmpPos.setText(empPos);
                lblEmpDept.setText(empDept);
                lblEmpStat.setText(empStat);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Profile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Profile() {
        initComponents();
        Connect();
        fetchData(globalID);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        lblEmpName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblEmpDept = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblEmpPos = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jab = new javax.swing.JLabel();
        lblEmpStat = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblEmpID = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblUploadImg = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfDOB = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        cbGender = new javax.swing.JComboBox<>();
        tfPhoneNum = new javax.swing.JTextField();
        tfEmpEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taAddress = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImage.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 102, 150, 150));

        lblEmpName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblEmpName.setText("Employee Name");
        jPanel1.add(lblEmpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 102, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Department:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 202, -1, -1));

        lblEmpDept.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEmpDept.setText("Department");
        jPanel1.add(lblEmpDept, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 202, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Position:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 172, -1, -1));

        lblEmpPos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEmpPos.setText("Position");
        jPanel1.add(lblEmpPos, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 172, -1, -1));

        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 22, 140, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel8.setText("Employee Profile");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 32, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 72, 880, 20));

        jab.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jab.setForeground(new java.awt.Color(153, 153, 153));
        jab.setText("Status:");
        jPanel1.add(jab, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 232, -1, -1));

        lblEmpStat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEmpStat.setText("Status");
        jPanel1.add(lblEmpStat, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 232, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("Employee ID:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 142, -1, -1));

        lblEmpID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEmpID.setText("ID");
        jPanel1.add(lblEmpID, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 142, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Additional Information");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 302, -1, -1));

        lblUploadImg.setForeground(new java.awt.Color(74, 155, 205));
        lblUploadImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUploadImg.setText("Upload Photo");
        lblUploadImg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblUploadImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUploadImgMouseClicked(evt);
            }
        });
        jPanel1.add(lblUploadImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 257, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Date of Birth");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 372, -1, -1));
        jPanel1.add(tfDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 332, 200, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Gender");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 442, -1, -1));

        cbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel1.add(cbGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 402, 140, 30));
        jPanel1.add(tfPhoneNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 472, 200, 30));
        jPanel1.add(tfEmpEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 472, 200, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Phone Number");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 512, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Email");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 512, -1, -1));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setAutoscrolls(true);

        taAddress.setColumns(20);
        taAddress.setLineWrap(true);
        taAddress.setRows(5);
        taAddress.setWrapStyleWord(true);
        taAddress.setPreferredSize(new java.awt.Dimension(200, 84));
        jScrollPane1.setViewportView(taAddress);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 322, -1, 100));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Address");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 432, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Change Password");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 22, -1, 40));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void lblUploadImgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUploadImgMouseClicked
        JFileChooser jfc = new JFileChooser();
        FileNameExtensionFilter  fnef = new FileNameExtensionFilter("PNG JPG AND JPEG", "png", "jpeg", "jpg");
        jfc.addChoosableFileFilter(fnef);
        int load = jfc.showOpenDialog(null);

        if(load == jfc.APPROVE_OPTION) {
            f = jfc.getSelectedFile();
            path = f.getAbsolutePath();
            ImageIcon ii = new ImageIcon(path);
            Image img = ii.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
            lblImage.setIcon(new ImageIcon(img));
        }
    }//GEN-LAST:event_lblUploadImgMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbGender;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jab;
    private javax.swing.JLabel lblEmpDept;
    public javax.swing.JLabel lblEmpID;
    public javax.swing.JLabel lblEmpName;
    private javax.swing.JLabel lblEmpPos;
    private javax.swing.JLabel lblEmpStat;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblUploadImg;
    private javax.swing.JTextArea taAddress;
    private com.toedter.calendar.JDateChooser tfDOB;
    private javax.swing.JTextField tfEmpEmail;
    private javax.swing.JTextField tfPhoneNum;
    // End of variables declaration//GEN-END:variables
}
