package designpatterns.visitor;


import designpatterns.compositeComponent.MenuComponent;
import designpatterns.compositeComponent.MenuComposite;
import designpatterns.compositeComponent.MenuLeaf;

public class PrintMenuVisitor implements MenuVisitor {

    private StringBuilder result = new StringBuilder();

    public static MenuVisitor newInstance() {
        return new PrintMenuVisitor();
    }

    @Override
    public void visitComposite(MenuComposite composite, int level) {
        result.append(getIndention(level))
                .append(getCompositeLabel())
                .append(composite.getName())
                .append(getNewLine());

        for(MenuComponent menuComponent: composite.getChildren()) {
            if (menuComponent instanceof MenuComposite) {
                visitComposite((MenuComposite) menuComponent, level + 1);
            }
            if (menuComponent instanceof MenuLeaf) {
                visitLeaf((MenuLeaf) menuComponent, level + 1);
            }
        }
    }

    @Override
    public void visitLeaf(MenuLeaf leaf, int level) {
        result.append(getIndention(level))
                .append(getLeafLabel())
                .append(leaf.getName())
                .append(getNewLine());
    }

    @Override
    public String getResult() {
        return result.toString();
    }

    protected String getIndention(int level) {
        return getVisitorStringUtils().getEmptyString(getIndentionLength() *
                level);
    }

    protected VisitorStringUtils getVisitorStringUtils() {
        return VisitorStringUtils.newInstance();
    }

    protected int getIndentionLength() {
       return 4;
    }

    protected String getCompositeLabel() {
        return " + ";
    }

    protected String getLeafLabel() {
        return " - ";
    }

    protected String getNewLine() {
        return System.lineSeparator();
    }

}
