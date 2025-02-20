package Models;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.LineBorder;

import Modules.LoginAuth;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;


public class User_Login extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_Username;
	private JButton Login_btn;
	private JButton Back_btn;
	LoginAuth authentication = new LoginAuth();
	private JPasswordField passwordField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User_Login frame = new User_Login();
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
	public User_Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(255, 245, 227));
		passwordField.setBounds(258, 222, 175, 25);
		contentPane.add(passwordField);
		
		JPanel panellbl1 = new JPanel();
		panellbl1.setLayout(null);
		panellbl1.setBorder(new LineBorder(new Color(57, 28, 11), 2));
		panellbl1.setBackground(new Color(238, 180, 98));
		panellbl1.setBounds(238, 75, 208, 49);
		contentPane.add(panellbl1);
		
		JLabel userlbl = new JLabel("USER");
		userlbl.setForeground(new Color(57, 28, 11));
		userlbl.setFont(new Font("Lucida Sans", Font.BOLD, 25));
		userlbl.setBounds(67, 15, 147, 19);
		panellbl1.add(userlbl);
		
		textField_Username = new JTextField();
		textField_Username.setFont(new Font("Lucida Sans", Font.BOLD, 12));
		textField_Username.setBackground(new Color(255, 245, 227));
		textField_Username.setBounds(258, 168, 172, 25);
		textField_Username.setBorder(new LineBorder(new Color(57, 28, 11), 2));
		contentPane.add(textField_Username);
		
		textField_Username.setColumns(10);
		
		JLabel username_lbl = new JLabel("Username:");
		username_lbl.setForeground(new Color(57, 28, 11));
		username_lbl.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		username_lbl.setBounds(258, 150, 108, 17);
		contentPane.add(username_lbl);
		
		JLabel password_lbl = new JLabel("Password:");
		password_lbl.setForeground(new Color(57, 28, 11));
		password_lbl.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		password_lbl.setBounds(258, 202, 108, 17);
		contentPane.add(password_lbl);
		
	    Login_btn = new JButton("LOGIN");
		Login_btn.setForeground(new Color(255, 245, 227));
		Login_btn.setFont(new Font("Lucida Sans", Font.BOLD, 12));
		Login_btn.setBackground(new Color(57, 28, 11));
		Login_btn.setBorder(new LineBorder(new Color(159, 106, 56), 4));
		Login_btn.setBounds(279, 257, 115, 25);
		Login_btn.addActionListener(this);
		contentPane.add(Login_btn);
		
	    Back_btn = new JButton("BACK");
		Back_btn.setForeground(new Color(255, 245, 227));
		Back_btn.setFont(new Font("Lucida Sans", Font.BOLD, 12));
		Back_btn.setBorder(new LineBorder(new Color(159, 106, 56), 4));
		Back_btn.setBackground(new Color(57, 28, 11));
		Back_btn.setBounds(279, 292, 115, 25);
		Back_btn.addActionListener(this);
		contentPane.add(Back_btn);
		
		JLabel user_lblbackg = new JLabel("");
		user_lblbackg.setIcon(new ImageIcon(User_Login.class.getResource("/Resources/User_backg.png")));
		user_lblbackg.setBounds(0, 0, 686, 453);
		contentPane.add(user_lblbackg);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getSource() == Login_btn)
		{
			String username = textField_Username.getText();
			String password = String.valueOf(passwordField.getPassword());
			authentication.UserLogin(username, password);
			if(authentication.loginSuccess())
			{
				dispose();
				new User_Librarian().setVisible(true);
			}
			else
			{
				textField_Username.setText("");
				passwordField.setText("");
			}
					
		}
		else if(e.getSource() == Back_btn)
		{
			dispose();
			new Main_Login().setVisible(true);
		}
		
	}
}
