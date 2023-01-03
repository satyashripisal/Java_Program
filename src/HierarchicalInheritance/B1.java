package HierarchicalInheritance;

public class B1 extends A {
	public void pqr() {
		System.out.println("This is from B1");
	}
	public static void main(String[] args) {
		
		B1 b = new B1();
		b.pqr();
		b.abc();
	}

}
