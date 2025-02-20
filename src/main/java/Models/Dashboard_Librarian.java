package Models;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.border.BevelBorder;

public class Dashboard_Librarian extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JLabel mainlbl = new JLabel("");
	private JTextField totalbooks_textField;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard_Librarian frame = new Dashboard_Librarian();
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
	public Dashboard_Librarian() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1320, 745);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel toppanel_1 = new JPanel();
		toppanel_1.setBackground(new Color(238, 180, 98));
		toppanel_1.setBounds(203, 78, 10, 630);
		contentPane.add(toppanel_1);
		toppanel_1.setLayout(null);
		
		JPanel sidepanel = new JPanel();
		sidepanel.setBackground(new Color(159, 106, 56));
		sidepanel.setBounds(0, 78, 206, 630);
		contentPane.add(sidepanel);
		sidepanel.setLayout(null);
		
		JButton dashboard_btn = new JButton("DASHBOARD");
		dashboard_btn.setForeground(new Color(57, 28, 11));
		dashboard_btn.setBackground(new Color(238, 180, 98));
		dashboard_btn.setFont(new Font("Lucida Sans", Font.BOLD, 18));
		dashboard_btn.setBorder(new LineBorder(new Color(57, 28, 11), 6));
		dashboard_btn.setBounds(3, 69, 196, 47);
		sidepanel.add(dashboard_btn);
		
		JButton Books_btn = new JButton("BOOKS");
		Books_btn.setForeground(new Color(57, 28, 11));
		Books_btn.setFont(new Font("Lucida Sans", Font.BOLD, 18));
		Books_btn.setBorder(new LineBorder(new Color(57, 28, 11), 6));
		Books_btn.setBackground(new Color(238, 180, 98));
		Books_btn.setBounds(3, 127, 196, 47);
		sidepanel.add(Books_btn);
		
		JButton User_btn = new JButton("USER");
		User_btn.setForeground(new Color(57, 28, 11));
		User_btn.setFont(new Font("Lucida Sans", Font.BOLD, 18));
		User_btn.setBorder(new LineBorder(new Color(57, 28, 11), 6));
		User_btn.setBackground(new Color(238, 180, 98));
		User_btn.setBounds(3, 184, 196, 47);
		sidepanel.add(User_btn);
		
		JButton Record_btn = new JButton("RECORDS");
		Record_btn.setForeground(new Color(57, 28, 11));
		Record_btn.setFont(new Font("Lucida Sans", Font.BOLD, 18));
		Record_btn.setBorder(new LineBorder(new Color(57, 28, 11), 6));
		Record_btn.setBackground(new Color(238, 180, 98));
		Record_btn.setBounds(3, 241, 196, 47);
		sidepanel.add(Record_btn);
		
		JButton Logout_btn = new JButton("LOG OUT");
		Logout_btn.setForeground(new Color(57, 28, 11));
		Logout_btn.setFont(new Font("Lucida Sans", Font.BOLD, 18));
		Logout_btn.setBorder(new LineBorder(new Color(57, 28, 11), 6));
		Logout_btn.setBackground(new Color(238, 180, 98));
		Logout_btn.setBounds(3, 573, 196, 47);
		sidepanel.add(Logout_btn);
		
		JPanel toppanel = new JPanel();
		toppanel.setBackground(new Color(238, 180, 98));
		toppanel.setBounds(0, 68, 1306, 10);
		contentPane.add(toppanel);
		toppanel.setLayout(null);
		
		JPanel panel_admin = new JPanel();
		panel_admin.setBackground(new Color(238, 180, 98));
		panel_admin.setBounds(1052, 20, 244, 58);
		panel_admin.setBorder(new LineBorder(new Color(57, 28, 11), 4));
		contentPane.add(panel_admin);
		panel_admin.setLayout(null);
		
		JLabel welcomelbl = new JLabel("WELCOME, ADMIN!");
		welcomelbl.setFont(new Font("Lucida Sans", Font.BOLD, 22));
		welcomelbl.setBounds(17, 3, 252, 48);
		panel_admin.add(welcomelbl);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(238, 180, 98));
		panel.setBorder(new LineBorder(new Color(159, 106, 56), 4));
		panel.setForeground(new Color(57, 28, 11));
		panel.setBounds(505, 99, 238, 114);
		contentPane.add(panel);
		panel.setLayout(null);
		
		totalbooks_textField = new JTextField();
		totalbooks_textField.setBackground(new Color(238, 180, 98));
		totalbooks_textField.setBounds(106, 20, 111, 63);
		panel.add(totalbooks_textField);
		totalbooks_textField.setColumns(10);
		
		JLabel lblTotalBooks = new JLabel("TOTAL BOOKS");
		lblTotalBooks.setFont(new Font("Lucida Sans", Font.BOLD, 15));
		lblTotalBooks.setBounds(108, 75, 119, 48);
		panel.add(lblTotalBooks);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Dashboard_Librarian.class.getResource("/Resources/totalbook_icon.png")));
		lblNewLabel_1.setBounds(12, 16, 86, 87);
		panel.add(lblNewLabel_1);
						
						JPanel panel_1 = new JPanel();
						panel_1.setLayout(null);
						panel_1.setForeground(new Color(57, 28, 11));
						panel_1.setBorder(new LineBorder(new Color(159, 106, 56), 4));
						panel_1.setBackground(new Color(238, 180, 98));
						panel_1.setBounds(237, 99, 238, 114);
						contentPane.add(panel_1);
						
						textField = new JTextField();
						textField.setColumns(10);
						textField.setBackground(new Color(238, 180, 98));
						textField.setBounds(106, 20, 111, 65);
						panel_1.add(textField);
						
						JLabel lblBooksAvailable = new JLabel("BOOKS AVAILABLE");
						lblBooksAvailable.setFont(new Font("Lucida Sans", Font.BOLD, 15));
						lblBooksAvailable.setBounds(88, 75, 172, 48);
						panel_1.add(lblBooksAvailable);
						
						JLabel lblNewLabel = new JLabel("");
						lblNewLabel.setBounds(10, 10, 86, 87);
						panel_1.add(lblNewLabel);
						lblNewLabel.setIcon(new ImageIcon(Dashboard_Librarian.class.getResource("/Resources/available_icon.png")));
								
								JPanel panel_1_1 = new JPanel();
								panel_1_1.setLayout(null);
								panel_1_1.setForeground(new Color(57, 28, 11));
								panel_1_1.setBorder(new LineBorder(new Color(159, 106, 56), 4));
								panel_1_1.setBackground(new Color(238, 180, 98));
								panel_1_1.setBounds(769, 99, 238, 114);
								contentPane.add(panel_1_1);
								
								textField_1 = new JTextField();
								textField_1.setColumns(10);
								textField_1.setBackground(new Color(238, 180, 98));
								textField_1.setBounds(106, 20, 111, 63);
								panel_1_1.add(textField_1);
								
								JLabel lblBooksBorrowed = new JLabel("BOOKS BORROWED");
								lblBooksBorrowed.setFont(new Font("Lucida Sans", Font.BOLD, 15));
								lblBooksBorrowed.setBounds(88, 75, 172, 48);
								panel_1_1.add(lblBooksBorrowed);
								
								JLabel lblNewLabel_1_1 = new JLabel("");
								lblNewLabel_1_1.setIcon(new ImageIcon(Dashboard_Librarian.class.getResource("/Resources/borrow_icon.png")));
								lblNewLabel_1_1.setBounds(10, 15, 86, 87);
								panel_1_1.add(lblNewLabel_1_1);
										
										JPanel panel_1_2 = new JPanel();
										panel_1_2.setLayout(null);
										panel_1_2.setForeground(new Color(57, 28, 11));
										panel_1_2.setBorder(new LineBorder(new Color(159, 106, 56), 4));
										panel_1_2.setBackground(new Color(238, 180, 98));
										panel_1_2.setBounds(237, 232, 480, 359);
										contentPane.add(panel_1_2);
												
												JPanel panel_1_2_1 = new JPanel();
												panel_1_2_1.setLayout(null);
												panel_1_2_1.setForeground(new Color(57, 28, 11));
												panel_1_2_1.setBorder(new LineBorder(new Color(159, 106, 56), 4));
												panel_1_2_1.setBackground(new Color(238, 180, 98));
												panel_1_2_1.setBounds(793, 232, 480, 359);
												contentPane.add(panel_1_2_1);
														
														JPanel panel_1_1_1 = new JPanel();
														panel_1_1_1.setLayout(null);
														panel_1_1_1.setForeground(new Color(57, 28, 11));
														panel_1_1_1.setBorder(new LineBorder(new Color(159, 106, 56), 4));
														panel_1_1_1.setBackground(new Color(238, 180, 98));
														panel_1_1_1.setBounds(1036, 99, 238, 114);
														contentPane.add(panel_1_1_1);
														
														textField_2 = new JTextField();
														textField_2.setColumns(10);
														textField_2.setBackground(new Color(238, 180, 98));
														textField_2.setBounds(106, 21, 111, 60);
														panel_1_1_1.add(textField_2);
														
														JLabel lblOverdueBooks = new JLabel("OVERDUE BOOKS");
														lblOverdueBooks.setFont(new Font("Lucida Sans", Font.BOLD, 15));
														lblOverdueBooks.setBounds(94, 75, 172, 48);
														panel_1_1_1.add(lblOverdueBooks);
														
														JLabel lblNewLabel_1_1_1 = new JLabel("");
														lblNewLabel_1_1_1.setIcon(new ImageIcon(Dashboard_Librarian.class.getResource("/Resources/overdue_icon.png")));
														lblNewLabel_1_1_1.setBounds(10, 10, 86, 87);
														panel_1_1_1.add(lblNewLabel_1_1_1);
																
																JPanel panel_2 = new JPanel();
																panel_2.setBorder(new LineBorder(new Color(159, 106, 56), 6));
																panel_2.setBackground(new Color(244, 208, 159));
																panel_2.setBounds(291, 619, 354, 58);
																contentPane.add(panel_2);
																panel_2.setLayout(null);
																
																JPanel panel_3 = new JPanel();
																panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
																panel_3.setBackground(new Color(238, 180, 98));
																panel_3.setBounds(10, 10, 334, 38);
																panel_2.add(panel_3);
																panel_3.setLayout(null);
																
																JLabel lblMostBorrowedBooks = new JLabel("MOST BORROWED BOOKS");
																lblMostBorrowedBooks.setFont(new Font("Lucida Sans", Font.BOLD, 22));
																lblMostBorrowedBooks.setBounds(18, -5, 298, 48);
																panel_3.add(lblMostBorrowedBooks);
																		
																		JPanel panel_2_1 = new JPanel();
																		panel_2_1.setLayout(null);
																		panel_2_1.setBorder(new LineBorder(new Color(159, 106, 56), 6));
																		panel_2_1.setBackground(new Color(244, 208, 159));
																		panel_2_1.setBounds(856, 619, 354, 58);
																		contentPane.add(panel_2_1);
																		
																		JPanel panel_3_1 = new JPanel();
																		panel_3_1.setLayout(null);
																		panel_3_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
																		panel_3_1.setBackground(new Color(238, 180, 98));
																		panel_3_1.setBounds(10, 10, 334, 38);
																		panel_2_1.add(panel_3_1);
																		
																		JLabel lblOverdueBooks_1 = new JLabel("OVERDUE BOOKS");
																		lblOverdueBooks_1.setFont(new Font("Lucida Sans", Font.BOLD, 22));
																		lblOverdueBooks_1.setBounds(70, -5, 298, 48);
																		panel_3_1.add(lblOverdueBooks_1);
																		
																				mainlbl.setBackground(new Color(238, 180, 98));
																				mainlbl.setIcon(new ImageIcon(Books_Librarian.class.getResource("/Resources/Main_background.png")));
																				mainlbl.setBounds(0, 0, 1306, 708);
																				contentPane.add(mainlbl);
	}
}
