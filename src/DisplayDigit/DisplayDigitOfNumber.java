package DisplayDigit;

import java.util.Scanner;

public class DisplayDigitOfNumber {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		int r;
		int sum=0;
		int count=0;
		while(n>0) {
			
			r=n%10;
			n=n/10;
			
		System.out.println("Display digits "+r);
		count++;
		sum=sum+r;
		
		}
		System.out.println("Sum of Digits "+sum); 
		System.out.println("Number of Digit in Numbers "+count);	
	}

}
