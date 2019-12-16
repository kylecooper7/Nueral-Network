import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.*;
public class Drawing extends Canvas
	{
		protected boolean[][] pixeys;
		public Drawing(boolean[][] pixels) {
			pixeys = pixels;
		}
		
		public void paint(Graphics g) {
			for(int i = 0; i < pixeys.length; i++) {
				for(int j = 0; j < pixeys[i].length; j++) {
					if(pixeys[i][j]) {
						g.fillRect(10 * j,10 * i, 10, 10);
						//jakjasjbd
						
					}
				}
			}
				
			
			
		}

	}
