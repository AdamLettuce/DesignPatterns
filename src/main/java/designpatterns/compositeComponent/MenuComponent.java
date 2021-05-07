package designpatterns.compositeComponent;

import designpatterns.visitor.MenuVisitor;
import java.util.List;

public interface MenuComponent {
    public void add(MenuComponent menuComponent);
    public String getName();
    public List<MenuComponent> getChildren();
    public void accept(MenuVisitor visitor);
}
