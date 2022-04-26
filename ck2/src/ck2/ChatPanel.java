package ck2;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.TitledBorder;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class ChatPanel extends JPanel {
	
	Socket socket = null;
	BufferedReader bf = null;
	DataOutputStream os = null;
	OutputThread ot = null;
	String sender;
	String receiver;
	JTextArea txtMessages;
//	 private String DB_URL = "jdbc:mysql://localhost:3306/test";
//	 private String USER_NAME = "root";
//	 private String PASSWORD = "";
	/**
	 * Create the panel.
	 */
	public ChatPanel(Socket s, String sender, String receiver) {
//		 try {
//	            
//	            Connection conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
//	            
//	            Statement stmt = conn.createStatement();
//	          
//	            ResultSet rs = stmt.executeQuery("select * from informationchat");
//	           
//	            while (rs.next()) {
//	                System.out.println(rs.getString(1));
//	            }
//	            
//	            conn.close();
//	       
	    
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Message", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(panel, BorderLayout.SOUTH);
		panel.setLayout(new GridLayout(0, 3, 0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane);
		
		JTextArea txtMessage = new JTextArea();
		scrollPane.setViewportView(txtMessage);
		
		JButton btnSend = new JButton("Send");
		btnSend.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtMessage.getText().trim().length()==0) return;
				try {
					os.writeBytes(txtMessage.getText());
					os.write(13); os.write(10);
					os.flush();
					txtMessages.append("\n"+sender+ ":"+ txtMessage.getText());
					txtMessage.setText("");
				}
				catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		panel.add(btnSend);
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtMessage.setText("");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel.add(btnNewButton);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		add(scrollPane_1, BorderLayout.CENTER);
		
		txtMessages = new JTextArea();
		scrollPane_1.setViewportView(txtMessages);

		socket = s;
		this.sender = sender;
		this.receiver = receiver;
		try {
			bf = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			os = new DataOutputStream(socket.getOutputStream());
			ot = new OutputThread(s, txtMessages, sender, receiver);
			ot.start();
		} 
		catch (Exception e) {
			
		}
	 	
//	} catch (Exception ex) {
//		ex.printStackTrace();
//	}
		 
}
	public JTextArea gettxtMessages() {
		return this.txtMessages;
	}

}
