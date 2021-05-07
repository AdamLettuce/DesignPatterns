package designpatterns.command;


public class PrintStreamCommand implements Command {
    private PrintStreamWrapper printStreamWrapper;

    public PrintStreamCommand(PrintStreamWrapper printStreamWrapper) {
        this.printStreamWrapper = printStreamWrapper;
    }

    @Override
    public void execute() {
        printStreamWrapper.getPrintStream().println(printStreamWrapper.getArgument());
    }
}
