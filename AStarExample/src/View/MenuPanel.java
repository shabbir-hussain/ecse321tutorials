package View;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/** 
 * 
 * @author Shabbir
 *	
 * This class is the view for the menu
 */
public class MenuPanel extends JPanel {
	
	//buttons
	protected JButton bReset = new JButton("Reset");
	protected JButton bSearch = new JButton("Search");
	
	protected JLabel lStartX = new JLabel("StartX");
	protected JLabel lStartY = new JLabel("StartY");
	protected JLabel lEndX = new JLabel("EndX");
	protected JLabel lEndY = new JLabel("EndY");
	
	protected JTextField tStartX = new JTextField("0");
	protected JTextField tStartY = new JTextField("0");
	protected JTextField tEndX = new JTextField("10");
	protected JTextField tEndY = new JTextField("0");
	
	
	public static int mHEIGHT = 50;
	public static int mWIDTH = 600;
	public MenuPanel(){
		this.setPreferredSize(new Dimension(mWIDTH, mHEIGHT));
		this.setBackground(Color.LIGHT_GRAY);
		
		int inputW = 30;
		int inputH = 20;
		tStartX.setPreferredSize(new Dimension(inputW,inputH));
		tStartY.setPreferredSize(new Dimension(inputW,inputH));
		tEndX.setPreferredSize(new Dimension(inputW,inputH));
		tEndY.setPreferredSize(new Dimension(inputW,inputH));
		
		add(bReset);
		add(bSearch);
		add(lStartX);
		add(tStartX);
		add(lStartY);
		add(tStartY);
		add(lEndX);
		add(tEndX);
		add(lEndY);
		add(tEndY);
		
	}
	
	
}
