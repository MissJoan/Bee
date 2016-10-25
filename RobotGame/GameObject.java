public class GameObject {
	private int x;
	private int y;
        private int direction; // 0 = right, 1= down, 2=left, 3 = up
        private GameArea gameArea;
        
        public GameObject()
        {
            this(0,0,0);
        }
        
        public GameObject(int x, int y, int direction) {
            this.x = x;
            this.y = y;
            this.direction = direction; 
        }

        public GameArea getGameArea() {
            return gameArea;
        }

        public void setGameArea(GameArea gameArea) {
            this.gameArea = gameArea;
        }
        
	public int getX() {
		return this.x;
	}

	public void setX(int aX) {
		this.x = aX;
	}

	public int getY() {
		return this.y;
	}

	public void setY(int aY) {
		this.y = aY;
	}

	public void move(int aSteps) {
		if      (direction==0)
                    x++;
                else if (direction==1)
                    y++;
                else if (direction==2)
                    x--;
                else if (direction==3)
                    y--;
                else
                    throw new UnsupportedOperationException();
	}

	public void turn(int turns) {
		direction = (direction+turns) % 3; // If direction >3 then modulo to normalized
	}
}