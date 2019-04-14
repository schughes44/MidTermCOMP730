package Question4DesignPattern2;

public class MoveNorth implements CommandInterface {
	Player player;

	public MoveNorth(Player player) {
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
