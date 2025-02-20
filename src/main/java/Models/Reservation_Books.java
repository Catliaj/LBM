package Models;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class Reservation_Books extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reservation_Books frame = new Reservation_Books();
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
	public Reservation_Books() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1153, 582);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(159, 106, 56), 5));
		panel.setBackground(new Color(238, 180, 98));
		panel.setBounds(43, 112, 1053, 396);
		contentPane.add(panel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 22, 1011, 351);
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
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Name", "Book Title", "Reservation Date", "Queue Position", "Status"
			}
		));
		scrollPane.setViewportView(table);
		table.setBackground(new Color(244, 208, 159));
		
		JComboBox sort_comboBox = new JComboBox();
		sort_comboBox.setBorder(new LineBorder(new Color(57, 28, 11), 2));
		sort_comboBox.setBackground(new Color(241, 230, 205));
		sort_comboBox.setBounds(920, 73, 176, 32);
		contentPane.add(sort_comboBox);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Overdue_Books.class.getResource("/Resources/Main_background.png")));
		lblNewLabel.setBounds(10, -31, 1139, 704);
		contentPane.add(lblNewLabel);
	}

}

