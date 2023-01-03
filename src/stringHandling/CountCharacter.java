package stringHandling;

public class CountCharacter {

	public static void main(String[] args) {
		
		String s = "I am Satyashri";
		int count = 0;
		for(int i=0;i<s.length();i++) {
		//	if(s.charAt(i)!= '') {
				count++;
			}
			//Displays the total number of characters present in the given string    
	        System.out.println("Total number of characters in a string: " + count);   
		}

	}


