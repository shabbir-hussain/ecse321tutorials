package View;
/** 
 * The GridPanel class is the view for the grid
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class GridPanel extends JPanel{
	
	public static int mHEIGHT = 510;
	public static int mWIDTH = 580;
	public GridPanel(){
		
		this.setPreferredSize( new Dimension(mWIDTH, mHEIGHT));
		this.setBackground(Color.WHITE);

	}
	


	

}
