package myfirstgame;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.LinkedList;
import javax.swing.JFrame;
import myclasses.EntityA;
import myclasses.EntityB;

public class Game extends Canvas implements Runnable {
	private boolean solo = true;
	private int non = 0;
	public static String str1 ="";
	public static String str = "";
	private static final long serialVersionUID = 1L;
	public static final int WIDTH = 460;
	public static final int HEIGHT = WIDTH / 12 * 9;
	public static final int SCALE = 2;
	public final String TITLE = "Star Battle";
	
	private boolean running = false;
	private Thread thread;
	
	private BufferedImage image = new BufferedImage(WIDTH,HEIGHT,BufferedImage.TYPE_INT_RGB);
	private BufferedImage spriteSheet = null;
	private BufferedImage space = null;	
	private BufferedImage menuim = null;
	private BufferedImage score = null; 
	
	private int enemy_count = 5;
	private int enemy_kill = 0;
	
	public int getEnemy_count() {
		return enemy_count;
	}
	public void setEnemy_count(int enemy_count) {
		this.enemy_count = enemy_count;
	}
	public int getEnemy_kill() {
		return enemy_kill;
	}
	public void setEnemy_kill(int enemy_kill) {
		this.enemy_kill = enemy_kill;
	}


	private Player p;
	private Controller c;
	private boolean is_shooting = false;
	private Textures tex;
	private Menu menu;
	private Keyboard key;
	private Score scr;
	
	private MySQL mysql;
	private GetSQL getsql;
	
	public LinkedList<EntityA> ea;
	public LinkedList<EntityB> eb;
 
	
	
	public static int health = 95;				//health
	public static int lvl = 1;
	public static String strlvl ="1";
	public static int best = 0;
	
	public static enum STATE{
		MENU,
		GAME,
		SCORE
	};
	
	public static STATE state = STATE.MENU;
	
	private void init() {
		
		requestFocus();
		BufferedImageLoader loader = new BufferedImageLoader();
		try {
			spriteSheet = loader.LoadImage("/shiperan.png");
			space = loader.LoadImage("/qqq.png");
			menuim = loader.LoadImage("/tttt.png");
			score = loader.LoadImage("/Score.png");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		addKeyListener(new KeyInput(this));
		
		tex = new Textures(this);
		
		c = new Controller(tex,this);
		
		p = new Player(400,400,tex,this,c);
		
		menu = new Menu();
		key = new Keyboard();
		scr = new Score();
		mysql = new MySQL();
		getsql = new GetSQL();
		
		ea = c.getEntityA();
		eb = c.getEntityB();
		
		this.addMouseListener(new MouseInput());
		
		c.createEnemy(enemy_count);
		 
		
	}
	private synchronized void start() {
		if(running)
			return;
		running = true;
		thread = new Thread(this);
		thread.start();
	}
	
	public synchronized void stop() {
		if(!running)
			return;
	
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			 
			e.printStackTrace();
		}
		System.exit(1);
		
	}
	
	
 					 
	
	public void run() {
		
		
		init();
		long LastTime = System.nanoTime();
		final double amountOfTicks = 60.0;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		int updates = 0;
		int frames = 0;
		long timer = System.currentTimeMillis();
		
		
		
		while(running) {
		
			long now = System.nanoTime();
			delta += (now - LastTime) / ns;
			LastTime = now;
			if(delta >= 1) {
				tick();
				updates++;
				delta--;
			}
			
			render();
			frames++;
			
			if(System.currentTimeMillis() - timer > 1000) {
				timer += 1000;
				System.out.println(updates + "Ticks | FPS "+ frames);
				updates = 0;
				frames = 0;
			}
			
		}
		
		stop();
	}
	
	
	
	public int kill = 0;
	private void tick() {
		
		if(state == STATE.GAME) {		
			p.tick();
			c.tick();
		}
	 if(enemy_kill == 0)
		 kill = 0;
		if(enemy_kill != kill)
		{													//boom sound
			Sound.sound3.play();
			kill++;
			if(health <= 0) {
				enemy_kill = 0;
				kill = 0;
			}
		}
		if(enemy_kill >= enemy_count) {
			
			health = 95;
			enemy_count += 2;
			enemy_kill = 0;
			lvl++;
			if(best < lvl ) {
				best = lvl;
			}
			c.createEnemy(enemy_count); 
		 strlvl = Integer.toString(lvl);
		 
		}
															//state try again
	}
	


