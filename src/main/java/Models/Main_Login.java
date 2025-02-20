package Models;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main_Login extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton librarian_btn;
	private JButton user_btn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_Login frame = new Main_Login();
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
	public Main_Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 686, 453);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panellbl1 = new JPanel();
		panellbl1.setBorder(new LineBorder(new Color(57, 28, 11), 2));
		panellbl1.setBackground(new Color(238, 180, 98));
		panellbl1.setBounds(112, 302, 167, 39);
		panel.add(panellbl1);
		panellbl1.setLayout(null);
		
		JLabel librarianlbl = new JLabel("LIBRARIAN");
		librarianlbl.setFont(new Font("Lucida Sans", Font.BOLD, 18));
		librarianlbl.setBounds(30, 10, 118, 19);
		panellbl1.add(librarianlbl);
		
		JPanel panellbl2 = new JPanel();
		panellbl2.setLayout(null);
		panellbl2.setBorder(new LineBorder(new Color(57, 28, 11), 2));
		panellbl2.setBackground(new Color(238, 180, 98));
		panellbl2.setBounds(407, 302, 167, 39);
		panel.add(panellbl2);
		
		JLabel userlbl = new JLabel("USER");
		userlbl.setFont(new Font("Lucida Sans", Font.BOLD, 18));
		userlbl.setBounds(60, 10, 118, 19);
		panellbl2.add(userlbl);
		
	    librarian_btn = new JButton("");
		librarian_btn.addActionListener(this);
		librarian_btn.setIcon(new ImageIcon(Main_Login.class.getResource("/Resources/admin_icon.png")));
		librarian_btn.setBounds(143, 173, 112, 103);
		librarian_btn.setFocusPainted(false);
		librarian_btn.setContentAreaFilled(false);
		librarian_btn.setBorderPainted(false);
		panel.add(librarian_btn);
		
	    user_btn = new JButton("");
		user_btn.setIcon(new ImageIcon(Main_Login.class.getResource("/Resources/user_icon.png")));
		user_btn.setFocusPainted(false);
		user_btn.setContentAreaFilled(false);
		user_btn.setBorderPainted(false);
		user_btn.setBounds(437, 173, 112, 103);
		panel.add(user_btn);
		
		JLabel mainbglbl = new JLabel("");
		mainbglbl.setIcon(new ImageIcon(Main_Login.class.getResource("/Resources/Main_login.png")));
		mainbglbl.setBounds(0, 0, 686, 453);
		panel.add(mainbglbl);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getSource() == librarian_btn)
		{
			dispose();
			new Librarian_Login().setVisible(true);
		}
		else if(e.getSource() == user_btn)
		{
			dispose();
			new User_Login().setVisible(true);
		}
		
	}
}
