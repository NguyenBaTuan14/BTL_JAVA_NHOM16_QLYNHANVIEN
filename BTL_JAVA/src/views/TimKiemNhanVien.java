package views;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import model.NhanVien;
import service.NhanVienService;
import javax.swing.ImageIcon;

public class TimKiemNhanVien extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private DefaultTableModel dtm = new DefaultTableModel();
    private NhanVienService nhanVienService = new NhanVienService();
    private List<NhanVien> listNhanVien;

    private DefaultComboBoxModel dcbm = new DefaultComboBoxModel();
    private List<String> listCbb = new ArrayList<>();
    
 // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnThoat1;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JComboBox<String> cbbLoaiTimKiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTimKiem;
    private javax.swing.JTable tbTimKiem;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

	

	/**
	 * Create the frame.
	 */
	public TimKiemNhanVien(List<NhanVien> listNhanVien) {
		setResizable(false);
        initComponents();
        setLocationRelativeTo(null);
        this.listNhanVien = listNhanVien;
        String header[] = {"Mã NV", "Họ Tên", "Năm Sinh", "Giới Tính", "SĐT", "CCCD", "Địa Chỉ"};
        tbTimKiem.setModel(dtm);
        dtm.setColumnIdentifiers(header);
        loadCbb();
        showDataTable();
    }
	 @SuppressWarnings("unchecked")
	    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	    private void initComponents() {

	        jPanel1 = new javax.swing.JPanel();
	        jLabel3 = new javax.swing.JLabel();
	        jLabel1 = new javax.swing.JLabel();
	        txtTimKiem = new javax.swing.JTextField();
	        lbTimKiem = new javax.swing.JLabel();
	        btnTimKiem = new javax.swing.JButton();
	        btnTimKiem.setIcon(new ImageIcon(TimKiemNhanVien.class.getResource("/icon/Search.png")));
	        jScrollPane1 = new javax.swing.JScrollPane();
	        tbTimKiem = new javax.swing.JTable();
	        btnLamMoi = new javax.swing.JButton();
	        btnLamMoi.setIcon(new ImageIcon(TimKiemNhanVien.class.getResource("/icon/Refresh.png")));
	        cbbLoaiTimKiem = new javax.swing.JComboBox<>();
	        btnThoat1 = new javax.swing.JButton();
	        btnThoat1.setIcon(new ImageIcon(TimKiemNhanVien.class.getResource("/icon/Open door.png")));

	        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
	        setTitle("Tìm kiếm nhân viên");
	        setBackground(new java.awt.Color(255, 239, 239));
	        setMaximumSize(new java.awt.Dimension(500, 250));
	        setMinimumSize(new java.awt.Dimension(500, 250));
	        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

	        jPanel1.setBackground(new java.awt.Color(251, 246, 246));

	        jLabel3.setText("Loại tìm kiếm  :");

	        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
	        jLabel1.setForeground(new java.awt.Color(54, 69, 204));
	        jLabel1.setIcon(new ImageIcon(TimKiemNhanVien.class.getResource("/icon/Search.png"))); // NOI18N
	        jLabel1.setText("TÌM KIẾM NHÂN VIÊN");

	        txtTimKiem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(145, 239, 253)));

	        lbTimKiem.setText("Mã/ họ tên:");

	        btnTimKiem.setBackground(new java.awt.Color(244, 164, 96));
	        btnTimKiem.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
	        btnTimKiem.setText("Tìm Kiếm");
	        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                btnTimKiemActionPerformed(evt);
	            }
	        });

	        tbTimKiem.setModel(new javax.swing.table.DefaultTableModel(
	            new Object [][] {
	                {null, null, null, null, null, null, null},
	                {null, null, null, null, null, null, null},
	                {null, null, null, null, null, null, null},
	                {null, null, null, null, null, null, null}
	            },
	            new String [] {
	                "Mã", "Họ tên", "Năm sinh", "Giới tính", "Số điện thoại", "CCCD/ CMT", "Địa chỉ"
	            }
	        ));
	        jScrollPane1.setViewportView(tbTimKiem);

	        btnLamMoi.setBackground(new java.awt.Color(244, 164, 96));
	        btnLamMoi.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
	        btnLamMoi.setText("Làm mới");
	        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                btnLamMoiActionPerformed(evt);
	            }
	        });

	        cbbLoaiTimKiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
	        cbbLoaiTimKiem.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                cbbLoaiTimKiemActionPerformed(evt);
	            }
	        });

	        btnThoat1.setBackground(new java.awt.Color(244, 164, 96));
	        btnThoat1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
	        btnThoat1.setText("Thoát");
	        btnThoat1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                btnThoat1ActionPerformed(evt);
	            }
	        });

	        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
	        jPanel1.setLayout(jPanel1Layout);
	        jPanel1Layout.setHorizontalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addGap(120, 120, 120)
	                        .addComponent(jLabel3))
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addGap(135, 135, 135)
	                        .addComponent(lbTimKiem)))
	                .addGap(29, 29, 29)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                    .addComponent(cbbLoaiTimKiem, 0, 200, Short.MAX_VALUE)
	                    .addComponent(txtTimKiem))
	                .addGap(0, 0, Short.MAX_VALUE))
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addGap(131, 131, 131)
	                        .addComponent(jLabel1))
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addGap(70, 70, 70)
	                        .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(35, 35, 35)
	                        .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(35, 35, 35)
	                        .addComponent(btnThoat1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addGap(60, 60, 60)
	                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addContainerGap(70, Short.MAX_VALUE))
	        );
	        jPanel1Layout.setVerticalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addGap(22, 22, 22)
	                .addComponent(jLabel1)
	                .addGap(39, 39, 39)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel3)
	                    .addComponent(cbbLoaiTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(22, 22, 22)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(lbTimKiem)
	                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(31, 31, 31)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(btnLamMoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(btnThoat1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                .addGap(70, 70, 70)
	                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(50, 50, 50))
	        );

	        getContentPane().add(jPanel1);
	        jPanel1.getAccessibleContext().setAccessibleName("");

	        pack();
	    }// </editor-fold>//GEN-END:initComponents
	 private void cbbLoaiTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbLoaiTimKiemActionPerformed
	        // TODO add your handling code here:
	        if (cbbLoaiTimKiem.getSelectedItem().toString().equals("Search theo mã")) {
	            lbTimKiem.setText("Nhập mã :");
	        }
	        if (cbbLoaiTimKiem.getSelectedItem().toString().equals("Search theo tên")) {
	            lbTimKiem.setText("Nhập tên :");

	        }
	    }//GEN-LAST:event_cbbLoaiTimKiemActionPerformed

	    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
	        if (txtTimKiem.getText().isEmpty()) {
	            JOptionPane.showMessageDialog(this, "Vui lòng nhập thông tin cần tìm");
	            showDataTable();
	            return;
	        }
	        if (cbbLoaiTimKiem.getSelectedItem().toString().equals("Search theo mã")) {
	            List<NhanVien> listSearchMa = new NhanVienService().searchByMa(listNhanVien, txtTimKiem.getText());
	            if (listSearchMa.size() == 0) {
	                JOptionPane.showMessageDialog(this, "Không thấy nhân viên nào");
	                showDataTable();
	                txtTimKiem.setText("");
	                return;
	            } else {
	                showDataTableSearch(listSearchMa);
	                txtTimKiem.setText("");
	                JOptionPane.showMessageDialog(this, "Tìm kiếm thành công");
	            }
	        } else {
	            List<NhanVien> listSearchTen = new NhanVienService().searchByName(listNhanVien, txtTimKiem.getText());
	            if (listSearchTen.size() == 0) {
	                JOptionPane.showMessageDialog(this, "Không thấy nhân viên nào");
	                txtTimKiem.setText("");
	                showDataTable();
	                return;
	            } else {
	                showDataTableSearch(listSearchTen);
	                txtTimKiem.setText("");
	                JOptionPane.showMessageDialog(this, "Tìm kiếm thành công");
	            }
	        }
	    }//GEN-LAST:event_btnTimKiemActionPerformed
	    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
	        if (JOptionPane.showConfirmDialog(this, "Bạn có muốn làm mới không","Làm mới",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
	            showDataTable();
	            txtTimKiem.setText("");
	            JOptionPane.showMessageDialog(this, "Làm mới thành công");
	        } else {
	            return;
	        }

	    }//GEN-LAST:event_btnLamMoiActionPerformed

	    private void btnThoat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoat1ActionPerformed
	        if (JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát không","Thoát",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
	            this.dispose();
	            new QuanLyNhanVien().setVisible(true);
	        } else {
	            return;
	        }
	    }//GEN-LAST:event_btnThoat1ActionPerformed
	    /**
	     * @param args the command line arguments
	     */
	    private void loadCbb() {
	        listCbb.add("Search theo mã");
	        listCbb.add("Search theo tên");
	        cbbLoaiTimKiem.setModel(dcbm);
	        for (String nhanVien : listCbb) {
	            dcbm.addElement(nhanVien);
	        }
	    }

	    public void showDataTableSearch(List<NhanVien> listNV) {
	        dtm.setRowCount(0);
	        for (NhanVien nv : listNV) {
	            dtm.addRow(nv.getObject());
	        }
	    }

	    public void showDataTable() {
	        dtm.setRowCount(0);
	        for (NhanVien nv : new NhanVienService().selectAll()) {
	            dtm.addRow(nv.getObject());
	        }
	    }

}
