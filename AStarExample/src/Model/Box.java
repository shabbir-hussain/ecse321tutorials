package Model;

import java.awt.Color;

/**
 * 
 * @author Shabbir
 *
 *	This class defines each cell in the grid
 */
public class Box {
	public int x;
	public int y;
	private boolean filled= false;
	public static int size = 10;
	
	public Box(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	public void flip(){
		if(isFilled())
			setFilled(false);
		else
			setFilled(true);
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public boolean equals(Box b){
		if(this.x == b.x && this.y == b.y)
			return true;
		return false;
	}
}
