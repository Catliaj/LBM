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
import java.awt.event.ActionEvent;

public class Records_Librarian extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JLabel mainlbl = new JLabel("");
	private JTable table;
	private JTextField search_textField;
	private JButton dashboard_btn;
	private JButton Books_btn;
	private JButton User_btn;
	private JButton Logout_btn;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Records_Librarian frame = new Records_Librarian();
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
	public Records_Librarian() {
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
		
		JButton Record_btn = new JButton("RECORDS");
		Record_btn.setForeground(new Color(57, 28, 11));
		Record_btn.setFont(new Font("Lucida Sans", Font.BOLD, 18));
		Record_btn.setBorder(new LineBorder(new Color(57, 28, 11), 6));
		Record_btn.setBackground(new Color(238, 180, 98));
		Record_btn.setBounds(3, 241, 196, 47);
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
		panel.setBounds(232, 161, 1053, 435);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 20, 1012, 397);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Lucida Sans", Font.BOLD, 12));
		table.getTableHeader().setFont(new Font("Lucida Sans", Font.BOLD, 14));
		
		
		        // Apply header renderer to all columns
		        JTableHeader tableHeader = table.getTableHeader();
		        
		        	
		        		table.setRowHeight(30);
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
		        				{null, null, null, null, null, null},
		        				{null, null, null, null, null, null},
		        				{null, null, null, null, null, null},
		        				{null, null, null, null, null, null},
		        				{null, null, null, null, null, null},
		        				{null, null, null, null, null, null},
		        				{null, null, null, null, null, null},
		        				{null, null, null, null, null, null},
		        				{null, null, null, null, null, null},
		        				{null, null, null, null, null, null},
		        				{null, null, null, null, null, null},
		        				{null, null, null, null, null, null},
		        				{null, null, null, null, null, null},
		        				{null, null, null, null, null, null},
		        				{null, null, null, null, null, null},
		        			},
		        			new String[] {
		        				"Name", "Book Title", "Borrow Date", "Due Date", "Return Date", "Status"
		        			}
		        		));
		        		
		        		table.setBackground(new Color(244, 208, 159));
		        		scrollPane.setViewportView(table);
		
		JComboBox sort_comboBox = new JComboBox();
		sort_comboBox.setBackground(new Color(241, 230, 205));
		sort_comboBox.setBounds(1109, 125, 176, 32);
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
		
		JButton User_btn_1 = new JButton("OVERDUE BOOKS ");
		User_btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		User_btn_1.setForeground(new Color(57, 28, 11));
		User_btn_1.setFont(new Font("Lucida Sans", Font.BOLD, 18));
		User_btn_1.setBorder(new LineBorder(new Color(57, 28, 11), 6));
		User_btn_1.setBackground(new Color(238, 180, 98));
		User_btn_1.setBounds(411, 626, 225, 47);
		contentPane.add(User_btn_1);
		
		JButton User_btn_1_1 = new JButton("RESERVATION");
		User_btn_1_1.setForeground(new Color(57, 28, 11));
		User_btn_1_1.setFont(new Font("Lucida Sans", Font.BOLD, 18));
		User_btn_1_1.setBorder(new LineBorder(new Color(57, 28, 11), 6));
		User_btn_1_1.setBackground(new Color(238, 180, 98));
		User_btn_1_1.setBounds(784, 626, 225, 47);
		contentPane.add(User_btn_1_1);
		mainlbl.setBackground(new Color(238, 180, 98));
		mainlbl.setIcon(new ImageIcon(Books_Librarian.class.getResource("/Resources/Main_background.png")));
		mainlbl.setBounds(0, 0, 1306, 708);
		contentPane.add(mainlbl);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
	    if (e.getSource() == dashboard_btn) 
        {
           dispose();
           new Dashboard_Librarian().setVisible(true);
        }
        else if (e.getSource() == Books_btn) 
        {
            dispose();
            new Books_Librarian().setVisible(true);
        }
        else if (e.getSource() == Logout_btn) 
        {
            dispose();
            new Librarian_Login().setVisible(true);
            
        }
        else if(e.getSource() == User_btn)
        {
        	dispose();
        	new User_Librarian().setVisible(true);
        }
		
	}
}
