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
import javax.swing.RowFilter;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableRowSorter;

import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;
import Modules.Dasbhoard_UserBackend;

public class History_User extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JLabel mainlbl = new JLabel("");
	private JTable table;
	private JTextField search_textField;
	private JTextField total;
	private JLabel timeLabel;
	private JLabel dateLabel;
	private JButton dashboard_btn;
	private JButton Logout_btn;
	private JLabel name;
	private JComboBox<String> filter_comboBox; // Declare globally
	Dasbhoard_UserBackend user = new Dasbhoard_UserBackend();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					History_User frame = new History_User(null);
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
	private String username;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public History_User(String Username) 
	{
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
		
	    dashboard_btn = new JButton("DASHBOARD");
		dashboard_btn.setForeground(new Color(57, 28, 11));
		dashboard_btn.setBackground(new Color(238, 180, 98));
		dashboard_btn.setFont(new Font("Lucida Sans", Font.BOLD, 18));
		dashboard_btn.setBorder(new LineBorder(new Color(57, 28, 11), 6));
		dashboard_btn.setBounds(3, 69, 196, 47);
		dashboard_btn.addActionListener(this);
		sidepanel.add(dashboard_btn);
		
		JButton Record_btn = new JButton("HISTORY");
		Record_btn.setEnabled(false);
		Record_btn.setForeground(new Color(57, 28, 11));
		Record_btn.setFont(new Font("Lucida Sans", Font.BOLD, 18));
		Record_btn.setBorder(new LineBorder(new Color(57, 28, 11), 6));
		Record_btn.setBackground(new Color(238, 180, 98));
		Record_btn.setBounds(3, 126, 196, 47);
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
		panel_admin.setBounds(10, 20, 398, 58);
		panel_admin.setBorder(new LineBorder(new Color(57, 28, 11), 4));
		contentPane.add(panel_admin);
		panel_admin.setLayout(null);
		
		JLabel welcomelbl = new JLabel("WELCOME,");
		welcomelbl.setBounds(17, 3, 135, 48);
		welcomelbl.setFont(new Font("Lucida Sans", Font.BOLD, 22));
		panel_admin.add(welcomelbl);
		
	    name = new JLabel("WELCOME");
		name.setFont(new Font("Lucida Sans", Font.BOLD, 22));
		name.setBounds(142, 3, 246, 48);
		panel_admin.add(name);

		
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
		        			
		        			},
		        			new String[] {
		        				"Name", "Book Title", "Borrow Date", "Due Date", "Overdue Days", "Status", "Fines"
		        			}
		        		));
		        		table.getColumnModel().getColumn(6).setResizable(false);
		        		
		        		table.setBackground(new Color(244, 208, 159));
		        		scrollPane.setViewportView(table);
		
		JComboBox filter_comboBox = new JComboBox();
		filter_comboBox.setBackground(new Color(241, 230, 205));
		filter_comboBox.setBounds(879, 122, 176, 32);
		filter_comboBox.setBorder(new LineBorder(new Color(57, 28, 11), 2));
		
		filter_comboBox.addItem("All");
		filter_comboBox.addItem("Returned");
		filter_comboBox.addItem("Overdue");
		filter_comboBox.addItem("Monthly");
		filter_comboBox.addItem("Yearly");
		
		contentPane.add(filter_comboBox);
		
		filter_comboBox.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    }
		});
		
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
		search_textField.addKeyListener(new KeyAdapter() {
		  
		    public void keyPressed(KeyEvent e) {
		        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
		            searchRecords();
		        }
		    }
		});
		
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
		
		total = new JTextField();
		total.setColumns(10);
		total.setFont(new Font("Lucida Sans", Font.BOLD, 20));
		total.setBackground(new Color(238, 180, 98));
		total.setEditable(false); // Make it read-only
		total.setBounds(106, 20, 107, 63);
		panel_1_1.add(total);
		
		computeTotalFines();
		table.getModel().addTableModelListener(e -> computeTotalFines());
		
		JLabel lblTotalFines = new JLabel("TOTAL FINES");
		lblTotalFines.setFont(new Font("Lucida Sans", Font.BOLD, 15));
		lblTotalFines.setBounds(110, 75, 156, 48);
		panel_1_1.add(lblTotalFines);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(History_User.class.getResource("/Resources/fines_icon.png")));
		//lblNewLabel_1_1.setIcon(new ImageIcon(History_User.class.getResource("/Resources/fines_icon.png")));
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
		       		 user.getName(getUsername());
		       		UpdateLabelName(getUsername());
		       		user.loadHistorytable(table);
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

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getSource() == dashboard_btn)
		{
			dispose();
			new Dashboard_User(getUsername()).setVisible(true);
		}
		else if (e.getSource() == Logout_btn) {
			dispose();
			new User_Login().setVisible(true);
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
	
	private void searchRecords() {
	    String searchText = search_textField.getText().toLowerCase();
	    DefaultTableModel model = (DefaultTableModel) table.getModel();
	    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
	    table.setRowSorter(sorter);

	    if (searchText.trim().isEmpty()) {
	        sorter.setRowFilter(null);  // Reset filter
	    } else {
	        sorter.setRowFilter(RowFilter.regexFilter("(?i)" + searchText));
	    }
	}
		
	private void computeTotalFines() {
	    if (total == null) {
	        System.out.println("Total fines field is not initialized yet.");
	        return; // Exit if total is null
	    }

	    DefaultTableModel model = (DefaultTableModel) table.getModel();
	    double totalFine = 0.0;

	    int fineColumnIndex = 6; // Ensure this is the correct column index for fines

	    for (int i = 0; i < model.getRowCount(); i++) {
	        try {
	            double fine = Double.parseDouble(model.getValueAt(i, fineColumnIndex).toString());
	            totalFine += fine;
	        } catch (NumberFormatException | NullPointerException e) {
	            // Skip rows with invalid or empty fine values
	        }
	    }

	    total.setText(String.format("%.2f", totalFine)); // Format to 2 decimal places
	}



}


