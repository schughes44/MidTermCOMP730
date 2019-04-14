package Question4DesignPattern2;

public class MoveSouth implements CommandInterface {
	Player player;

	public MoveSouth(Player player) {
		this.player = player;
	}
	
	@Override
	public void execute() {
		player.movedNorth();
	}

	@Override
	public boolean undo() {
		return false;
	}

}