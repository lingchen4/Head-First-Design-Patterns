package headfirst.designpatterns.command.simpleremote;

import java.util.Deque;
import java.util.List;
import java.util.Queue;

//
// This is the invoker
//
public class SimpleRemoteControl {
	Command slot;
	Deque<Command> undoCommands;
 
	public SimpleRemoteControl() {
		undoCommands = new java.util.ArrayDeque<>();
	}
 
	public void setCommand(Command command) {
		slot = command;
	}
 
	public void buttonWasPressed() {
		slot.execute();
		undoCommands.addLast(slot);
	}

	public void undoButtonWasPressed() {
		Command command = undoCommands.pollLast();
		if (command != null){
			command.undo();
		}
	}
}
