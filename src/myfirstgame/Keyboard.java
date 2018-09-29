package myfirstgame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Keyboard {
	
	private int index = 1;
	public static boolean keyboard = false;
	public void render(Graphics g) {
		///////////////////////////////////////////// 
		Font f = new Font("arial", Font.BOLD, 20);
		g.setFont(f);
		g.setColor(Color.CYAN);
//////////////////////////////////////first line
		g.drawRect(570, 300, 20, 20);
		g.drawString("Q",572,318);
		g.drawRect(600, 300, 20, 20);
		g.drawString("W",600,318);
		g.drawRect(630, 300, 20, 20);
		g.drawString("E",633,318);
		g.drawRect(660, 300, 20, 20);
		g.drawString("R",663,318);
		g.drawRect(690, 300, 20, 20);
		g.drawString("T",693,318);
		g.drawRect(720, 300, 20, 20);
		g.drawString("Y",723,318);
		g.drawRect(750, 300, 20, 20);
		g.drawString("U",753,318);
		g.drawRect(780, 300, 20, 20);
		g.drawString("I",783,318);
		g.drawRect(810, 300, 20, 20);
		g.drawString("O",813,318);
		g.drawRect(840, 300, 20, 20);
		g.drawString("P",843,318);
		//////////////////////////////////					//delete
		g.drawRect(860, 370, 45, 20);
		g.drawString("DEL",863,388);
//////////////////////////////////////second line
		g.drawRect(580, 330, 20, 20);
		g.drawString("A",585,348);
		g.drawRect(610, 330, 20, 20);
		g.drawString("S",615,348);
		g.drawRect(640, 330, 20, 20);
		g.drawString("D",645,348);
		g.drawRect(670, 330, 20, 20);
		g.drawString("F",675,348);
		g.drawRect(700, 330, 20, 20);
		g.drawString("G",703,348);
		g.drawRect(730, 330, 20, 20);
		g.drawString("H",735,348);
		g.drawRect(760, 330, 20, 20);
		g.drawString("J",765,348);
		g.drawRect(790, 330, 20, 20);
		g.drawString("K",795,348);
		g.drawRect(820, 330, 20, 20);
		g.drawString("L",825,348);
/////////////////////////////////////////third line		
		g.drawRect(610, 360, 20, 20);
		g.drawString("Z",615,378);
		g.drawRect(640,360, 20, 20);
		g.drawString("X",645,378);
		g.drawRect(670, 360, 20, 20);
		g.drawString("C",675,378);
		g.drawRect(700, 360, 20, 20);
		g.drawString("V",705,378);
		g.drawRect(730, 360, 20, 20);
		g.drawString("B",735,378);
		g.drawRect(760, 360, 20, 20);
		g.drawString("N",765,378);
		g.drawRect(790, 360, 20, 20);
		g.drawString("M",792,378);
		
		if(MouseInput.x == 1)  { 
			Game.str1 += "Q";
			MouseInput.x = 0;
		}
		if(MouseInput.x == 2) {
			Game.str1 += "W";
			MouseInput.x = 0;
			}
		if(MouseInput.x == 3) {
			Game.str1 += "E";
			MouseInput.x = 0;
			}
		if(MouseInput.x == 4) {
			Game.str1 += "R";
			MouseInput.x = 0;
			}
		if(MouseInput.x == 5) {
			Game.str1 += "T";
			MouseInput.x = 0;
			}
		if(MouseInput.x == 6) {
			Game.str1 += "Y";
			MouseInput.x = 0;
			}
		if(MouseInput.x == 7) {
			Game.str1 += "U";
			MouseInput.x = 0;
			}
		if(MouseInput.x == 8) {
			Game.str1 += "I";
			MouseInput.x = 0;
			}
		if(MouseInput.x == 9) {
			Game.str1 += "O";
			MouseInput.x = 0;
			}
		if(MouseInput.x == 10) {
			Game.str1 += "P";
			MouseInput.x = 0;
			}
//////////////////////////////////////////second line
		if(MouseInput.x == 11) {
			Game.str1 += "A";
			MouseInput.x = 0;
			}
		if(MouseInput.x == 12) {
			Game.str1 += "S";
			MouseInput.x = 0;
			}
		if(MouseInput.x == 13) {
			Game.str1 += "D";
			MouseInput.x = 0;
			}
		if(MouseInput.x == 14) {
			Game.str1 += "F";
			MouseInput.x = 0;
			}
		if(MouseInput.x == 15) {
			Game.str1 += "G";
			MouseInput.x = 0;
			}
		if(MouseInput.x == 16) {
			Game.str1 += "H";
			MouseInput.x = 0;
			}
		if(MouseInput.x == 17) {
			Game.str1 += "J";
			MouseInput.x = 0;
			}
		if(MouseInput.x == 18) {
			Game.str1 += "K";
			MouseInput.x = 0;
			}
		if(MouseInput.x == 19) {
			Game.str1 += "L";
			MouseInput.x = 0;
			}
	/////////////////////////////third	
		if(MouseInput.x == 20) {
			Game.str1 += "Z";
			MouseInput.x = 0;
			}
		if(MouseInput.x == 21) {
			Game.str1 += "X";
			MouseInput.x = 0;
			}
		if(MouseInput.x == 22) {
			Game.str1 += "C";
			MouseInput.x = 0;
			}
		if(MouseInput.x == 23) {
			Game.str1 += "V";
			MouseInput.x = 0;
			}
		if(MouseInput.x == 24) {
			Game.str1 += "B";
			MouseInput.x = 0;
			}
		if(MouseInput.x == 25) {
			Game.str1 += "N";
			MouseInput.x = 0;
			}
		if(MouseInput.x == 26) {
			Game.str1 += "M";
			MouseInput.x = 0;
			}
			g.drawString("Player name  "+Game.str1,553,418);
			
			if(Game.str1.length() > 9)
				Game.str1 = "";
			if(Game.str1.length() > 0 && MouseInput.x == 28)
			{
				
				Game.str1 = Game.str1.substring(0,Game.str1.length() - index);

				MouseInput.x = 0;
			}
			g.drawRect(860, 400, 35, 20);
			g.drawString("OK",863,418);

			
	}
}
