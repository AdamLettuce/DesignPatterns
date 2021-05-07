package designpatterns.main;


import designpatterns.factoryAbstract.AbstractFactory;
import designpatterns.factoryAbstract.ConcreteFactory1;
import designpatterns.factoryAbstract.ConcreteFactory2;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new ConcreteFactory1();
        System.out.println(abstractFactory.getProductA().getNameA());
        System.out.println(abstractFactory.getProductB().getNameB());

        abstractFactory = new ConcreteFactory2();
        System.out.println(abstractFactory.getProductA().getNameA());
        System.out.println(abstractFactory.getProductB().getNameB());
    }
}
