# Smart Home (Command Pattern)

This project demonstrates the Command Design Pattern using a simple smart home automation scenario.
The pattern encapsulates actions (commands) as objects, allowing requests to be parameterized, queued, logged, and executed flexibly.

The system controls two devices:
* Light Bulb
* TV

Each device can perform actions such as turning on or off. Actions are wrapped into concrete command classes that implement a generic Command interface.

A SmartHomeRemoteControl acts as the invoker, executing whichever command is currently configured.

Each **handler** implements the `BudgetRequestHandler` interface, which defines two methods:


## Key Components

1. Command Interface

Defines a single method:
```
public interface Command {
    void execute();
}

```
Every action in the system is represented as a Command.

2. Concrete Commands

- LightToggleCommand - Toggles a light bulb on/off by tracking current state.
- TvTurnOnCommand - Turns the TV on.
- TvTurnOffCommand - Turns the TV off.

Each command stores a reference to the receiver (a device) and invokes the appropriate method.

3. Receivers

Actual devices performing the work:
- LightBulb
- TV

4. Invoker - SmartHomeRemoteControl

```java
public class SmartHomeRemoteControl {
    private Command command;

    public void invoke() {
        command.execute();
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
```
The invoker is decoupled from the receiver. It only runs the configured command.

## Benefits of Using the Command Pattern

- Decouples objects invoking operations from objects performing them.
- Supports easy extension with new commands.
- Enables undo/redo, logging, or queuing operations if needed.
- Helps centralize execution logic (e.g., smart remote control).