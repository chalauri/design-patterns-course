package ge.edu.sangu.command.receivers;

public class LightBulb implements Device {

    @Override
    public void turnOn() {
        System.out.println("Light has turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Light has turned OFF");
    }
}
