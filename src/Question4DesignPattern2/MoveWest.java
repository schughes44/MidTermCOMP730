package Question4DesignPattern2;

public class MoveWest implements CommandInterface {
	Player player;

	public MoveWest(Player player) {
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
