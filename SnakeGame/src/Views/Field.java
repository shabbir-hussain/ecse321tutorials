package Views;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyListener;

import javax.swing.JPanel;


public class Field extends JPanel {
	
	public Field(KeyListener kl){
		setBackground(Color.BLACK);
        setPreferredSize(new Dimension(Application.SCREEN_WIDTH, Application.SCREEN_HEIGHT));
        setDoubleBuffered(true);
        setVisible(true);
        this.setFocusable(true);
        this.requestFocus();

        addKeyListener(kl);
	}
	

}
