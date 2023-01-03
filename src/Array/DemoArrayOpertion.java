package Array;

public class DemoArrayOpertion {


	public static void main(String[] args) {
		
		int array1[][] = {{1,7,8,5},{5,8,9,4}};//R0,R1,C0,C1,C2,C3
		
		for(int i=0;i<=1;i++) {//for row
			for(int j=0;j<=3;j++) {//for column
				System.out.println(array1[i][j]);
				
			}
			System.out.println();
		}
	}

}
