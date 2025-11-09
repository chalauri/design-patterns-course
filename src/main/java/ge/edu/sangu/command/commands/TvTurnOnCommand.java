package ge.edu.sangu.command.commands;

import ge.edu.sangu.command.receivers.Device;

public class TvTurnOnCommand implements Command {

    private final Device device;

    public TvTurnOnCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOn();
    }
}
