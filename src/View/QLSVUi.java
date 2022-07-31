/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.SinhVien;
import Service.impl.SinhVienServiceImpl;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anhkon
 */
public class QLSVUi extends javax.swing.JFrame {

    private SinhVienServiceImpl lstImpl = new SinhVienServiceImpl();
    private DefaultTableModel dtm;

    /**
     * Creates new form QLSVUi
     */
    public QLSVUi() {
        initComponents();
        loadData(lstImpl.getList());
    }

    private void loadData(ArrayList<SinhVien> list) {
        dtm = (DefaultTableModel) this.tblSV.getModel();
        dtm.setRowCount(0);
        for (SinhVien sv : list) {
            dtm.addRow(new Object[]{
                sv.getMaSv(),
                sv.getHo_ten(),
                sv.getEmail(),
                sv.getSo_dt(),
                sv.getGioi_tinh() == 1 ? "Nam" : "Nữ",
                sv.getDia_chi(),});
        }
    }

    private void clearForm() {
        this.txtMaSV.setText("");
        txtHoTen.setText("");
        txtEmail.setText("");
        txtSoDT.setText("");
        txtDiaChi.setText("");
        rdoNam.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMaSV = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSoDT = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        btnNew = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSV = new javax.swing.JTable();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Quản Lý  Sinh Viên");

        jLabel2.setText("Mã SV");

        jLabel3.setText("Họ tên");

        jLabel4.setText("Email");

        jLabel5.setText("Số dt");

        jLabel6.setText("GIới tính");

        jLabel7.setText("Địa chỉ");

        txtSoDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoDTActionPerformed(evt);
            }
        });

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        tblSV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SV", "Họ tên", "Email", "Số đt", "Giới tính", "Địa chỉ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSVMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblSV);

        buttonGroup1.add(rdoNam);
        rdoNam.setSelected(true);
        rdoNam.setText("Nam");

        buttonGroup1.add(rdoNu);
        rdoNu.setText("Nữ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdoNam)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdoNu))
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtHoTen)
                                    .addComponent(txtMaSV)
                                    .addComponent(txtEmail)
                                    .addComponent(txtSoDT, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnNew)
                                    .addComponent(btnDelete))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnUpdate)
                                    .addComponent(btnSave)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNew)
                            .addComponent(btnUpdate))
                        .addGap(32, 32, 32)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtSoDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDelete)
                            .addComponent(btnSave))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rdoNam)
                    .addComponent(rdoNu))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        this.clearForm();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        SinhVien sv = new SinhVien();
        String maSv = txtMaSV.getText();
        String hoTen = txtHoTen.getText();
        String email = txtEmail.getText();
        String sodt = txtSoDT.getText();
        int gioiTinh = rdoNam.isSelected() ? 1 : 0;
        String dia_chi = txtDiaChi.getText();

        sv.setMaSv(maSv);
        sv.setHo_ten(hoTen);
        sv.setEmail(email);
        sv.setSo_dt(sodt);
        sv.setGioi_tinh(gioiTinh);
        sv.setDia_chi(dia_chi);
        //Check null
        if (maSv.isEmpty() || hoTen.isEmpty() || email.isEmpty() || sodt.isEmpty() || dia_chi.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không được để trống");
            return;
        }
        //check maSV
        boolean result = lstImpl.checkMaSV(maSv);
        if (result) {
            JOptionPane.showMessageDialog(this, "Mã SV bị trùng");
            return;
        }
        //regex Email
        String emaiRegex = "^(.+)@(\\S+)$";
        Pattern pattern = Pattern.compile(emaiRegex);
        if (!email.matches(emaiRegex)) {
            JOptionPane.showMessageDialog(this, "Sai định dạng email");
            return;
        }

        try {
            if (sodt.trim().length() != 10) {
                JOptionPane.showMessageDialog(this, "Số ĐT chỉ được có 10 số");
                return;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Số ĐT phải là số");
            return;

        }

        if (lstImpl.Add(sv)) {
            JOptionPane.showMessageDialog(this, "Thêm thành công");
            loadData(lstImpl.getList());
        } else {
            JOptionPane.showMessageDialog(this, "Thêm thất bại");
        }
        this.clearForm();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        String maSv = txtMaSV.getText();
        int row = tblSV.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Hãy chọn vào 1 dòng trên table");
            return;
        }
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xoá?");
        if (confirm == JOptionPane.YES_OPTION) {
            if (lstImpl.Delete(maSv)) {
            
            JOptionPane.showMessageDialog(this, "Xoá thành công");
            loadData(lstImpl.getList());
            this.clearForm();
        } else{
            JOptionPane.showMessageDialog(this, "Xoá thất bại,Sinh viên này đã nhập điểm");
        }
        }
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        SinhVien sv = new SinhVien();
        String maSv = txtMaSV.getText();
        String hoTen = txtHoTen.getText();
        String email = txtEmail.getText();
        String sodt = txtSoDT.getText();
        int gioiTinh = rdoNam.isSelected() ? 1 : 0;
        String dia_chi = txtDiaChi.getText();

        sv.setMaSv(maSv);
        sv.setHo_ten(hoTen);
        sv.setEmail(email);
        sv.setSo_dt(sodt);
        sv.setGioi_tinh(gioiTinh);
        sv.setDia_chi(dia_chi);
        //Check null
        if (maSv.isEmpty() || hoTen.isEmpty() || email.isEmpty() || sodt.isEmpty() || dia_chi.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không được để trống");
            return;
        }
        //regex Email
        String emaiRegex = "^(.+)@(\\S+)$";
        Pattern pattern = Pattern.compile(emaiRegex);
        Matcher matcher = pattern.matcher(email);
        if (!email.matches(emaiRegex)) {
            JOptionPane.showMessageDialog(this, "Sai định dạng email");
            return;
        }

        try {
            if (sodt.trim().length() != 10) {
                JOptionPane.showMessageDialog(this, "Số ĐT chỉ được có 10 số");
                return;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Số ĐT phải là số");
            return;

        }

        if (lstImpl.Update(maSv, sv)) {
            JOptionPane.showMessageDialog(this, "Update thành công");
            loadData(lstImpl.getList());
        } else {
            JOptionPane.showMessageDialog(this, "UPdate thất bại");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSVMouseClicked
        // TODO add your handling code here:
        int row = tblSV.getSelectedRow();
        if (row == -1) {
            return;
        }
        String maSv = tblSV.getValueAt(row, 0).toString();
        String hoTen = tblSV.getValueAt(row, 1).toString();
        String Email = tblSV.getValueAt(row, 2).toString();
        String soDT = tblSV.getValueAt(row, 3).toString();
        String gioiTinh = tblSV.getValueAt(row, 4).toString();
        String Diachi = tblSV.getValueAt(row, 5).toString();

        txtMaSV.setText(maSv);
        txtHoTen.setText(hoTen);
        txtEmail.setText(Email);
        txtSoDT.setText(soDT);
        txtDiaChi.setText(Diachi);
        if (gioiTinh.equalsIgnoreCase("Nam")) {
            rdoNam.setSelected(true);
        } else {
            rdoNu.setSelected(true);
        }
    }//GEN-LAST:event_tblSVMouseClicked

    private void txtSoDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoDTActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(QLSVUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLSVUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLSVUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLSVUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLSVUi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTable tblSV;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaSV;
    private javax.swing.JTextField txtSoDT;
    // End of variables declaration//GEN-END:variables

}
