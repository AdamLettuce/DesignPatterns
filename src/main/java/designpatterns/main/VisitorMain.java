package designpatterns.main;


import designpatterns.compositeComponent.Menu;
import designpatterns.compositeComponent.MenuComponent;
import designpatterns.visitor.MenuVisitor;
import designpatterns.visitor.PrintMenuVisitor;

public class VisitorMain {

    public static void main(String[] args) {
        printMenu(Menu.buildMainMenu(), PrintMenuVisitor.newInstance());
        printMenu(Menu.buildAdminMenu(), PrintMenuVisitor.newInstance());
    }

    private static void printMenu(MenuComponent menu, MenuVisitor visitor) {
        menu.accept(visitor);
        System.out.print(visitor.getResult());
    }
}
