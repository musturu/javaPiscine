package edu.roma42.printer.logic;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.*;


public class ImageConverter {

	static public int[][] getMatrixFromPath(String BMPFileName) throws IOException {
		File file = new File(BMPFileName);
		BufferedImage image = ImageIO.read(file);
		int[][] array2D = new int[image.getHeight()][image.getWidth()];
    	
		for (int xPixel = 0; xPixel < image.getHeight(); xPixel++) {
        	
			for (int yPixel = 0; yPixel < image.getWidth(); yPixel++) {
            	
				int color = image.getRGB(yPixel, xPixel);
				if (color==Color.BLACK.getRGB()) {
					 array2D[xPixel][yPixel] = 1;
				} else {
					 array2D[xPixel][yPixel] = 0;
				}
			}
		}
		return (array2D);
	}
}
