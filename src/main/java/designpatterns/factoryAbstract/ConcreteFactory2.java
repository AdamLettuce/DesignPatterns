package designpatterns.factoryAbstract;


public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public AbstractProductA getProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public AbstractProductB getProductB() {
        return new ConcreteProductB2();
    }
}
