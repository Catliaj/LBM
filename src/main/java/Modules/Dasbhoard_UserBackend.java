package Modules;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Connection.db_connection;

public class Dasbhoard_UserBackend 
{
	String username;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	db_connection db = new db_connection();
	Connection connection;
	
	
	public String getName(String username) 
	{
		
		
		try
		{
			connection = db.getConnection();
			setUsername(username);
			String query = ("SELECT CONCAT (first_name, ' ',lastname) AS FULLNAME FROM USERS WHERE USERNAME = ?");
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1, getUsername());
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				return rs.getString("FULLNAME");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
		}
		return null;
	}
	

	public void loadHistorytable(JTable table) {
	    try {
	        connection = db.getConnection();
	        PreparedStatement ps = connection.prepareStatement(
	        	    "SELECT books.Title, books.Author, borrowing.borrowing_date, borrowing.return_date, borrowing.status, borrowing.fine_amount, " +
	        	    "CASE WHEN borrowing.return_date < CURDATE() AND borrowing.status = 'OVERDUE' " +
	        	    "THEN DATEDIFF(CURDATE(), borrowing.return_date) ELSE 0 END AS overdue_days " +
	        	    "FROM books " +
	        	    "INNER JOIN borrowing ON books.book_id = borrowing.book_id " +
	        	    "INNER JOIN users ON borrowing.user_id = users.user_id " +
	        	    "WHERE users.username = ?"
	        	);
	
	        ps.setString(1, getUsername());
	
	        ResultSet rs = ps.executeQuery();
	        DefaultTableModel model = (DefaultTableModel) table.getModel();
	        model.setRowCount(0);
	        while (rs.next()) {
	            model.addRow(new Object[] {
	                rs.getString("Title"),
	                rs.getString("Author"),
	                rs.getString("borrowing_date"),
	                rs.getString("return_date"),
	                rs.getInt("overdue_days"),
	                rs.getString("status"),
	                rs.getString("fine_amount")
	                
	            });
	        }
	
	    } catch (Exception e) {
	        e.printStackTrace();
	        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
	    }
	}

	public void loadHistoryTextArea(String username, JTextArea textArea) {
	    try {
	        PreparedStatement ps = connection.prepareStatement(
	            "SELECT books.Title, books.Author, borrowing.borrowing_date, borrowing.return_date, borrowing.status, borrowing.fine_amount, " +
	            "CASE WHEN borrowing.return_date < CURDATE() AND borrowing.status = 'OVERDUE' THEN DATEDIFF(CURDATE(), borrowing.return_date) ELSE 0 END AS overdue_days, " +
	            "DATEDIFF(borrowing.return_date, CURDATE()) AS days_to_return " +
	            "FROM books " +
	            "INNER JOIN borrowing ON books.book_id = borrowing.book_id " +
	            "INNER JOIN users ON borrowing.user_id = users.user_id " +
	            "WHERE users.username = ?"
	        );
	        ps.setString(1, username);
	
	        ResultSet rs = ps.executeQuery();
	        StringBuilder textAreaContent = new StringBuilder();
	        while (rs.next()) {
	            if (rs.getInt("days_to_return") > 0) {
	                textAreaContent.append("Book: ").append(rs.getString("Title"))
	                    .append("\nBorrowed Date: ").append(rs.getString("borrowing_date"))
	                    .append("\nReturn Date: ").append(rs.getString("return_date"))
	                    .append("\nDays to Return: ").append(rs.getInt("days_to_return"))
	                    .append("\n\n");
	            }
	        }
	        textArea.setText(textAreaContent.toString());
	
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
	
	   public void updateBorrowedAndDueSoonCounts(String username, JTextField textField1, JTextField textField2) {
	        try {
	            // Query to get the total borrowed books
	            PreparedStatement psBorrowed = connection.prepareStatement(
	                "SELECT COUNT(*) AS total_borrowed " +
	                "FROM borrowing " +
	                "INNER JOIN users ON borrowing.user_id = users.user_id " +
	                "WHERE users.username = ?"
	            );
	            psBorrowed.setString(1, username);
	            ResultSet rsBorrowed = psBorrowed.executeQuery();
	            if (rsBorrowed.next()) {
	                textField1.setText(String.valueOf(rsBorrowed.getInt("total_borrowed")));
	            }

	            // Query to get the total books due soon
	            PreparedStatement psDueSoon = connection.prepareStatement(
	                "SELECT COUNT(*) AS total_due_soon " +
	                "FROM borrowing " +
	                "INNER JOIN users ON borrowing.user_id = users.user_id " +
	                "WHERE users.username = ? AND DATEDIFF(borrowing.return_date, CURDATE()) <= 7"
	            );
	            psDueSoon.setString(1, username);
	            ResultSet rsDueSoon = psDueSoon.executeQuery();
	            if (rsDueSoon.next()) {
	                textField2.setText(String.valueOf(rsDueSoon.getInt("total_due_soon")));
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	   
	   
	   public void loadOverdueBooks(String username, JTable table) {
		    try {
		        PreparedStatement ps = connection.prepareStatement(
		            "SELECT books.Title, " +
		            "CASE WHEN borrowing.return_date < CURDATE() AND borrowing.status = 'OVERDUE' THEN DATEDIFF(CURDATE(), borrowing.return_date) ELSE 0 END AS overdue_days " +
		            "FROM books " +
		            "INNER JOIN borrowing ON books.book_id = borrowing.book_id " +
		            "INNER JOIN users ON borrowing.user_id = users.user_id " +
		            "WHERE users.username = ? AND borrowing.status = 'OVERDUE'"
		        );
		        ps.setString(1, username);

		        ResultSet rs = ps.executeQuery();
		        DefaultTableModel model = (DefaultTableModel) table.getModel();
		        model.setRowCount(0);
		        while (rs.next()) {
		            model.addRow(new Object[] {
		                rs.getString("Title"),
		                rs.getInt("overdue_days")
		            });
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		}


}
