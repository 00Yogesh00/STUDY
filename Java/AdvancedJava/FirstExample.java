import java.sql.*;
public class FirstExample
{

	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
	static final String DB_URL = "jdbc:mariadb://localhost/Sample";

	//  Database credentials
	static final String USER = "Yogesh";
	static final String PASS = "12q23w34e45r";

	public static void main(String[] args)
	{
		Connection conn = null;
		Statement stmt = null;
		try
		{
			//STEP 2: Register JDBC driver
			 Class.forName("org.mariadb.jdbc.Driver");

			//STEP 3: Open a connection
			 System.out.println("Connecting to database...");
			 conn = DriverManager.getConnection(DB_URL,USER,PASS);
			 //STEP 4: Execute a query
			System.out.println("Creating statement...");
			stmt = conn.createStatement();
			String sql;
			sql = "SELECT Emp_ID, Emp_Name, Em_Department, Emp_Salary FROM Employee";
			 ResultSet rs = stmt.executeQuery(sql);
			 //STEP 5: Extract data from result set
			 while(rs.next())
			 {
				//Retrieve by column name
				String Emp_ID = rs.getString("Emp_ID");
				String Emp_Name = rs.getString("Emp_Name");
				String Em_Department = rs.getString("Em_Department");
				float Emp_Salary = rs.getFloat("Emp_Salary");

				//Display values
				System.out.print("Emp_ID : " + Emp_ID);
				System.out.print(", Emp_Name : " + Emp_Name);
				System.out.print(", Em_Department : " + Em_Department);
				System.out.println(", Emp_Salary : " + Emp_Salary);
 			}
			//STEP 6: Clean-up environment
			rs.close();
			stmt.close();
			conn.close();
		}catch(SQLException se)
		{
			//Handle errors for JDBC
			se.printStackTrace();
		}catch(Exception e)
		{
			//Handle errors for Class.forName
			e.printStackTrace();
		}finally
		{
			//finally block used to close resources
			try
			{
				if(stmt!=null)
					stmt.close();
			}catch(SQLException se2)
			{
			}// nothing we can do
			try
			{
				if(conn!=null)
					conn.close();
			}catch(SQLException se)
			{
				se.printStackTrace();
			}//end finally try
		}//end try
		System.out.println("Goodbye!");
	}//end main
}//end FirstExample
