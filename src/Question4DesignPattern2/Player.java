package Question4DesignPattern2;

public class Player {
	
	private int xCoord = 0;
	private int yCoord = 0;

	public Player(int xCoord, int yCoord) {
		
		this.xCoord = xCoord;
		this.yCoord = yCoord;	
	}
	
	public void movedNorth() {
		xCoord = 1;
		yCoord = 1;		
		System.out.println("Player moved North at " + xCoord + " , " + yCoord + " coordinates");
	}
	
	public void movedSouth() {
		xCoord = 4;
		yCoord = 4;
		System.out.println("Player moved South at " + xCoord + " , " + yCoord + " coordinates");
	}
	
	public void movedWest() {
		xCoord = 2;
		yCoord = 2;
		System.out.println("Player moved West at " + xCoord + " , " + yCoord + " coordinates");
	}
	
	public void movedEast() {
		xCoord = 3;
		yCoord = 3;
		System.out.println("Player moved East at " + xCoord + " , " + yCoord + " coordinates");
	}
	
	public void undoMove() {
		xCoord = 0;
		yCoord = 0;
		System.out.println("I moved back to coordinates " + xCoord + " , " + yCoord);
	}
}
