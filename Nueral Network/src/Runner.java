import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import javax.swing.*;
public class Runner
	{
	static int counter = 0;

		public static void main(String[] args)
			{
			Img image = new Img("test.png");
			Img a0 = new Img("0.png");
			Img a6 = new Img("a6.png");
			printJFrame(a0);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			printJFrame(a6);
			
//			int[][] data = image.findImg("test.png");
			
//			boolean[][] pixels = new boolean[1][1];
//			JFrame frame = new JFrame("My Drawing");
//			Canvas canvas = new Drawing(pixels);
//			canvas.setSize(250, 250);
//			frame.add(canvas);
//			frame.pack();
//			frame.setVisible(true);
			
			
		
			



	

			}
		
		public static void printJFrame(Img image) {
			int[][] data = image.findImg();
			boolean[][] pixels = new boolean[data.length][data[0].length];
			for(int i = 0; i < data.length; i++) {
				for(int j = 0; j < data[i].length; j++) {
					pixels[i][j]= ! (data[i][j] == -1);
				}
			}
			JFrame frame = new JFrame("The JFrame");
			Canvas canvas = new Drawing(pixels);
			canvas.setSize(250, 250);
			frame.add(canvas);
			frame.pack();
			frame.setVisible(true);
			
		}
		
		
		

	}
