package assignment0;

import support.assignment0.RobotMotionAdapter;

public class RobotInstructions  {

	/*
	 * Below you see a method called "act".
	 * It has one parameter, called "support.robot".
	 * For now, the way in which the code below fits into what you see on
	 * the screen will seem mysterious.  That's OK.
	 * 
	 * For now, please accept that the instructions below cause the support.robot to
	 * move forward, turn left, or turn right.
	 */
	public void act(RobotMotionAdapter robot) {
		
		/**
		 * Each of the following lines of code executes in turn.  The
		 * first line causes the support.robot to move forward 60 "pixels".  A pixel is
		 * a measurement of distance on a computer screen.
		 * 
		 * The second line causes the support.robot to turn left.  Based on what you see,
		 * what does "90" represent?
		 * 
		 * Run the program as instructed in the lab write-up and observe how the support.robot
		 * moves in response to the code you see below.
		 * 
		 * You will add instructions at the end of the code to cause the support.robot to move
		 * as you desire.
		 */
        robot.turnLeft(45);

        //left slant to the top
        robot.forward(30);

        //left curve
        for (int i = 0; i < 18; i++) { 
            robot.forward(5);
            robot.turnLeft(30);
        }

        //right curve
        robot.turnRight(180);
        for (int i = 0; i < 18; i++) {
            robot.forward(5);
            robot.turnLeft(10);
        }

        //right slant
        robot.turnRight(45); 
        robot.forward(80);

        robot.turnRight(135);
    }
}