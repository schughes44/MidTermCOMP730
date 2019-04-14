package Question4DesignPattern2;

public class MoveMain {

	public static void main(String[] args) {
		
		Player player = new Player(0, 0);
		CommandInvoker command = new CommandInvoker();
		
		for (int i = 0; i < 50; i++) {
			int random = (int)(Math.random() * 5 +1);
			
			if (random == 1) {
				command.setDirection(new MoveNorth(player));
			}
			
			if (random == 2) {
				command.setDirection(new MoveEast(player));
			}
			
			if (random == 3) {
				command.setDirection(new MoveSouth(player));
			}
			
			if (random == 4) {
				command.setDirection(new MoveWest(player));
			}
			command.move();
		}
		//command.undoMove();
	}
}
