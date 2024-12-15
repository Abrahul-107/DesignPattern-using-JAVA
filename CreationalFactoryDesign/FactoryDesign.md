# Factory Design Pattern 
- The **Factory Method pattern** falls under the category of creational design patterns and is widely used to create objects without specifying their exact class types. Instead of directly instantiating objects using constructors, the **Factory Method pattern** delegates the responsibility of object creation to subclasses, allowing for greater flexibility and extensibility.

## What is the Factory Method Design Pattern?
- The Factory Method pattern is a creational design pattern that provides an interface for creating objects in a superclass but allows subclasses to alter the type of objects that will be created. It encapsulates the object creation logic, decoupling it from the client code that uses the objects.

## When to Use Factory Method Design Pattern?
- The Factory Method pattern is best suited for scenarios where
- The exact class of objects to be created is not known at compile time.
- The client code needs to be decoupled from the concrete classes of objects it creates.
- There’s a need for flexibility in object creation, allowing subclasses to provide variations of the created objects.
- The application needs to adhere to the Open/Closed Principle, where classes should be open for extension but closed for modification.

## Components of Factory Method Design Pattern
1. Product(***Transport***): Represents the interface of the objects created by the factory method.
2. ConcreteProduct: Concrete implementations of the product(***TransportInterface***).
3. Creator or AbstractCreator: Declares the factory method(***createTransport()***), which returns an instance of the Product interface.
4. ConcreteCreator(***CarLogistics,BusLogistics,ShipLogistics***): Implements the factory method to create instances of ConcreteProduct(Car,bus, ship).



## Factory Method: 
The createTransport() method is an abstract method in the Logistics class. Each subclass implements this method to return a specific type of Transport.
- In CarLogistic, createTransport() might return a Car.

- In BusLogistic, createTransport() might return a Bus.
- In ShipLogistic, createTransport() might return a Ship.
##  Polymorphism: 
- The LogisticsApplication class calls the run() method with a specific Logistics type (CarLogistic, BusLogistic, ShipLogistic). This determines which subclass of Logistics will be used and, consequently, which createTransport() method will be called to instantiate the correct Transport.

## Use Cases of the Factory Method
Below are the main use cases of factory method design pattern:
- Used in JDBC for creating connections and in frameworks like Spring for managing beans.
- Libraries like Swing and JavaFX use factories to create flexible UI components.
- Tools like Log4j rely on factories to create configurable loggers.
- Factories help create objects from serialized data, supporting various formats.


## Advantages of the Factory Method
Below are the main advantages of factory method design pattern:

- Separates creation logic from client code, improving flexibility.
- New product types can be added easily.
- Simplifies unit testing by allowing mock product creation.
- Centralizes object creation logic across the application.
- Hides specific product classes from clients, reducing dependency.


## Disadvantages of the Factory Method
Below are the main advantages of factory method design pattern:

- Adds more classes and interfaces, which can complicate maintenance.
- Slight performance impacts due to polymorphism.
- Concrete creators are linked to their products.
- Clients need knowledge of specific subclasses.
- May lead to unnecessary complexity if applied too broadly.
- Factory logic can be harder to test.