package practice;

class Overload{  
public static void main(int a)  //overloaded main method  
{  
System.out.println(a);  
}  
public static void main(char b) {
	System.out.println(b);
}
public static void main(String args[])  
{     
System.out.println("main method invoked"); //code 
main(6); 
main('A');
Overload.main(6);//because of static method it called through class name
}  
}  
