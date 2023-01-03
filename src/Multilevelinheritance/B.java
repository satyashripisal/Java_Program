package Multilevelinheritance;

public class B extends A{

	public void abc() {
		System.out.println("This is data from class B");
	}
	public static void main(String[] Args) {
		B t2 = new B();
		t2.Test1Demo();
		t2.abc();
	}

}
