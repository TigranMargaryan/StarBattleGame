package myfirstgame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MySQL {
	private String user = "root";
	private String pass = "root";
	private String url = "jdbc:mysql://localhost:3306/game_score?autoReconnect=true&useSSL=false";
	public static String strname ="";
	public static int score;
	public String n = "Tikk";
	public void render() {
		
		
				try {
					Class.forName("com.mysql.jdbc.Driver");  

					Connection c = DriverManager.getConnection(url, user, pass);
				
					String query = " INSERT INTO top_score(name, point)"
							+ " VALUES(?, ?)";
					
					//String query = "update top_score set point = ? where point < ?";
					
					PreparedStatement prep = c.prepareStatement(query);
					
					prep.setString(1,Game.str);
					
					prep.setInt(2, Game.best);
					
					
					prep.executeUpdate();
					
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
	}
}
