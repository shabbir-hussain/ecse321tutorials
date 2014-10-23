package View;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import Controller.GridController;
import Controller.MenuController;

/**
 * 
 * @author Shabbir
 *
 *	This class just wraps around the other panels
 */
public class ContentContainer extends JPanel {
	
	public ContentContainer(){
		this.setLayout(new BorderLayout());
		
		//init Controllers
		GridController gCont = new GridController();
		MenuController mCont = new MenuController(gCont);
		
		//place panels on Panel
		this.add(mCont.getPanel(),BorderLayout.PAGE_START);
		
		add(gCont.getPanel(),BorderLayout.CENTER);
		
		this.setVisible(true);
	}
}
