package myfirstgame;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

import animations.Animation;
import myclasses.EntityA;
import myclasses.EntityB;

public class Enemy extends GameObject implements EntityB{

 public int k = 0;
	Random r = new Random();
	private int speed = (r.nextInt(3) + 1);
	
	Animation anim;
	
	private Game game;
	private Controller c;
	
	public Enemy(double x,double y,Textures tex,Controller c,Game game) {
		 super(x, y);
		 this.game = game;
		 this.c = c;
		anim = new Animation(5,tex.enemy[0],tex.enemy[1],tex.enemy[2]);
	}
	
	@SuppressWarnings("static-access")
	public void tick() {
		y += speed;
		if (y > (Game.HEIGHT  * Game.SCALE)) {
			speed = (r.nextInt(3) + 1);
			x = r.nextInt(740);
			y = -10;	
			
		}
		if(y > 650)
		{
			game.health -=10;
			y = 0;
			x = r.nextInt(740);
			
		}
	
		for(int i = 0 ; i < game.ea.size(); i++) {
			
			EntityA tempt = game.ea.get(i);
		
			if(Physics.Collision(this,tempt)) {
				c.removeEntity(tempt);
				c.removeEntity(this);
				game.setEnemy_kill(game.getEnemy_kill() + 1);
			}
			
		}
		
		
		anim.runAnimation();
	}
	public void render(Graphics g) {
		
		anim.drawAnimation(g, x, y, 10);
		
	}
	public Rectangle getBounds(){
		return new Rectangle((int)x,(int)y,32,32);
	}
	
	public double getY() {
		return y;
	} 

	public double getX() {
		return x;
	}
}
