package myfirstgame;

import java.awt.Graphics;
import java.awt.Rectangle;
import animations.Animation;
import myclasses.EntityA;

public class Bullet extends GameObject implements EntityA  {
 
	Animation anim;
	
	public Bullet(double x,double y,Textures tex,Game game) {
		super(x,y);
		anim = new Animation(5,tex.missile[0],tex.missile[1],tex.missile[0]);
	}
	
	public void tick() {
		y -= 10;
		
		
		anim.runAnimation();
	}
	public Rectangle getBounds(){
		return new Rectangle((int)x,(int)y+30,32,32);
	}
	
	public void render(Graphics g ) {
		anim.drawAnimation(g, x, y+30, 0);
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
}
