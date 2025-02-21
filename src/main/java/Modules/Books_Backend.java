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
			String query = "INSERT INTO books (BookTitle, Author, Publisher, Genre, Publication_Year, Quantity, Location, ISBN) VALUES(?,?,?,?,?,?,?,?) ";
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
			String query = "UPDATE books SET BookTitle = ?, Author = ?, Publisher = ?, Genre = ?, Publication_Year = ?, Quantity = ?, Location = ? WHERE ISBN = ?";
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
