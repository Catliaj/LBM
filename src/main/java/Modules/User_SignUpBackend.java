package Modules;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Connection.db_connection;

public class User_SignUpBackend 
{
	String FirstName, MiddleInitial,LastName, Email, Phone_number,UserName,Password, Role;
	


	db_connection db = new db_connection();
	Connection connection;
	
	public void addUser(String FirstName, String MiddleInitial, String LastName, String Email, String Phone_Number,
						String UserName,String Password) 
	{
		setFirstName(FirstName);
		setMiddleInitial(MiddleInitial);
		setLastName(LastName);
		setEmail(Email);
		setPhone_number(Phone_Number);
		setUserName(UserName);
		setPassword(Password);
		
		
		try
		{
		connection = db.getConnection();
		String query = "INSERT INTO users (First_Name, Middle_Name, LastName, Email, Phone_Number,UserName, Password, Role) VALUES(?,?,?,?,?,?,?,?) ";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1, getFirstName());
		ps.setString(2, getMiddleInitial());
		ps.setString(3, getLastName());
		ps.setString(4, getEmail());
		ps.setString(5, getPhone_number());
		ps.setString(6, getUserName());
		ps.setString(7, getPassword());
		ps.setString(8, "USER");
		ps.executeUpdate();
		JOptionPane.showMessageDialog(null, "User SignUp Successfully ");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
		}
			
	}
	
	public void updateUser(String FirstName, String MiddleInitial, String LastName, String Email, String Phone_Number,
			String UserName,String Password, String Role) 
	{
		setFirstName(FirstName);
		setMiddleInitial(MiddleInitial);
		setLastName(LastName);
		setEmail(Email);
		setPhone_number(Phone_Number);
		setUserName(UserName);
		setPassword(Password);
		setRole(Role);

		try 
		{
			connection = db.getConnection();
			PreparedStatement ps = connection.prepareStatement("UPDATE users SET First_Name = ?, Middle_Initial = ?, LastName = ?, Email = ?, Phone_Number = ?, UserName = ?, Password = ?, Role = ? WHERE UserName = ?");
			ps.setString(1, getFirstName());
			ps.setString(2, getMiddleInitial());
			ps.setString(3, getLastName());
			ps.setString(4, getEmail());
			ps.setString(5, getPhone_number());
			ps.setString(6, getUserName());
			ps.setString(7, getPassword());
			ps.setString(8, getRole());
			ps.setString(9, getUserName());
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "User Updated Successfully ");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
		}

	}
	
	public void deleteUser(String UserName) 
	{
		setUserName(UserName);

		try 
		{
			connection = db.getConnection();
			PreparedStatement ps = connection.prepareStatement("DELETE FROM users WHERE UserName = ?");
			ps.setString(1, getUserName());
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "User Deleted Successfully ");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
		}
	}
	
	public void loadUserTable(JTable table)
	{
		DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); 
		try {
			connection = db.getConnection();
			String query = "SELECT * FROM users";
			PreparedStatement ps = connection.prepareStatement(query);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				String FirstName = rs.getString("First_Name");
				String MiddleInitial = rs.getString("Middle_Initial");
				String LastName = rs.getString("LastName");
				String Email = rs.getString("Email");
				String Phone = rs.getString("Phone_Number");
				String UserName = rs.getString("UserName");
				String Password = rs.getString("Password");
				String Role = rs.getString("Role");
				
				Object[] row = { FirstName, MiddleInitial, LastName, Email, Phone,UserName, Password, Role };
				model.addRow(row);
			}
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
		}
	}
	
    public List<String[]> getUsersData() {
        List<String[]> patientData = new ArrayList<>();
        try {
            // Establish the connection
            connection = db.getConnection();
            Statement statement = connection.createStatement();
            String query = "SELECT First_Name, Middle_Initial, LastName, Email, Phone_Number, UserName, Password, Role FROM users";
            ResultSet resultSet = statement.executeQuery(query);

           
            while (resultSet.next()) {
                String firstName = resultSet.getString("First_Name");
                String middleInitial = resultSet.getString("Middle_Initial");
                String lastName = resultSet.getString("LastName");
                String Email = resultSet.getString("Email");
				String Phone = resultSet.getString("Phone_Number");
                String UserName = resultSet.getString("UserName");
                String role = resultSet.getString("Role"); 
                patientData.add(new String[]{firstName, middleInitial, lastName,Email, Phone, UserName,role});
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error retrieving users data: " + ex.getMessage());
        }
        return patientData;
    }
	

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getMiddleInitial() {
		return MiddleInitial;
	}

	public void setMiddleInitial(String middleInitial) {
		MiddleInitial = middleInitial;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}
	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPhone_number() {
		return Phone_number;
	}

	public void setPhone_number(String phone_number) {
		Phone_number = phone_number;
	}
}
