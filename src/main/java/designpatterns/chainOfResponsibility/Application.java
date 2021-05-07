package designpatterns.chainOfResponsibility;


public class Application implements Widget {
    HelpHandler helpHandler;

    @Override
    public boolean hasHelp() {
        return false;
    }

    @Override
    public void setHandler(HelpHandler helpHandler) {
        this.helpHandler = helpHandler;
    }

    @Override
    public void handleHelp() {
        if(hasHelp()) {
            System.out.println("Application is handling help");
        } else {
            helpHandler.handleHelp();
        }
    }
}
