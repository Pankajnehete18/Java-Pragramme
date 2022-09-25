package PalindromeNumber;

import java.util.Scanner;

public class PalindromeNumberOrNot {

	public static void main(String[] args) {
		

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		int m=n;
		int rev=0;
		int r;
		
		while(n>0) {
			
			r=n%10;
			n=n/10;
			
			rev=rev*10+r;
	}
        if(rev==m)
        	System.out.println("Number is Palindrome");
        else
        	System.out.println("Number is not Palindrome");
}
}