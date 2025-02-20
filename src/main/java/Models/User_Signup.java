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
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Modules.User_SignUpBackend;

public class User_Signup extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_Username;
	private JTextField textField_password;
	private JTextField textField_fname;
	private JTextField textField_surname;
	private JTextField textField_MI;
	private JTextField textField_email;
	private JTextField textField_phonenumber;
	private JButton Login_btn;
	private JButton Back_btn;
	User_SignUpBackend user = new User_SignUpBackend();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User_Signup frame = new User_Signup();
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
	public User_Signup() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panellbl1 = new JPanel();
		panellbl1.setLayout(null);
		panellbl1.setBorder(new LineBorder(new Color(57, 28, 11), 2));
		panellbl1.setBackground(new Color(238, 180, 98));
		panellbl1.setBounds(238, 75, 208, 49);
		contentPane.add(panellbl1);
		
		JLabel signuplbl = new JLabel("SIGN UP");
		signuplbl.setForeground(new Color(57, 28, 11));
		signuplbl.setFont(new Font("Lucida Sans", Font.BOLD, 25));
		signuplbl.setBounds(50, 15, 147, 19);
		panellbl1.add(signuplbl);
		
		textField_Username = new JTextField();
		textField_Username.setFont(new Font("Lucida Sans", Font.BOLD, 12));
		textField_Username.setBackground(new Color(255, 245, 227));
		textField_Username.setBounds(225, 167, 115, 20);
		textField_Username.setBorder(new LineBorder(new Color(57, 28, 11), 2));
		contentPane.add(textField_Username);
		
		textField_Username.setColumns(10);
		
		textField_password = new JTextField();
		textField_password.setFont(new Font("Lucida Sans", Font.BOLD, 12));
		textField_password.setColumns(10);
		textField_password.setBorder(new LineBorder(new Color(57, 28, 11), 2));
		textField_password.setBackground(new Color(255, 245, 227));
		textField_password.setBounds(273, 308, 137, 20);
		contentPane.add(textField_password);
		
		JLabel username_lbl = new JLabel("Username:");
		username_lbl.setForeground(new Color(57, 28, 11));
		username_lbl.setFont(new Font("Lucida Sans", Font.BOLD, 12));
		username_lbl.setBounds(225, 147, 108, 17);
		contentPane.add(username_lbl);
		
		JLabel password_lbl = new JLabel("Password:");
		password_lbl.setForeground(new Color(57, 28, 11));
		password_lbl.setFont(new Font("Lucida Sans", Font.BOLD, 12));
		password_lbl.setBounds(275, 287, 108, 17);
		contentPane.add(password_lbl);
		
	    Login_btn = new JButton("SignUp");
		Login_btn.setForeground(new Color(255, 245, 227));
		Login_btn.setFont(new Font("Lucida Sans", Font.BOLD, 12));
		Login_btn.setBackground(new Color(57, 28, 11));
		Login_btn.setBorder(new LineBorder(new Color(159, 106, 56), 4));
		Login_btn.setBounds(281, 335, 115, 25);
		Login_btn.addActionListener(this);
		contentPane.add(Login_btn);
		
	    Back_btn = new JButton("BACK");
		Back_btn.setForeground(new Color(255, 245, 227));
		Back_btn.setFont(new Font("Lucida Sans", Font.BOLD, 12));
		Back_btn.setBorder(new LineBorder(new Color(159, 106, 56), 4));
		Back_btn.setBackground(new Color(57, 28, 11));
		Back_btn.setBounds(281, 367, 115, 25);
		Back_btn.addActionListener(this);
		contentPane.add(Back_btn);
		
		JLabel fnamelbl = new JLabel("First Name:");
		fnamelbl.setForeground(new Color(57, 28, 11));
		fnamelbl.setFont(new Font("Lucida Sans", Font.BOLD, 12));
		fnamelbl.setBounds(350, 147, 108, 17);
		contentPane.add(fnamelbl);
		
		textField_fname = new JTextField();
		textField_fname.setFont(new Font("Lucida Sans", Font.BOLD, 12));
		textField_fname.setColumns(10);
		textField_fname.setBorder(new LineBorder(new Color(57, 28, 11), 2));
		textField_fname.setBackground(new Color(255, 245, 227));
		textField_fname.setBounds(350, 167, 115, 20);
		contentPane.add(textField_fname);
		
		JLabel middleinitiallbl = new JLabel("Middle Initial:");
		middleinitiallbl.setForeground(new Color(57, 28, 11));
		middleinitiallbl.setFont(new Font("Lucida Sans", Font.BOLD, 12));
		middleinitiallbl.setBounds(212, 194, 108, 17);
		contentPane.add(middleinitiallbl);
		
		JLabel surnamelbl = new JLabel("Surname:");
		surnamelbl.setForeground(new Color(57, 28, 11));
		surnamelbl.setFont(new Font("Lucida Sans", Font.BOLD, 12));
		surnamelbl.setBounds(370, 194, 108, 17);
		contentPane.add(surnamelbl);
		
		textField_surname = new JTextField();
		textField_surname.setFont(new Font("Lucida Sans", Font.BOLD, 12));
		textField_surname.setColumns(10);
		textField_surname.setBorder(new LineBorder(new Color(57, 28, 11), 2));
		textField_surname.setBackground(new Color(255, 245, 227));
		textField_surname.setBounds(372, 214, 115, 20);
		contentPane.add(textField_surname);
		
		textField_MI = new JTextField();
		textField_MI.setFont(new Font("Lucida Sans", Font.BOLD, 12));
		textField_MI.setColumns(10);
		textField_MI.setBorder(new LineBorder(new Color(57, 28, 11), 2));
		textField_MI.setBackground(new Color(255, 245, 227));
		textField_MI.setBounds(202, 214, 115, 20);
		contentPane.add(textField_MI);
		
		JLabel Emaillbl = new JLabel("Email:");
		Emaillbl.setForeground(new Color(57, 28, 11));
		Emaillbl.setFont(new Font("Lucida Sans", Font.BOLD, 12));
		Emaillbl.setBounds(225, 242, 108, 17);
		contentPane.add(Emaillbl);
		
		textField_email = new JTextField();
		textField_email.setFont(new Font("Lucida Sans", Font.BOLD, 12));
		textField_email.setColumns(10);
		textField_email.setBorder(new LineBorder(new Color(57, 28, 11), 2));
		textField_email.setBackground(new Color(255, 245, 227));
		textField_email.setBounds(225, 262, 115, 20);
		contentPane.add(textField_email);
		
		textField_phonenumber = new JTextField();
		textField_phonenumber.setFont(new Font("Lucida Sans", Font.BOLD, 12));
		textField_phonenumber.setColumns(10);
		textField_phonenumber.setBorder(new LineBorder(new Color(57, 28, 11), 2));
		textField_phonenumber.setBackground(new Color(255, 245, 227));
		textField_phonenumber.setBounds(350, 262, 115, 20);
		contentPane.add(textField_phonenumber);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number:");
		lblPhoneNumber.setForeground(new Color(57, 28, 11));
		lblPhoneNumber.setFont(new Font("Lucida Sans", Font.BOLD, 12));
		lblPhoneNumber.setBounds(350, 242, 115, 17);
		contentPane.add(lblPhoneNumber);
		
		JLabel user_lblbackg = new JLabel("");
		user_lblbackg.setIcon(new ImageIcon(User_Signup.class.getResource("/Resources/Usersignup_backg.png")));
		user_lblbackg.setBounds(0, 0, 686, 453);
		contentPane.add(user_lblbackg);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getSource() == Login_btn)
		{
			String FirstName = textField_fname.getText();
			String MiddleName = textField_MI.getText();
			String LastName = textField_surname.getText();
			String Email = textField_email.getText();
			String Phone = textField_phonenumber.getText();
			String Username = textField_Username.getText();
			String Password = textField_password.getText();
			user.addUser(FirstName, MiddleName, LastName, Email, Phone, Username, Password);
			
			textField_fname.setText("");
			textField_MI.setText("");
			textField_surname.setText("");
			textField_email.setText("");
			textField_phonenumber.setText("");
			textField_Username.setText("");
			textField_password.setText("");
			
		}
		else if(e.getSource() == Back_btn)
		{
			dispose();
			new User_Login().setVisible(true);
		}
		
	}
	
}
