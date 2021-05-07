package designpatterns.command;


import java.io.PrintStream;

public class PrintStreamWrapper {
    private PrintStream printStream;
    private Object argument;

    public PrintStreamWrapper(PrintStream printStream, Object argument) {
        this.printStream = printStream;
        this.argument = argument;
    }

    public PrintStream getPrintStream() {
        return printStream;
    }

    public Object getArgument() {
        return argument;
    }
}
