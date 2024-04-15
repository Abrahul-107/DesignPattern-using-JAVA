# Object-Oriented Design Patterns in Java

This repository contains implementations of various object-oriented design patterns in Java. Each pattern is illustrated with practical examples to demonstrate its usage and benefits.

## Patterns Implemented

1. **Strategy Pattern - S.O.L.I.D Principles**
   - Implement the Strategy pattern following the principles of S.O.L.I.D (Single Responsibility, Open/Closed, Liskov Substitution, Interface Segregation, Dependency Inversion). This pattern enables selecting an algorithm at runtime.

2. **Observer Pattern - Notify Me Button Functionality**
   - Design a "Notify Me" button using the Observer pattern. This pattern facilitates one-to-many relationships where multiple observers (subscribers) are notified of changes in the subject (button click).

3. **Decorator Pattern - Pizza Billing System**
   - Create a pizza ordering and billing system using the Decorator pattern. This pattern allows adding extra toppings (decorators) dynamically to a base pizza object without modifying its structure.

4. **Factory Pattern - Parking Lot**
   - Develop a parking lot management system using the Factory pattern. This pattern abstracts the process of creating different types of parking spaces (e.g., compact, standard, premium) based on user requirements.

5. **Abstract Factory Pattern - Snake Ladder Game**
   - Implement a snake and ladder game using the Abstract Factory pattern. This pattern provides an interface for creating families of related objects (e.g., game board, players) without specifying their concrete classes.

6. **Chain of Responsibility Pattern - Elevator System**
   - Design an elevator control system using the Chain of Responsibility pattern. This pattern creates a chain of handler objects to process requests sequentially, with each handler having the ability to handle the request or pass it to the next handler.

7. **Proxy Pattern - Car Rental System**
   - Develop a car rental system using the Proxy pattern. This pattern controls access to the car rental service, acting as a surrogate or placeholder for car objects to manage and optimize resource-intensive operations.

8. **Null Object Pattern - Logging System**
   - Create a logging system using the Null Object pattern. This pattern provides an object with neutral behavior to handle cases where a logging object may not be available or needed, preventing null references.

9. **State Pattern - Tic-Tac-Toe Game**
   - Design a tic-tac-toe game using the State pattern. This pattern allows the game to transition between different states (e.g., player's turn, game over) based on user interactions and game rules.

10. **Composite Pattern - BookMyShow with Concurrency Handling**
    - Implement a ticket booking system like BookMyShow using the Composite pattern. This pattern allows treating individual seats and seat groups uniformly, enabling composite objects (seating sections) to be composed recursively.

11. **Adapter Pattern - Vending Machine**
    - Create a vending machine using the Adapter pattern. This pattern adapts different product interfaces (snacks, beverages) for vending, enabling compatibility with the vending machine interface.

12. **Singleton Pattern - ATM**
    - Design an ATM system using the Singleton pattern. This pattern ensures that a single instance of the ATM controller exists throughout the application, preventing multiple instances and managing global state.

13. **Builder Pattern - Chess Game**
    - Develop a chess game using the Builder pattern. This pattern separates the construction of complex game objects (e.g., chessboard, pieces) from their representation, allowing step-by-step construction and configuration.

14. **Prototype Pattern - File System**
    - Implement a file system using the Prototype pattern. This pattern allows creating and cloning file objects efficiently, providing a blueprint for creating new file instances.

15. **Bridge Pattern - Splitwise**
    - Design a simplified accounting and balancing system like Splitwise using the Bridge pattern. This pattern decouples abstraction (accounting logic) from implementation (splitting expenses), enabling flexible and scalable solutions.

16. **Facade Pattern - Optimal Accounting Balancing**
    - Create an optimal accounting balancing system using the Facade pattern. This pattern simplifies complex accounting algorithms and operations, providing a unified interface to perform accounting tasks efficiently.
