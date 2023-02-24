// James Dizikes
// CS 1324 Fall 2019
// Maintained by D. Trytten 4/12/2020
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Project11 extends JPanel
{
	// Change these constants to adjust the size and title of the window.
	private static final int WIDTH = 640;
	private static final int HEIGHT = 480;
	private static final String WINDOW_TITLE = "My Image Title!";
	
	// Do not change the main method.
	public static void main(String[] args)
	{
		JPanel panel = new Project11();
		panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		
		JFrame frame = new JFrame(WINDOW_TITLE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(panel);
		frame.pack();
	}
	
	// Add your drawing code to this method.
	public void paintComponent(Graphics g)
	{
		// Do not change these two lines.
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		
		
		// Face of Duolingo (or somewhat close to it)
		
		// Set the background color to cyan 
		Rectangle2D.Double background = new Rectangle2D.Double();
		background.setRect(0, 0, WIDTH, HEIGHT);
		g2d.setColor(Color.CYAN);
		g2d.fill(background);
		g2d.draw(background);
		
		// Left ear through roundrectangle method 
		RoundRectangle2D.Double leftEar = new RoundRectangle2D.Double();
		leftEar.setRoundRect(190, 30, 75, 100, 620 / 2, 470 / 2);
		g2d.setColor(Color.GREEN); 
		g2d.fill(leftEar);
		g2d.draw(leftEar);
		
		// Right ear through roundrectangle method 
		RoundRectangle2D.Double rightEar = new RoundRectangle2D.Double();
		rightEar.setRoundRect(390, 35, 75, 100, 620 / 2, 470 / 2);
		g2d.setColor(Color.GREEN); 
		g2d.fill(rightEar);
		g2d.draw(rightEar);
		
		// Create the face with the Round Rectangle method 
		RoundRectangle2D.Double face = new RoundRectangle2D.Double();
		face.setRoundRect(160, 90, WIDTH / 2, HEIGHT / 2, 170, 200);
		g2d.setColor(Color.GREEN); 
		g2d.fill(face); 
		g2d.draw(face);
		
		// Create the eye with the Round Rectangle method (make it more circular)
		RoundRectangle2D.Double firstEye = new RoundRectangle2D.Double();
		firstEye.setRoundRect(170, 115, 140, 115, 620 / 2, 470 / 2);
		g2d.setColor(Color.YELLOW); 
		g2d.fill(firstEye);
		g2d.draw(firstEye);
		
		// Create the second eye 
		RoundRectangle2D.Double secondEye = new RoundRectangle2D.Double();
		secondEye.setRoundRect(330, 115, 140, 115, 620 / 2, 470 / 2);
		g2d.setColor(Color.YELLOW); 
		g2d.fill(secondEye);
		g2d.draw(secondEye);
		
		// Create the first pupil 
		Ellipse2D.Double firstPupil = new Ellipse2D.Double();
		firstPupil.setFrame(175, 125, WIDTH / 5, HEIGHT / 5);
		g2d.setColor(Color.WHITE);
		g2d.fill(firstPupil);
		g2d.draw(firstPupil);
		
		// Create the second pupil 
		Ellipse2D.Double secondPupil = new Ellipse2D.Double();
		secondPupil.setFrame(335, 125, WIDTH / 5, HEIGHT / 5);
		g2d.setColor(Color.WHITE);
		g2d.fill(secondPupil);
		g2d.draw(secondPupil);
		
		// Create the first eye lens for the pupil
		RoundRectangle2D.Double firstEyeLens = new RoundRectangle2D.Double();
		firstEyeLens.setRoundRect(215, 130, 50, 75, 620 / 2, 470 / 2);
		g2d.setColor(Color.BLACK); 
		g2d.fill(firstEyeLens);
		g2d.draw(firstEyeLens);
		
		// Create the second eye lens for the pupil
		RoundRectangle2D.Double secondEyeLens = new RoundRectangle2D.Double();
		secondEyeLens.setRoundRect(375, 130, 50, 75, 620 / 2, 470 / 2);
		g2d.setColor(Color.BLACK); 
		g2d.fill(secondEyeLens);
		g2d.draw(secondEyeLens);
		
		// Create the lower mouth (this took way too long on the mathy part)
		Arc2D.Double lowerMouth = new Arc2D.Double();
		lowerMouth.setArc(270, 270, WIDTH / 6, HEIGHT / 10, 45, -275, Arc2D.OPEN);
		g2d.setColor(Color.ORANGE);
		g2d.fill(lowerMouth);
		g2d.draw(lowerMouth);
		
		// Create the upper mouth here so that it doesn't overlap the lower mouth 
		Arc2D.Double upperMouth = new Arc2D.Double();
		upperMouth.setArc(257, 240, WIDTH / 5, HEIGHT / 5, 15, 150, Arc2D.PIE);
		g2d.setColor(Color.YELLOW);
		g2d.fill(upperMouth);
		g2d.draw(upperMouth);
		
		
	}
}