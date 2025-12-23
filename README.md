A. Project overview

This project demonstrates Object-Oriented programming principles using Vehicle Management System.

It applies inheritance, abstraction, composition, and aggregation to model different vehicle types and their drivers.

An abstract Vehicle superclass defines shared variables, while Car, Motorcycle, Truck, and ElectricTruck provide specialized implementations.

B. Class hierarchy

- Vehicle (abstract superclass)
    - Car
    - Motorcycle
    - Truck

The Vehicle class defines abstract methods `startEngine()` and `stopEngine()`, which are overridden in each subclass to provide customized behavior.
Access modifiers used:

- private : used for encapsulation
- protected: used for shared fields like brand and year
- constructors use `super()` for chaining

C. Instructions to Compile and Run

Go to the src directory and run following commands:

javac *.java

java Main

D. Screenshots

Screenshots of the program can be found at:
docs/screenshots

E. Reflection

Inheritance simplified the design by allowing common attributes and behaviors to be shared across all vehicle types. This reduced code duplication.

Method overriding allowed each subclass to customize shared behavior while maintaining a common interface. 


