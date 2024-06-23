package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import views.DangNhap;
import views.Loading;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import java.awt.Color;
import javax.swing.JProgressBar;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Loading extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Loading().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JProgressBar prbLoading;

	/**
	 * Create the frame.
	 */
	Timer time;

	public Loading() {
		setResizable(false);
		initComponents();
		setLocationRelativeTo(null);
		time = new Timer(20, (e) -> {
			prbLoading.setValue(prbLoading.getValue() + 1 < 100 ? prbLoading.getValue() + 1 : 100);
			if (prbLoading.getValue() == 99) {
				this.dispose();
				new DangNhap().setVisible(true);
			}
		});
		time.start();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		prbLoading = new javax.swing.JProgressBar();
		jLabel1 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setBackground(new java.awt.Color(255, 204, 204));
		getContentPane().setLayout(new java.awt.GridLayout(1, 0));

		jPanel1.setBackground(new java.awt.Color(251, 246, 246));

		prbLoading.setForeground(new java.awt.Color(204, 255, 204));
		prbLoading.setMaximumSize(new java.awt.Dimension(300, 30));
		prbLoading.setMinimumSize(new java.awt.Dimension(300, 30));
		prbLoading.setName(""); // NOI18N
		prbLoading.setOpaque(true);
		prbLoading.setPreferredSize(new java.awt.Dimension(300, 30));
		prbLoading.setStringPainted(true);

		jLabel1.setForeground(new java.awt.Color(221, 66, 66));
		jLabel1.setText("Vui lòng đợi trong chốc lát !");

		jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
		jLabel3.setForeground(new java.awt.Color(221, 66, 66));
		jLabel3.setText("Loading .........");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1Layout.setHorizontalGroup(
			jPanel1Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup()
							.addGap(199)
							.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel1Layout.createSequentialGroup()
							.addGap(99)
							.addComponent(prbLoading, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel1Layout.createSequentialGroup()
							.addGap(188)
							.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(99, Short.MAX_VALUE))
		);
		jPanel1Layout.setVerticalGroup(
			jPanel1Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
					.addGap(45)
					.addComponent(jLabel3)
					.addGap(25)
					.addComponent(prbLoading, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
					.addComponent(jLabel1)
					.addGap(27))
		);
		jPanel1.setLayout(jPanel1Layout);

		getContentPane().add(jPanel1);

		pack();
	}// </editor-fold>//GEN-END:initComponents

}
