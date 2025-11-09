package ge.edu.sangu.command.commands;

import ge.edu.sangu.command.receivers.Device;

public class LightToggleCommand implements Command {

    private final Device device;
    private boolean isLightOn = false;

    public LightToggleCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        if (isLightOn) {
            device.turnOff();
            isLightOn = false;
        } else {
            device.turnOn();
            isLightOn = true;
        }
    }
}
