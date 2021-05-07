package designpatterns.compositeComponent;



import designpatterns.visitor.MenuVisitor;

import java.util.ArrayList;
import java.util.List;

public class MenuLeaf implements MenuComponent {
    private String name;

    public static MenuLeaf newInstance(String name) {
        return new MenuLeaf(name);
    }

    public MenuLeaf(String name) {
        this.name = name;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<MenuComponent> getChildren() {
        return new ArrayList<MenuComponent>();
    }

    @Override
    public void accept(MenuVisitor visitor) {
        visitor.visitLeaf(this, 0);
    }
}
