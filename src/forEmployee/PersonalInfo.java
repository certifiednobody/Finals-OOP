/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package forEmployee;

import java.io.File;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.filechooser.FileNameExtensionFilter;


public class PersonalInfo extends javax.swing.JPanel {

    public static String gl_emp_id;
    
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
            Logger.getLogger(PersonalInfo.class.getName()).log(Level.SEVERE, null, e);
        } catch (SQLException e) {
            Logger.getLogger(PersonalInfo.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void fetchData() {
        try {
            pst = con.prepareStatement("SELECT * FROM employees WHERE id=?");
            pst.setString(1, gl_emp_id);
            rs = pst.executeQuery();
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            
            if(rs.next() == true) {
                String empID = rs.getString(1);
                String empName = rs.getString(2);
                String empStat = rs.getString(3);
                String empDept = rs.getString(4);
                String empPos = rs.getString(5);
                String empCont = rs.getString(6);
                String empEmail = rs.getString(7);
                String emp_datehired = rs.getString(8);
                String emp_dob = rs.getString(9);
                String empGender = rs.getString(10);
                String empAddress = rs.getString(11);
                String emerg_pn_name = rs.getString(12);
                String emerg_rel = rs.getString(13);
                String emerg_pn = rs.getString(14);
                byte[] imgData = rs.getBytes(15);
                
                String sanitizedNumber = empCont.replaceAll("[^0-9]", "");
                String convertedNumber = sanitizedNumber.replaceFirst("^63", "0");
                
                lblEmpID.setText(empID);
                lblEmpName.setText(empName);
                lblEmpPos.setText(empPos);
                lblEmpDept.setText(empDept);
                lblEmpStat.setText(empStat);
                lblDateHired.setText(emp_datehired);
                
                tfPhoneNum.setText(convertedNumber);
                tfEmail.setText(empEmail);
                try {
                    tfDOB.setDate(sdf.parse(emp_dob));
                } catch (ParseException ex) {
                    Logger.getLogger(PersonalInfo.class.getName()).log(Level.SEVERE, null, ex);
                }
                if("Male".equals(empGender)) {
                    cbGender.setSelectedIndex(0);
                }else {
                    cbGender.setSelectedIndex(1);
                }
                taAddress.setText(empAddress);
                tfContName.setText(emerg_pn_name);
                tfRel.setText(emerg_rel);
                tfContPNum.setText(emerg_pn);
                
                format = new ImageIcon(imgData);
                Image mm = format.getImage();
                Image img2 = mm.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
                ImageIcon image = new ImageIcon(img2);
                lblImage.setIcon(image);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(PersonalInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public PersonalInfo() {
        initComponents();
        Connect();
        fetchData();
        
        lblUploadImg.setVisible(false);
        btnSave.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        lblUploadImg = new javax.swing.JLabel();
        lblEmpName = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblEmpDept = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblEmpPos = new javax.swing.JLabel();
        jab = new javax.swing.JLabel();
        lblEmpStat = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblEmpID = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfDOB = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        cbGender = new javax.swing.JComboBox<>();
        tfPhoneNum = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taAddress = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblDateHired = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        tfContPNum = new javax.swing.JTextField();
        tfRel = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        tfContName = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        btnChangePass = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImage.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 150, 150));

        lblUploadImg.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblUploadImg.setForeground(new java.awt.Color(74, 155, 205));
        lblUploadImg.setText("Upload Photo");
        lblUploadImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUploadImgMouseClicked(evt);
            }
        });
        jPanel1.add(lblUploadImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 175, -1, -1));

        lblEmpName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblEmpName.setText("Employee Name");
        jPanel1.add(lblEmpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Department:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, -1, -1));

        lblEmpDept.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEmpDept.setText("Department");
        jPanel1.add(lblEmpDept, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Position:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, -1));

        lblEmpPos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEmpPos.setText("Position");
        jPanel1.add(lblEmpPos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, -1));

        jab.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jab.setForeground(new java.awt.Color(153, 153, 153));
        jab.setText("Status:");
        jPanel1.add(jab, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, -1));

        lblEmpStat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEmpStat.setText("Status");
        jPanel1.add(lblEmpStat, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("Employee ID:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, -1));

        lblEmpID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEmpID.setText("ID");
        jPanel1.add(lblEmpID, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Additional Information");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Date of Birth");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        tfDOB.setEnabled(false);
        jPanel1.add(tfDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 200, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Gender");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        cbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        cbGender.setEnabled(false);
        jPanel1.add(cbGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 140, 30));

        tfPhoneNum.setEditable(false);
        tfPhoneNum.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(tfPhoneNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 200, 30));

        tfEmail.setEditable(false);
        tfEmail.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(tfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 200, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Phone Number");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Email");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, -1, -1));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setAutoscrolls(true);

        taAddress.setEditable(false);
        taAddress.setBackground(new java.awt.Color(255, 255, 255));
        taAddress.setColumns(20);
        taAddress.setLineWrap(true);
        taAddress.setRows(5);
        taAddress.setWrapStyleWord(true);
        taAddress.setPreferredSize(new java.awt.Dimension(200, 84));
        jScrollPane1.setViewportView(taAddress);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, 100));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("Address");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 153, 153));
        jLabel16.setText("Date Hired:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, -1, -1));

        lblDateHired.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDateHired.setText("Date Hired");
        jPanel1.add(lblDateHired, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, -1, -1));

        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEdit.setText("EDIT");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel1.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 15, 100, 40));

        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 15, 100, 40));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Emergency Contact");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(153, 153, 153));
        jLabel19.setText("Relationship");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 380, -1, -1));

        tfContPNum.setEditable(false);
        tfContPNum.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(tfContPNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, 200, 30));

        tfRel.setEditable(false);
        tfRel.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(tfRel, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, 200, 30));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(153, 153, 153));
        jLabel20.setText("Phone Number");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 450, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(153, 153, 153));
        jLabel21.setText("Contact Name");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, -1, -1));

        tfContName.setEditable(false);
        tfContName.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(tfContName, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 200, 30));

        btnCancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancel.setText("CANCEL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 15, 100, 40));

        btnChangePass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnChangePass.setText("CHANGE PASSWORD");
        btnChangePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePassActionPerformed(evt);
            }
        });
        jPanel1.add(btnChangePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 420, -1, 40));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 510));
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

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        tfDOB.setEnabled(true);
        cbGender.setEnabled(true);
        tfPhoneNum.setEditable(true);
        tfEmail.setEditable(true);
        taAddress.setEditable(true);
        tfContName.setEditable(true);
        tfRel.setEditable(true);
        tfContPNum.setEditable(true);

        lblUploadImg.setVisible(true);
        btnEdit.setVisible(false);
        btnCancel.setVisible(true);
        btnSave.setVisible(true);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        File f = new File(path);
        
        if(tfEmail.getText().isEmpty() || tfPhoneNum.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Fill Out Phone Number and Email", "Complete The Form",JOptionPane.ERROR_MESSAGE);
        }else if(tfPhoneNum.getText().length() != 11) {
            JOptionPane.showMessageDialog(null, "Please enter a valid 11-digit number.", "Error Input Value",JOptionPane.ERROR_MESSAGE);
            tfPhoneNum.requestFocus();
        }else if(!tfEmail.getText().matches(regex)) {
            JOptionPane.showMessageDialog(null, "Please enter a valid email address.", "Error Input Value",JOptionPane.ERROR_MESSAGE);
            tfEmail.requestFocus();
        }else {
            try {
                InputStream is = new FileInputStream(f);
                java.util.Date d = tfDOB.getDate();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                
                String empCont = tfPhoneNum.getText().replaceAll("[^0-9]", "");
                String empEm = tfEmail.getText();
                String date_of_birth = sdf.format(d);
                String empG = cbGender.getSelectedItem().toString();
                String empAd = taAddress.getText();
                String emerg_name = tfContName.getText();
                String emerg_rel = tfRel.getText();
                String emerg_pn = tfContPNum.getText();
                
                String formattedPN = "+63 " + empCont.substring(1,4)+ " " + empCont.substring(4,7) + " " + empCont.substring(7); 
                
                pst = con.prepareStatement("UPDATE employees SET phone_number=?, email=?, date_of_birth=?, gender=?, address=?, emerg_contact_name=?, emerg_relationship=?, emerg_phone_number=?, image=? WHERE id=?");
                
                pst.setString(1, empCont);
                pst.setString(2, empEm);
                pst.setString(3, date_of_birth);
                pst.setString(4, empG);
                pst.setString(5, empAd);
                pst.setString(6, emerg_name);
                pst.setString(7, emerg_rel);
                pst.setString(8, emerg_pn);
                pst.setBlob(9, is);
                
                pst.setString(10, gl_emp_id);
                
                int k = pst.executeUpdate();
            
                if(k == 1) {
                    JOptionPane.showMessageDialog(this, "Profile Updated Successfully.");
                    tfDOB.setEnabled(false);
                    cbGender.setEnabled(false);
                    tfPhoneNum.setEditable(false);
                    tfEmail.setEditable(false);
                    taAddress.setEditable(false);
                    tfContName.setEditable(false);
                    tfRel.setEditable(false);
                    tfContPNum.setEditable(false);
                    
                    lblUploadImg.setVisible(false);
                    btnEdit.setVisible(true);
                    btnCancel.setVisible(false);
                    btnSave.setVisible(false);
                }    
                
            }catch(SQLException e) {
                Logger.getLogger(PersonalInfo.class.getName()).log(Level.SEVERE, null, e);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(PersonalInfo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        if(tfDOB.getDate() == null) {
             JOptionPane.showMessageDialog(this, "Date of Birth is Empty");
        }else {
            try {
                pst = con.prepareStatement("SELECT * FROM employees");
                rs = pst.executeQuery();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                
                if(rs.next() == true) {
                    tfPhoneNum.setText(rs.getString(6));
                    tfEmail.setText(rs.getString(7));
                    try {
                        tfDOB.setDate(sdf.parse(rs.getString(9)));
                    } catch (ParseException ex) {
                        Logger.getLogger(PersonalInfo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                
                    String checker = rs.getString(10);
                    if("Male".equals(checker) || checker == null) {
                        cbGender.setSelectedIndex(0);
                    }else {
                        cbGender.setSelectedIndex(1);
                    }
                    taAddress.setText(rs.getString(11));    
                    tfContName.setText(rs.getString(12));   
                    tfRel.setText(rs.getString(13));   
                    tfContPNum.setText(rs.getString(14));
                    
                    byte[] imgData = rs.getBytes(15);
                    format = new ImageIcon(imgData);
                    Image mm = format.getImage();
                    Image img2 = mm.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
                    ImageIcon image = new ImageIcon(img2);
                    
                    lblImage.setIcon(image);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PersonalInfo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        tfDOB.setEnabled(false);
        cbGender.setEnabled(false);
        tfPhoneNum.setEditable(false);
        tfEmail.setEditable(false);
        taAddress.setEditable(false);
        tfContName.setEditable(false);
        tfRel.setEditable(false);
        tfContPNum.setEditable(false);

        lblUploadImg.setVisible(false);
        btnEdit.setVisible(true);
        btnCancel.setVisible(false);
        btnSave.setVisible(true);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnChangePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePassActionPerformed
        new ChangePasswordForm().setVisible(true);
    }//GEN-LAST:event_btnChangePassActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnChangePass;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbGender;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jab;
    public javax.swing.JLabel lblDateHired;
    private javax.swing.JLabel lblEmpDept;
    public javax.swing.JLabel lblEmpID;
    private javax.swing.JLabel lblEmpName;
    private javax.swing.JLabel lblEmpPos;
    private javax.swing.JLabel lblEmpStat;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblUploadImg;
    private javax.swing.JTextArea taAddress;
    private javax.swing.JTextField tfContName;
    private javax.swing.JTextField tfContPNum;
    private com.toedter.calendar.JDateChooser tfDOB;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfPhoneNum;
    private javax.swing.JTextField tfRel;
    // End of variables declaration//GEN-END:variables
}
