import java.awt.Color;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Assignment2 extends GraphicsProgram
{
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
	private static final int BRICK_WIDTH = APPLET_WIDTH/BRICK_COLUMNS-SEPARATION; 
	// Calculated so that it fills the space provided 
	private static final int BALL_RADIUS = 10;
	private static final int BALL_START_X = APPLET_WIDTH/2-BALL_RADIUS;
	private static final int BALL_START_Y = APPLET_HEIGHT/2-BALL_RADIUS;
	
	
	public void run()
	{
		setSize(APPLET_WIDTH,APPLET_HEIGHT);
			
		//initiate structure
			
		//make the first half of the staircase blue using numStairs/2 as the limit
		
		for (int j=0; j < BRICK_ROWS; j++)
		{
			int xCoord = 0;
			int yCoord = 0;
			
			if (j<2)
			{
				
				for (int i=0; i < BRICK_COLUMNS; i++)
					{
						xCoord = i*(SEPARATION + BRICK_WIDTH);
						yCoord = BRICK_Y_OFFSET+(BRICK_HEIGHT + SEPARATION)*j;
						makeBrick(xCoord,yCoord,BRICK_WIDTH,BRICK_HEIGHT,Color.RED);
					}
			}
			else if (j<4)
			{
				for (int i=0; i < BRICK_COLUMNS; i++)
					{
						xCoord = i*(SEPARATION + BRICK_WIDTH);
						yCoord = BRICK_Y_OFFSET+(BRICK_HEIGHT + SEPARATION)*j;	
						makeBrick(xCoord,yCoord,BRICK_WIDTH,BRICK_HEIGHT,Color.BLACK);
					}
			}
		}//end j for loop
		
		makePaddle();
		
		makeBrick(APPLET_WIDTH/2-PADDLE_WIDTH/2,(APPLET_HEIGHT-(PADDLE_Y_OFFSET+PADDLE_HEIGHT)),PADDLE_WIDTH,PADDLE_HEIGHT,Color.BLACK);
	}//end run() method

	public void makeBrick (int xVal, int yVal, int width, int height, Color color)
	{
	//x value is 
		GRect rect;
		rect = new GRect(xVal, yVal, width, height);
		rect.setColor(Color.BLACK);
		rect.setFillColor(color);
		rect.setFilled(true);
		add(rect);
	}//end makeRect
	
	public void makePaddle ()
	{
	//x value is 
		GOval oval;
		oval = new GOval(BALL_START_X,BALL_START_Y,BALL_RADIUS*2, BALL_RADIUS*2);
		//rect.setColor(Color.BLACK);
		oval.setFillColor(Color.BLACK);
		oval.setFilled(true);
		add(oval);
	}//end i for loop
}


	

