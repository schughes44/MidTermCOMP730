package Question4DesignPattern2;

public class MoveSouth implements CommandInterface {
	Player player;

	public MoveSouth(Player player) {
		this.player = player;
	}
	
	@Override
	public void execute() {
		player.movedSouth();
	}

	@Override
	public boolean undo() {
		player.undoMove();
		return true;
	}

}