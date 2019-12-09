# Factory Design Pattern
This is opposite of singleton and is one of the second most widely used creational design pattern.

# Concepts:

* Doesnt expose instantiation logic
* Defer to subclasses. CLient isnt aware of subclasses.
* Common interface.
* Allowing user to how to implementation
* Example: Calender, ResourceBundle, NumberFormat
* Opposite of singleton
* factory is responsible for lifecycle of objects
* Client is unaware since everything is in concrete classes and there is common interface which is what is used by the client.
* Parameterized create method : concrete type

## Exercise:

* Create Pages
* Create Website
* Create concrete classes
* Create Factory
* Polish with Enum

## Drawback
* Complexity
* Double the amount of code
* Logic is in subclasses
* refactoring.. plan then code


