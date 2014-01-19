/*
 * Class: ITC 115
 * Instructor: Portia Plante
 * Student: Thomas Bonin
 * Program: Assignment 2
 * Date Due: Monday, January 20, 2014
 * 
 * SUMMARY:
 * This program creates the main screen design for a simple video game. The design
 * consists of a series of colored bricks, a ball, and a paddle. To create rows of 
 * bricks that are colored the same for each two rows, the program uses a color array
 * and a nested 'for' loop with an increment multiplier of 0.5 (cast back to an integer).
 * 
 * There is one method for constructing each brick (called makeBrick). This same method
 * is used to construct the paddle as well. Another method is used to make the ball.
 */

import java.awt.Color;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Assignment2 extends GraphicsProgram
{
	// Create constants for all design factors:
	
	private static final int APPLET_WIDTH = 400;
	private static final int APPLET_HEIGHT = 600;
	
	private static final int PADDLE_Y_OFFSET = 30;
	private static final int PADDLE_WIDTH = 60;
	private static final int PADDLE_HEIGHT = 10;
	
	private static final int BRICK_Y_OFFSET = 70;
	private static final int BRICK_ROWS = 10; 
	private static final int BRICK_COLUMNS = 10; 
	private static final int SEPARATION = 4; 
	
	private static final int BRICK_HEIGHT = 8;
	
	// Calculate BRICK_WIDTH so that it fills the space provided:
	
	private static final int BRICK_WIDTH = APPLET_WIDTH/BRICK_COLUMNS-SEPARATION; 
	
	private static final int BALL_RADIUS = 10;
	private static final int BALL_START_X = APPLET_WIDTH/2-BALL_RADIUS;
	private static final int BALL_START_Y = APPLET_HEIGHT/2-BALL_RADIUS;
	
	// Create color array:
	
	Color[]colors = {
			Color.RED,
			Color.ORANGE,
			Color.YELLOW,
			Color.GREEN,
			Color.CYAN,
			};
	
	public void run()
	{
		setSize(APPLET_WIDTH,APPLET_HEIGHT);
		
		// Use a nested for loop to create ten rows with each two rows of one color, one 
		// right after the other:
		
		for (int j = 0; j < BRICK_ROWS; j++)
		{
			Color color = colors[(int)(j*0.5)];
			int xFactor = SEPARATION + BRICK_WIDTH;
			int yFactor =  BRICK_Y_OFFSET + (BRICK_HEIGHT + SEPARATION)*j;
			
			for (int i = 0; i < BRICK_COLUMNS; i++)
					{					
						int xCoord = i * xFactor;
						int yCoord = yFactor;
						makeBrick(xCoord, yCoord, BRICK_WIDTH,BRICK_HEIGHT, color);
					}//end i loop
		}//end j loop
		
		// Use makeBall method to create ball:
		
		makeBall();
		
		// Create variables for paddle coordinates and use makeBrick method to create
		// paddle using paddle variables and constants:
		
			// NOTE: PADDLE_Y_OFFSET is multiplied by two so that it LOOKS exactly like 
			// Portia's printed version. 
		
		int paddleX = APPLET_WIDTH / 2 - PADDLE_WIDTH / 2;
		int paddleY = APPLET_HEIGHT - PADDLE_Y_OFFSET * 2 - PADDLE_HEIGHT;
		
		makeBrick(paddleX, paddleY, PADDLE_WIDTH, PADDLE_HEIGHT, Color.BLACK);
	
	}//end run() method

	public void makeBrick (int xVal, int yVal, int width, int height, Color color)
	{
		// Create GRect object that can be used for all bricks in program:
		
		GRect rect;
		rect = new GRect(xVal, yVal, width, height);
		rect.setColor(Color.BLACK);
		rect.setFillColor(color);
		rect.setFilled(true);
		add(rect);
	}//end makeBrick method
	
	public void makeBall ()
	{
		// Create GOval object that meets specifications for game ball:
		
		GOval oval;
		oval = new GOval(BALL_START_X, BALL_START_Y, BALL_RADIUS*2, BALL_RADIUS*2);
		oval.setFillColor(Color.BLACK);
		oval.setFilled(true);
		add(oval);
	}//end makeBall method
	
}//end class Assignment2


	

