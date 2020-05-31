package InnerClasses;

public class AynonmousClass {
public static void main(String[] args) {
	AynonmousClass ob = new AynonmousClass();
	POP obj = new POP() {
		public void pop() {
			System.out.println("popcorn2.");
		}
	}; //semicolon required
	
	obj.pop(); //popcorn2
	
}
}
class POP{
	public void pop() {
		System.out.println(" popcorn1.");
	}
}

/*
abstract class POP{

public abstract void pop(); 
}*/