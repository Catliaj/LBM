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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.border.BevelBorder;
import Modules.Dasbhoard_UserBackend;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JTextPane;

public class Dashboard_User extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JLabel mainlbl = new JLabel("");
	private JLabel timeLabel;
	private JLabel dateLabel;
	private JTable table;
	private JTextField textField1;
	private JTextField textField2;
	private JButton User_btn;
	private JButton Logout_btn;
	private JButton borrow;
	private JButton renew;
	private JLabel name;
	private JTextArea textArea;
	Dasbhoard_UserBackend user = new Dasbhoard_UserBackend();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard_User frame = new Dashboard_User(null);
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
	private String Username;
	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public Dashboard_User(String Username) {
		setUsername(Username);
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
		dashboard_btn.setEnabled(false);
		dashboard_btn.setForeground(new Color(57, 28, 11));
		dashboard_btn.setBackground(new Color(238, 180, 98));
		dashboard_btn.setFont(new Font("Lucida Sans", Font.BOLD, 18));
		dashboard_btn.setBorder(new LineBorder(new Color(57, 28, 11), 6));
		dashboard_btn.setBounds(3, 69, 196, 65);
		sidepanel.add(dashboard_btn);
		
	    User_btn = new JButton("HISTORY");
		User_btn.setForeground(new Color(57, 28, 11));
		User_btn.setFont(new Font("Lucida Sans", Font.BOLD, 18));
		User_btn.setBorder(new LineBorder(new Color(57, 28, 11), 6));
		User_btn.setBackground(new Color(238, 180, 98));
		User_btn.setBounds(3, 149, 196, 65);
		User_btn.addActionListener(this);
		sidepanel.add(User_btn);
		
	    Logout_btn = new JButton("LOG OUT");
		Logout_btn.setForeground(new Color(57, 28, 11));
		Logout_btn.setFont(new Font("Lucida Sans", Font.BOLD, 18));
		Logout_btn.setBorder(new LineBorder(new Color(57, 28, 11), 6));
		Logout_btn.setBackground(new Color(238, 180, 98));
		Logout_btn.setBounds(3, 555, 196, 65);
		Logout_btn.addActionListener(this);
		sidepanel.add(Logout_btn);
		
		JPanel toppanel = new JPanel();
		toppanel.setBackground(new Color(238, 180, 98));
		toppanel.setBounds(0, 68, 1306, 10);
		contentPane.add(toppanel);
		toppanel.setLayout(null);
		
		JPanel panel_admin = new JPanel();
		panel_admin.setBackground(new Color(238, 180, 98));
		panel_admin.setBounds(10, 20, 398, 58);
		panel_admin.setBorder(new LineBorder(new Color(57, 28, 11), 4));
		contentPane.add(panel_admin);
		panel_admin.setLayout(null);
		
		JLabel welcomelbl = new JLabel("WELCOME, ");
		welcomelbl.setFont(new Font("Lucida Sans", Font.BOLD, 22));
		welcomelbl.setBounds(10, 0, 130, 48);
		panel_admin.add(welcomelbl);
		
	    name = new JLabel("WELCOME, ");
		name.setFont(new Font("Lucida Sans", Font.BOLD, 22));
		name.setBounds(131, 0, 257, 48);
		panel_admin.add(name);
														
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setForeground(new Color(57, 28, 11));
		panel_1_1_1.setBorder(new LineBorder(new Color(159, 106, 56), 4));
		panel_1_1_1.setBackground(new Color(238, 180, 98));
		panel_1_1_1.setBounds(223, 277, 705, 248);
		contentPane.add(panel_1_1_1);
		
		JLabel lblNotification = new JLabel("NOTIFICATION");
		lblNotification.setFont(new Font("Lucida Sans", Font.BOLD, 22));
		lblNotification.setBounds(70, 10, 252, 48);
		panel_1_1_1.add(lblNotification);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(31, 192, 638, 0);
		panel_1_1_1.add(scrollPane_1);
																				
		JPanel panel_admin_1 = new JPanel();
		panel_admin_1.setLayout(null);
	panel_admin_1.setBorder(new LineBorder(new Color(57, 28, 11), 4));
		panel_admin_1.setBackground(new Color(238, 180, 98));
		panel_admin_1.setBounds(991, 20, 305, 58);
		contentPane.add(panel_admin_1);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(159, 106, 56), 5));
		panel.setBackground(new Color(238, 180, 98));
		panel.setBounds(949, 103, 335, 422);
		contentPane.add(panel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 96, 299, 293);
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setFont(new Font("Lucida Sans", Font.BOLD, 12));
		table.getTableHeader().setFont(new Font("Lucida Sans", Font.BOLD, 14));
		
		
		        // Apply header renderer to all columns
		        JTableHeader tableHeader = table.getTableHeader();
		        
		        	
		        		table.setRowHeight(45);
		        		table.setIntercellSpacing(new Dimension(4, 4)); // Space between cells
		        		table.setGridColor(new Color(57, 28, 11)); // Set border color
		        		table.getTableHeader().setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		        		table.setShowGrid(true); // Ensure grid lines are visible
		                DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
		                headerRenderer.setBackground(new Color(238, 190, 98)); // Set header background color
		                headerRenderer.setForeground(Color.BLACK); // Set header text color
		                headerRenderer.setHorizontalAlignment(JLabel.CENTER); // Center text
		                tableHeader.setDefaultRenderer(headerRenderer);
		                tableHeader.setPreferredSize(new Dimension(tableHeader.getWidth(), 30));
		        		table.setModel(new DefaultTableModel(
		        			new Object[][] {
		        				{null, null},
		        				{null, null},
		        				{null, null},
		        				{null, null},
		        				{null, null},
		        				{null, null},
		        				{null, null},
		        				{null, null},
		        				{null, null},
		        				{null, null},
		        				{null, null},
		        				{null, null},
		        				{null, null},
		        				{null, null},
		        				{null, null},
		        			},
		        			new String[] {
		        				"Book Title", "Overdue Days"
		        			}
		        		));
		        		
		        		table.setBackground(new Color(244, 208, 159));
		        		scrollPane.setViewportView(table);
		        		
		JLabel lblNewLabel_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1.setBounds(20, 10, 86, 87);
		panel.add(lblNewLabel_1_1_1);
		lblNewLabel_1_1_1.setIcon(new ImageIcon(Dashboard_Librarian.class.getResource("/Resources/overdue_icon.png")));
		
		JLabel lblOverdueBooks = new JLabel("OVERDUE BOOKS");
		lblOverdueBooks.setFont(new Font("Lucida Sans", Font.BOLD, 22));
		lblOverdueBooks.setBounds(112, 26, 252, 48);
		panel.add(lblOverdueBooks);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setForeground(new Color(57, 28, 11));
		panel_1.setBorder(new LineBorder(new Color(159, 106, 56), 4));
		panel_1.setBackground(new Color(238, 180, 98));
		panel_1.setBounds(248, 130, 223, 114);
		contentPane.add(panel_1);
		 
		textField1 = new JTextField();
		textField1.setFont(new Font("Lucida Sans", Font.BOLD, 35));
		textField1.setColumns(10);
		textField1.setBackground(new Color(238, 180, 98));
		textField1.setBounds(106, 20, 107, 63);
		panel_1.add(textField1);
		
		JLabel lblTotalBorrowed = new JLabel("TOTAL BORROWED");
		lblTotalBorrowed.setFont(new Font("Lucida Sans", Font.BOLD, 15));
		lblTotalBorrowed.setBounds(71, 75, 156, 48);
		panel_1.add(lblTotalBorrowed);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Dashboard_User.class.getResource("/Resources/borrow_icon.png")));
		lblNewLabel_1.setBounds(12, 16, 86, 87);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setForeground(new Color(57, 28, 11));
		panel_1_1.setBorder(new LineBorder(new Color(159, 106, 56), 4));
		panel_1_1.setBackground(new Color(238, 180, 98));
		panel_1_1.setBounds(568, 130, 223, 114);
		contentPane.add(panel_1_1);
		
		textField2 = new JTextField();
		textField2.setFont(new Font("Lucida Sans", Font.BOLD, 35));
		textField2.setColumns(10);
		textField2.setBackground(new Color(238, 180, 98));
		textField2.setBounds(106, 20, 107, 63);
		panel_1_1.add(textField2);
		
		JLabel lblDueSoon = new JLabel("DUE SOON");
		lblDueSoon.setFont(new Font("Lucida Sans", Font.BOLD, 15));
		lblDueSoon.setBounds(116, 73, 156, 48);
		panel_1_1.add(lblDueSoon);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(Dashboard_User.class.getResource("/Resources/due_icon.png")));
		lblNewLabel_1_1.setBounds(12, 16, 86, 87);
		panel_1_1.add(lblNewLabel_1_1);
		
	    borrow = new JButton("BORROW BOOK");
		borrow.setForeground(new Color(57, 28, 11));
		borrow.setFont(new Font("Lucida Sans", Font.BOLD, 18));
		borrow.setBorder(new LineBorder(new Color(57, 28, 11), 6));
		borrow.setBackground(new Color(238, 180, 98));
		borrow.setBounds(376, 576, 273, 75);
		borrow.addActionListener(this);
		contentPane.add(borrow);
		
	    renew = new JButton("RENEW BOOK");
		renew.setForeground(new Color(57, 28, 11));
		renew.setFont(new Font("Lucida Sans", Font.BOLD, 18));
		renew.setBorder(new LineBorder(new Color(57, 28, 11), 6));
		renew.setBackground(new Color(238, 180, 98));
		renew.setBounds(797, 576, 273, 75);
		renew.addActionListener(this);
		contentPane.add(renew);
		user.getName(getUsername());
		UpdateLabelName(getUsername());
		mainlbl.setBackground(new Color(238, 180, 98));
		mainlbl.setIcon(new ImageIcon(Books_Librarian.class.getResource("/Resources/Main_background.png")));
		mainlbl.setBounds(0, 0, 1306, 708);
		contentPane.add(mainlbl);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(21, 69, 664, 160);
		panel_1_1_1.add(scrollPane_2);
		
	    textArea = new JTextArea();
	    scrollPane_2.setViewportView(textArea);
	    textArea.setBackground(new Color(244, 208, 159));
	    textArea.setBorder(new LineBorder(new Color(57, 28, 11), 6));
	    textArea.setFont(new Font("Lucida Sans", Font.BOLD, 15));
	    user.loadHistoryTextArea(Username, textArea);
		user.updateBorrowedAndDueSoonCounts(Username, textField1, textField2);
		user.loadOverdueBooks(Username, table);
        dateLabel = new JLabel();
        dateLabel.setForeground(new Color(57, 28, 11));
        dateLabel.setFont(new Font("Lucida Sans", Font.BOLD, 14));
        dateLabel.setBounds(40, 24, 236, 30);
        panel_admin_1.add(dateLabel);
       		
       		   timeLabel = new JLabel();
       		   timeLabel.setBounds(90, 0, 141, 40);
       		   panel_admin_1.add(timeLabel);
       		   timeLabel.setForeground(new Color(57, 28, 11));
       		   timeLabel.setFont(new Font("Lucida Sans", Font.BOLD, 18));
       		startClock();
	}
	
	private void startClock() {
	    Timer timer = new Timer(1000, new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss a");
	            SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, MMMM dd, yyyy");

	            Date now = new Date();
	            timeLabel.setText(timeFormat.format(now));
	            dateLabel.setText(dateFormat.format(now));
	        }
	    });
	    timer.start();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getSource() == borrow)
		{
			dispose();
			new Borrow_User(getUsername()).setVisible(true);
		}
		else if(e.getSource() == renew)
		{
			dispose();
			// wala pang renew
		}
		else if(e.getSource() == Logout_btn)
		{
			dispose();
			new User_Login().setVisible(true);
		}
		else if(e.getSource() == User_btn)
		{
			dispose();
			new History_User(getUsername()).setVisible(true);
		}
		
	}
	
	private void UpdateLabelName(String username)
	{
		String updatename = user.getName(username);
		if(updatename != null)
		{
			
			name.setText("<html>" +updatename.replace("\n","<br>") + "</html>");
		}
		else
		{
			name.setText("User Not Found");
		}
				
	}
}
