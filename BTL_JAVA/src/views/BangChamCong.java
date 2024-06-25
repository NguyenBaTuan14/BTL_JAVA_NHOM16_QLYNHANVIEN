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
import javax.swing.table.DefaultTableModel;

import model.ChamCong;
import model.NhanVien;
import model.TaiKhoan;
import service.NhanVienService;
import views.ChonCongViec;
import views.BangChamCong;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;

public class BangChamCong extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	/**
     * Creates new form BangChamCong
     */
    private DefaultTableModel dtmChamCong = new DefaultTableModel();
    

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
            java.util.logging.Logger.getLogger(BangChamCong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BangChamCong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BangChamCong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BangChamCong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BangChamCong().setVisible(true);
            }
        });
	}
	
	// Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonQuayLai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbChamCong;
    // End of variables declaration//GEN-END:variables

	/**
	 * Create the frame.
	 */
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbChamCong = new javax.swing.JTable();
        buttonQuayLai = new javax.swing.JButton();
        buttonQuayLai.setIcon(new ImageIcon(BangChamCong.class.getResource("/icon/Open door.png")));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 239, 239));

        jPanel1.setBackground(new java.awt.Color(251, 246, 246));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(54, 69, 204));
        jLabel1.setText("THỜI GIAN LÀM VIỆC");

        tbChamCong.setModel(new DefaultTableModel(
        	new Object[][] {
        		{null, null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null, null, null},
        	},
        	new String[] {
        			"MÃ", "Họ Tên", "Giờ vào sáng", "Giờ ra sáng","Giờ vào chiều", "Giờ ra chiều", "Ngày chấm", "Giờ làm (Ngày)", "Giờ làm (Tháng)"
        	}
        ));
        jScrollPane1.setViewportView(tbChamCong);
        if (tbChamCong.getColumnModel().getColumnCount() > 0) {
            tbChamCong.getColumnModel().getColumn(0).setMaxWidth(70);
            tbChamCong.getColumnModel().getColumn(1).setMinWidth(120);
        }

        buttonQuayLai.setBackground(new java.awt.Color(244, 164, 96));
        buttonQuayLai.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonQuayLai.setText("Quay lại");
        buttonQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonQuayLaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(390)
        					.addComponent(jLabel1))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(100)
        					.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 800, GroupLayout.PREFERRED_SIZE)))
        			.addGap(100))
        		.addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        			.addContainerGap(452, Short.MAX_VALUE)
        			.addComponent(buttonQuayLai)
        			.addGap(431))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(50)
        			.addComponent(jLabel1)
        			.addGap(48)
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE)
        			.addGap(45)
        			.addComponent(buttonQuayLai, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1.setLayout(jPanel1Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void buttonQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonQuayLaiActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát không", "Thoát", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            this.dispose();
            new ChonCongViec().setVisible(true);
        }
    }//GEN-LAST:event_buttonQuayLaiActionPerformed

    /**
     * @param args the command line arguments
     */
	public BangChamCong() {
    	setResizable(false);
		initComponents();
        setLocationRelativeTo(null);
        String header[] = {"MÃ", "Họ Tên", "Giờ vào sáng", "Giờ ra sáng","Giờ vào chiều", "Giờ ra chiều", "Ngày chấm", "Giờ làm (Ngày)", "Giờ làm (Tháng)"};
        tbChamCong.setModel(dtmChamCong);
        dtmChamCong.setColumnIdentifiers(header);
        
        
        docFile();
        showDataTable();
        
	}
	

	
	public static void docFile() {
		try {
			FileInputStream fis = new FileInputStream("ChamCong.bin");
			ObjectInputStream ois = new ObjectInputStream(fis);
			List<ChamCong> nvs = (List<ChamCong>) ois.readObject();
			ChamCong.chamCongs.removeAll(ChamCong.chamCongs);
			for (ChamCong nv : nvs) {
				
				ChamCong.chamCongs.add(nv);
			}
			fis.close();
			ois.close();

		} catch (Exception e) {
		}
	}

    private void showDataTable() {
        dtmChamCong.setRowCount(0);
        for (ChamCong cc : ChamCong.chamCongs) {
            dtmChamCong.addRow(cc.getObject());
        }
    }

}
