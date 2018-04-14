package DoctorsAP;


import java.sql.*;

import javax.swing.JOptionPane;

public class SQLconnection {
	Connection myConn = null;
	public static Connection dbConnector()
	{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/doctorsap", "root" , "");
			
			//JOptionPane.showMessageDialog(null, "connection ok !!");
			return myConn;
		}catch(Exception e)
		{
			//JOptionPane.showMessageDialog(null, "connection lost !!");
			//JOptionPane.showMessageDialog(null, e);
			return null;
		
		}
	
	}

}