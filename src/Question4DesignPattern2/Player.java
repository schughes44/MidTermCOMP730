package Question4DesignPattern2;

public class Player {
	
	private int xCoord = 0;
	private int yCoord = 0;

	public Player(int xCoord, int yCoord) {
		
		this.xCoord = xCoord;
		this.yCoord = yCoord;	
	}
	
	public void movedNorth() {
		yCoord = yCoord + 2;		
		System.out.println("Player moved North at " + xCoord + "x" + " , " + yCoord + "y" + " coordinates");
	}
	
	public void movedSouth() {
		yCoord = yCoord - 2;
		System.out.println("Player moved South at " + xCoord + "x" + " , " + yCoord + "y" + " coordinates");
	}
	
	public void movedWest() {
		xCoord = xCoord - 2;
		System.out.println("Player moved West at " + xCoord + "x" + " , " + yCoord + "y" + " coordinates");
	}
	
	public void movedEast() {
		xCoord = xCoord + 2;
		System.out.println("Player moved East at " + xCoord + "x" + " , " + yCoord + "y" + " coordinates");
	}
	
	public void undoMove() {
		xCoord = 0;
		yCoord = 0;
		System.out.println("Player moved back to coordinates " + xCoord + "x" + " , " + yCoord + "y");
	}
}
