**Prototype Pattern**
* Avoids costly creation
* Avoids subclassing
* Typically doesn't use `new`
* Often utilizes an Interface
* Usually implemented with Registry
* Example : java.lang.Object#clone()


**Pitfalls**

* Sometimes not clear when to use
* Used with other patterns
* Shallow Vs Deep Copy

**Summary**

* Lighter weight construction
* Copy Constructor or Clone
* Shallow or Deep
* Copy of itself
* Guarantee  unique instance
* Often refactored in 
* Can help with performance issue