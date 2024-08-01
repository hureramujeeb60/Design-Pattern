package Factory;

/* Factory Design pattern is also comes under the creational design pattern as it also focuses on the creation of the object.
Factory design pattern says to define an interface for creating the object and let the subclasses decide which class to instantiate

Below Steps to achieve factory pattern:
-> Create an interface that defines the common operations for the object.
-> Define the actual classes that implements the above interface
-> Create an interface that declares the factory method
*/

interface Product{
    void display();
}

class ConcreteProductA implements Product{
    @Override
    public void display() {
        System.out.println("This is concrete product A");
    }
}

class ConcreteProductB implements Product{
    @Override
    public void display() {
        System.out.println("This is concrete product B");
    }
}

interface Factory{
    Product factoryMethod();
}

class concreteFactoryA implements Factory{
    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}

class concreteFactoryB implements Factory{
    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}

public class ExampleFactory {


    public static void main(String[] args) {
        Factory factoryA = new concreteFactoryA();
        Product productA = factoryA.factoryMethod();
        productA.display();
    }

}
