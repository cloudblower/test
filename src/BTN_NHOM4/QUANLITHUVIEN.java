/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTN_NHOM4;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class QUANLITHUVIEN extends javax.swing.JFrame{

    public static DSMUONSACH dsmuonsach;
    public static DSSACHTRUYEN dssachtruyen;
    public static DSTHETHUVIEN dsthethuvien;
    private QUANLISACHTRUYEN qlsachtruyen;
    private QUANLITHETHUVIEN qlthethuvien;
    private QUANLIMUONSACH qlmuonsach;
    public QUANLITHUVIEN() {
        initComponents();
        dsmuonsach = new DSMUONSACH();
        dssachtruyen = new DSSACHTRUYEN();
        dsthethuvien = new DSTHETHUVIEN();
        qlsachtruyen = new QUANLISACHTRUYEN();
        qlthethuvien = new QUANLITHETHUVIEN();
        qlmuonsach = new QUANLIMUONSACH();
        qlsachtruyen.setDefaultCloseOperation(HIDE_ON_CLOSE);
        qlthethuvien.setDefaultCloseOperation(HIDE_ON_CLOSE);
        qlmuonsach.setDefaultCloseOperation(HIDE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelHeader = new javax.swing.JLabel();
        labelThanhVienVIP1 = new javax.swing.JLabel();
        labelSachUaChuong1 = new javax.swing.JLabel();
        labelTruyenUaChuong1 = new javax.swing.JLabel();
        labelDoanhThu1 = new javax.swing.JLabel();
        labelThanhVienVIP2 = new javax.swing.JLabel();
        labelDoanhThu2 = new javax.swing.JLabel();
        labelSachUaChuong2 = new javax.swing.JLabel();
        labelTruyenUaChuong2 = new javax.swing.JLabel();
        btnMuonSach = new javax.swing.JButton();
        btnSachTruyen = new javax.swing.JButton();
        btnTheThuVien = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        labelHeader.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelHeader.setText("QUẢN LÍ THƯ VIỆN");

        labelThanhVienVIP1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelThanhVienVIP1.setText("Thành viên VIP :");

        labelSachUaChuong1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelSachUaChuong1.setText("Sách được ưa chuộng nhất:");

        labelTruyenUaChuong1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelTruyenUaChuong1.setText("Truyện được ưa chuộng nhất:");

        labelDoanhThu1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelDoanhThu1.setText("Tổng doanh thu của thư viện:");

        labelThanhVienVIP2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelThanhVienVIP2.setText("không có");

        labelDoanhThu2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelDoanhThu2.setText("không có");

        labelSachUaChuong2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelSachUaChuong2.setText("không có");

        labelTruyenUaChuong2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTruyenUaChuong2.setText("không có");

        btnMuonSach.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMuonSach.setText("Quản Lí Mượn Sách");
        btnMuonSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMuonSachActionPerformed(evt);
            }
        });

        btnSachTruyen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSachTruyen.setText("Quản Lí Sách Truyện");
        btnSachTruyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSachTruyenActionPerformed(evt);
            }
        });

        btnTheThuVien.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnTheThuVien.setText("Quản Lí Thẻ Thư Viện");
        btnTheThuVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTheThuVienActionPerformed(evt);
            }
        });

        btnCapNhat.setText("Cập nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelTruyenUaChuong1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelTruyenUaChuong2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelThanhVienVIP1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelThanhVienVIP2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCapNhat))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelSachUaChuong1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelSachUaChuong2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelDoanhThu1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelDoanhThu2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTheThuVien, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnSachTruyen, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMuonSach, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(244, Short.MAX_VALUE)
                .addComponent(labelHeader)
                .addGap(244, 244, 244))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(labelHeader)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelThanhVienVIP1)
                    .addComponent(labelThanhVienVIP2)
                    .addComponent(btnCapNhat))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSachUaChuong1)
                    .addComponent(labelSachUaChuong2))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTruyenUaChuong1)
                    .addComponent(labelTruyenUaChuong2))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDoanhThu1)
                    .addComponent(labelDoanhThu2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMuonSach, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTheThuVien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSachTruyen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        CapNhatTienThue();
        CapNhatTienChi();
        CapNhatThongTin();
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnTheThuVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTheThuVienActionPerformed
        qlthethuvien.setVisible(true);
    }//GEN-LAST:event_btnTheThuVienActionPerformed

    private void btnSachTruyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSachTruyenActionPerformed
        qlsachtruyen.setVisible(true);
    }//GEN-LAST:event_btnSachTruyenActionPerformed

    private void btnMuonSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMuonSachActionPerformed
        qlmuonsach.setVisible(true);
    }//GEN-LAST:event_btnMuonSachActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(QUANLITHUVIEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QUANLITHUVIEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QUANLITHUVIEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QUANLITHUVIEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QUANLITHUVIEN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnMuonSach;
    private javax.swing.JButton btnSachTruyen;
    private javax.swing.JButton btnTheThuVien;
    private javax.swing.JLabel labelDoanhThu1;
    private javax.swing.JLabel labelDoanhThu2;
    private javax.swing.JLabel labelHeader;
    private javax.swing.JLabel labelSachUaChuong1;
    private javax.swing.JLabel labelSachUaChuong2;
    private javax.swing.JLabel labelThanhVienVIP1;
    private javax.swing.JLabel labelThanhVienVIP2;
    private javax.swing.JLabel labelTruyenUaChuong1;
    private javax.swing.JLabel labelTruyenUaChuong2;
    // End of variables declaration//GEN-END:variables

    public static void CapNhatTienThue(){
        for(int i = 0; i < dsmuonsach.list.size(); i++){
            for(int j = 0; j < dssachtruyen.list.size(); j++){
                if(dsmuonsach.list.get(i).getMaSachTruyen().equalsIgnoreCase(dssachtruyen.list.get(j).getMaSachTruyen())){
                    dsmuonsach.list.get(i).setTienThue(dsmuonsach.list.get(i).tinhSoNgayThue() * dssachtruyen.list.get(j).donGiaThue);
                }
            }
        }
    }
    
    public static void CapNhatTienChi(){
        for(int i = 0; i < dsthethuvien.list.size(); i++){
            double Sum = 0;
            for(int j = 0; j < dsmuonsach.list.size(); j++){
                if(dsthethuvien.list.get(i).getMaThe().equalsIgnoreCase(dsmuonsach.list.get(j).getMaThe())){
                    CapNhatTienThue();
                    Sum += dsmuonsach.list.get(j).getTienThue();
                }
            }
            dsthethuvien.list.get(i).setTienDaChi(Sum);
        }
    }
    
    public void CapNhatThongTin(){
        try {
            double Sum = 0, Max = dsthethuvien.list.get(0).getTienDaChi();
            int vitri = 0;
            // Thành viên VIP
            for(int i = 0; i < dsthethuvien.list.size(); i++){
                if(Max < dsthethuvien.list.get(i).getTienDaChi()){
                    Max = dsthethuvien.list.get(i).getTienDaChi();
                    vitri = i;
                }
            }
            labelThanhVienVIP2.setText(dsthethuvien.list.get(vitri).getTenChuThe());

            // Sách được ưa chuộng nhất
            Max = dssachtruyen.list.get(0).getSoLuocThue();
            vitri = 0;
            for(int i = 0; i < dssachtruyen.list.size(); i++){
                if(dssachtruyen.list.get(i) instanceof SACH){
                    if(Max < dssachtruyen.list.get(i).getSoLuocThue()){
                        Max = dssachtruyen.list.get(i).getSoLuocThue();
                        vitri = i;
                    }
                }
            }
            labelSachUaChuong2.setText(dssachtruyen.list.get(vitri).getTenSachTruyen());

            // Truyện được ưa chuộng nhất
            Max = dssachtruyen.list.get(0).getSoLuocThue();
            vitri = 0;
            for(int i = 0; i < dssachtruyen.list.size(); i++){
                if(dssachtruyen.list.get(i) instanceof TRUYEN){
                    if(Max < dssachtruyen.list.get(i).getSoLuocThue()){
                        Max = dssachtruyen.list.get(i).getSoLuocThue();
                        vitri = i;
                    }
                }
            }
            labelTruyenUaChuong2.setText(dssachtruyen.list.get(vitri).getTenSachTruyen());

            //Tổng doanh thu
            for(int i = 0; i < dsmuonsach.list.size(); i++){
                Sum += dsmuonsach.list.get(i).getTienThue();
            }
            labelDoanhThu2.setText((Double.toString(Sum)+" đồng"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Lỗi thiếu dữ liệu thông tin, vui lòng nhập thêm các bản ghi cho Sách Truyện, Thẻ Thư Viện và Mượn Sách!", "Lỗi", 1);
        }
    }
}
