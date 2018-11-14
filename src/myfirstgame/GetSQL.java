package myfirstgame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class GetSQL {
	
	private String user = "root";
	private String pass = "tlam142536";
	private String url = "jdbc:mysql://localhost:3306/game_score?autoReconnect=true&useSSL=false";
	public static String strname1 ="";
	public static int score1;
	public static int max = 1;
	public static String namemax = "";
	public static Map<String,Integer> scormap = new HashMap<>();
	public void render() {
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");  

			Connection c = DriverManager.getConnection(url, user, pass);
			 
		    Statement s = c.createStatement();
			
			ResultSet r = s.executeQuery("select * from top_score");
			while(r.next()) {
				strname1 = r.getNString("name");
				score1 = r.getInt("point");
				
				scormap.put(strname1,score1);
				/*if(score1 > max)
					{
					max = score1;
					namemax = strname1;
					}
					*/
				
			
			
			}
		//	System.out.println("ytyy++++++++++++++++");
	//		System.out.println(max + "     " + namemax );
			c.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
}
}
