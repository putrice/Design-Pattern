package base;

import airConditioning.Ac;
import airConditioning.AcOffCommand;
import airConditioning.AcOnWithHighModeCommand;
import airConditioning.AcOnWithLowModeCommand;
import airConditioning.AcOnWithMediumModeCommand;
import light.Light;
import light.LightOffCommand;
import light.LightOnCommand;

public class RemoteControlSimulator {
	
	public static void main(String [] ar){
		RemoteControl remote = new RemoteControl();
		
		Light light = new Light();
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		LightOffCommand lightOffCommand = new LightOffCommand(light);
		
//		Ac ac = new Ac();
//		AcOnWithHighModeCommand highModeCommand = new AcOnWithHighModeCommand(ac);
//		AcOnWithMediumModeCommand mediumModeCommand = new AcOnWithMediumModeCommand(ac);
//		AcOnWithLowModeCommand lowModeCommand = new AcOnWithLowModeCommand(ac);
//		AcOffCommand acOffCommand = new AcOffCommand(ac);
		
		remote.addCommand(lightOnCommand, lightOffCommand);
//		remote.addCommand(highModeCommand, acOffCommand);
//		remote.addCommand(mediumModeCommand, acOffCommand);
//		remote.addCommand(lowModeCommand, acOffCommand);
		
		remote.onButtonPushed(lightOnCommand);
//		remote.onButtonPushed(highModeCommand);
		
		remote.undoButtonPushed();
		
	}

}
