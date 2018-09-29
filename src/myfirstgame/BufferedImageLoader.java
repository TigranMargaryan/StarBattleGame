package myfirstgame;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class BufferedImageLoader {

	private BufferedImage image;
	
	public BufferedImage LoadImage(String path) throws IOException {
		
		image = ImageIO.read(this.getClass().getResource(path));
		return image;
	}
}
