package myfirstgame;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseInput implements MouseListener{
	 public static int x = 0;
	 public static int y = 0;
 
	 @Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {

		 int mx = e.getX();
		 int my = e.getY();
		
		 //game start button
		 if(mx > Game.WIDTH / 2 + 120 && mx <= Game.WIDTH / 2 + 290) {
			 if(my > 250 && my <= 300) {
				 Game.state = Game.STATE.GAME;
				 
			 }
		 }
		 if(mx > Game.WIDTH / 2 + 120 && mx <= Game.WIDTH / 2 + 290) {
			 if(my > 350 && my <= 400) {
				Game.state = Game.STATE.SCORE;
			 }
		 }
		 //game exit button
		 if(mx > Game.WIDTH / 2 + 120 && mx <= Game.WIDTH / 2 + 290) {
			 if(my > 450 && my <= 500) {
 
				 System.exit(1);
			 }
		 }
		 
		 
		 if(mx > Game.WIDTH / 2 + 340 && mx <= Game.WIDTH / 2 + 360) {
			 if(my > 300 && my <= 320) {												//klick letter
			x = 1;
				y += 10;
			 
			 }
		 }
		 if(mx > Game.WIDTH / 2 + 370 && mx <= Game.WIDTH / 2 + 390) {
			 if(my > 300 && my <= 320) {												//klick letter
			x = 2;
			y += 10;
			 
			 }
		 }
		 if(mx > Game.WIDTH / 2 + 400 && mx <= Game.WIDTH / 2 + 420) {
			 if(my > 300 && my <= 320) {												//klick letter
			x = 3;
			y += 10;
			 
			 }
		 }
		 if(mx > Game.WIDTH / 2 + 430 && mx <= Game.WIDTH / 2 + 450) {
			 if(my > 300 && my <= 320) {												//klick letter
			x = 4;
			y += 10;
			 
			 }
		 }
		 if(mx > Game.WIDTH / 2 + 460 && mx <= Game.WIDTH / 2 + 480) {
			 if(my > 300 && my <= 320) {												//klick letter
			x = 5;
			y += 10;
			 
			 }
		 }
		 if(mx > Game.WIDTH / 2 + 490 && mx <= Game.WIDTH / 2 + 510) {
			 if(my > 300 && my <= 320) {											//klick letter
			x = 6;
			y += 10;
			 
			 }
		 }
		 if(mx > Game.WIDTH / 2 + 520 && mx <= Game.WIDTH / 2 + 540) {
			 if(my > 300 && my <= 320) {												//klick letter
			x = 7;
			y += 10;
			 
			 }
		 }
		 if(mx > Game.WIDTH / 2 + 550 && mx <= Game.WIDTH / 2 + 570) {
			 if(my > 300 && my <= 320) {												//klick letter
			x = 8;
			y += 10;
			 
			 }
		 }
		 if(mx > Game.WIDTH / 2 + 580 && mx <= Game.WIDTH / 2 + 600) {
			 if(my > 300 && my <= 320) {												//klick letter
			x = 9;
			y += 10;
			 
			 }
		 }
		 if(mx > Game.WIDTH / 2 + 610 && mx <= Game.WIDTH / 2 + 630) {
			 if(my > 300 && my <= 320) {											
			x = 10;
			y += 10;
			 
			 }
		 }
			 ////////////////////////////////////////////////////////////second line
		 if(mx > Game.WIDTH / 2 + 350 && mx <= Game.WIDTH / 2 + 370) {
			 if(my > 330 && my <= 350) {											
			x = 11;
			y += 10;
			 
			 }
		 }
		 if(mx > Game.WIDTH / 2 + 380 && mx <= Game.WIDTH / 2 + 400) {
			 if(my > 330 && my <= 350) {											
			x = 12;
			y += 10;
			 
			 }
		 }
		 if(mx > Game.WIDTH / 2 + 410 && mx <= Game.WIDTH / 2 + 430) {
			 if(my > 330 && my <= 350) {												
			x = 13;
			y += 10;
			 
			 }
		 }
		 if(mx > Game.WIDTH / 2 + 440 && mx <= Game.WIDTH / 2 + 460) {
			 if(my > 330 && my <= 350) {									
			x = 14;
			y += 10;
			 
			 }
		 }
		 if(mx > Game.WIDTH / 2 + 470 && mx <= Game.WIDTH / 2 + 490) {
			 if(my > 330 && my <= 350) {									
			x = 15;
			y += 10;
			 
			 }
		 }
		 if(mx > Game.WIDTH / 2 + 500 && mx <= Game.WIDTH / 2 + 520) {
			 if(my > 330 && my <= 350) {										
			x = 16;
			y += 10;
			 
			 }
		 }
		 if(mx > Game.WIDTH / 2 + 530 && mx <= Game.WIDTH / 2 + 550) {
			 if(my > 330 && my <= 350) {											
			x = 17;
			y += 10;
			 
			 }
		 }
		 if(mx > Game.WIDTH / 2 + 560 && mx <= Game.WIDTH / 2 + 580) {
			 if(my > 330 && my <= 350) {											
			x = 18;
			y += 10;
			 
			 }
		 }
		 if(mx > Game.WIDTH / 2 + 590 && mx <= Game.WIDTH / 2 + 610) {
			 if(my > 330 && my <= 350) {											
			x = 19;
			y += 10;
			 
			 }
		 }
	////////////////////////////////////////////////////////////////////third line	 
		 if(mx > Game.WIDTH / 2 + 380 && mx <= Game.WIDTH / 2 + 400) {
			 if(my > 360 && my <= 380) {											
			x = 20;
			y += 10;
			 
			 }
		 }
		 if(mx > Game.WIDTH / 2 + 410 && mx <= Game.WIDTH / 2 + 430) {
			 if(my > 360 && my <= 380) {											
			x = 21;
			y += 10;
			 
			 }
		 }
		 if(mx > Game.WIDTH / 2 + 440 && mx <= Game.WIDTH / 2 + 460) {
			 if(my > 360 && my <= 380) {												
			x = 22;
			y += 10;
			 
			 }
		 }
		 if(mx > Game.WIDTH / 2 + 470 && mx <= Game.WIDTH / 2 + 490) {
			 if(my > 360 && my <= 380) {													
			x = 23;
			y += 10;
			 
			 }
		 }
		 if(mx > Game.WIDTH / 2 + 500 && mx <= Game.WIDTH / 2 + 520) {
			 if(my > 360 && my <= 380) {											
			x = 24;
			y += 10;
			 
			 }
		 }
		 if(mx > Game.WIDTH / 2 + 530 && mx <= Game.WIDTH / 2 + 550) {
			 if(my > 360 && my <= 380) {											
			x = 25;
			y += 10;
			 
			 }
		 }
		 if(mx > Game.WIDTH / 2 + 560 && mx <= Game.WIDTH / 2 + 580) {
			 if(my > 360 && my <= 380) {											
			x = 26;
			y += 10;
			 
			 }
		 }
		 													////////////////////////////////////okay button
		 
		 if(mx > Game.WIDTH / 2 + 630 && mx <= Game.WIDTH / 2 + 665) {
			 if(my > 400 && my <= 420) {											
			Game.str = Game.str1;
			x = 27;
			 }
		 }
		 														/////////////////////////delete button

		 if(mx > Game.WIDTH / 2 + 630 && mx <= Game.WIDTH / 2 + 675) {
			 if(my > 370 && my <= 390) {											
			x = 28;
			 }
		 }
		 												//////////////////////////////////////Score back menu
		 if(mx >= 10 && mx <= 110) {
			 if(my > 460 && my <= 500) {											
			x = 29;
			 }
		 }
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	

}
