package designpatterns.compositeComponent;



import designpatterns.visitor.MenuVisitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MenuComposite implements MenuComponent {
    private List<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
    private String name;

    public static MenuComposite newInstance(String name) {
        return new MenuComposite(name);
    }

    public MenuComposite(String name) {
        this.name = name;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<MenuComponent> getChildren() {
        return Collections.unmodifiableList(menuComponents);
    }

    @Override
    public void accept(MenuVisitor visitor) {
        visitor.visitComposite(this, 0);
    }

}
