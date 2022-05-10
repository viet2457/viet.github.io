package doancoso;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
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

public class test extends JFrame {

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
					test frame = new test();
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
	public test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1366,768);
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
		btndangnhap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btndangnhap.setForeground(Color.WHITE);
		btndangnhap.setBackground(Color.GREEN);
		btndangnhap.setFont(new Font("Tahoma", Font.BOLD, 38));
		btndangnhap.setBounds(488, 399, 454, 52);
		contentPane.add(btndangnhap);
		
		JLabel quenmk = new JLabel("Quên Mật Khẩu");
		quenmk.setFont(new Font("Tahoma", Font.PLAIN, 15));
		quenmk.setBounds(663, 462, 122, 19);
		contentPane.add(quenmk);
		
		JButton btnNewButton = new JButton("Tạo Tài Khoản Mới");
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton.setBounds(530, 512, 362, 45);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Thoát");
		btnNewButton_1.setForeground(Color.GREEN);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(624, 606, 161, 37);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Administrator\\Downloads\\279116475_519707016492266_2388921106051159547_n.png"));
		lblNewLabel.setBounds(0, 2, 1368, 728);
		contentPane.add(lblNewLabel);
	}
}
