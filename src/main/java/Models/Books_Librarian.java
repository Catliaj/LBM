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

public class Books_Librarian extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JLabel mainlbl = new JLabel("");
	private JTextField title_textField;
	private JTextField author_textField;
	private JTextField ISBN_textField;
	private JTextField Publisher_textField;
	private JTextField Year_textField;
	private JTextField Quantity_textField;
	private JTextField Location_textField;
	private JTable table;
	private JTextField search_textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Books_Librarian frame = new Books_Librarian();
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
	public Books_Librarian() {
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
		panel.setBounds(227, 88, 369, 610);
		contentPane.add(panel);
		panel.setLayout(null);
		
		title_textField = new JTextField();
		title_textField.setForeground(new Color(57, 28, 11));
		title_textField.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		title_textField.setBorder(new LineBorder(new Color(57, 28, 11), 2));
		title_textField.setBackground(new Color(241, 230, 205));
		title_textField.setBounds(43, 48, 276, 30);
		panel.add(title_textField);
		title_textField.setColumns(10);
		
		JLabel titlelbl = new JLabel("Title:");
		titlelbl.setForeground(new Color(57, 28, 11));
		titlelbl.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		titlelbl.setBounds(42, 20, 124, 22);
		panel.add(titlelbl);
		
		JLabel authorlbl = new JLabel("Author:");
		authorlbl.setForeground(new Color(57, 28, 11));
		authorlbl.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		authorlbl.setBounds(42, 88, 124, 22);
		panel.add(authorlbl);
		
		author_textField = new JTextField();
		author_textField.setForeground(new Color(57, 28, 11));
		author_textField.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		author_textField.setColumns(10);
		author_textField.setBorder(new LineBorder(new Color(57, 28, 11), 2));
		author_textField.setBackground(new Color(241, 230, 205));
		author_textField.setBounds(43, 116, 276, 30);
		panel.add(author_textField);
		
		JLabel lblIsbn = new JLabel("ISBN:");
		lblIsbn.setForeground(new Color(57, 28, 11));
		lblIsbn.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		lblIsbn.setBounds(43, 151, 124, 22);
		panel.add(lblIsbn);
		
		ISBN_textField = new JTextField();
		ISBN_textField.setForeground(new Color(57, 28, 11));
		ISBN_textField.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		ISBN_textField.setColumns(10);
		ISBN_textField.setBorder(new LineBorder(new Color(57, 28, 11), 2));
		ISBN_textField.setBackground(new Color(241, 230, 205));
		ISBN_textField.setBounds(44, 179, 276, 30);
		panel.add(ISBN_textField);
		
		JComboBox Genre_comboBox = new JComboBox();
		Genre_comboBox.setBackground(new Color(241, 230, 205));
		Genre_comboBox.setBorder(new LineBorder(new Color(57, 28, 11), 2));
		Genre_comboBox.setBounds(44, 245, 276, 30);
		panel.add(Genre_comboBox);
		
		JLabel genrelbl = new JLabel("Genre:");
		genrelbl.setForeground(new Color(57, 28, 11));
		genrelbl.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		genrelbl.setBounds(43, 219, 124, 22);
		panel.add(genrelbl);
		
		JLabel publisherlbl = new JLabel("Publisher:");
		publisherlbl.setForeground(new Color(57, 28, 11));
		publisherlbl.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		publisherlbl.setBounds(43, 285, 189, 22);
		panel.add(publisherlbl);
		
		Publisher_textField = new JTextField();
		Publisher_textField.setForeground(new Color(57, 28, 11));
		Publisher_textField.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		Publisher_textField.setColumns(10);
		Publisher_textField.setBorder(new LineBorder(new Color(57, 28, 11), 2));
		Publisher_textField.setBackground(new Color(241, 230, 205));
		Publisher_textField.setBounds(43, 309, 276, 30);
		panel.add(Publisher_textField);
		
		JLabel lblQuantity = new JLabel("Publication Year:");
		lblQuantity.setForeground(new Color(57, 28, 11));
		lblQuantity.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		lblQuantity.setBounds(42, 349, 189, 22);
		panel.add(lblQuantity);
		
		Year_textField = new JTextField();
		Year_textField.setForeground(new Color(57, 28, 11));
		Year_textField.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		Year_textField.setColumns(10);
		Year_textField.setBorder(new LineBorder(new Color(57, 28, 11), 2));
		Year_textField.setBackground(new Color(241, 230, 205));
		Year_textField.setBounds(43, 377, 276, 30);
		panel.add(Year_textField);
		
		JLabel lblQuantity_1 = new JLabel("Quantity:");
		lblQuantity_1.setForeground(new Color(57, 28, 11));
		lblQuantity_1.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		lblQuantity_1.setBounds(42, 417, 124, 22);
		panel.add(lblQuantity_1);
		
		Quantity_textField = new JTextField();
		Quantity_textField.setForeground(new Color(57, 28, 11));
		Quantity_textField.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		Quantity_textField.setColumns(10);
		Quantity_textField.setBorder(new LineBorder(new Color(57, 28, 11), 2));
		Quantity_textField.setBackground(new Color(241, 230, 205));
		Quantity_textField.setBounds(43, 445, 276, 30);
		panel.add(Quantity_textField);
		
		JLabel lblLocation = new JLabel("Location:");
		lblLocation.setForeground(new Color(57, 28, 11));
		lblLocation.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		lblLocation.setBounds(42, 485, 124, 22);
		panel.add(lblLocation);
		
		Location_textField = new JTextField();
		Location_textField.setForeground(new Color(57, 28, 11));
		Location_textField.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		Location_textField.setColumns(10);
		Location_textField.setBorder(new LineBorder(new Color(57, 28, 11), 2));
		Location_textField.setBackground(new Color(241, 230, 205));
		Location_textField.setBounds(43, 513, 276, 30);
		panel.add(Location_textField);
		
		JButton Add_btn = new JButton("ADD");
		Add_btn.setForeground(new Color(57, 28, 11));
		Add_btn.setFont(new Font("Lucida Sans", Font.BOLD, 18));
		Add_btn.setBorder(new LineBorder(new Color(57, 28, 11), 4));
		Add_btn.setBackground(new Color(244, 208, 159));
		Add_btn.setBounds(23, 560, 153, 30);
		panel.add(Add_btn);
		
		JButton Update_btn = new JButton("UPDATE");
		Update_btn.setForeground(new Color(57, 28, 11));
		Update_btn.setFont(new Font("Lucida Sans", Font.BOLD, 18));
		Update_btn.setBorder(new LineBorder(new Color(57, 28, 11), 4));
		Update_btn.setBackground(new Color(244, 208, 159));
		Update_btn.setBounds(195, 560, 153, 30);
		panel.add(Update_btn);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(606, 162, 679, 536);
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
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Title", "Author", "ISBN", "Genre", "Publisher", "Publication Year", "Quantity", "Location", "Action"
			}
		));
		
		table.setBackground(new Color(244, 208, 159));
		scrollPane.setViewportView(table);
		
		JComboBox sort_comboBox = new JComboBox();
		sort_comboBox.setBackground(new Color(241, 230, 205));
		sort_comboBox.setBounds(1108, 120, 176, 32);
		sort_comboBox.setBorder(new LineBorder(new Color(57, 28, 11), 2));
		contentPane.add(sort_comboBox);
		
		JPanel search_panel = new JPanel();
		search_panel.setBorder(new LineBorder(new Color(57, 28, 11), 2));
		search_panel.setBackground(new Color(244, 208, 159));
		search_panel.setBounds(634, 98, 447, 54);
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
	}
}
