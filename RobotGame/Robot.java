
import java.util.Random;

public class Robot extends GameObject {
    
        Random rand = new Random();
 
        public void move(int steps)
        {
            turn(rand.nextInt(4));
            super.move(steps);
            int alternator = rand.nextInt(10);
            if(alternator == 0)
                say("I will win this");
            else if (alternator==1)
                say("He will never catch me!");
            else if (alternator==2)
                say("I am a non-edible robot, please leave me be!");
            
            System.out.println("(" + getX() + "," + getY() + ")"+ "Robot moved");
        }
        
	public void say(String whatToSay) {
            System.out.println("Robot says: " + whatToSay);
	}
        
        public void die()
        {
            say("ARRRGH, i'm dying! Someone is eating me!");
            getGameArea().removeRobot(this);
        }
}