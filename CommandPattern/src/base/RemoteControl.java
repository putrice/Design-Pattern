package base;

import java.util.ArrayList;

public class RemoteControl {
	ArrayList<Command> onCommands;
	ArrayList<Command> offCommands;
	ArrayList<Command> logCommands;
	
	public RemoteControl() {
		onCommands = new ArrayList<>();
		offCommands = new ArrayList<>();
		logCommands = new ArrayList<>();
	}
	
	public void addCommand(Command onCommand, Command offCommand){
		onCommands.add(onCommand);
		offCommands.add(offCommand);
	}
	
	public void onButtonPushed(Command onCommand){
		for(Command command : onCommands){
			if(command == onCommand){
				command.execute();
				logCommands.add(command);
			}
		}
	}
	
	public void offButtonPushed(Command offCommand){
		for(Command command : offCommands){
			if(command == offCommand){
				command.execute();
				logCommands.add(command);
			}
		}
	}
	
	public void undoButtonPushed(){
		int maxIndex = logCommands.size() != 0 ? logCommands.size() - 1 : 0;
		logCommands.get(maxIndex).undo();
	}
	
}
