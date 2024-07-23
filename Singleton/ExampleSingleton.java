package Singleton;
// Single is a creational design pattern in which we focus on the creation of the object. In this our motive is to create only one instance of a class
public class ExampleSingleton {
    private static ExampleSingleton uniqueInstance = null;

    private ExampleSingleton(){

    }

    // Lazy Construction of the instance
    public static ExampleSingleton getInstance(){
        if(uniqueInstance == null) {
            uniqueInstance = new ExampleSingleton();
        }
        return uniqueInstance;
    }
}
