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
		
		for (int j=0; j < BRICK_ROWS; j++)
		{
			int xCoord = 0;
			int yCoord = 0;
			Color color = colors[(int)(j*0.5)];
			int xFactor = SEPARATION + BRICK_WIDTH;
			int yFactor =  BRICK_Y_OFFSET+(BRICK_HEIGHT + SEPARATION)*j;
			
			{
			for (int i=0; i < BRICK_COLUMNS; i++)
					{					
						xCoord = i*xFactor;
						yCoord = yFactor;
						makeBrick(xCoord,yCoord,BRICK_WIDTH,BRICK_HEIGHT,color);
					} // end i loop
			} 
		} //end j loop
		
		makeBall();
		
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
	
	public void makeBall ()
	{
	//x value is 
		GOval oval;
		oval = new GOval(BALL_START_X,BALL_START_Y,BALL_RADIUS*2, BALL_RADIUS*2);
		oval.setFillColor(Color.BLACK);
		oval.setFilled(true);
		add(oval);
	}//end i for loop
}


	

