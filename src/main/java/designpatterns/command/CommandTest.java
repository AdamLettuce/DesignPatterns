package designpatterns.command;


public class CommandTest {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        invoker.addCommand(new SampleObjectCommand(new SampleObject(robot())));
        invoker.addCommand(new PrintStreamCommand(new PrintStreamWrapper(System.out, robot())));
        invoker.doIt();
    }

    private static String robot() {
        return "Robot";
    }
}
