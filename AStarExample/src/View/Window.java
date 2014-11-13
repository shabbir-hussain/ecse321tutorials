package View;
/**
 * The Window class is the wrapper around the JFrame
 * @author Shabbir
 */
import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class Window extends JFrame {

	public static int WIDTH = 597;
	public static int HEIGHT =600;
	public Window(){
		
		
		ContentContainer c = new ContentContainer();
		this.add(c);
				
		this.pack();
		this.setTitle("A Star Example");
		this.setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

}
