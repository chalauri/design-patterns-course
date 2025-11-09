package ge.edu.sangu.command.receivers;

public class TV implements Device {

    @Override
    public void turnOn() {
        System.out.println("TV has turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("TV has turned OFF");
    }
}
