## Startegy Design Pattern 
- A strategy pattern is a behavioral design pattern that allows the behavior of an object to be selected at runtime. It is one of the Gang of Four (GoF) design patterns, which are widely used in object-oriented programming. 

- In simpler terms, The Strategy Pattern allows you to define a family of algorithms, encapsulate each one of them, and make them interchangeable. This pattern lets the algorithm vary independently from clients that use it.
## Characteristics
- It defines a family of algorithms: The pattern allows you to encapsulate multiple algorithms or behaviors into separate classes, known as strategies.

- It encapsulates behaviors: Each strategy encapsulates a specific behavior or algorithm, providing a clean and modular - way to manage different variations or implementations.

- It enables dynamic behavior switching: The pattern enables clients to switch between different strategies at runtime, allowing for flexible and dynamic behavior changes.

- It promotes object collaboration: The pattern encourages collaboration between a context object and strategy objects, where the context delegates the execution of a behavior to a strategy object.

## UML diagram:-
```
classDiagram
    interface DriverStrategy 
    {
        + drive()
    }

    class NormalVehicleStrategy implements DriverStrategy 
    {
        + drive()
    }

    class SportsVehicleStrategy implements DriverStrategy 
    {
        + drive()
    }

     class Vehicle 
     {
        + driverStrategy: DriverStrategy
        + Vehicle(driverStrategy: DriverStrategy)
        + setDriverStrategy(driverStrategy: DriverStrategy)
        + drive()
    }

    class OffroadVehicle extends Vehicle 
    {
        + OffroadVehicle(driverStrategy: DriverStrategy)
    }

    class SportsVehicle extends Vehicle 
    {
        + SportsVehicle()
    }

    class GoodsVehicle extends Vehicle 
    {
        + GoodsVehicle(driverStrategy: DriverStrategy)
        // Optional: Specific goods vehicle methods
    }

    Vehicle <-> DriverStrategy : implements
    Vehicle o--|> OffroadVehicle
    Vehicle o--|> SportsVehicle
    Vehicle o--|> GoodsVehicle
```


## Reference
 - [GFG Documentation / Explanation](https://www.geeksforgeeks.org/strategy-pattern-set-1/)

## Authors
 - [@rahulparida](https://x.com/AB_Rahul17)

