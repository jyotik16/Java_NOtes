package InnerClasses;

public class LocalInnerClass {
private int a=12;

void fun() {
	
	System.out.println("OUter class");
	class Inner{ //Local Inner class can't be private public protected
		 private int b=13;
		 void fun2() {
			 System.out.println("Inner class"+" outer variable="+a+" b="+b);
		 }		 	 
	}
	Inner ob1 = new Inner();
	ob1.b=14; //change value
	ob1.fun2();
	
}
public static void main(String[] args) {
	LocalInnerClass ob = new LocalInnerClass();
	//Inner ob1 = ob.new Inner();
	ob.fun();
	
}
}
/*
 * OUter class
Inner class outer variable=12 b=14*/
