##Method Reference  

 we provide reference to already existing method(with similar argument types) to simplify the implementation of the functional interface using double colon (::) operator. This process of providing reference to pre-existing method is called Method reference.

1. Static Method References
2. Instance method/non-static Method References
3. Constructor References

Now, let’s try to observe them one by one from below table.

![image](https://i2.wp.com/javatechonline.com/wp-content/uploads/2020/05/image3.jpg?w=828&ssl=1)

### Method reference to an Instance method of a class 

```java
interface B {
    public  void add(int x, int y);
}
class Addition {
	public void sum(int a, int b) {
	    System.out.println("The sum is :"+(a+b));
	}
}
public class TestInstanceMethodReference {

	public static void main(String[] args) {
		
		Addition addition = new Addition();
		//*** Using Lambda Expression ***//
		B b1 = (a,b) -> System.out.println("The sum is :"+(a+b));
		b1.add(10, 14);
		
		//*** Using Method Reference ***//
		B b2 = addition::sum;
		b2.add(100, 140);
	
```

### Constructor Reference 

```java
interface C {
	public Employee getEmployee();
}

interface D {
	public Employee getEmployee(String name, int age);
}

class Employee {
	String eName;
	int eAge;
	
	public Employee(){} 
	
	public Employee(String eName, int eAge) {
		this.eName = eName;
		this.eAge = eAge;
	}
	
	public void getInfo() {
		System.out.println("I am a method of class Employee");
	}
}

public class TestConstructorReference {

	public static void main(String[] args) {	
		
		//*** Using Lambda Expression ***//
		C c1 = () -> new Employee();
		c1.getEmployee().getInfo();
		D d1 = (name,age) -> new Employee(name,age);
		d1.getEmployee("Tony", 34).getInfo();
		
		//*** Using Method Reference ***//
		C c2 = Employee::new;
		c2.getEmployee().getInfo();
		D d2 = Employee::new;
		d2.getEmployee("Tony", 34).getInfo();
	}
} 
```

