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
	private static final int BALL_START_X = APPLET_WIDTH/2-BALL_RADIUS/2;
	private static final int BALL_START_Y = APPLET_HEIGHT/2-BALL_RADIUS/2;
	
	
	public void run()
	{
		setSize(APPLET_WIDTH,APPLET_HEIGHT);
			
		//initiate structure
			
		//make the first half of the staircase blue using numStairs/2 as the limit
		
		for (int j=0; j < BRICK_ROWS; j++)
		{
			if (j<2)
			{
				for (int i=0; i < BRICK_COLUMNS; i++)
					{
						makeRect(i,j,(SEPARATION + BRICK_WIDTH),BRICK_Y_OFFSET,(BRICK_HEIGHT + SEPARATION),BRICK_WIDTH, BRICK_HEIGHT,0,1,1);
					}
			}
			else if (j<4)
			{
				for (int i=0; i < BRICK_COLUMNS; i++)
					{
						makeRect(i,j,(SEPARATION + BRICK_WIDTH),BRICK_Y_OFFSET,(BRICK_HEIGHT + SEPARATION),BRICK_WIDTH, BRICK_HEIGHT,.892,1,1);
					}
			}
		}//end j for loop
		
		makeOval();
		makeRect(1,1,APPLET_WIDTH/2-PADDLE_WIDTH/2,0,(APPLET_HEIGHT-(PADDLE_Y_OFFSET+PADDLE_HEIGHT)),PADDLE_WIDTH,PADDLE_HEIGHT,0,0,0);
	}//end run() method

	public void makeRect (int x, int y, int a, int f, int c, int d, int e, int h, int s, int b, Color color)
	{
	//x value is 
		GRect rect;
		rect = new GRect(a*x,f+c*y,d,e);
		rect.setColor(Color.BLACK);
		rect.setFillColor(color);
		rect.setFilled(true);
		add(rect);
	}//end makeRect
	
	public void makeOval ()
	{
	//x value is 
		GOval oval;
		oval = new GOval(BALL_START_X,BALL_START_Y,BALL_RADIUS, BALL_RADIUS);
		//rect.setColor(Color.BLACK);
		oval.setFillColor(Color.BLACK);
		oval.setFilled(true);
		add(oval);
	}//end i for loop
}


	

