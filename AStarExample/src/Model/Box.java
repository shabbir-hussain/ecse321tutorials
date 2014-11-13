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
	
	/**
	 * Changes a filled cell to empty and vice versa
	 */
	public void flip(){
		if(isFilled())
			setFilled(false);
		else
			setFilled(true);
	}

	/**
	 * 
	 * @return Returns true if the box is filled
	 */
	public boolean isFilled() {
		return filled;
	}

	/**
	 * Sets the box to fill
	 * @param filled is the filled glag
	 */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	/**
	 * Checks if the one box is at the same location as another box
	 * @param b box to check against
	 * @return true if both boxes are in the same location
	 */
	public boolean equals(Box b){
		if(this.x == b.x && this.y == b.y)
			return true;
		return false;
	}
}
