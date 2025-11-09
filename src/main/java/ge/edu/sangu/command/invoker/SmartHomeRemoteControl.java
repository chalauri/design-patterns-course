package ge.edu.sangu.command.invoker;

import ge.edu.sangu.command.commands.Command;

public class SmartHomeRemoteControl {

    private Command command;

    public void invoke() {
        command.execute();
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
