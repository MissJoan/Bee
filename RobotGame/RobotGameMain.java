/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jeppjleemoritzled
 */
public class RobotGameMain {
       public static void main(String[] args) {
           
            Robot r = new Robot();
            RobotEater rEat = new RobotEater();
            GameArea gameArea = new GameArea();
            gameArea.setRobot(10,10,r);
            gameArea.setRobotEater(15,15,rEat);
            
            System.out.println("Starting game...");
            gameArea.startGame();
            // When the game stops, the control goes back to the main method
            System.out.println("Game has stopped, thank you for playing...");
            System.out.println("Steps needed : " + gameArea.getTimeElapsed());
            
           /*
           for(int i=1;i<=10000;i*=10)
           {
               System.out.println("Testing distance: "+ i + " ...");
               int currentSteps = testGameSteps(i);
               System.out.println("Result distance " + i + " : "+currentSteps);
           }*/
            
    }
      /* public static int testGameSteps(int distance) throws InterruptedException
       {
            Robot r = new Robot();
            RobotEater rEat = new RobotEater();
            GameArea gameArea = new GameArea();
            gameArea.setRobot(0,0,r);
            gameArea.setRobotEater(distance,distance,rEat);
            
           // System.out.println("Starting game...");
            gameArea.startGame();
            // When the game stops, the control goes back to the main method
           // System.out.println("Game has stopped, thank you for playing...");
            return gameArea.getTimeElapsed();
       }*/
    
}
