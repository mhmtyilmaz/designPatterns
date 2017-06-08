Factory Pattern 
* Doesn't expose instantiation logic
* Defer to subsclasses
* Common interface 
* Specified by architecture, implemented by user
* Examples : Calendar, ResourceBundle, NumberFormat

**Pitfalls**
* Complexity
* Creation in subclass
* Refactoring

**Summary**
* Returns various instances
* Multiple constructors
* Interface driven
* Subclasses
* Adaptable to environment more easily
* Parameter driven