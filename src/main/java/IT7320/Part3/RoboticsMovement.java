package IT7320.Part3;

public class RoboticsMovement {

	RoboticsMovementInterface obj;
	int x, y;
	
	public RoboticsMovement(int x, int y) {
		this.x = 0;
		this.y = 0;
	}

	public int moveForward(int a) {

		return x + a;
	}

	public int moveBackward(int b) {
		
		return x - b;
	}

	public int moveLeft(int c) {
		
		return y - c;
	}

	public int moveRight(int d) {
		
		return y + d;
	}
	
	public void printIntroduction() {
		
		System.out.println("The robot is moving along x and y axis. Original point is starting from (0 , 0).");
	}
	public void printCurrentPosition(int x, int y) {
		
		System.out.println("The robot's current position is at: ( " + x + " , " + y + " ).");
	}
	

}
