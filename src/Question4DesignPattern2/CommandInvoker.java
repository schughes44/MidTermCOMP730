package Question4DesignPattern2;

public class CommandInvoker {

	CommandInterface slot;

	public CommandInvoker() {

	}

	public void setDirection(CommandInterface command) {
		slot = command;
	}

	public void move() {
		slot.execute();
	}

	public void undoMove() {
		slot.undo();
	}
}
