package statements;

public class NestedIf {

	public static void main(String[] args) {

		int age=2;
		int weight=80;
		
		if(age>=18) {
			if(weight>50) {
				
				System.out.println("You are eligible to donate blood");
			}
			else {
				
				System.out.println("You are not eligible to donate blood due to less weight ");
			   
			}
		}
		else {
			
			System.out.println("You are not eligible to donate blood due to age limit");
		}
		

	}

}
