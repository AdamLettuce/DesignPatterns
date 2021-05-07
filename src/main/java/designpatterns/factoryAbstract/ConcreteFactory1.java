package designpatterns.factoryAbstract;


public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public AbstractProductA getProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public AbstractProductB getProductB() {
        return new ConcreteProductB1();
    }
}
