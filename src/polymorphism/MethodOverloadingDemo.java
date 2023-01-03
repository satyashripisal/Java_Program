package polymorphism;

public class MethodOverloadingDemo{
		
	    public void show() {
			System.out.println("1");
		}
		
	    public void show(int a) {
			System.out.println("2");
		}
		
	    public void show(char a) {
			System.out.println("3");
		}
		
	    public void show(int a, char b) {
			System.out.println("4");
		}
		public static void main(String[] args) {
			
			MethodOverloadingDemo md = new MethodOverloadingDemo();
			md.show();
			md.show(4);
			md.show('o');
			md.show(2, 'p');
			
			
		}
}


