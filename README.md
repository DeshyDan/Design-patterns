# Design patterns

## Introduction

This repository contains the implementation of the design patterns in java.

## Table of contents

- [Behavioral Patterns](#behavioral-patterns)
- [Structural Patterns](#structural-patterns)
<!-- - [Creational Patterns](#creational-patterns) -->
  
## Behavioral Patterns

Behavioral patterns are concerned with the assignment of responsibilities between objects, or, encapsulating behavior in an object and delegating requests to it.

|Behavioral Patterns|Brief Description|Interesting reads|
| --- | --- | --- |
| Momento Pattern|Allows restoring an object to a previous state| <https://refactoring.guru/design-patterns/memento> |
| State Pattern|Allows an object to behave differently depending on the state it is in |<https://refactoring.guru/design-patterns/state> |
| Strategy Pattern|Allows passing different algorithms (behaviours) to an object. |<https://refactoring.guru/design-patterns/strategy> |
| Template Method Pattern|Allows defining a template (skeleton) for an operation. Specific steps will then be implemented in subclasses| <https://refactoring.guru/design-patterns/template-method>|
| Command Pattern|Allows decouple a sender from a receiver. The sender will talk to the receiver through a command. Commands can be undone and persisted|<https://refactoring.guru/design-patterns/command>|
|Iterator Pattern|Allows iterating over an object without having to expose the object's internal structure (which may change in the future)|<https://refactoring.guru/design-patterns/iterator>|
|Observer Pattern|Allows an object to notify other objects when its state changes|<https://refactoring.guru/design-patterns/observer>|
|Mediator Pattern|Allows an object to encapsulate the communication between other objects|<https://refactoring.guru/design-patterns/mediator>|
|Chain of Responsibility Pattern|Allows buillding a chain of objects to process a request|<https://refactoring.guru/design-patterns/chain-of-responsibility>|
|visitor Pattern|Allows adding new operations to an object structure without modifying it|<https://refactoring.guru/design-patterns/visitor>|

## Structural Patterns

Structural patterns are concerned with how classes and objects are composed to form larger structures.

|Structural Patterns|Brief Description|Interesting reads|
| --- | --- | --- |
|Composite Pattern|Represents object hierarchies where individual objects and compositions of objects are treated the same way|<https://refactoring.guru/design-patterns/composite>|
|Adapter Pattern|Allows objects with incompatible interfaces to collaborate|<https://refactoring.guru/design-patterns/adapter>|
|Decorator Pattern|Allows adding new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors|<https://refactoring.guru/design-patterns/decorator>|
|Facade Pattern|Allows hiding the complexity of a subsystem by providing a simple interface|<https://refactoring.guru/design-patterns/facade>|
