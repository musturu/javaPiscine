package edu.roma42.printer.app;

import edu.roma42.printer.logic.ImageConverter;

import java.io.IOException;

public class Program {


    public static void main(String[] args) {

		char WHITE = 0;
		char BLACK = 1;
		String path = null;

		try {
			WHITE = args[0].charAt(0);
			BLACK = args[1].charAt(0);
			path = args[2];
		} catch (Exception e) {
            System.out.println("Usage: java Main <whiteChar> <blackChar> <imagePath>" + e.getMessage());
            System.exit(1);
		}

        try {
            int[][] intMatrix = ImageConverter.getMatrixFromPath(path);

            for (int i = 0; i < intMatrix.length; i++) {
                for (int j = 0; j < intMatrix[i].length; j++) {
					if (intMatrix[i][j] == 0) {
						System.out.print(WHITE);
					}
					else {
						System.out.print(BLACK);
					}
                }
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println("Error reading the image file: " + e.getMessage());
            System.exit(-1);
        }
    }
}
