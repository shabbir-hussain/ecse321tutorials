package Controllers;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.Timer;

import Models.Food;
import Models.Snake;
import Views.Application;
import Views.Field;

/**
 * 
 * @author Shabbir
 * This class glues the model and the view together by updating the model
 * the redrawing the view
 */
public class GameController implements ActionListener {
		
	protected Field mField;
	protected Snake mSnake;
	protected Food mFood;

	private Timer timer;
	Random rand = new Random();
	SnakeKeyAdapter ka = new SnakeKeyAdapter();
	
	public GameController()
	{
		//create Field with paint functin defined in controller
		mField = new Field(ka){
			@Override
			public void paintComponent(Graphics g){
				super.paintComponent(g);
				drawSnake(g);
				drawFood(g);
		        Toolkit.getDefaultToolkit().sync();
			}
		};
		
		mSnake = new Snake();
		mFood = new Food(rand.nextInt(Application.SCREEN_WIDTH),rand.nextInt(Application.SCREEN_HEIGHT));
		timer = new Timer(Application.TIMEOUT,this);
		timer.start();
	}
	
	public void Update(){
		mSnake.Update();
	}
	
	public void Draw(){
		mField.repaint();
	}

	//This method is called everytime the timer times out
	@Override
	public void actionPerformed(ActionEvent arg0) {
		Update();
		Draw();
		
	}
	
	private void drawSnake(Graphics g) {
		g.setColor(mSnake.color);
        g.drawRect(mSnake.xPos, mSnake.yPos, mSnake.sqLength, mSnake.sqHeight);
        
    }
	private void drawFood(Graphics g){
		g.setColor(mFood.color);
		g.drawRect(mFood.xPos, mFood.yPos, mFood.size, mFood.size);
	}

	private class SnakeKeyAdapter extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			int key = e.getKeyCode();
	
	        if ((key == KeyEvent.VK_LEFT) && (!mSnake.hRight)) {
	            mSnake.goLeft();
	        }
	
	        if ((key == KeyEvent.VK_RIGHT) && (!mSnake.hLeft)) {
	            mSnake.goRight();
	        }
	
	        if ((key == KeyEvent.VK_UP) && (!mSnake.hDown)) {
	            mSnake.goUp();
	        }
	
	        if ((key == KeyEvent.VK_DOWN) && (!mSnake.hUp)) {
	            mSnake.goDown();
	        }
		}
	}

	
	
///////////////////GETTERS AND SETTERS//////////////////
	public Field getField(){
		return mField;
	}
	
}
