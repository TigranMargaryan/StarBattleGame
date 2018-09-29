package myfirstgame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Menu {

	public Rectangle playbutton = new Rectangle(Game.WIDTH / 2 + 120, 250, 170, 50);
	public Rectangle scorebutten = new Rectangle(Game.WIDTH / 2 + 120, 350, 170, 50);
	public Rectangle exitbutton = new Rectangle(Game.WIDTH / 2 + 120, 450, 170, 50);
	Game game;
	
	@SuppressWarnings("static-access")
	public void render(Graphics g) {
		
		Graphics2D gr = (Graphics2D) g;
		
		 	Font fn = new Font("arial", Font.BOLD, 50);
		 	g.setFont(fn);
		 	g.setColor(Color.CYAN);
		 	g.drawString("    Stare Battle ", Game.WIDTH / 2 - 10,100);
	
		 	Font fn1 = new Font("arial",Font.BOLD,30);
		 	g.setFont(fn1);
		 	g.drawString(" Play", playbutton.x + 55,playbutton.y + 35);
		 	
		 	gr.draw(playbutton);
		 	
		 	g.drawString("Score", scorebutten.x + 55,playbutton.y + 135);
		 	gr.draw(scorebutten);
		 	
		 	g.drawString(" Quit", exitbutton.x + 55,playbutton.y + 235);
		 	gr.draw(exitbutton);
		
///////////////////////////////////////////////////////////////////////// Gmae over 
		 	if(game.best > 1) {
		 		fn1 = new Font("arial",Font.BOLD,40);
			 	g.setFont(fn1);
	 			g.setColor(Color.cyan);
	 			g.drawString("You lost ", 350, 160);
	 			g.drawString("Your best score is "+game.best, 250, 220);
							}
		}
}
