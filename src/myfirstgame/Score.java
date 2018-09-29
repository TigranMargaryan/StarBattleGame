package myfirstgame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Score {
	public void render(Graphics g) {
		Font fn = new Font("arial", Font.BOLD, 30);
	 	g.setFont(fn);
	 	g.setColor(Color.CYAN);
	 	g.drawString("Top 10", 10,40);
	 	
	 	fn = new Font("arial", Font.BOLD, 20);
	 	g.setFont(fn);
	 	g.drawString("1)", 10, 80);
	 	g.drawString(GetSQL.namemax, 30, 80);
	 	g.drawString(" "+GetSQL.max, 120, 80);
	 	
	 	g.drawString("2)", 10,120);
	 	
	 	g.drawString("3)", 10,160);
	 	
	 /*	g.drawString("4)", 10,200);
	 	
	 	g.drawString("5)", 10,240);
	 	
	 	g.drawString("6)", 10,280);
	 	
	 	g.drawString("7)", 10,320);
	 	
	 	g.drawString("8)", 10,360);
	 	
	 	g.drawString("9)", 10,400);
	 	
	 	g.drawString("10)",2 ,440);*/
	 	
	 	
	 	g.drawRect(10, 460, 100, 40);				//back to menu
	 	g.drawString("Back", 35,487);
	 	
	 
	}
}
