package HierarchicalInheritance;

public class C1 extends A {
	
	public void xyz() {
		System.out.println("This is from C1");
	}


public static void main (String[] args) {
	C1 c = new C1();
	c.abc();
	c.xyz();
}

}
