package FibbonacciSeries;

import java.util.Scanner;

public class FibbonacciSeries8 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of terms");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		int c;
		
		System.out.print(a+","+b+",");
		
		for(int i=0;i<n-2;i++) {
			c=a+b;
			System.out.print(c+",");
			a=b;
			b=c;
		}

	}

}
