package singleinheritance;

public class B extends  A {
	void msg() {
		System.out.println("1");
	}

	public static void main(String[] args) {
		
		B b1 = new B();
		b1.show();
		b1.msg();

	}

}
