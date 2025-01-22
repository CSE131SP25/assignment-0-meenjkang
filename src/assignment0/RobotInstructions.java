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
        robot.turnLeft(45); // Begin the left side

        // Draw the left slant to the top
        robot.forward(30); // Move toward the tip of the left curve

        // Draw the left curve (half-circle approximation)
        for (int i = 0; i < 18; i++) { // More steps for a smoother curve
            robot.forward(5); // Move forward a small step
            robot.turnLeft(30); // Turn slightly to form the curve
        }

        // Draw the right curve (half-circle approximation)
        robot.turnRight(180); // Reorient to start the second curve
        for (int i = 0; i < 18; i++) {
            robot.forward(5);
            robot.turnLeft(10);
        }

        // Draw the right slant back to the point
        robot.turnRight(45); // Align for the straight edge
        robot.forward(80); // Return to the base

        // Reorient to the original direction
        robot.turnRight(135);
    }
}