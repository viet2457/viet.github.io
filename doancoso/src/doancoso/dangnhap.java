package doancoso;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JDesktopPane;

public class dangnhap extends JFrame {

	private JPanel contentPane;
	private JTextField txtdangnhap;
	private JTextField txtmk;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dangnhap frame = new dangnhap();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public dangnhap() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1377,768);
		//setBounds(100, 100, 878, 499);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel khachsan = new JLabel("Khách Sạn");
		khachsan.setForeground(Color.WHITE);
		khachsan.setFont(new Font("Tahoma", Font.BOLD, 60));
		khachsan.setBounds(677, 2, 362, 156);
		contentPane.add(khachsan);
		
		JLabel quanly = new JLabel("Quản Lý");
		quanly.setBackground(Color.BLUE);
		quanly.setForeground(Color.GREEN);
		quanly.setFont(new Font("Tahoma", Font.BOLD, 60));
		quanly.setBounds(407, 44, 260, 73);
		contentPane.add(quanly);
		
		JLabel dangnhap = new JLabel("Đăng Nhập ");
		dangnhap.setForeground(Color.GREEN);
		dangnhap.setFont(new Font("Tahoma", Font.BOLD, 25));
		dangnhap.setBounds(355, 213, 155, 32);
		contentPane.add(dangnhap);
		
		JLabel matkhau = new JLabel("Mật Khẩu");
		matkhau.setForeground(Color.WHITE);
		matkhau.setFont(new Font("Tahoma", Font.BOLD, 25));
		matkhau.setBounds(982, 211, 144, 37);
		contentPane.add(matkhau);
		
		txtdangnhap = new JTextField();
		txtdangnhap.setBounds(277, 274, 300, 45);
		contentPane.add(txtdangnhap);
		txtdangnhap.setColumns(10);
		
		txtmk = new JTextField();
		txtmk.setBounds(874, 274, 322, 45);
		contentPane.add(txtmk);
		txtmk.setColumns(10);
		
		JButton btndangnhap = new JButton("Đăng Nhập");
		
		btndangnhap.setForeground(Color.WHITE);
		btndangnhap.setBackground(Color.GREEN);
		btndangnhap.setFont(new Font("Tahoma", Font.BOLD, 38));
		btndangnhap.setBounds(488, 399, 454, 68);
		contentPane.add(btndangnhap);
		
		JLabel quenmk = new JLabel("Quên Mật Khẩu");
		quenmk.setFont(new Font("Tahoma", Font.PLAIN, 15));
		quenmk.setBounds(660, 478, 122, 19);
		contentPane.add(quenmk);
		
		JButton btnNewButton = new JButton("Tạo Tài Khoản Mới");
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton.setBounds(532, 531, 362, 45);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Thoát");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		btnNewButton_1.setForeground(Color.GREEN);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(624, 625, 161, 37);
		contentPane.add(btnNewButton_1);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(194, 213, 1, 1);
		contentPane.add(desktopPane);
		
		JLabel kengang = new JLabel("");
		kengang.setIcon(new ImageIcon("C:\\Users\\Administrator\\Downloads\\279582090_718371559216046_7599437508291583780_n.png"));
		kengang.setBounds(114, 508, 1082, 12);
		contentPane.add(kengang);
		
		JLabel anhnen = new JLabel("");
		anhnen.setIcon(new ImageIcon("C:\\Users\\Administrator\\Downloads\\279575835_4634479296653190_7142582254749213153_n.png"));
		anhnen.setBounds(-10, 2, 1371, 730);
		contentPane.add(anhnen);
	}
}
