public class GameArea {
	private Robot robot; // single robot
	private RobotEater robotEater; // Single robot eater
	private int timeElapsed; // Amount of time gone since game started
        private boolean gameIsRunning = true; // Game stops if this is false

        public int getTimeElapsed() {
            return timeElapsed;
        }
        
        public void removeRobot(Robot r) // Removes the robot from the game
        {
            robot = null;
        }
        
        public Robot getRobot() {
            return robot;
        }

        public RobotEater getRobotEater() {
            return robotEater;
        }

	public void stopGame() {
		gameIsRunning = false;
	}

	public void startGame() { // Starts the game in endless loop until stopGame() is called
		while (gameIsRunning)
                {
                    passTime();
                    
                    robot.move(1);
                    
                    robotEater.move(2);
                    if(robot==null)
                        stopGame();
                }
	}
        
        private void passTime() {
		timeElapsed++;
	}
        
	public boolean doesCollide(GameObject aGameObject1, GameObject aGameObject2) { // If both object are at same point, it returns true
		return aGameObject1.getX() == aGameObject2.getX() && aGameObject1.getY() == aGameObject2.getY();
	}

	public int calculateDistance(GameObject aGameObject1, GameObject aGameObject2) { // Euclidean distance between 2 objects in a 2-dimensional space
		return (int)Math.sqrt(Math.pow(aGameObject1.getX()-aGameObject2.getX(),2) + Math.pow(aGameObject1.getY() - aGameObject2.getY(),2));
	}

        public void setRobot(int x, int y, Robot r) {
                robot = r;
                r.setX(x);
                r.setY(y);
                r.setGameArea(this);
        }

        public void setRobotEater(int x, int y, RobotEater re) {
                robotEater = re;
                re.setX(x);
                re.setY(y);
                re.setGameArea(this);
        }
}