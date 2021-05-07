package designpatterns.command;

import java.util.Collection;
import java.util.HashSet;


public class Invoker {
    Collection<Command> commands = new HashSet<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void doIt() {
        commands.forEach(Command::execute);
    }
}
