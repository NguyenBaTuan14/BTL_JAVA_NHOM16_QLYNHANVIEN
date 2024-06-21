package views;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.AncestorEvent;

import model.NhanVien;
import model.TaiKhoan;
import service.NhanVienService;
import views.ChonCongViec;
import views.DangNhap;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.awt.event.ActionEvent;

public class DangNhap extends JFrame {

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
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhap().setVisible(true);
            }
        });
	}
	
	// Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JCheckBox chkNhoMatKhau;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtTenDangNhap;
    // End of variables declaration//GEN-END:variables

	/**
	 * Create the frame.
	 */
	public DangNhap() {
		setResizable(false);
		initComponents();
        setLocationRelativeTo(null);
        taiKhoanDefault();
        docFile();
        nhoMatKhau();
	}
	
	
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTenDangNhap = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        chkNhoMatKhau = new javax.swing.JCheckBox();
        btnDangNhap = new javax.swing.JButton();
        txtMatKhau = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBackground(new java.awt.Color(251, 246, 246));
        jPanel1.setMaximumSize(new java.awt.Dimension(500, 300));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 300));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 300));
        jPanel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanel1AncestorAdded(evt);
            }
            
			public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel1.setText("Tên đăng nhập:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(54, 69, 204));
        jLabel2.setText("Đăng nhập");

        jLabel3.setText("Mật khẩu:");

        chkNhoMatKhau.setBackground(new java.awt.Color(251, 246, 246));
        chkNhoMatKhau.setText("Nhớ mật khẩu");

        btnDangNhap.setBackground(new java.awt.Color(255, 153, 0));
        btnDangNhap.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.setBorder(null);
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });
        
        JButton btnDangKy = new JButton();
        btnDangKy.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
        		new DangKy().setVisible(true);
        	}

			
        });
        btnDangKy.setText("Đăng Ký");
        btnDangKy.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        btnDangKy.setBorder(null);
        btnDangKy.setBackground(new Color(255, 153, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(172)
        			.addComponent(chkNhoMatKhau)
        			.addContainerGap(226, Short.MAX_VALUE))
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(90)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel1)
        						.addComponent(jLabel3))
        					.addGap(29)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(txtTenDangNhap, GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
        						.addComponent(txtMatKhau, GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(194)
        					.addComponent(jLabel2)
        					.addGap(0, 105, Short.MAX_VALUE)))
        			.addGap(99))
        		.addGroup(Alignment.LEADING, jPanel1Layout.createSequentialGroup()
        			.addGap(122)
        			.addComponent(btnDangNhap, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
        			.addGap(56)
        			.addComponent(btnDangKy, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(122, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(Alignment.LEADING, jPanel1Layout.createSequentialGroup()
        			.addGap(11)
        			.addComponent(jLabel2)
        			.addGap(21)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(txtTenDangNhap, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel1))
        			.addGap(21)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel3)
        				.addComponent(txtMatKhau, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        			.addGap(14)
        			.addComponent(chkNhoMatKhau, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        			.addGap(36)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnDangNhap, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnDangKy, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel1.setLayout(jPanel1Layout);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
	private void jPanel1AncestorAdded(AncestorEvent evt) {
		// TODO Auto-generated method stub
		
	}
	@SuppressWarnings("deprecation")
	private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        TaiKhoan tkdn = null;
        if (check()) {
            for (TaiKhoan tk : TaiKhoan.taiKhoans) {
                if (txtTenDangNhap.getText().equalsIgnoreCase(tk.getTaiKhoan())) {
                    tkdn = tk; // lấy tài khoản đăng nhập
                }
            }
            if (tkdn != null
                    && new String(txtMatKhau.getPassword()).equalsIgnoreCase(tkdn.getMatKhau())) {
                //kiểm tra xem tài khoản có tồn tại không, nếu có kiểm tra mật khẩu có đúng không
                this.dispose();
                new ChonCongViec().setVisible(true);
                if (chkNhoMatKhau.isSelected()) { // nếu nhớ mật khẩu được tích sẽ lưu ttin
                    TaiKhoan.taiKhoanNho = txtTenDangNhap.getText();
                    TaiKhoan.matKhauNho = new String(txtMatKhau.getPassword());
                } else { // nếu không tích sẽ không lưu
                    TaiKhoan.taiKhoanNho = "";
                    TaiKhoan.matKhauNho = "";
                }
            } else {
                JOptionPane.showMessageDialog(this, "Tài khoản hoặc mật khẩu không chính xác",
                        "Đăng nhập không thành công", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnDangNhapActionPerformed
	
    public boolean check() {
        StringBuilder err = new StringBuilder();
        if (txtTenDangNhap.getText().isEmpty()) {
            err.append("Tên đăng nhập không được để trống\n");
        }
        if (new String(txtMatKhau.getPassword()).isEmpty()) {
            err.append("Mật khẩu không được để trống\n");
        }
        if (err.length() > 0) {
            JOptionPane.showMessageDialog(this, err);
            return false;
        } else {
            return true;
        }
    }

    public void nhoMatKhau() {
        if (!TaiKhoan.taiKhoanNho.isEmpty()) { // kiểm tra nếu ttin tài khoản được lưu không trống
            txtTenDangNhap.setText(TaiKhoan.taiKhoanNho);
            txtMatKhau.setText(TaiKhoan.matKhauNho);
            chkNhoMatKhau.setSelected(true);
        }
    }

    public void taiKhoanDefault() {

        TaiKhoan.taiKhoans.add(new TaiKhoan("lyxinh", "123"));
        TaiKhoan.taiKhoans.add(new TaiKhoan("quanly", "123"));
        TaiKhoan.ghiDuLieu();

    }
    public void docFile() {
		try {
			FileInputStream fis = new FileInputStream("TaiKhoan.bin");
			ObjectInputStream ois = new ObjectInputStream(fis);
			List<TaiKhoan> tks = (List<TaiKhoan>) ois.readObject();
			TaiKhoan.taiKhoans.removeAll(TaiKhoan.taiKhoans);
			for (TaiKhoan tk : tks) {
				TaiKhoan.taiKhoans.add(tk);
			}
			fis.close();
			ois.close();

		} catch (Exception e) {
		}
	}
}
