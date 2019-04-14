package Question4DesignPattern2;

public class MoveWest implements CommandInterface {
	Player player;

	public MoveWest(Player player) {
		this.player = player;
	}
	
	@Override
	public void execute() {
		player.movedWest();
	}

	@Override
	public boolean undo() {
		player.undoMove();
		return true;
	}

}
