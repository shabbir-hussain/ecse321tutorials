package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.MenuPanel;

/**
 * 
 * @author Shabbir
 *	This class controls the menu
 */
public class MenuController extends MenuPanel {

	GridController gCont;
	
	public MenuController(GridController gC){
		 super();
		 gCont = gC;
		 
		 gCont.setStart(0, 0);
		 gCont.setEnd(10, 0);
		 
		 //wire action listeners
		 bReset.addActionListener(new ResetButtonAL());
		 bSearch.addActionListener(new SearchButtonAL());
		 tStartX.addActionListener(new TextFieldAL());
		 tStartY.addActionListener(new TextFieldAL());
		 tEndX.addActionListener(new TextFieldAL());
		 tEndY.addActionListener(new TextFieldAL());
		 
		 
	}
	
	public MenuPanel getPanel(){
		return this;
	}
	
	//what happens when reset is clicked
	class ResetButtonAL implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			gCont.ResetPath();	
		}
	}
	//what happens when search button is cliecked
	class SearchButtonAL implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			gCont.SearchForPath();			
		}
	}
	//what happens when any text ffield is changed
	class TextFieldAL implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			try{
				int sX = Integer.parseInt(tStartX.getText());
				int sY = Integer.parseInt(tStartY.getText());
				int eX = Integer.parseInt(tEndX.getText());
				int eY = Integer.parseInt(tEndY.getText());
				
				gCont.setStart(sX, sY);
				gCont.setEnd(eX,eY);
				
				//show results
				gCont.repaint();
				
			}
			catch(Exception ex){
				//ignore errors
			}
			
		}
		
	}
	
	
}
