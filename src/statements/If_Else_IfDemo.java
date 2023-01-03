package statements;

public class If_Else_IfDemo {

	public static void main(String[] args) {
int marks=45;
		
		if(marks<35){
			System.out.println("fail");
			
		}
		else if(marks>=35 && marks<50) {
			System.out.println("Pass Class");
		}
		else if(marks>50 && marks<60){
			System.out.println("B Grade");	
		}
		else if(marks>=60 && marks<=75){
			System.out.println("A Grade");
			
		}
		else if(marks>75 && marks<=90){
			System.out.println("A+ Grade");
			
		}
		else if(marks>90 && marks<=100) {
			System.out.println("A++ Grade");
			
		}
		else {
			System.out.println("Invalid");
		}

	}

}
//the if-else-if ladder statement executes one condition from multiple statements.

