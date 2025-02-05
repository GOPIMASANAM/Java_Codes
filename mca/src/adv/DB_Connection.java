package adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DB_Connection {

	public static void main(String[] args) throws Exception {
		
		try {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","gopi","7730");
		String query="select * from admin";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		 if(rs!=null) {
			 boolean flag=false;
			 while(rs.next()) {
				 flag=true;
				 System.out.println(rs.getString(1)+"  "+rs.getString(2));
			 } 
			 if(flag==false)
				 System.out.println("No records.");
		 } 						
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}

