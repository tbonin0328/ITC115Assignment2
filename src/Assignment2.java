import acm.graphics.*;
import acm.program.*;
import java.awt.*;

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
	private static final int BRICK_WIDTH = 10; //1, 2
	// Calculated so that it fills the space provided 
	//private static final int BALL_START_X = Center of Screen;
	//private static final int BALL_START_Y = Center of Screen;
	private static final int BALL_RADIUS = 10;
	
	public void run()
	{
		setSize(APPLET_WIDTH,APPLET_HEIGHT);
			
		//initiate structure
			
		//make the first half of the staircase blue using numStairs/2 as the limit
		for (int j=0; j < BRICK_ROWS; j++)
			if (j<2)
			{
			GRect rect = null;
			makeRect(j);
			add(rect);
			}
			else if (j<4)
			{
			for (int i=0; i < BRICK_COLUMNS; i++)
				{
					//x value is 
					GRect rect;
					rect = new GRect((SEPARATION + BRICK_WIDTH)*i,BRICK_Y_OFFSET + (BRICK_HEIGHT + SEPARATION)*j,BRICK_WIDTH, BRICK_HEIGHT);
					rect.setColor(Color.BLACK);
					rect.setFillColor(Color.ORANGE);
					rect.setFilled(true);
					add(rect);
				}//end i for loop
			}
			else if (j<6)
			{
			for (int i=0; i < BRICK_COLUMNS; i++)
				{
					//x value is 
					GRect rect;
					rect = new GRect((SEPARATION + BRICK_WIDTH)*i,BRICK_Y_OFFSET + (BRICK_HEIGHT + SEPARATION)*j,BRICK_WIDTH, BRICK_HEIGHT);
					rect.setColor(Color.BLACK);
					rect.setFillColor(Color.YELLOW);
					rect.setFilled(true);
					add(rect);
				}//end i for loop
			}
			else if (j<8)
			{
			for (int i=0; i < BRICK_COLUMNS; i++)
				{
					//x value is 
					GRect rect;
					rect = new GRect((SEPARATION + BRICK_WIDTH)*i,BRICK_Y_OFFSET + (BRICK_HEIGHT + SEPARATION)*j,BRICK_WIDTH, BRICK_HEIGHT);
					rect.setColor(Color.BLACK);
					rect.setFillColor(Color.GREEN);
					rect.setFilled(true);
					add(rect);
				}//end i for loop
			}
			else if (j<10)
			{
			for (int i=0; i < BRICK_COLUMNS; i++)
				{
					//x value is 
					GRect rect;
					rect = new GRect((SEPARATION + BRICK_WIDTH)*i,BRICK_Y_OFFSET + (BRICK_HEIGHT + SEPARATION)*j,BRICK_WIDTH, BRICK_HEIGHT);
					rect.setColor(Color.BLACK);
					rect.setFillColor(Color.CYAN);
					rect.setFilled(true);
					add(rect);
				}//end i for loop
			}
			}//end run() method

	public static void makeRect (int x)
	{
	for (int i=0; i < BRICK_COLUMNS; i++)
	{
		//x value is 
		GRect rect;
		rect = new GRect((SEPARATION + BRICK_WIDTH)*i,BRICK_Y_OFFSET + (BRICK_HEIGHT + SEPARATION)*x,BRICK_WIDTH, BRICK_HEIGHT);
		rect.setColor(Color.BLACK);
		rect.setFillColor(Color.RED);
		rect.setFilled(true);
	}//end i for loop
}
}
	

