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
import javax.swing.border.BevelBorder;
import com.toedter.calendar.JDateChooser;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Modules.Books_Backend;

public class Borrow_User extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JLabel mainlbl = new JLabel("");
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JDateChooser dateChooser;
	private JDateChooser dateChooser_1;
	private JButton Books_btn_1;
	private JTable table;
	Books_Backend book = new Books_Backend();
	private JTextField search;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Borrow_User frame = new Borrow_User(null);
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
	
	String username;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Borrow_User(String username) {
		setUsername(username);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1106, 714);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		       		   		
		       		   				
		       		   				JPanel panel = new JPanel();
		       		   				panel.setBorder(new LineBorder(new Color(159, 106, 56), 5));
		       		   				panel.setBackground(new Color(238, 180, 98));
		       		   				panel.setBounds(10, 55, 693, 84);
		       		   				contentPane.add(panel);
		       		   				panel.setLayout(null);
		       		   				
		       		   				JLabel lblBookDetails = new JLabel("SELECT BOOK:");
		       		   				lblBookDetails.setFont(new Font("Lucida Sans", Font.BOLD, 22));
		       		   				lblBookDetails.setBounds(34, 15, 252, 48);
		       		   				panel.add(lblBookDetails);
		       		   				
		       		   				
		       		   					
		       		   					JPanel panel_2 = new JPanel();
		       		   					panel_2.setBounds(210, 15, 470, 58);
		       		   					panel.add(panel_2);
		       		   					panel_2.setLayout(null);
		       		   					panel_2.setBorder(new LineBorder(new Color(159, 106, 56), 6));
		       		   					panel_2.setBackground(new Color(244, 208, 159));
		       		   					
		       		   					search = new JTextField();
		       		   					search.setForeground(new Color(57, 28, 11));
		       		   					search.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		       		   					search.setColumns(10);
		       		   					search.setBorder(new LineBorder(new Color(57, 28, 11), 2));
		       		   					search.setBackground(new Color(241, 230, 205));
		       		   					search.setBounds(10, 10, 450, 38);
		       		   					panel_2.add(search);
		       		   					
		       		   					JPanel panel_1_1 = new JPanel();
		       		   					panel_1_1.setLayout(null);
		       		   					panel_1_1.setBorder(new LineBorder(new Color(159, 106, 56), 5));
		       		   					panel_1_1.setBackground(new Color(238, 180, 98));
		       		   					panel_1_1.setBounds(713, 55, 354, 409);
		       		   					contentPane.add(panel_1_1);
		       		   					
		       		   					JLabel lblBookDetails_2_1 = new JLabel("BORROWING ");
		       		   					lblBookDetails_2_1.setFont(new Font("Lucida Sans", Font.BOLD, 22));
		       		   					lblBookDetails_2_1.setBounds(106, 10, 330, 48);
		       		   					panel_1_1.add(lblBookDetails_2_1);
		       		   					
		       		   					JLabel lblBorrowDate = new JLabel("Borrow Date:");
		       		   					lblBorrowDate.setForeground(new Color(57, 28, 11));
		       		   					lblBorrowDate.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		       		   					lblBorrowDate.setBounds(45, 174, 124, 22);
		       		   					panel_1_1.add(lblBorrowDate);
		       		   					
		       		   					JLabel genrelbl_1 = new JLabel("Due Date:");
		       		   					genrelbl_1.setForeground(new Color(57, 28, 11));
		       		   					genrelbl_1.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		       		   					genrelbl_1.setBounds(50, 239, 177, 22);
		       		   					panel_1_1.add(genrelbl_1);
		       		   					
		       		   				    dateChooser = new JDateChooser();
		       		   					dateChooser.setBounds(46, 206, 259, 30);
		       		   					panel_1_1.add(dateChooser);
		       		   					
		       		   				    dateChooser_1 = new JDateChooser();
		       		   					dateChooser_1.setBounds(49, 264, 259, 30);
		       		   					panel_1_1.add(dateChooser_1);
		       		   					
		       		   					JLabel lblQuantity_1 = new JLabel("Name:");
		       		   					lblQuantity_1.setForeground(new Color(57, 28, 11));
		       		   					lblQuantity_1.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		       		   					lblQuantity_1.setBounds(45, 112, 150, 22);
		       		   					panel_1_1.add(lblQuantity_1);
		       		   					
		       		   					textField_6 = new JTextField();
		       		   					textField_6.setForeground(new Color(57, 28, 11));
		       		   					textField_6.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		       		   					textField_6.setColumns(10);
		       		   					textField_6.setBorder(new LineBorder(new Color(57, 28, 11), 2));
		       		   					textField_6.setBackground(new Color(241, 230, 205));
		       		   					textField_6.setBounds(45, 138, 259, 30);
		       		   					panel_1_1.add(textField_6);
		       		   					
		       		   				    Books_btn_1 = new JButton("BORROW");
		       		   					Books_btn_1.setBounds(93, 333, 177, 47);
		       		   					panel_1_1.add(Books_btn_1);
		       		   					Books_btn_1.setForeground(new Color(57, 28, 11));
		       		   					Books_btn_1.setFont(new Font("Lucida Sans", Font.BOLD, 18));
		       		   					Books_btn_1.setBorder(new LineBorder(new Color(57, 28, 11), 6));
		       		   					Books_btn_1.setBackground(new Color(238, 180, 98));
		       		   					
		       		   					JLabel lblBookDetails_2_1_1 = new JLabel("INFORMATION");
		       		   					lblBookDetails_2_1_1.setFont(new Font("Lucida Sans", Font.BOLD, 22));
		       		   					lblBookDetails_2_1_1.setBounds(93, 49, 330, 48);
		       		   					panel_1_1.add(lblBookDetails_2_1_1);
		       		   							
		       		   							JPanel panel_1_2 = new JPanel();
		       		   							panel_1_2.setLayout(null);
		       		   							panel_1_2.setBorder(new LineBorder(new Color(159, 106, 56), 5));
		       		   							panel_1_2.setBackground(new Color(238, 180, 98));
		       		   							panel_1_2.setBounds(10, 474, 1057, 179);
		       		   							contentPane.add(panel_1_2);
		       		   							
		       		   							JLabel lblBookDetails_2_2 = new JLabel("BOOK DETAILS:");
		       		   							lblBookDetails_2_2.setFont(new Font("Lucida Sans", Font.BOLD, 22));
		       		   							lblBookDetails_2_2.setBounds(21, 0, 252, 48);
		       		   							panel_1_2.add(lblBookDetails_2_2);
		       		   							
		       		   							JLabel titlelbl_1 = new JLabel("Title:");
		       		   							titlelbl_1.setForeground(new Color(57, 28, 11));
		       		   							titlelbl_1.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		       		   							titlelbl_1.setBounds(21, 41, 124, 22);
		       		   							panel_1_2.add(titlelbl_1);
		       		   							
		       		   							textField_7 = new JTextField();
		       		   							textField_7.setForeground(new Color(57, 28, 11));
		       		   							textField_7.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		       		   							textField_7.setColumns(10);
		       		   							textField_7.setBorder(new LineBorder(new Color(57, 28, 11), 2));
		       		   							textField_7.setBackground(new Color(241, 230, 205));
		       		   							textField_7.setBounds(22, 69, 177, 30);
		       		   							panel_1_2.add(textField_7);
		       		   							
		       		   							JLabel authorlbl_1 = new JLabel("Author:");
		       		   							authorlbl_1.setForeground(new Color(57, 28, 11));
		       		   							authorlbl_1.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		       		   							authorlbl_1.setBounds(268, 41, 124, 22);
		       		   							panel_1_2.add(authorlbl_1);
		       		   							
		       		   							textField_8 = new JTextField();
		       		   							textField_8.setForeground(new Color(57, 28, 11));
		       		   							textField_8.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		       		   							textField_8.setColumns(10);
		       		   							textField_8.setBorder(new LineBorder(new Color(57, 28, 11), 2));
		       		   							textField_8.setBackground(new Color(241, 230, 205));
		       		   							textField_8.setBounds(269, 69, 194, 30);
		       		   							panel_1_2.add(textField_8);
		       		   							
		       		   							JLabel lblIsbn_1 = new JLabel("ISBN:");
		       		   							lblIsbn_1.setForeground(new Color(57, 28, 11));
		       		   							lblIsbn_1.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		       		   							lblIsbn_1.setBounds(567, 41, 150, 22);
		       		   							panel_1_2.add(lblIsbn_1);
		       		   							
		       		   							textField_9 = new JTextField();
		       		   							textField_9.setForeground(new Color(57, 28, 11));
		       		   							textField_9.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		       		   							textField_9.setColumns(10);
		       		   							textField_9.setBorder(new LineBorder(new Color(57, 28, 11), 2));
		       		   							textField_9.setBackground(new Color(241, 230, 205));
		       		   							textField_9.setBounds(568, 69, 149, 30);
		       		   							panel_1_2.add(textField_9);
		       		   							
		       		   							JLabel genrelbl_2 = new JLabel("Genre:");
		       		   							genrelbl_2.setForeground(new Color(57, 28, 11));
		       		   							genrelbl_2.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		       		   							genrelbl_2.setBounds(826, 41, 177, 22);
		       		   							panel_1_2.add(genrelbl_2);
		       		   							
		       		   							textField_10 = new JTextField();
		       		   							textField_10.setForeground(new Color(57, 28, 11));
		       		   							textField_10.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		       		   							textField_10.setColumns(10);
		       		   							textField_10.setBorder(new LineBorder(new Color(57, 28, 11), 2));
		       		   							textField_10.setBackground(new Color(241, 230, 205));
		       		   							textField_10.setBounds(268, 137, 195, 30);
		       		   							panel_1_2.add(textField_10);
		       		   							
		       		   							JLabel publisherlbl_1 = new JLabel("Publisher:");
		       		   							publisherlbl_1.setForeground(new Color(57, 28, 11));
		       		   							publisherlbl_1.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		       		   							publisherlbl_1.setBounds(268, 113, 195, 22);
		       		   							panel_1_2.add(publisherlbl_1);
		       		   							
		       		   							JLabel lblQuantity_2 = new JLabel("Publication Year:");
		       		   							lblQuantity_2.setForeground(new Color(57, 28, 11));
		       		   							lblQuantity_2.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		       		   							lblQuantity_2.setBounds(567, 109, 150, 22);
		       		   							panel_1_2.add(lblQuantity_2);
		       		   							
		       		   							textField_11 = new JTextField();
		       		   							textField_11.setForeground(new Color(57, 28, 11));
		       		   							textField_11.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		       		   							textField_11.setColumns(10);
		       		   							textField_11.setBorder(new LineBorder(new Color(57, 28, 11), 2));
		       		   							textField_11.setBackground(new Color(241, 230, 205));
		       		   							textField_11.setBounds(568, 137, 149, 30);
		       		   							panel_1_2.add(textField_11);
		       		   							
		       		   							textField_12 = new JTextField();
		       		   							textField_12.setForeground(new Color(57, 28, 11));
		       		   							textField_12.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		       		   							textField_12.setColumns(10);
		       		   							textField_12.setBorder(new LineBorder(new Color(57, 28, 11), 2));
		       		   							textField_12.setBackground(new Color(241, 230, 205));
		       		   							textField_12.setBounds(826, 65, 177, 30);
		       		   							panel_1_2.add(textField_12);
		       		   										
		       		   										JPanel panel_1 = new JPanel();
		       		   										panel_1.setLayout(null);
		       		   										panel_1.setBorder(new LineBorder(new Color(159, 106, 56), 5));
		       		   										panel_1.setBackground(new Color(238, 180, 98));
		       		   										panel_1.setBounds(10, 149, 691, 319);
		       		   										contentPane.add(panel_1);
		       		   										
		       		   										JScrollPane scrollPane = new JScrollPane();
		       		   										scrollPane.setBounds(20, 20, 654, 285);
		       		   										panel_1.add(scrollPane);
		       		   										
		       		   										table = new JTable();
		       		   										scrollPane.setViewportView(table);
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
		       		   								        				{null, null, null, null},
		       		   								        				{null, null, null, null},
		       		   								        				{null, null, null, null},
		       		   								        				{null, null, null, null},
		       		   								        				{null, null, null, null},
		       		   								        				{null, null, null, null},
		       		   								        				{null, null, null, null},
		       		   								        				{null, null, null, null},
		       		   								        				{null, null, null, null},
		       		   								        				{null, null, null, null},
		       		   								        				{null, null, null, null},
		       		   								        				{null, null, null, null},
		       		   								        				{null, null, null, null},
		       		   								        				{null, null, null, null},
		       		   								        				{null, null, null, null},
		       		   								        			},
		       		   								        			new String[] {
		       		   								        				"Book Title", "Author", "ISBN", "Genre", "Publisher", "Publication Year", "Quantity", "Location"
		       		   								        			}
		       		   								        		));
		       		   								        		
		       		   								        	table.addMouseListener(new MouseAdapter() {
		       		   								            @Override
		       		   								            public void mouseClicked(MouseEvent e) {
		       		   								                int selectedRow = table.getSelectedRow();
		       		   								                if (selectedRow >= 0) {
		       		   								                    // Fill text fields with selected row data
		       		   								                	               		   								                    textField_7.setText(table.getValueAt(selectedRow, 0).toString());
		       		   								                	                           		   								                    textField_8.setText(table.getValueAt(selectedRow, 1).toString());
		       		   								                	                           		   								                    textField_9.setText(table.getValueAt(selectedRow, 2).toString());
		       		   								                	                           		   								                    textField_12.setText(table.getValueAt(selectedRow, 3).toString());
		       		   								                	                           		   								                    textField_10.setText(table.getValueAt(selectedRow, 4).toString());
		       		   								                	                           		   								                    textField_11.setText(table.getValueAt(selectedRow, 5).toString());
		       		   								                	                           		   								                    
		       		   								                	                           		   								              
		       		   								                	
		       		   								                }
		       		   								            }
		       		   								        });
		       		   								        		
		       		   								        		table.setBackground(new Color(244, 208, 159));
		       		   								        		scrollPane.setViewportView(table);
		       		   										
		       		   										
		       		   										
		       		   											mainlbl.setBackground(new Color(238, 180, 98));
		       		   											mainlbl.setIcon(new ImageIcon(Books_Librarian.class.getResource("/Resources/Main_background.png")));
		       		   											mainlbl.setBounds(0, -68, 1306, 776);
		       		   											contentPane.add(mainlbl);
		       		   											book.loadBooktable(table);
		       		   										Books_btn_1.addActionListener(this);
		       		   		
		       		 
}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if (e.getSource() == Books_btn_1) {
			String booktitle = textField_7.getText();
			String username = textField_6.getText();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String date_borrowed = sdf.format(dateChooser.getDate());
			String date_returned = sdf.format(dateChooser_1.getDate());
			book.borrowbook(booktitle, getUsername(), date_borrowed, date_returned);
        }
		}
		
	}


