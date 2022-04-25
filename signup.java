package com.mycompany.doanjava;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMINB
 */
package karaoke;


import java.awt.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;

import java.sql.ResultSet;

import java.sql.Statement;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;




//import notepad.signup2;
@SuppressWarnings({ "serial", "unused" })
public class signup extends JFrame implements ActionListener
{
	JPanel contentPane;
	JTextField user;
	JPasswordField pass;
	JButton Login1;
	JButton Cancel;
	JButton contact;
	JLabel anhnen;
	JCheckBox checkBox;
	Connection con;
	ResultSet rs;
	Statement stm;
	DefaultTableModel dm;
	//listsong nhacsi = new listsong();
	//listsong casi = new listsong();
	public signup() {
//		try {
//			 String DB_URL = "jdbc:mysql://localhost:3306/karaoke";
//		     String USER_NAME = "root";
//		     String PASSWORD = "1234";
//			
//		     con = DriverManager.getConnection(DB_URL,USER_NAME,PASSWORD);
//			
//			stm = con.createStatement();
//			System.out.print("Connected");
//			String sql = "SELECT*FROM Login";
//			rs = stm.executeQuery(sql);
//		}catch(Exception e){
//			e.printStackTrace();
//		}
		// TODO Auto-generated constructor stub
			setTitle("Log in");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 498, 395);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			setLocationRelativeTo(null);
			this.setResizable(false); 
			contentPane.setLayout(null);
		
			JLabel lblNewLabel = new JLabel("Log in");
			lblNewLabel.setForeground(Color.RED);
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
			lblNewLabel.setBounds(188, 70, 127, 51);
			contentPane.add(lblNewLabel);
			
			JLabel username = new JLabel("Username :");
			username.setFont(new Font("Tahoma", Font.BOLD, 18));
			username.setBounds(22, 141, 108, 22);
			contentPane.add(username);
			
			JLabel password = new JLabel("Password :");
			password.setFont(new Font("Tahoma", Font.BOLD, 18));
			password.setBounds(22, 204, 108, 22);
			contentPane.add(password);
			
			user = new JTextField();
			user.setForeground(Color.green);
			user.setBackground(Color.black);
			user.setCaretColor(Color.white);
			user.setText("Enter your username here");
			user.setFont(new Font("MS foli",Font.BOLD,15));
			user.setBounds(153, 146, 264, 31);
			contentPane.add(user);
			//user.setColumns(10);
			
			pass = new JPasswordField();
			pass.setForeground(Color.green);
			pass.setBackground(Color.black);
			pass.setCaretColor(Color.white);
			//pass.setOpaque(true);
			pass.setText("Enter password here");
			//pass.setEchoChar('*');
			pass.setFont(new Font("MS foli",Font.BOLD,15));
			pass.setBounds(153, 207, 264, 31);
			contentPane.add(pass);
			//pass.setColumns(10);
			
			Cancel = new JButton("Cancel",new ImageIcon("J:\\My Drive\\Đồ án java\\New folder\\259461465_645609943310929_7885227564676938518_n.png"));
			//Cancel.setIcon(new ImageIcon("J:\\My Drive\\Đồ án java\\New folder\\deleted-button.png"));
			Cancel.addActionListener(this);
			Cancel.setForeground(Color.white);
			Cancel.setBackground(Color.red);
			Cancel.setBackground(new Color(255, 69, 0));
			Cancel.setFont(new Font("Tahoma", Font.BOLD, 18));
			Cancel.setBounds(22, 303, 140, 40);
			contentPane.add(Cancel);
			
			checkBox = new JCheckBox("Show password");
			checkBox.addActionListener(this);
			checkBox.setFont(new Font("Tahoma", Font.BOLD, 18));
			checkBox.setBounds(193, 248, 171, 31);
			contentPane.add(checkBox);
			
			Login1 = new JButton("Login",new ImageIcon("J:\\My Drive\\Đồ án java\\New folder\\272774281_315478593953074_1835666774111849950_n.png"));
			//Login1.setIcon(new ImageIcon("J:\\My Drive\\Đồ án java\\New folder\\user.png"));
			Login1.addActionListener(this);
			Login1.setForeground(new Color(245,245,245));
			Login1.setBackground(new Color(30,144,255));
			Login1.setFont(new Font("Tahoma", Font.BOLD, 18));
			Login1.setBounds(326, 303, 140, 40);
			contentPane.add(Login1); 
						
			JLabel lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Hoang Viet\\Downloads\\login.png"));
			lblNewLabel_1.setBounds(103, 75, 46, 46);
			contentPane.add(lblNewLabel_1);
		
			
			anhnen = new JLabel("");
			anhnen.setIcon(new ImageIcon("C:\\Users\\ADMINB\\Desktop\\1637045678_709_Chiem-Nguong-Ve-Dep-Phong-Canh-Thien-Nhien-Ky-Ao.jpg"));
			anhnen.setBounds(0, 0, 484, 358);
			contentPane.add(anhnen);
			
