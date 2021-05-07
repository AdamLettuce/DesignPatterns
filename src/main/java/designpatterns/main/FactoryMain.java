package designpatterns.main;


import designpatterns.factory.Creator;
import designpatterns.factory.CreatorImpl;
import designpatterns.factory.Product;

public class FactoryMain {
    public static void main(String[] args) {
        Creator creator = new CreatorImpl();
        Product product = creator.newInstance();
        System.out.println(product.getName());
    }
}
