package practice;

public class FizzBuzz {

	public static void main(String[] args) {
	int n=15;

	for(int i=1;i<=n;i++){
        if(i%3==0){
            if(i%5==0){
                System.out.println("FizzBuzz");
            }
            else{
                System.out.println("Fizz");//if n is not divided by 5
            }
        }else{
            System.out.println("Buzz");//if n is not divided by 3
        }
        
    }
}

}
