import java.sql.*;

public class connectionSQL {

	public static void main(String[] args) {
		
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myinfo", "root", "");
			Statement statement;
			
			statement = connection.createStatement();
			ResultSet resultSet;
			resultSet = statement.executeQuery("select * from info");
			int id;
			int age;
			String email;
			String name;
			String address;
			while(resultSet.next()) {
				id = resultSet.getInt("id");
				name = resultSet.getString("fullname");
				age = resultSet.getInt("age");
				address = resultSet.getString("address");
				email = resultSet.getString("email");
				
				System.out.println("id : "+ id+" name: "+name+ " age: "+ age+ " adderss: "+ address+ " email: "+ email);
			}
			
		}catch(Exception exception) {
			System.out.println("error: " + exception);
			
		}

	}

}
