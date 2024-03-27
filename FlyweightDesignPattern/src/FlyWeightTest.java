import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.awt.event.*;

public class FlyWeightTest extends JFrame{

	JButton startDrawing;
	
	int windowWidth = 1750;
	int windowHeigth = 1750;
	
	Color[] shapeColor = {Color.orange,Color.red, Color.yellow,Color.blue, Color.pink, Color.cyan, Color.magenta,
			Color.black, Color.gray};
	
	public static void main(String [] args) {
		
		new FlyWeightTest();
	
	}
	
	public FlyWeightTest() {
		
		this.setSize(this.windowWidth, this.windowHeigth);
		this.setLocationRelativeTo(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setTitle("FlyWeight Test");
		
		JPanel contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());
		
		final JPanel drawingPanel = new JPanel();
		startDrawing = new JButton("Drawing Stuff");
		
		contentPane.add(drawingPanel, BorderLayout.CENTER);
		contentPane.add(startDrawing, BorderLayout.SOUTH);
		
		startDrawing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				Graphics g = drawingPanel.getGraphics();
				
				long startTime = System.currentTimeMillis();
				
				for(int i = 0; i < 100000; i++) {
					
					MyRect rect = RectFactory.getRect(getRandColor());
					rect.draw(g,getRandX(),getRandY(),getRandX(),getRandY());
				}
				
				long endTime = System.currentTimeMillis();
				
				System.out.println("That Took: " + (endTime - startTime));
			}
		});
		
		this.add(contentPane);
		this.setVisible(true);
		
	}
	
	private Color getRandColor() {
		
		Random rand = new Random();
		int randInt = rand.nextInt(this.shapeColor.length);
		
		return shapeColor[randInt];
	}
	
	private int getRandX() {
		
		return (int)(Math.random()*this.windowWidth);
	}
	
	private int getRandY() {
		
		return (int)(Math.random()*this.windowHeigth);
	}
}
