package views;

import java.awt.EventQueue;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.ChamCong;
import model.NhanVien;
import service.NhanVienService;
import views.ChonCongViec;
import views.QuanLyNhanVien;
import views.ThemNhanVien;
import javax.swing.ImageIcon;

public class ThemNhanVien extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
            java.util.logging.Logger.getLogger(ThemNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThemNhanVien().setVisible(true);
            }
        });
	}
	
	// Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangKy;
    private javax.swing.JButton btnQuayLai;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton radioNam;
    private javax.swing.JRadioButton radioNu;
    private javax.swing.JTextField txtCCCD;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtHoVaTen;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtNamSinh;
    private javax.swing.JTextField txtSDT;
	private NhanVienService service;
    // End of variables declaration//GEN-END:variables

	/**
	 * Create the frame.
	 */
	public ThemNhanVien() {
		setResizable(false);
		initComponents();
        this.service = new NhanVienService();
        jPanel1.setSize(500, 600);
        this.XoaForm();
        QuanLyNhanVien.docFile();
	}
	
	 private NhanVien getFormData() {
	        String MaNv = this.txtMaNV.getText();
	        String HoVaTen = this.txtHoVaTen.getText();
	        String NamSinh = this.txtNamSinh.getText();
	        boolean GioiTinh = this.radioNam.isSelected();
	        String SDT = this.txtSDT.getText();
	        String DiaChi = this.txtDiaChi.getText();
	        String CCCD = this.txtCCCD.getText();

	        int cccd = 0;
	        if (MaNv.trim().length() == 0
	                || HoVaTen.trim().length() == 0
	                || NamSinh.trim().length() == 0
	                || SDT.trim().length() == 0
	                || DiaChi.trim().length() == 0
	                || CCCD.trim().length() == 0) {
	            JOptionPane.showMessageDialog(this, "Không được để trống thông tin!");
	            return null;
	        }
	        for (NhanVien nv : NhanVienService.nhanViens) {
	            if (nv.getMa().equalsIgnoreCase(txtMaNV.getText())) {
	                JOptionPane.showMessageDialog(this, "Mã nhân viên đã tồn tại");
	                return null;
	            }
	        }
	        if (!txtHoVaTen.getText().trim().matches("^[A-Za-zÀÁÂÃÈÉÊÌÍÒÓÔÕÙƯÚÝàáâãèéêìíòóôõùúýĂăĐđĨĩŨũƠơƯưẠ-ỹ ]+$")) {
	            JOptionPane.showMessageDialog(this, "Họ tên không đúng định dạng");
	            return null;
	        }
//	        if (!txtHoVaTen.getText().trim().matches("^[a-zA-ZaAàÀảẢãÃáÁạẠăĂằẰẳẲẵẴắẮặẶâÂầẦẩẨẫẪấẤậẬbBcCdDđĐeEèÈẻẺẽẼéÉẹẸêÊềỀểỂễỄếẾệỆ"
//	                + "fFgGhHiIìÌỉỈĩĨíÍịỊjJkKlLmMnNoOòÒỏỎõÕóÓọỌôÔồỒổỔỗỖốỐộỘơƠờỜởỞỡỠớỚợỢpPqQrRsStTu"
//	                + "UùÙủỦũŨúÚụỤưƯừỪửỬữỮứỨựỰvVwWxXyYỳỲỷỶỹỸýÝỵỴzZ]+$")) {
//	            JOptionPane.showMessageDialog(this, "Họ tên không đúng định dạng");
//	            return null;
//	        }
	        if (checkNamSinh() == true) {
	            JOptionPane.showMessageDialog(this, "Năm sinh không hợp lệ");
	            return null;
	        }

	        if (checkSDT(SDT) == true) {
	            JOptionPane.showMessageDialog(this, "Số điện thoại không hợp lệ");
	            return null;
	        }
	        if (!txtCCCD.getText().matches("^\\d{12}$")) {
	            JOptionPane.showMessageDialog(this, "CCCD phải là 12 số");
	            return null;
	        }

	        NhanVien nv = new NhanVien(MaNv, HoVaTen, Integer.parseInt(NamSinh), GioiTinh, SDT, CCCD, DiaChi);
	        return nv;
	    }
	 
	 @SuppressWarnings("unchecked")
	    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	    private void initComponents() {

	        buttonGroup1 = new javax.swing.ButtonGroup();
	        jPanel1 = new javax.swing.JPanel();
	        jLabel1 = new javax.swing.JLabel();
	        jLabel2 = new javax.swing.JLabel();
	        txtHoVaTen = new javax.swing.JTextField();
	        txtNamSinh = new javax.swing.JTextField();
	        jLabel3 = new javax.swing.JLabel();
	        jLabel4 = new javax.swing.JLabel();
	        radioNu = new javax.swing.JRadioButton();
	        radioNam = new javax.swing.JRadioButton();
	        txtSDT = new javax.swing.JTextField();
	        jLabel5 = new javax.swing.JLabel();
	        jLabel6 = new javax.swing.JLabel();
	        txtDiaChi = new javax.swing.JTextField();
	        txtCCCD = new javax.swing.JTextField();
	        jLabel7 = new javax.swing.JLabel();
	        btnDangKy = new javax.swing.JButton();
	        btnDangKy.setIcon(new ImageIcon(ThemNhanVien.class.getResource("/icon/Accept.png")));
	        btnQuayLai = new javax.swing.JButton();
	        btnQuayLai.setIcon(new ImageIcon(ThemNhanVien.class.getResource("/icon/Open door.png")));
	        jLabel8 = new javax.swing.JLabel();
	        txtMaNV = new javax.swing.JTextField();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	        setTitle("Thêm nhân viên");
	        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

	        jPanel1.setBackground(new java.awt.Color(251, 246, 246));
	        jPanel1.setMaximumSize(new java.awt.Dimension(500, 600));
	        jPanel1.setPreferredSize(new java.awt.Dimension(500, 600));

	        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
	        jLabel1.setForeground(new java.awt.Color(54, 69, 204));
	        jLabel1.setIcon(new ImageIcon(ThemNhanVien.class.getResource("/icon/Users.png"))); // NOI18N
	        jLabel1.setText("THÊM NHÂN VIÊN");

	        jLabel2.setText("Họ và tên:");

	        jLabel3.setText("Năm sinh:");

	        jLabel4.setText("Giới tính:");

	        buttonGroup1.add(radioNu);
	        radioNu.setText("Nữ");

	        buttonGroup1.add(radioNam);
	        radioNam.setText("Nam");

	        txtSDT.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                txtSDTActionPerformed(evt);
	            }
	        });

	        jLabel5.setText("Số điện thoại:");

	        jLabel6.setText("Địa chỉ:");

	        txtCCCD.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                txtCCCDActionPerformed(evt);
	            }
	        });

	        jLabel7.setText("CCCD/ CMT:");

	        btnDangKy.setBackground(new java.awt.Color(244, 164, 96));
	        btnDangKy.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
	        btnDangKy.setText("Đăng ký");
	        btnDangKy.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                btnDangKyActionPerformed(evt);
	            }
	        });

	        btnQuayLai.setBackground(new java.awt.Color(244, 164, 96));
	        btnQuayLai.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
	        btnQuayLai.setText("Quay lại");
	        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                btnQuayLaiActionPerformed(evt);
	            }
	        });

	        jLabel8.setText("Mã nhân viên");

	        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
	        jPanel1.setLayout(jPanel1Layout);
	        jPanel1Layout.setHorizontalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addGap(90, 90, 90)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addGap(1, 1, 1)
	                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(jLabel5)
	                            .addComponent(jLabel6)
	                            .addComponent(jLabel7)
	                            .addComponent(jLabel4)))
	                    .addComponent(jLabel2)
	                    .addComponent(jLabel3)
	                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                .addGap(29, 29, 29)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(txtSDT)
	                    .addComponent(txtNamSinh)
	                    .addComponent(txtHoVaTen)
	                    .addComponent(txtDiaChi)
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addComponent(radioNam)
	                        .addGap(30, 30, 30)
	                        .addComponent(radioNu)
	                        .addGap(0, 91, Short.MAX_VALUE))
	                    .addComponent(txtMaNV)
	                    .addComponent(txtCCCD))
	                .addGap(99, 99, 99))
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addGap(50, 50, 50)
	                .addComponent(btnDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(104, 104, 104)
	                .addComponent(btnQuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(55, 55, 55))
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addGap(145, 145, 145)
	                .addComponent(jLabel1)
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );
	        jPanel1Layout.setVerticalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addGap(20, 20, 20)
	                .addComponent(jLabel1)
	                .addGap(40, 40, 40)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jLabel8))
	                .addGap(28, 28, 28)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(txtHoVaTen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jLabel2))
	                .addGap(34, 34, 34)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(txtNamSinh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jLabel3))
	                .addGap(30, 30, 30)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel4)
	                    .addComponent(radioNam)
	                    .addComponent(radioNu))
	                .addGap(22, 22, 22)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jLabel5))
	                .addGap(28, 28, 28)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jLabel6))
	                .addGap(28, 28, 28)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(txtCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(35, 35, 35)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(btnDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(btnQuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(57, 57, 57))
	        );

	        getContentPane().add(jPanel1);

	        pack();
	        setLocationRelativeTo(null);
	    }// </editor-fold>//GEN-END:initComponents
	 
	 private void btnDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangKyActionPerformed
	        NhanVien nv = this.getFormData();
	        if (nv == null) {
	            return;
	        }
	        if (JOptionPane.showConfirmDialog(this, "Bạn muốn thêm nhân viên?",
	                "Thêm nhân viên", JOptionPane.YES_NO_OPTION,
	                JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
	            this.service.insert(nv);
	            this.XoaForm();
	            JOptionPane.showMessageDialog(this, "Thêm nhân viên thành công");
	            this.service.ghiDuLieu();
	            ChamCong.ghiDuLieu();
	        } else {
	            return;
	        }

	    }//GEN-LAST:event_btnDangKyActionPerformed

	    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
	        if (JOptionPane.showConfirmDialog(this, "Bạn có muốn quay lại không", "Quay lại", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
	            this.dispose();
	            new ChonCongViec().setVisible(true);
	        } else {
	            return;
	        }

	    }//GEN-LAST:event_btnQuayLaiActionPerformed

	    private void txtSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDTActionPerformed
	        // TODO add your handling code here:
	    }//GEN-LAST:event_txtSDTActionPerformed

	    private void txtCCCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCCCDActionPerformed
	        // TODO add your handling code here:
	    }//GEN-LAST:event_txtCCCDActionPerformed
	    
	    private void XoaForm() {
	        this.txtMaNV.setText("");
	        this.txtHoVaTen.setText("");
	        this.txtNamSinh.setText("");
	        this.radioNam.setSelected(true);
	        this.txtSDT.setText("");
	        this.txtDiaChi.setText("");
	        this.txtCCCD.setText("");
	    }

	    private boolean checkNamSinh() {
	        try {
	            String nam = txtNamSinh.getText();
	            SimpleDateFormat sdf = new SimpleDateFormat();
	            sdf.applyPattern("yyyy");
	            Date d = sdf.parse(nam);
	        } catch (ParseException e) {
	            return true;
	        }
	        return false;
	    }

	    private boolean checkSDT(String s) {
	        Pattern pt = Pattern.compile("^0[0-9]{9}$");
	        Matcher mt = pt.matcher(s);
	        if (!mt.find()) {
	            return true;
	        } else {
	            return false;
	        }
	    }

	    private boolean checkMaNV(String ma) {
	        for (NhanVien nv : NhanVienService.nhanViens) {
	            if (nv.getMa().equalsIgnoreCase(ma)) {
	                return false;
	            }
	        }
	        return true;
	    }

}
