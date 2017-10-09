package IT7320.Part3;

import junit.framework.TestCase;

public class TestMovement extends TestCase {

	RoboticsMovement obj;
	int a, b, c, d, x, y;        //a, b are moving along x axis while c, d are moving along y axis.
	                       //Original starting point is coordination(0, 0).
	                       //Current point is coordination(x, y).
	
	protected void setUp() throws Exception {
		
		obj = new RoboticsMovement(0, 0);
		a = 10;
		b = 12;
		c = 5;
		d = 8;
	}

	protected void tearDown() throws Exception {
		
		obj = null;
		a = 0;
		b = 0;
		c = 0;
		d = 0;
	}

    //test single movement behaviors
	public void testMoveForward() {
	
		assertEquals(10, obj.moveForward(a));
	}

	public void testMoveBackward() {
		
		assertEquals(-12, obj.moveBackward(b));
	}

	public void testMoveLeft() {
		
		assertEquals(-5, obj.moveLeft(c));
	}

	public void testMoveRight() {
		
		assertEquals(8, obj.moveRight(d));
	}
	
	//test multiple movements
	public void testMultipleMovements() {
		
		assertEquals(-2, obj.moveForward(a) + obj.moveBackward(b));   //test robotics move 10 forward first then move 12 backward
		assertEquals(3, obj.moveLeft(c) + obj.moveRight(d));  //test robotics move 5 left first then move 8 right
	}

}
