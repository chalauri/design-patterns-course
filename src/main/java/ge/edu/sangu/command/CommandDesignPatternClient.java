package ge.edu.sangu.command;

import ge.edu.sangu.command.commands.Command;
import ge.edu.sangu.command.commands.LightToggleCommand;
import ge.edu.sangu.command.commands.TvTurnOffCommand;
import ge.edu.sangu.command.commands.TvTurnOnCommand;
import ge.edu.sangu.command.invoker.SmartHomeRemoteControl;
import ge.edu.sangu.command.receivers.Device;
import ge.edu.sangu.command.receivers.LightBulb;
import ge.edu.sangu.command.receivers.TV;

public class CommandDesignPatternClient {
    public static void main(String[] args) {
        Device tv = new TV();
        Device lightBulb = new LightBulb();

        Command lightToggleCommand = new LightToggleCommand(lightBulb);
        Command tvTurnOnCommand = new TvTurnOnCommand(tv);
        Command tvTurnOffCommand = new TvTurnOffCommand(tv);

        SmartHomeRemoteControl smartHomeRemoteControl = new SmartHomeRemoteControl();

        System.out.println("-----------Light Bulb Example------------");
        smartHomeRemoteControl.setCommand(lightToggleCommand);
        smartHomeRemoteControl.invoke();
        smartHomeRemoteControl.invoke();
        smartHomeRemoteControl.invoke();
        smartHomeRemoteControl.invoke();
        System.out.println("\n");

        System.out.println("-----------Tv Turn On Example------------");
        smartHomeRemoteControl.setCommand(tvTurnOnCommand);
        smartHomeRemoteControl.invoke();

        System.out.println("-----------Tv Turn Off Example------------");
        smartHomeRemoteControl.setCommand(tvTurnOffCommand);
        smartHomeRemoteControl.invoke();
    }
}
