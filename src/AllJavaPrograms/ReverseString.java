package AllJavaPrograms;

public class ReverseString {

	public static void main(String[] args) {
	
		String name = "ABC DE";
		
		int leng  = name.length();
		System.out.println(leng);
		
		String rev = "";
		for(int i=leng-1; i>=0; i--) {
			rev = rev + name.charAt(i);
			}
		System.out.println("Reverse of String is:: "+ rev);
		}

}
