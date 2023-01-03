package Multilevelinheritance;

public class C extends B{
	public void pqr() {
		System.out.println("This is data from class C");
	}

	public static void main(String[] args) {
		C t3 = new C();
		t3.pqr();
		t3.abc();
		t3.Test1Demo();
		
	
	
	}

}
