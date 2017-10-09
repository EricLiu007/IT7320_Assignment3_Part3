package IT7320.Part3;

public interface RoboticsMovementInterface {

	public int moveForward(int a);
	
	public int moveBackward(int a);
	
	public int moveLeft(int a);
	
	public int moveRight(int a);
	
	public void printIntroduction();
	
	public void printCurrentPosition(int a, int b);
}
