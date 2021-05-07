package designpatterns.factory;


public class ProductImpl implements Product {
    @Override
    public String getName() {
        return ProductImpl.class.getSimpleName();
    }
}
