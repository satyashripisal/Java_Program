package polymorphism;

public class MethodOverridingDemo2 extends MethodOverridingDemo1 {
	
	public void show() {
		System.out.println("2");
	}
	
	public static void main(String[] args) {

		MethodOverridingDemo2 od2 = new MethodOverridingDemo2();
		od2.show();
		
		MethodOverridingDemo1 od1 = new MethodOverridingDemo1();
		od1.show();
				

	}
}
