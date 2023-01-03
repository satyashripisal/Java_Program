package AllJavaPrograms;

public class FibonnaciSeries2 {

	public static void main(String[] args) {
		int n = 6;
		int a = 1, b = 1 , c;
		
		for(int i=1; i<=n; i++) {
			
			c = a+b;
			System.out.println(c);
			
			a = b;
			b = c;
			
		}

	}

}
