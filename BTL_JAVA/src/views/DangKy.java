package views;

import java.awt.EventQueue;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.AncestorEvent;

import model.TaiKhoan;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import java.awt.Component;

public class DangKy extends JFrame {

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
                new DangKy().setVisible(true);
            }
        });
	}
	
	private javax.swing.JButton btnDangKy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtTenDangNhap;
    private JPasswordField txtMatKhauAgain;
    // End of variables declaration//GEN-END:variables

	/**
	 * Create the frame.
	 */
    public DangKy() {
		setResizable(false);
		initComponents();
        setLocationRelativeTo(null);
        docFile();
        
	}
	
	
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTenDangNhap = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnDangKy = new javax.swing.JButton();
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
        jLabel2.setText("Đăng Ký");

        jLabel3.setText("Mật khẩu:");

        btnDangKy.setBackground(new java.awt.Color(255, 153, 0));
        btnDangKy.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btnDangKy.setText("Đăng Ký");
        btnDangKy.setBorder(null);
        btnDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangKyActionPerformed(evt);
            }
        });
        
        JLabel jLabel4 = new JLabel();
        jLabel4.setText("Nhập lại mật khẩu:");
        
        txtMatKhauAgain = new JPasswordField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(194)
        			.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(211, Short.MAX_VALUE))
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(58)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel3)
        				.addComponent(jLabel1)
        				.addComponent(jLabel4))
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(btnDangKy, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
        					.addContainerGap(143, Short.MAX_VALUE))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(18)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(txtMatKhauAgain, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)
        						.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING, false)
        							.addComponent(txtMatKhau, Alignment.LEADING)
        							.addComponent(txtTenDangNhap, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)))
        					.addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(11)
        			.addComponent(jLabel2)
        			.addGap(21)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel1)
        				.addComponent(txtTenDangNhap, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        			.addGap(21)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel3)
        				.addComponent(txtMatKhau, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel4)
        				.addComponent(txtMatKhauAgain, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        			.addGap(41)
        			.addComponent(btnDangKy, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.linkSize(SwingConstants.VERTICAL, new Component[] {txtTenDangNhap, txtMatKhau, txtMatKhauAgain});
        jPanel1.setLayout(jPanel1Layout);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
	private void jPanel1AncestorAdded(AncestorEvent evt) {
		// TODO Auto-generated method stub
		
	}
	private void btnDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        TaiKhoan tkdk = null;
        
        if (check()) {
            for (TaiKhoan tk : TaiKhoan.taiKhoans) {
                if (txtTenDangNhap.getText().equalsIgnoreCase(tk.getTaiKhoan())) {
                    tkdk = tk; // lấy tài khoản đăng nhập
                }
            }
            if (tkdk != null) {
                //kiểm tra xem tài khoản có tồn tại không, nếu có kiểm tra mật khẩu có đúng không
            	JOptionPane.showMessageDialog(this, "Tài khoản đã tồn tại",
                        "Đăng ký không thành công", JOptionPane.ERROR_MESSAGE);
                
            } else {
                
                if(!(txtMatKhau.getText().equals(txtMatKhauAgain.getText()))){
                	JOptionPane.showMessageDialog(this, "Mật khẩu nhập lại không khớp",
                            "Đăng ký không thành công", JOptionPane.ERROR_MESSAGE);
                }else {
                	tkdk = new TaiKhoan(txtTenDangNhap.getText(),txtMatKhau.getText());
                	TaiKhoan.taiKhoans.add(tkdk);
                	TaiKhoan.ghiDuLieu();
                	JOptionPane.showMessageDialog(this, "Tài khoản đã được lưu",
                            "Đăng ký thành công", JOptionPane.OK_OPTION);
                	this.dispose();
                	new DangNhap().setVisible(true);
                }
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
        if (new String(txtMatKhauAgain.getPassword()).isEmpty()) {
            err.append("Mật khẩu nhập lại không được để trống\n");
        }
        if (err.length() > 0) {
            JOptionPane.showMessageDialog(this, err);
            return false;
        } else {
            return true;
        }
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
