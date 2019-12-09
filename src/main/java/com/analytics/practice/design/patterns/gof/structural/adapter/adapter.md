# Adapter Design Pattern

Concept:
* When client wants to talk to existing interface.
* Usually when one portion of app is legacy which cannot be changed.
* effectively change the clients code to adapt to talk to legacy
* Example: Collections API;
    * Arrays -> List (array are old and List are new)
    * Stream classes surrounding IO. 
    
* Client centric. 
* Integrate new with old.
* Adaptee is the new postion of the code.
* Client want to do something. and legacy doesnt support. so we add adapter interface.

    