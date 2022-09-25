package ReverseNumber;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		
		int n=sc.nextInt();
		int r;
		int rev=0;
		
		while(n>0) {
			
			r=n%10;
			n=n/10;
			
			rev=rev*10+r;
			
		}
		System.out.println(rev);  
	}

}
