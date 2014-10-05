package Models;

import java.awt.Color;

public class Food {

	public int xPos;
	public int yPos;
	
	public int size;
	
	public Color color;
	
	public Food(int x, int y){
		xPos = x;
		yPos = y;
		size = 10;
		
		color = Color.WHITE;
	}
}
