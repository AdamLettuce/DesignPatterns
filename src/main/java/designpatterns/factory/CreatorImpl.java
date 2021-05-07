package designpatterns.factory;


public class CreatorImpl implements Creator {
    @Override
    public Product newInstance() {
        return new ProductImpl();
    }
}
