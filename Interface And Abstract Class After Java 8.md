### Differences Between Interface And Abstract Class After Java 8 :

#### 1) Fields

Interface fields are public, static and final by default. Interfaces still don’t support non-static and non-final variables. Interfaces can only have public, static and final variables. On the other hand, abstract class can have static as well as non-static and final as well as non-final variables. They also support private and protected variables along with public variables.

#### 2) Methods

After Java 8, an interface can have default and static methods along with abstract methods. Interfaces don’t support final methods. But, abstract classes support final as well as non-final methods and static as well as non-static methods along with abstract methods.

Also note that, only interfaces can have default methods. Abstract classes can’t have default methods.

#### 3) Constructors

Interfaces can’t have constructors. Abstract classes can have any number of constructors.

#### 4) Member’s Accessibility

All members of interfaces are public by default. Interfaces don’t support private and protected members. But, abstract classes support all type of members – private, protected and public members.

#### 5) Multiple Inheritance

A class can extend only one abstract class, but can implement multiple interfaces. Thus, a class can inherit multiple properties from multiple sources only through interfaces, not through abstract classes.