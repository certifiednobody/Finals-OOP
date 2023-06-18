/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package mainEmployee;

import java.awt.*;
import java.io.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import main.LoginPage;

public class ProfilePanel extends javax.swing.JPanel {

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
            Logger.getLogger(ProfilePanel.class.getName()).log(Level.SEVERE, null, e);
        } catch (SQLException e) {
            Logger.getLogger(ProfilePanel.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void uploadImg() {
        System.out.print("Image Path - " + path);
        System.out.print("Image Name - " + f.getName());
        File f = new File(path);
        
        try {
            InputStream is = new FileInputStream(f);
            
            pst = con.prepareStatement("INSERT INTO tbl_images(img_name, img_path, img_file) VALUES(?,?,?)");
            pst.setString(1, f.getName());
            pst.setString(2, path);
            pst.setBlob(3, is);
            
            int inserted = pst.executeUpdate();
            
            if(inserted > 0) {
                JOptionPane.showMessageDialog(null, "Image Uploaded Successfully");
            }else {
                JOptionPane.showMessageDialog(null, "Image Upload Failed");
            }
                 
        }catch(FileNotFoundException e) {
            Logger.getLogger(ProfilePanel.class.getName()).log(Level.SEVERE, null, e);
        } catch (SQLException e) {
            Logger.getLogger(ProfilePanel.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void fetchData() {
        try {
            LoginPage lp = new LoginPage();
            pst = con.prepareStatement("SELECT * FROM tbl_employees WHERE emp_username=?");
            pst.setString(1, lp.txtUsername.getText());
            rs = pst.executeQuery();
            
            if(rs.next() == true) {
                lblEmpID.setText(rs.getString(1));
                lblEmpName.setText(rs.getString(2));
                lblEmpStat.setText(rs.getString(3));
                taEmpAddress.setText(rs.getString(4));
                tfEmpEmail.setText(rs.getString(5));
                tfEmpContact.setText(rs.getString(6));
                lblEmpDept.setText(rs.getString(7));
                lblEmpPos.setText(rs.getString(8));
            }else {
                lblEmpID.setText("");
                lblEmpName.setText("");
                lblEmpStat.setText("");
                taEmpAddress.setText("");
                tfEmpEmail.setText("");
                tfEmpContact.setText("");
                lblEmpDept.setText("");
                lblEmpPos.setText("");
            }
            
        }catch(SQLException e) {
            Logger.getLogger(ProfilePanel.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public ProfilePanel() {
        initComponents();
        Connect();
        fetchData();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        tfEmpContact = new javax.swing.JTextField();
        tfEmpEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taEmpAddress = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(920, 600));
        setPreferredSize(new java.awt.Dimension(920, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImage.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 150, 150));

        lblEmpName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblEmpName.setText("Employee Name");
        add(lblEmpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Department:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));

        lblEmpDept.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEmpDept.setText("Department");
        add(lblEmpDept, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Position:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, -1, -1));

        lblEmpPos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEmpPos.setText("Position");
        add(lblEmpPos, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, -1, -1));

        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 140, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel8.setText("Employee Profile");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 880, 20));

        jab.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jab.setForeground(new java.awt.Color(153, 153, 153));
        jab.setText("Status:");
        add(jab, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        lblEmpStat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEmpStat.setText("Status");
        add(lblEmpStat, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("Employee ID:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, -1));

        lblEmpID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEmpID.setText("ID");
        add(lblEmpID, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Additional Information");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        lblUploadImg.setForeground(new java.awt.Color(74, 155, 205));
        lblUploadImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUploadImg.setText("Upload Photo");
        lblUploadImg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblUploadImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUploadImgMouseClicked(evt);
            }
        });
        add(lblUploadImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 245, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Date of Birth");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));
        add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 200, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Gender");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 140, 30));
        add(tfEmpContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 200, 30));
        add(tfEmpEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, 200, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Phone Number");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Email");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 500, -1, -1));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setAutoscrolls(true);

        taEmpAddress.setColumns(20);
        taEmpAddress.setLineWrap(true);
        taEmpAddress.setRows(5);
        taEmpAddress.setWrapStyleWord(true);
        taEmpAddress.setPreferredSize(new java.awt.Dimension(200, 84));
        jScrollPane1.setViewportView(taEmpAddress);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, -1, 100));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Address");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        uploadImg();
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jab;
    private javax.swing.JLabel lblEmpDept;
    private javax.swing.JLabel lblEmpID;
    private javax.swing.JLabel lblEmpName;
    private javax.swing.JLabel lblEmpPos;
    private javax.swing.JLabel lblEmpStat;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblUploadImg;
    private javax.swing.JTextArea taEmpAddress;
    private javax.swing.JTextField tfEmpContact;
    private javax.swing.JTextField tfEmpEmail;
    // End of variables declaration//GEN-END:variables
}
