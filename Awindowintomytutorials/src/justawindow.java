import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class justawindow  extends JFrame{

	public  static void main (String[] args){
		justawindow w = new justawindow();
	}
	
	//JPanel
	JPanel pnl = new JPanel();
	//Buttons
	JButton btn = new JButton("Press me");
	
	//jlabel
	JLabel myLabel = new JLabel("Hello World");
		
	public justawindow(){
		
		myLabel.setVisible(false);
	
		
		btn.addActionListener(new ActionListener() {
			 
            public void actionPerformed(ActionEvent e)
            {
                //Execute when button is pressedmy
            	myLabel.setVisible(true);
       
            }
        }); 
		
		pnl.add(btn);
		pnl.add(myLabel);
		this.add(pnl);
		
		setSize(400,500);
		setTitle("Look a window");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
