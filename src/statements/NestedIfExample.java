package statements;

public class NestedIfExample {

	public static void main(String[] args) {
		int age=20;
		int weight=45;
		
		if(age>=18 && age<=50) {
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
