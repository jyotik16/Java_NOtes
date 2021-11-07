## Association
Association relationship is a structural relationship in which different objects are linked within the system. It exhibits a binary relationship between the objects representing an activity.It is represented by a line between the classes followed by an arrow that navigates the direction, and when the arrow is on both sides, it is then called a bidirectional association.

![img](https://static.javatpoint.com/tutorial/uml/images/uml-association-vs-aggregation-vs-composition3.png)

An aggregation is a special form of association, and composition is the special form of aggregation.
### Aggregation
Aggregation is a subset of association, is a collection of different things. It represents has a relationship. It is more specific than an association. It is a binary association, i.e., it only involves two classes. It is a kind of relationship in which the child is **independent** of its parent.

![agg](https://static.javatpoint.com/tutorial/uml/images/uml-association-vs-aggregation-vs-composition4.png)

### Composition

The composition is a part of aggregation, and it portrays the whole-part relationship. It depicts dependency between a composite (parent) and its parts (children), which means that if the composite is discarded, so will its parts get deleted. It exists between similar objects.t is a kind of relationship in which the child is **dependent** of its parent.

![](https://static.javatpoint.com/tutorial/uml/images/uml-association-vs-aggregation-vs-composition5.png)



In Java, **SOLID principles** are an object-oriented approach that are applied to software structure design. It is conceptualized by **Robert C. Martin** (also known as Uncle Bob). These five principles have changed the world of object-oriented programming, and also changed the way of writing software. It also ensures that the software is modular, easy to understand, debug, and refactor. 

![](https://howtodoinjava.com/wp-content/uploads/solid_class_design_principles.png)

## Single Responsibility Principle

The single responsibility principle states that **every Java class must perform a single functionality**. Implementation of multiple functionalities in a single class mashup the code and if any modification is required may affect the whole class. It precise the code and the code can be easily maintained.

```java
public class Student  
{  
public void printDetails();  
{  
//functionality of the method  
}  
pubic void calculatePercentage();  
{  
//functionality of the method  
}  
public void addStudent();  
{  
//functionality of the method  
}  
}  
```

The above code snippet violates the single responsibility principle. To achieve the goal of the principle, we should implement a separate class that performs a single functionality only.

## Open-Closed Principle

The application or module entities the methods, functions, variables,etc  The open-closed principle states that according to new requirements **the module should be open for extension but closed for modification.** The extension allows us to implement new functionality to the module.

```java
public class VehicleInfo  
{  
public double vehicleNumber(Vehicle vcl)   
{  
if (vcl instanceof Car)   
{  
return vcl.getNumber();  
if (vcl instanceof Bike)   
{  
return vcl.getNumber();  
}  
}  
```

If we want to add another subclass named Truck, simply, we add one more if statement that violates the open-closed principle. The only way to add the subclass and achieve the goal of principle by overriding the **vehicleNumber()** method, as we have shown below.

```java
public class VehicleInfo   
{  
public double vehicleNumber()   
{  
//functionality   
}  
}  
public class Car extends VehicleInfo   
{  
public double vehicleNumber()   
{  
return this.getValue();  
}  
public class Car extends Truck   
{  
public double vehicleNumber()   
{  
return this.getValue();  
}
```

## Liskov Substitution Principle

The Liskov Substitution Principle (LSP) was introduced by **Barbara Liskov**. It applies to inheritance in such a way that the **derived classes must be completely substitutable for their base classes**. In other words, if class A is a subtype of class B, then we should be able to replace B with A without interrupting the behavior of the program. It extends the open-close principle and also focuses on the behavior of a superclass and its subtypes.

```java
public class Rectangle {
    private int width;
    private int height;
    public Rectangle(){}

    public Rectangle(int w,int h) {
        this.width = w;
        this.height = h;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
  
  public int getHeight() {
        return width;
    }
    public void setHeight(int width) {
        this.width = width;
    }
 public final static void setDimensions(Rectangle r,int w,int h) {
          r.setWidth(w);
          r.setHeight(h);
          //assert r.getArea() == w * h
    }
}
```

```java
public class Square extends Rectangle {
    @Override
    public void setHeight(int h){
        super.setHeight(h);
        super.setWidth(h);
    }
    @Override
    public void setWidth(int w) {
        super.setWidth(w);
        super.setHeight(w);
   
```

When talking about LSP, we have the method `setDimensions `in the Rectangle class that accepts a type of Rectangle object and sets the width and height. This is a violation because the behavior changed and we have inconsistent data when we pass a square reference.

## Interface Segregation Principle

The principle states that the larger interfaces split into smaller ones. Because the implementation classes use only the methods that are required. We should not force the client to use the methods that they do not want to use.

```java
Suppose, we have created an interface named Conversion having three methods intToDouble(), intToChar(), and charToString().

public interface Conversion  
{  
public void intToDouble();  
public void intToChar();  
public void charToString();  
}  
```

```java
public interface ConvertIntToDouble  
{  
public void intToDouble();  
}   
public interface ConvertIntToChar  
{  
public void intToChar();  
}  
public interface ConvertCharToString   
{  
public void charToString();  
}  
```

Now we can use only the method that is required. Suppose, we want to convert the integer to double and character to string then, we will use only the methods **intToDouble()** and **charToString().**

## Dependency Inversion Principle

The principle states that we must use abstraction (abstract classes and interfaces) instead of concrete implementations. High-level modules should not depend on the low-level module but both should depend on the abstraction. Because the abstraction does not depend on detail but the detail depends on abstraction.
```java
public class WindowsMachine  
{  
//functionality   
}  
It is worth, if we have not keyboard and mouse to work on Windows. 
```

```java
To make the code loosely coupled, we decouple the WindowsMachine from the keyboard by using the Keyboard interface and this keyword.
Keyboard.java
public interface Keyboard   
{   
//functionality  
}  
WindowsMachine.java
public class WindowsMachine  
{  
private final Keyboard keyboard;  
private final Monitor monitor;  
public WindowsMachine(Keyboard keyboard, Monitor monitor)   
{  
this.keyboard = keyboard;  
this.monitor = monitor;  
}  
}  
In the above code, we have used the dependency injection to add the keyboard dependency in the WindowsMachine class.
```

## Why should we use SOLID principles?

- It reduces the dependencies so that a block of code can be changed without affecting the other code blocks.
- The principles intended to make design easier, understandable.
- By using the principles, the system is maintainable, testable, scalable, and reusable.
- It avoids the bad design of the software.













