package myfirstgame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQL {
	private String user = "root";
	private String pass = "tlam142536";
	private String url = "jdbc:mysql://localhost:3306/game_score?autoReconnect=true&useSSL=false";
	public static String strname ="";
	public static int score;
	
	public void render() {
		
		
				try {
					Class.forName("com.mysql.jdbc.Driver");  

					Connection c = DriverManager.getConnection(url, user, pass);
				
					String query = " insert into top_score (name, point)"
							+ " values (?, ?)";
					
					//String query = "update top_score set point = ? where point < ?";
					
					PreparedStatement prep = c.prepareStatement(query);
					prep.setString(1,Game.str);
					prep.setInt(2, Game.best);
					
					prep.executeUpdate();
					
					
				Statement s = c.createStatement();
					
					ResultSet r = s.executeQuery("select * from top_score");
					
					strname = r.getNString("name");
					score = r.getInt("point");
					System.out.println("ytyy++++++++++++++++");
					System.out.println(strname + "     " + score );
					c.close();
					
				//	System.out.println("Connection MySQL0"); 
					
				/*	while(r.next()) 
					{
						strname = r.getString("name");
						score = r.getInt("point");
						//String ss = r.getString("balance");
						//int x =Integer.parseInt(ss);
						//if(x > 10000)
						System.out.println("user name is = "+r.getString("name"));
						 
					}*/
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
	}
}
