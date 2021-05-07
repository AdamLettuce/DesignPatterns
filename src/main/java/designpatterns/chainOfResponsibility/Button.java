package designpatterns.chainOfResponsibility;


public class Button implements Widget {

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
         System.out.println("Button is handling help");
        } else {
            helpHandler.handleHelp();
        }
    }
}
