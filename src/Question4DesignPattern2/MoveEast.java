package Question4DesignPattern2;

public class MoveEast implements CommandInterface {
	Player player;

	public MoveEast(Player player) {
		this.player = player;
	}
	
	@Override
	public void execute() {
		player.movedEast();
	}

	@Override
	public boolean undo() {
		player.undoMove();
		return true;
	}

}