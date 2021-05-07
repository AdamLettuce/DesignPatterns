package designpatterns.chainOfResponsibility;


public interface HelpHandler {
    boolean hasHelp();
    void setHandler(HelpHandler helpHandler);
    void handleHelp();
}
