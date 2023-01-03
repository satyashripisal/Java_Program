package practice;

public class RemoveSpecialChar {

	public static void main(String[] args) {
		
		String abc = "$@ty@$hr!";
		int no = abc.length();
		
		for(int i = 0; i<=no; i++) {
			//if(abc==abc[i])
		}
		String ab = " ";
		ab = abc.replaceAll("[$@!]", "");
		System.out.println(ab);
	}

}
