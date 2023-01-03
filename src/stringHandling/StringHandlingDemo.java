package stringHandling;

public class StringHandlingDemo {
	
	public static void main(String[] args) {
		String str1 = " selenium ";
		String str2 = "Welcome to the Selenium Testing";
		String str3 = "Testing";
		
		//trim()
		System.out.println(str1.trim());//reduce space  before and after string
		
		//substring
		System.out.println(str2.substring(2));//means remove 0,1 index char from string
		System.out.println(str2.substring(5));
		System.out.println(str2.substring(0, 5));
		
		//endWith()
		System.out.println(str2.endsWith("selenium"));//false because selenium is not last word
		System.out.println(str2.endsWith("ing"));//true
		
		//length()--> length start with 1
		System.out.println(str3.length());
		

	}

}
