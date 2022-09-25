package ReverseNumber;

import java.util.Scanner;

public class ReverseNumber2 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		int rev=0;
		int r;
		
		while(n>0) {
			
			r=n%10;
			n=n/10;
			rev=rev*10+r;
			
		}
		System.out.println(rev);
	}

}
