package ge.edu.sangu.command.commands;

import ge.edu.sangu.command.receivers.Device;

public class TvTurnOffCommand implements Command {

    private final Device device;

    public TvTurnOffCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOff();
    }
}
