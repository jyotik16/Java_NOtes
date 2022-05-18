package com.java8;

```java
static class A{
	 int f() {
		return 0;
	}
}
static class B extends A{
	int f() {
		return 1;
	}
	B ff() {
	return null;	
	}
}
static class C extends B{
	int f() {
		return 2;
	}
	C ff() {
		System.out.println("C");
		return null;	
	}
}

public static void main(String[] args) {
	A ref = new C();
	B ob = new C();
	B ref1 = (B) ref;
	System.out.print(ref1.f());
	//ref.ff(); complier error because ff() not exit in the parent class
	ob.ff(); //In java 5->Covariant method  where u can change the return type of override method.d
}
```



```scala

    public static void main(String[] args) {
        for (int index = 0; 1; index++) {
            System.out.println("Welcome");
            break;
        }
    }
Complier Error
```

```java
public static void main(String[] args) {
        for (int index = 0; true; index++) {
            System.out.println("Welcome");
            break;
        }
    }
```

