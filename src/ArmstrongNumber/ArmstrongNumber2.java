package ArmstrongNumber;

import java.util.Scanner;

public class ArmstrongNumber2 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		
		int m=n;
		int sum=0;
		int r;
		
		while(n>0) {
			
			r=n%10;
			n=n/10;
			
			sum=sum+r*r*r;
	}
        if(sum==m)
        	System.out.println("Number is Armstrong");
        else
        	System.out.println("Number is not Armstrong");
	}

}
