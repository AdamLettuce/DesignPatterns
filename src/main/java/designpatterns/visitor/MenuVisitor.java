package designpatterns.visitor;


import designpatterns.compositeComponent.MenuComposite;
import designpatterns.compositeComponent.MenuLeaf;

public interface MenuVisitor {
    void visitComposite(MenuComposite composite, int level);
    void visitLeaf(MenuLeaf leaf, int level);

    String getResult();
}
