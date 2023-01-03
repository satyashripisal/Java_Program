package stringHandling;

public class StringConcatination {

public static void main(String[] args) {
		
		String str1 = "Selenium";//literal way
		String str2 = "Testing"; 
		
		
		System.out.println(str1 + str2);//concatination
		System.out.println("Selenium"+1+1);//String+Number concatination 
		System.out.println(1+1+"Selenium");//Number+String concatination
		
		//concats() method
		System.out.println(str1.concat(str2));//without space two string concat 

		//charAt() method
		System.out.println(str1.charAt(4));//providing index in charAt parenthesis then o/p will be that character
		System.out.println(str2.charAt(6));
		
		
		
	}
}
