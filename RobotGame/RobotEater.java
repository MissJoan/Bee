
import java.util.Random;

public class RobotEater extends GameObject {
        private int lastDistance = Integer.MAX_VALUE;
        Random rand = new Random();
 
        public void move(int steps)
        {
            int currentDistance = getGameArea().calculateDistance(this, getGameArea().getRobot());
            if(currentDistance<lastDistance)
                super.move(steps);
            else
            {
                turn(rand.nextInt(4));
                super.move(steps);
            }
            System.out.println("(" + getX() + "," + getY() + ")"+ " RobotEater moved, Distance: " + currentDistance);
            lastDistance=currentDistance;
            
            if (getGameArea().doesCollide(this, getGameArea().getRobot()))
            {
                eatRobot(getGameArea().getRobot());
            }
        }

	public void eatRobot(Robot aRobot) {
            aRobot.die();
	}
}