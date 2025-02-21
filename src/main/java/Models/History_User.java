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
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

public class History_User extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JLabel mainlbl = new JLabel("");
	private JTable table;
	private JTextField search_textField;
	private JTextField textField_1;
	private JLabel timeLabel;
	private JLabel dateLabel;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					History_User frame = new History_User();
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
	public History_User() {
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
		
		JButton Record_btn = new JButton("HISTORY");
		Record_btn.setForeground(new Color(57, 28, 11));
		Record_btn.setFont(new Font("Lucida Sans", Font.BOLD, 18));
		Record_btn.setBorder(new LineBorder(new Color(57, 28, 11), 6));
		Record_btn.setBackground(new Color(238, 180, 98));
		Record_btn.setBounds(3, 184, 196, 47);
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
		panel_admin.setBounds(10, 20, 244, 58);
		panel_admin.setBorder(new LineBorder(new Color(57, 28, 11), 4));
		contentPane.add(panel_admin);
		panel_admin.setLayout(null);
		
		JLabel welcomelbl = new JLabel("WELCOME, USER!");
		welcomelbl.setBounds(17, 3, 252, 48);
		welcomelbl.setFont(new Font("Lucida Sans", Font.BOLD, 22));
		panel_admin.add(welcomelbl);

		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(159, 106, 56), 5));
		panel.setBackground(new Color(238, 180, 98));
		panel.setBounds(232, 161, 823, 521);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 20, 787, 479);
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
		        				{null, null, null, null, null, null, null, null},
		        				{null, null, null, null, null, null, null, null},
		        				{null, null, null, null, null, null, null, null},
		        				{null, null, null, null, null, null, null, null},
		        				{null, null, null, null, null, null, null, null},
		        				{null, null, null, null, null, null, null, null},
		        				{null, null, null, null, null, null, null, null},
		        				{null, null, null, null, null, null, null, null},
		        				{null, null, null, null, null, null, null, null},
		        				{null, null, null, null, null, null, null, null},
		        				{null, null, null, null, null, null, null, null},
		        				{null, null, null, null, null, null, null, null},
		        				{null, null, null, null, null, null, null, null},
		        				{null, null, null, null, null, null, null, null},
		        				{null, null, null, null, null, null, null, null},
		        			},
		        			new String[] {
		        				"Name", "Book Title", "Borrow Date", "Due Date", "Return Date", "Overdue Days", "Status", "Fines"
		        			}
		        		));
		        		table.getColumnModel().getColumn(7).setResizable(false);
		        		
		        		table.setBackground(new Color(244, 208, 159));
		        		scrollPane.setViewportView(table);
		
		JComboBox sort_comboBox = new JComboBox();
		sort_comboBox.setBackground(new Color(241, 230, 205));
		sort_comboBox.setBounds(879, 122, 176, 32);
		sort_comboBox.setBorder(new LineBorder(new Color(57, 28, 11), 2));
		contentPane.add(sort_comboBox);
		
		JPanel search_panel = new JPanel();
		search_panel.setBorder(new LineBorder(new Color(57, 28, 11), 2));
		search_panel.setBackground(new Color(244, 208, 159));
		search_panel.setBounds(359, 88, 447, 54);
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
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setForeground(new Color(57, 28, 11));
		panel_1_1.setBorder(new LineBorder(new Color(159, 106, 56), 4));
		panel_1_1.setBackground(new Color(238, 180, 98));
		panel_1_1.setBounds(1065, 336, 223, 114);
		contentPane.add(panel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(238, 180, 98));
		textField_1.setBounds(106, 20, 107, 63);
		panel_1_1.add(textField_1);
		
		JLabel lblTotalFines = new JLabel("TOTAL FINES");
		lblTotalFines.setFont(new Font("Lucida Sans", Font.BOLD, 15));
		lblTotalFines.setBounds(110, 75, 156, 48);
		panel_1_1.add(lblTotalFines);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(History_User.class.getResource("/Resources/fines_icon.png")));
		lblNewLabel_1_1.setBounds(12, 16, 86, 87);
		panel_1_1.add(lblNewLabel_1_1);
		       	
		       	JPanel panel_admin_1 = new JPanel();
		       	panel_admin_1.setLayout(null);
		       	panel_admin_1.setBorder(new LineBorder(new Color(57, 28, 11), 4));
		       	panel_admin_1.setBackground(new Color(238, 180, 98));
		       	panel_admin_1.setBounds(983, 20, 305, 58);
		       	contentPane.add(panel_admin_1);
		       	
		        // Date Label
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
		       		   
		       		   	mainlbl.setBackground(new Color(238, 180, 98));
		       		   	mainlbl.setIcon(new ImageIcon(Books_Librarian.class.getResource("/Resources/Main_background.png")));
		       		   	mainlbl.setBounds(0, 0, 1306, 708);
		       		   	contentPane.add(mainlbl);

		    startClock(); // Call method to update time
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
}


