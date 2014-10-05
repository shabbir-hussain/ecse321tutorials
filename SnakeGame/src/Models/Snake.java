package Models;

import java.awt.Color;

import Views.Application;

/**
 * 
 * @author Shabbir
 * This Class models the snake in the snake game
 */
public class Snake {
	
	//position and velocity
	public int xPos;
	public int yPos;
	public int sVelocity;
	
	//height and width of sqares
	public int sqHeight;
	public int sqLength;
	
	//lenght of body
	public int bodyLength;
	
	//heading direction
	public boolean hRight;
	public boolean hLeft;
	public boolean hUp;
	public boolean hDown;
	
	public Color color;
	
	public Snake(){
		//position and velocity
		xPos =100;
		yPos =100;
		sVelocity = 2;
		
		//height and width of sqares
		sqHeight=10;
		sqLength=10;
		
		//lenght of body
		bodyLength=3;
		
		//heading direction
		hRight=true;
		hLeft=false;
		hUp=false;
		hDown=false;
		
		color = Color.GREEN;
	}
	
	//set heading direction
	public void goRight(){
		hRight=true;
		hLeft=false;
		hUp=false;
		hDown=false;
	}
	public void goLeft(){
		hRight=false;
		hLeft=true;
		hUp=false;
		hDown=false;
	}
	public void goUp(){
		hRight=false;
		hLeft=false;
		hUp=true;
		hDown=false;
	}
	public void goDown(){
		hRight=false;
		hLeft=false;
		hUp=false;
		hDown=true;
	}
	
	public void Update(){

		//move the snake
		if(hRight){
			xPos += sVelocity;
		}else if(hLeft){
			xPos -= sVelocity;
		}else if(hUp){
			yPos -= sVelocity;
		}else if(hDown){
			yPos += sVelocity;
		}
		
		
	}
	
	//Check if snake hit a wall
	public boolean isBordered(){
		if(xPos + sqLength > Application.SCREEN_WIDTH || xPos< 0){
			return true;
		}
		if(yPos + sqHeight > Application.SCREEN_HEIGHT || yPos < 0){
			return true;
		}
		
		return false;
	}
	
	
}