			contact = new JButton("Contact",new ImageIcon("J:\\My Drive\\Đồ án java\\New folder\\contact.png"));
			//contact.setText("Contact");
			//contact.setIcon(new ImageIcon("J:\\My Drive\\Đồ án java\\New folder\\contact.png"));
			contact.setForeground(new Color(30, 144, 255));
			contact.setBackground(new Color(238, 130, 238));
			contact.addActionListener(this);
			contact.setFont(new Font("Tahoma", Font.BOLD, 18));
			contact.setBounds(340, 0, 154, 40);
			contentPane.add(contact);
		}	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getActionCommand().equals("Login")) {
					String usename = user.getText();
					String password = pass.getText();
					if (usename.trim().equals("vietkudo")&& password.trim().equals("conan")) {
						Appchat gd = new Appchat();
						gd.setVisible(true);
						dispose();
					}else {
						JOptionPane.showMessageDialog(null, "Account is incorrect.Please sign up again or contact to owner");
						
					}
				}
						else if(e.getSource() == Cancel)
					{
						JOptionPane.showMessageDialog(null, "Please sign up to start program." + "If you don't have account ,"
							+ " you should contact with owner to sign up ");
					}
						else if(e.getSource() == checkBox) {
							if (checkBox.isSelected()) {
								pass.setEchoChar((char) 0);
							} else {
								pass.setEchoChar('*');
							}
						}
						else if(e.getSource() == contact) {
							JOptionPane.showMessageDialog(null,"If you meet difficulty in signing account , you can contact with me via : "
									+ "\nNick Facebook : https://www.facebook.com/Viethoang1412"
									+ "\nPhone : 0329190334");
						}
					}
		
//			public void timten(String IDSONG) {
//				JFrame jframe = new JFrame("List song");
//				jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
//				jframe.setSize(1000, 300);
//				jframe.setLocationRelativeTo(null);
//				jframe.setVisible(true);
//				
//				JPanel jptk = new JPanel();
//				
//				DefaultTableModel dm = new DefaultTableModel();
//				dm.setColumnIdentifiers(new String[] { "NAMESONG", "IDSONG", "TYPESONG ", "SINGERNAME",
//						"MUSICIANNAME"});
//				JTable tbl = new JTable(dm);
//				JScrollPane sc = new JScrollPane(tbl, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
//						JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
//				sc.setBounds(0, 0, 985, 207);
//				jptk.setLayout(null);
//				
//				/*
//				JButton musician = new JButton("Find musician");
//				musician.setBounds(109, 213, 159, 40);
//				jptk.add(musician);
//				*/
//				JButton trove = new JButton("Return");
//				trove.setBounds(388, 213, 167, 40);
//				jptk.add(trove);
//				/*
//				JButton singer = new JButton("singer");
//				trove.setBounds(695, 213, 167, 40);
//				jptk.add(trove);
//				
//				singer.addActionListener(new ActionListener() {
//
//					@Override
//					public void actionPerformed(ActionEvent e) {
//						// TODO Auto-generated method stub
//						String singer1 = JOptionPane.showInputDialog(null,"Enter musician name which you want to find :");
//						//casi.timcasi(singer1);
//						dispose();
//					
//					}
//				});
//				musician.addActionListener(new ActionListener() {
//
//					@Override
//					public void actionPerformed(ActionEvent e) {
//						// TODO Auto-generated method stub
//						String musician1 = JOptionPane.showInputDialog(null,"Enter singer name which you want to find :");
//						//nhacsi.timcasi(musician1);
//						dispose();
//					
//					}
//				});
//				*/
//				trove.addActionListener(new ActionListener() {
//
//					@Override
//					public void actionPerformed(ActionEvent e) {
//						// TODO Auto-generated method stub
////						new listsong();
////						jframe.setVisible(false);
//						
//					}
//					
//				});
//						
//			
//				try {
//					System.out.println("");
//					System.out.println("select * from LISTSONG where NAMESONG= N'"+IDSONG+"'");
//					rs = stm.executeQuery("select * from LISTSONG where NAMESONG= N'"+IDSONG+"' ");
//					while(rs.next()) {
//						dm.addRow(new String[]{rs.getString(1), rs.getString(2),rs.getString(3),
//								rs.getString(4), rs.getString(5)});
//					}
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				jptk.add(sc,BorderLayout.CENTER);
//				jframe.add(jptk);
//			}
			/*
	public void timcasi(String SINGERNAME) {
		try {
			System.out.println("");
			System.out.println("select * from LISTSONG where SINGERNAME = N'"+SINGERNAME+"'");
			rs = stm.executeQuery("select * from LISTSONG where SINGERNAME = N'"+SINGERNAME+"' ");
			while(rs.next()) {
				dm.addRow(new String[]{rs.getString(1), rs.getString(2),rs.getString(3),
						rs.getString(4), rs.getString(5)});
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		*/
	
	private void exit() {
		this.setVisible(false);
	}
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					signup frame = new signup();
					frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}
}
	
			
	
	

	


