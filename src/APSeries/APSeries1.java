package APSeries;

import java.util.Scanner;

public class APSeries1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Programming for Arithmetice Series");
		System.out.println("Enter first number");
		
		int a=sc.nextInt();
		
		System.out.println("Enter common difference  ");
		int d=sc.nextInt();
		
		System.out.println("Enter numbers of terms");
		int n=sc.nextInt();
		
		int term=0;
		
		for(int i=0;i<=n;i++) {
			
			System.out.print(term+",");
			term=term+d;
		}
		
		
	}

}
