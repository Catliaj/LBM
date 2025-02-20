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
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import Modules.User_SignUpBackend;

public class User_Librarian extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JLabel mainlbl = new JLabel("");
	private JTable table;
	private JTextField search_textField;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JButton Update_btn;
	private JButton dashboard_btn;
	private JButton Books_btn;
	private JButton User_btn;
	private JButton Record_btn;
	private JButton Logout_btn;
	private JButton Add_btn;
	private JTextField textField_6;
	User_SignUpBackend user = new User_SignUpBackend();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User_Librarian frame = new User_Librarian();
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
	public User_Librarian() {
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
		
	    dashboard_btn = new JButton("DASHBOARD");
		dashboard_btn.setForeground(new Color(57, 28, 11));
		dashboard_btn.setBackground(new Color(238, 180, 98));
		dashboard_btn.setFont(new Font("Lucida Sans", Font.BOLD, 18));
		dashboard_btn.setBorder(new LineBorder(new Color(57, 28, 11), 6));
		dashboard_btn.setBounds(3, 69, 196, 47);
		dashboard_btn.addActionListener(this);
		sidepanel.add(dashboard_btn);
		
	    Books_btn = new JButton("BOOKS");
		Books_btn.setForeground(new Color(57, 28, 11));
		Books_btn.setFont(new Font("Lucida Sans", Font.BOLD, 18));
		Books_btn.setBorder(new LineBorder(new Color(57, 28, 11), 6));
		Books_btn.setBackground(new Color(238, 180, 98));
		Books_btn.setBounds(3, 127, 196, 47);
		Books_btn.addActionListener(this);
		sidepanel.add(Books_btn);
		
	    User_btn = new JButton("USER");
		User_btn.setForeground(new Color(57, 28, 11));
		User_btn.setFont(new Font("Lucida Sans", Font.BOLD, 18));
		User_btn.setBorder(new LineBorder(new Color(57, 28, 11), 6));
		User_btn.setBackground(new Color(238, 180, 98));
		User_btn.setBounds(3, 184, 196, 47);
		User_btn.addActionListener(this);
		sidepanel.add(User_btn);
		
	    Record_btn = new JButton("RECORDS");
		Record_btn.setForeground(new Color(57, 28, 11));
		Record_btn.setFont(new Font("Lucida Sans", Font.BOLD, 18));
		Record_btn.setBorder(new LineBorder(new Color(57, 28, 11), 6));
		Record_btn.setBackground(new Color(238, 180, 98));
		Record_btn.setBounds(3, 241, 196, 47);
		Record_btn.addActionListener(this);
		sidepanel.add(Record_btn);
		
	    Logout_btn = new JButton("LOG OUT");
		Logout_btn.setForeground(new Color(57, 28, 11));
		Logout_btn.setFont(new Font("Lucida Sans", Font.BOLD, 18));
		Logout_btn.setBorder(new LineBorder(new Color(57, 28, 11), 6));
		Logout_btn.setBackground(new Color(238, 180, 98));
		Logout_btn.setBounds(3, 573, 196, 47);
		Logout_btn.addActionListener(this);
		sidepanel.add(Logout_btn);
		
		JPanel toppanel = new JPanel();
		toppanel.setBackground(new Color(238, 180, 98));
		toppanel.setBounds(0, 68, 1306, 10);
		contentPane.add(toppanel);
		toppanel.setLayout(null);
		
		JPanel panel_admin = new JPanel();
		panel_admin.setBackground(new Color(238, 180, 98));
		panel_admin.setBounds(1041, 20, 244, 58);
		panel_admin.setBorder(new LineBorder(new Color(57, 28, 11), 4));
		contentPane.add(panel_admin);
		panel_admin.setLayout(null);
		
		JLabel welcomelbl = new JLabel("WELCOME, ADMIN!");
		welcomelbl.setFont(new Font("Lucida Sans", Font.BOLD, 22));
		welcomelbl.setBounds(17, 3, 252, 48);
		panel_admin.add(welcomelbl);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(159, 106, 56), 5));
		panel.setBackground(new Color(238, 180, 98));
		panel.setBounds(258, 481, 1004, 205);
		contentPane.add(panel);
		panel.setLayout(null);
		
	    Add_btn = new JButton("ADD");
		Add_btn.setForeground(new Color(57, 28, 11));
		Add_btn.setFont(new Font("Lucida Sans", Font.BOLD, 18));
		Add_btn.setBorder(new LineBorder(new Color(57, 28, 11), 4));
		Add_btn.setBackground(new Color(244, 208, 159));
		Add_btn.setBounds(820, 98, 153, 35);
		Add_btn.addActionListener(this);
		panel.add(Add_btn);
		
	    Update_btn = new JButton("UPDATE");
		Update_btn.addActionListener(this);
		Update_btn.setForeground(new Color(57, 28, 11));
		Update_btn.setFont(new Font("Lucida Sans", Font.BOLD, 18));
		Update_btn.setBorder(new LineBorder(new Color(57, 28, 11), 4));
		Update_btn.setBackground(new Color(244, 208, 159));
		Update_btn.setBounds(820, 132, 153, 35);
		Update_btn.addActionListener(this);
		panel.add(Update_btn);
		
		textField = new JTextField();
		textField.setForeground(new Color(57, 28, 11));
		textField.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		textField.setColumns(10);
		textField.setBorder(new LineBorder(new Color(57, 28, 11), 2));
		textField.setBackground(new Color(241, 230, 205));
		textField.setBounds(31, 133, 205, 35);
		panel.add(textField);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setForeground(new Color(57, 28, 11));
		lblUsername.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		lblUsername.setBounds(30, 105, 124, 22);
		panel.add(lblUsername);
		
		textField_1 = new JTextField();
		textField_1.setForeground(new Color(57, 28, 11));
		textField_1.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		textField_1.setColumns(10);
		textField_1.setBorder(new LineBorder(new Color(57, 28, 11), 2));
		textField_1.setBackground(new Color(241, 230, 205));
		textField_1.setBounds(30, 50, 205, 35);
		panel.add(textField_1);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setForeground(new Color(57, 28, 11));
		lblFirstName.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		lblFirstName.setBounds(29, 22, 124, 22);
		panel.add(lblFirstName);
		
		JLabel lblMiddleInitial = new JLabel("Middle Initial:");
		lblMiddleInitial.setForeground(new Color(57, 28, 11));
		lblMiddleInitial.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		lblMiddleInitial.setBounds(302, 22, 124, 22);
		panel.add(lblMiddleInitial);
		
		textField_2 = new JTextField();
		textField_2.setForeground(new Color(57, 28, 11));
		textField_2.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		textField_2.setColumns(10);
		textField_2.setBorder(new LineBorder(new Color(57, 28, 11), 2));
		textField_2.setBackground(new Color(241, 230, 205));
		textField_2.setBounds(303, 50, 205, 35);
		panel.add(textField_2);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setForeground(new Color(57, 28, 11));
		lblEmail.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		lblEmail.setBounds(303, 105, 124, 22);
		panel.add(lblEmail);
		
		textField_3 = new JTextField();
		textField_3.setForeground(new Color(57, 28, 11));
		textField_3.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		textField_3.setColumns(10);
		textField_3.setBorder(new LineBorder(new Color(57, 28, 11), 2));
		textField_3.setBackground(new Color(241, 230, 205));
		textField_3.setBounds(304, 133, 205, 35);
		panel.add(textField_3);
		
		JLabel lblSurname = new JLabel("Surname:");
		lblSurname.setForeground(new Color(57, 28, 11));
		lblSurname.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		lblSurname.setBounds(566, 22, 124, 22);
		panel.add(lblSurname);
		
		textField_4 = new JTextField();
		textField_4.setForeground(new Color(57, 28, 11));
		textField_4.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		textField_4.setColumns(10);
		textField_4.setBorder(new LineBorder(new Color(57, 28, 11), 2));
		textField_4.setBackground(new Color(241, 230, 205));
		textField_4.setBounds(567, 50, 205, 35);
		panel.add(textField_4);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number:");
		lblPhoneNumber.setForeground(new Color(57, 28, 11));
		lblPhoneNumber.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		lblPhoneNumber.setBounds(567, 105, 124, 22);
		panel.add(lblPhoneNumber);
		
		textField_5 = new JTextField();
		textField_5.setForeground(new Color(57, 28, 11));
		textField_5.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		textField_5.setColumns(10);
		textField_5.setBorder(new LineBorder(new Color(57, 28, 11), 2));
		textField_5.setBackground(new Color(241, 230, 205));
		textField_5.setBounds(568, 133, 205, 35);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setForeground(new Color(57, 28, 11));
		textField_6.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		textField_6.setColumns(10);
		textField_6.setBorder(new LineBorder(new Color(57, 28, 11), 2));
		textField_6.setBackground(new Color(241, 230, 205));
		textField_6.setBounds(789, 50, 205, 35);
		panel.add(textField_6);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(new Color(57, 28, 11));
		lblPassword.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		lblPassword.setBounds(788, 22, 124, 22);
		panel.add(lblPassword);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(249, 162, 1023, 309);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Lucida Sans", Font.BOLD, 12));
		table.getTableHeader().setFont(new Font("Lucida Sans", Font.BOLD, 14));
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(new Color(238, 190, 98)); // Set header background color
        headerRenderer.setForeground(Color.BLACK); // Set header text color
        headerRenderer.setHorizontalAlignment(JLabel.CENTER); // Center text

        // Apply header renderer to all columns
        JTableHeader tableHeader = table.getTableHeader();
        tableHeader.setDefaultRenderer(headerRenderer);
        tableHeader.setPreferredSize(new Dimension(tableHeader.getWidth(), 30));

	
		table.setRowHeight(30);
		table.setIntercellSpacing(new Dimension(4, 4)); // Space between cells
		table.setGridColor(new Color(57, 28, 11)); // Set border color
		table.getTableHeader().setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		table.setShowGrid(true); // Ensure grid lines are visible
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"First Name", "Middle Initial", "Surname", "Email", "Phone Number", "Username", "Password", "Role"
			}
		));
		
		table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow >= 0) {
                    // Fill text fields with selected row data
                	textField_1.setText(table.getValueAt(selectedRow, 0).toString());
                	textField_2.setText(table.getValueAt(selectedRow, 1).toString());
                	textField_4.setText(table.getValueAt(selectedRow, 2).toString());
                	textField.setText(table.getValueAt(selectedRow, 3).toString());
                	textField_3.setText(table.getValueAt(selectedRow, 4).toString());
                	textField_5.setText(table.getValueAt(selectedRow, 5).toString());
                	textField_6.setText(table.getValueAt(selectedRow, 6).toString());
                	
                }
            }
        });
		
		table.setBackground(new Color(244, 208, 159));
		scrollPane.setViewportView(table);
		
		JComboBox sort_comboBox = new JComboBox();
		sort_comboBox.setBackground(new Color(241, 230, 205));
		sort_comboBox.setBounds(1096, 124, 176, 32);
		sort_comboBox.setBorder(new LineBorder(new Color(57, 28, 11), 2));
		contentPane.add(sort_comboBox);
		
		JPanel search_panel = new JPanel();
		search_panel.setBorder(new LineBorder(new Color(57, 28, 11), 2));
		search_panel.setBackground(new Color(244, 208, 159));
		search_panel.setBounds(502, 88, 447, 54);
		contentPane.add(search_panel);
		search_panel.setLayout(null);
		
		search_textField = new JTextField();
		search_textField.setBounds(60, 7, 377, 40);
		search_panel.add(search_textField);
		search_textField.setForeground(new Color(57, 28, 11));
		search_textField.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		search_textField.setColumns(10);
		search_textField.setBorder(new LineBorder(new Color(57, 28, 11), 2));
		search_textField.setBackground(new Color(241, 230, 205));
		
		JLabel search_icon = new JLabel("");
		search_icon.setIcon(new ImageIcon(Books_Librarian.class.getResource("/Resources/people (2).png")));
		search_icon.setBounds(10, -12, 84, 77);
		search_panel.add(search_icon);
		mainlbl.setBackground(new Color(238, 180, 98));
		mainlbl.setIcon(new ImageIcon(Books_Librarian.class.getResource("/Resources/Main_background.png")));
		mainlbl.setBounds(0, 0, 1306, 708);
		contentPane.add(mainlbl);
		user.loadUserTable(table);
		setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if (e.getSource() == Update_btn) 
		{
			String firstname = textField_1.getText();
			String middleinitial = textField_2.getText();
			String surname = textField_4.getText();
			String username = textField.getText();
			String email = textField_3.getText();
			String phonenumber = textField_5.getText();
			String password = textField_6.getText();
			user.addUser(firstname, middleinitial, surname, email, phonenumber, username, password);
		}
		
		else if (e.getSource() == Add_btn) 
		{
			String firstname = textField_1.getText();
			String middleinitial = textField_2.getText();
			String surname = textField_4.getText();
			String username = textField.getText();
			String email = textField_3.getText();
			String phonenumber = textField_5.getText();
			String password = textField_6.getText();
			user.updateUser(firstname, middleinitial, surname, email, phonenumber, username, password, password);
		}
		else if (e.getSource() == dashboard_btn) 
        {
           dispose();
           new Dashboard_Librarian().setVisible(true);
        }
        else if (e.getSource() == Books_btn) 
        {
            dispose();
            new Books_Librarian().setVisible(true);
        }
        else if (e.getSource() == Record_btn) 
        {
        	  dispose();
        	  new Records_Librarian().setVisible(true);
        }
        else if (e.getSource() == Logout_btn) 
        {
            dispose();
            new User_Login().setVisible(true);
        }
		
		
	}
}
