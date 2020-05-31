package InnerClasses;

public class MemberInnerClass {
private int a = 10;
public void fun() {
	System.out.println("Outer class");
//	Inner ob = new Inner();
//	ob.fun();
	
}
class Inner{
	private int b = 11;
	public void fun() {
		System.out.println("Inner class"+" outer variable="+a);
	}
}

public static void main(String[] args) {
	
	MemberInnerClass ob = new MemberInnerClass();
	Inner ob1 = ob.new Inner();
	ob.fun();
	ob1.fun();
}
}
/*
Outer class
Inner class outer variable=10
Inner class outer variable=10
*/