package myfirstgame;

import java.awt.Graphics;
import java.awt.Rectangle;
import animations.Animation;
import myclasses.EntityA;
import myclasses.EntityB;

public class Player extends GameObject implements EntityA{
	
	private double valX = 0;
	private double valY = 0;
	Animation anim ;
	Game game;
	Controller c;
	public Player(double x,double y,Textures tex,Game game,Controller c) {
		super(x, y);
		this.c = c;
		this.game = game;
		anim = new Animation(1,tex.player[0],tex.player[1],tex.player[2]);
	}
	
	public void tick() {
		x += valX;
		y += valY;
		
		if(x <= 0) 
			x = 0;
		if(y <= 0)
			y = 0;
		if(x >= 890)
			x = 890;
		if(y <= 0)
			y = 0;
		if(y >= 680 - 32)
			y = 680 - 32;
			
		for(int i = 0; i < game.eb.size(); i++ ) {
			
		EntityB tempt = game.eb.get(i);
		
		if(Physics.Collision(this,tempt)) {

			c.removeEntity(tempt);
			Game.health -= 30;
			game.setEnemy_kill(game.getEnemy_kill() + 1);
		}
		}
		anim.runAnimation();
	}
	public Rectangle getBounds(){
		return new Rectangle((int)x,(int)y,32,32);
	}
	
	public void render(Graphics g) {
		anim.drawAnimation(g, x, y, 0);
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}
	public void setVelX(double valX) {
		this.valX = valX;
	}
	public void setVelY(double valY) {
		this.valY = valY; 
	}
}

