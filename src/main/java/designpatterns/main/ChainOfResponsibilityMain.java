package designpatterns.main;


import designpatterns.chainOfResponsibility.Application;
import designpatterns.chainOfResponsibility.Button;
import designpatterns.chainOfResponsibility.Dialog;

public class ChainOfResponsibilityMain {
    public static void main(String[] args) {
        Application application = new Application();

        Dialog dialog = new Dialog();
        dialog.setHandler(application);

        Button button = new Button();
        button.setHandler(dialog);

        button.handleHelp();
    }
}
