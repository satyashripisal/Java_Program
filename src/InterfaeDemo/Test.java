package InterfaeDemo;

public class Test implements I1,I2 {
	

	@Override
	public void display() {
		System.out.println("This is from I2");
		
	}

	@Override
	public void show() {
		System.out.println("This is from I1");
		
	}


@Override
public void demo() {
	System.out.println("This is demo method");
}
public static void main(String[] args) {
	
    Test t = new Test();
    t.show();
    t.display();
    t.demo();
    
    
    
	}
}