	private void render() {
		
		
		BufferStrategy bs = this.getBufferStrategy();
		
		if(bs == null) {
			createBufferStrategy(3);
			return;
		}
		Graphics g =bs.getDrawGraphics();
		
		g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
		
		g.drawImage(space,0, 0, null);
		Font fn1 = new Font("arial",Font.BOLD,20);
	 	g.setFont(fn1);
		//if(MouseInput.x == 1 && Game.str1.length() > 0) 
	 	g.setColor(Color.cyan);
			g.drawString("NickName "+str,10,20);
		
/////////////////////////////////////////////////////
		
			if(MouseInput.x == 29) {
				state = STATE.MENU;
				MouseInput.x = 0;
			}
			
			
			
			if(health <= 0)
		{getsql.render();
			mysql.render();	
			
			kill = 0;
			lvl = 1;
			strlvl = "1";
		health = 95;
		state = STATE.MENU;														//Try Again
		
		addKeyListener(new KeyInput(this));
		
		tex = new Textures(this);
		
		c = new Controller(tex,this);
		
		p = new Player(400,400,tex,this,c);
		
		menu = new Menu();
		
		ea = c.getEntityA();
		eb = c.getEntityB();
		
		this.addMouseListener(new MouseInput());
		
		
		enemy_count = 5;
		enemy_kill = 0;
		c.createEnemy(enemy_count);
		
		Sound.sound1.play();
		
		}
/////////////////////////////////////////////////////		
	if(state == STATE.SCORE)
		{
		getsql.render();
		g.drawImage(score,0, 0, null);
		scr.render(g);
		}
/////////////////////////////////////////////////////		
		
		if(state == STATE.GAME) {
			
			g.drawImage(menuim,0, 0, null);
			
			p.render(g);
			c.render(g);
			
			Font  fnn = new Font("arial", Font.BOLD, 30);
		 	g.setFont(fnn);
		 	g.setColor(Color.blue); 								//level count draw
		 	g.drawString("LEVEL "+strlvl, 770,30);
			
			g.setColor(Color.gray);
			g.fillRect(5, 5, 95, 30);
			
			g.setColor(Color.GREEN);
			g.fillRect(5, 5, health , 30);  				//Health colors
			
			g.setColor(Color.white);
			g.drawRect(5, 5, 95, 30);

		}else if(state == STATE.MENU) {
 													//menu
			menu.render(g);
			
			if(solo == true)
			{
				key.render(g);
												//Keyboard show
			}
		}
		g.dispose();
		bs.show();
		if(MouseInput.x == 27) 
		{
			solo = false;
			MouseInput.x = 0;		
		}		
	}
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if(state == STATE.GAME) {		
			
		if(key == KeyEvent.VK_SPACE && !is_shooting) {
			Sound.sound2.play();
			is_shooting = true;																
			c.addEntity(new Bullet(p.getX(),p.getY(),tex,this));
		}else if(key == KeyEvent.VK_RIGHT) {
			p.setVelX(5);
		}else if(key == KeyEvent.VK_LEFT) {													//key pressed  
			p.setVelX(-5);
		}else if(key == KeyEvent.VK_DOWN) {
			p.setVelY(5);
		}else if(key == KeyEvent.VK_UP) {
			p.setVelY(-5);
		}
		
		} 	
		if(key == KeyEvent.VK_Q)
			MouseInput.x = 1;
		if(key == KeyEvent.VK_W)
			MouseInput.x = 2;
		if(key == KeyEvent.VK_E)
			MouseInput.x = 3;
		if(key == KeyEvent.VK_R)
			MouseInput.x = 4;
		if(key == KeyEvent.VK_T)
			MouseInput.x = 5;
		if(key == KeyEvent.VK_Y)
			MouseInput.x = 6;
		if(key == KeyEvent.VK_U)
			MouseInput.x = 7;
		if(key == KeyEvent.VK_I)
			MouseInput.x = 8;
		if(key == KeyEvent.VK_O)
			MouseInput.x = 9;
		if(key == KeyEvent.VK_P)
			MouseInput.x = 10;
		if(key == KeyEvent.VK_A)
			MouseInput.x = 11;
		if(key == KeyEvent.VK_S)
			MouseInput.x = 12;
		if(key == KeyEvent.VK_D)
			MouseInput.x = 13;
		if(key == KeyEvent.VK_F)
			MouseInput.x = 14;
		if(key == KeyEvent.VK_G)
			MouseInput.x = 15;
		if(key == KeyEvent.VK_H)
			MouseInput.x = 16;
		if(key == KeyEvent.VK_J)
			MouseInput.x = 17;
		if(key == KeyEvent.VK_K)
			MouseInput.x = 18;
		if(key == KeyEvent.VK_L)
			MouseInput.x = 19;
		if(key == KeyEvent.VK_Z)
			MouseInput.x = 20;
		if(key == KeyEvent.VK_X)
			MouseInput.x = 21;
		if(key == KeyEvent.VK_C)
			MouseInput.x = 22;
		if(key == KeyEvent.VK_V)
			MouseInput.x = 23;
		if(key == KeyEvent.VK_B)
			MouseInput.x = 24;
		if(key == KeyEvent.VK_N)
			MouseInput.x = 25;
		if(key == KeyEvent.VK_M)
			MouseInput.x = 26;
	}
	TextField text = new TextField();
	public void keyReleased(KeyEvent e) {
	int key = e.getKeyCode();
		
		if(key == KeyEvent.VK_RIGHT) {
			p.setVelX(0);
		}else if(key == KeyEvent.VK_LEFT) {
			p.setVelX(0);
		}else if(key == KeyEvent.VK_DOWN) {
			p.setVelY(0);
		}else if(key == KeyEvent.VK_UP) {
			p.setVelY(0);
		}else if(key == KeyEvent.VK_SPACE) {
			is_shooting = false;
		}
	}
	
	public BufferedImage getSpriteSheet() {
		return spriteSheet;
	}
	
	public static void main(String args[]) {
	Game game = new Game();

		game.setPreferredSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
		game.setMaximumSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
		game.setMinimumSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));	
		JFrame frame = new JFrame(game.TITLE);
		frame.add(game);	
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		game.start();
		
	}	
}
	 

