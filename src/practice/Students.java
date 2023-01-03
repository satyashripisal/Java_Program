package practice;

public class Students {
	
	int d =2;// Instance variable
	static int adhaarnum ; //Static Variable
	
	public void method() {
		
		int n = 555; //Local Variable
		System.out.println(n);
	}
	
	public static void main(String[] args) {
			int id = 121; //Instance Variable
		Students s = new Students();
		s.method();//through class object
		System.out.println(Students.adhaarnum);//call through class//without declarization give default value=0
		System.out.println(id);//directly print variable name
		
		
		
	
			
			
		}
		
	}
	


