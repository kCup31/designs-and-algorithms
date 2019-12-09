
# Prototype Design Pattern

The prototype pattern is used to get a unique instance of same object.

## Concepts:

* Avoids costly creation
* Avoids subclassing
* Dont use the work "new". First instance is new then its cloned.
* Often uses interfaces.
* Usually implemented with a registry
* Example:
    * java.lang.Object#clone()
    
    
## Design

* If an object is expensive to create. Then instead of creating a new object, you clone.  
    * clone/ cloneable
    * avoids keyword "new"
    * Although a copy, each instance is unique
    * Costly construction and not handled by client.
    * Its opposite of builder pattern.
    * You chose whether to take shallow VS deep copy.  A shallow copy will copy just the immediate properties whereas 
    the deep copy will also copy its reference as well.
    
## Pitfalls
* Not clear when to use. Mostly used with other patterns: registry
* Shallow vs Deep copy  

## Summary
* Gurantee unique instance
* can help with performance issue
* often refactored in
* Dont always jump to factor to see if protoype is suited for  
    
    
    
    
    
     

