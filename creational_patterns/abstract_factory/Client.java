package creational_patterns.abstract_factory;

public class Client {
    public static void main(String[] args) {
        AbstractFactory abstractFactory;
        AbstractProductA abstractProductA;
        AbstractProductB abstractProductB;

        // Using ConcreteFactory1
        System.out.println("Using ConcreteFactory1 -----------------------------------");
        abstractFactory = new ConcreteFactory1();
        abstractProductA = abstractFactory.createProductA();
        abstractProductB = abstractFactory.createProductB();
        abstractProductA.methodA();
        abstractProductB.methodB();
        
        // Using ConcreteFactory2
        System.out.println("\nUsing ConcreteFactory2 -----------------------------------");
        abstractFactory = new ConcreteFactory2();
        abstractProductA = abstractFactory.createProductA();  // using same abstractProductA instance
        abstractProductB = abstractFactory.createProductB();  // using same abstractProductB instance
        abstractProductA.methodA();
        abstractProductB.methodB();
    }
}
