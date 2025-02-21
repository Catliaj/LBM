package Modules;
import java.sql.*;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Connection.db_connection;



public class Books_Backend
{
	String BookTitle, Author, Publisher, Genre, Publication_Year, Quantity, Location;
	int ISBN;
	Connection connection;
	db_connection db = new db_connection();
	public void addbook(String BookTitle, String Author, String Publisher, String Genre, String Publication_Year,
						String Quantity, String Location, int ISBN) 
	{
		setBookTitle(BookTitle);
		setAuthor(Author);
		setPublisher(Publisher);
		setGenre(Genre);
		setPublication_Year(Publication_Year);
		setQuantity(Quantity);
		setLocation(Location);
		setISBN(ISBN);
		try
		{
			String query = "INSERT INTO books (Title, Author, Publisher, Genre, Publication_Year, Quantity, Location, ISBN) VALUES(?,?,?,?,?,?,?,?) ";
			connection = db.getConnection();
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1, getBookTitle());
			ps.setString(2, getAuthor());
			ps.setString(3, getPublisher());
			ps.setString(4, getGenre());
			ps.setString(5, getPublication_Year());
			ps.setString(6, getQuantity());
			ps.setString(7, getLocation());
			ps.setInt(8, getISBN());
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "Book Added Successfully ");
		}
		catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
		}
		
	}

	public void updateBook(String BookTitle, String Author, String Publisher, String Genre, String Publication_Year,
			String Quantity, String Location, int ISBN) {
		setBookTitle(BookTitle);
		setAuthor(Author);
		setPublisher(Publisher);
		setGenre(Genre);
		setPublication_Year(Publication_Year);
		setQuantity(Quantity);
		setLocation(Location);
		setISBN(ISBN);
		try {
			connection = db.getConnection();
			String query = "UPDATE books SET Title = ?, Author = ?, Publisher = ?, Genre = ?, Publication_Year = ?, Quantity = ?, Location = ? WHERE ISBN = ?";
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1, getBookTitle());
			ps.setString(2, getAuthor());
			ps.setString(3, getPublisher());
			ps.setString(4, getGenre());
			ps.setString(5, getPublication_Year());
			ps.setString(6, getQuantity());
			ps.setString(7, getLocation());
			ps.setInt(8, getISBN());
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "Book Updated Successfully ");
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
		}

	}
	
	public void loadBooktable(JTable table) {
		try {
			connection = db.getConnection();
			PreparedStatement ps = connection.prepareStatement("SELECT * FROM books");
			ResultSet rs = ps.executeQuery();
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			model.setRowCount(0);
			while (rs.next()) {
				model.addRow(new Object[] { rs.getString("Title"), rs.getString("Author"),
						rs.getInt("ISBN"), rs.getString("Genre"), rs.getString("Publisher"),
						rs.getString("Publication_Year"), rs.getString("Quantity"), rs.getString("Location") });
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
		}
	}
	
		public void borrowbook(String BookTitle, String username, String date_borrowed, String date_returned) 
		{
			setBookTitle(BookTitle); 
			
		try { connection = db.getConnection();
	
	    // Retrieve the book_id based on the BookTitle
	    String queryBookId = "SELECT book_id FROM books WHERE Title = ?";
	    PreparedStatement psBookId = connection.prepareStatement(queryBookId);
	    psBookId.setString(1, getBookTitle());
	    ResultSet rsBookId = psBookId.executeQuery();
	    int bookId = 0;
	    if (rsBookId.next()) {
	        bookId = rsBookId.getInt("book_id");
	    }
	
	    // Retrieve the user_id based on the username
	    String queryUserId = "SELECT user_id FROM users WHERE username = ?";
	    PreparedStatement psUserId = connection.prepareStatement(queryUserId);
	    psUserId.setString(1, username);
	    ResultSet rsUserId = psUserId.executeQuery();
	    int userId = 0;
	    if (rsUserId.next()) {
	        userId = rsUserId.getInt("user_id");
	    }
	
	    // Update the Quantity in the books table
	    String queryUpdateQuantity = "UPDATE books SET Quantity = Quantity - 1 WHERE book_id = ?";
	    PreparedStatement psUpdateQuantity = connection.prepareStatement(queryUpdateQuantity);
	    psUpdateQuantity.setInt(1, bookId);
	    psUpdateQuantity.executeUpdate();
	
	    // Insert a new record into the borrowing table
	    String queryInsertBorrowing = "INSERT INTO borrowing (book_id, user_id, borrowing_date, return_date , copies, STATUS) VALUES (?, ?, ?, ?, ?,'BORROWED')";
	    PreparedStatement psInsertBorrowing = connection.prepareStatement(queryInsertBorrowing);
	    psInsertBorrowing.setInt(1, bookId);
	    psInsertBorrowing.setInt(2, userId);
	    psInsertBorrowing.setString(3, date_borrowed);
	    psInsertBorrowing.setString(4, date_returned);
	    psInsertBorrowing.setInt(5, 1);
	    psInsertBorrowing.executeUpdate();
	
	    JOptionPane.showMessageDialog(null, "Book Borrowed Successfully");
	} catch (Exception e) {
	    e.printStackTrace();
	    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
	}
	}
	
	

	
	public String getBookTitle() {
		return BookTitle;
	}

	public void setBookTitle(String bookTitle) {
		BookTitle = bookTitle;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public String getPublisher() {
		return Publisher;
	}

	public void setPublisher(String publisher) {
		Publisher = publisher;
	}

	public String getGenre() {
		return Genre;
	}

	public void setGenre(String genre) {
		Genre = genre;
	}

	public String getPublication_Year() {
		return Publication_Year;
	}

	public void setPublication_Year(String publication_Year) {
		Publication_Year = publication_Year;
	}

	public String getQuantity() {
		return Quantity;
	}

	public void setQuantity(String quantity) {
		Quantity = quantity;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
}
