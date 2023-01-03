package pattern_program;



public class PalindromeNo {
	public static void palindromenois(int num) {
		
		int r = 0;
		int sum = 0;
		int t;
		t = num;//121
		while(num>0) //1
		{
			r = num%10;//1
			sum = (sum*10)+r;//121
			num = num/10;//0
			
			}
		if(t==sum)//121==121
		{
			System.out.println("It is Palindrome No");

		}
		else {
			System.out.println("It is not Palindrome no");
		}
			 
	}	
	public static void main(String[] args) {
		palindromenois(1221);
	}

}
