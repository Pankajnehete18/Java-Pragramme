package ArmstrongNumber;

import java.util.Scanner;

public class ArmstrongNumber4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int sum=0;
		int m=n;
		int r;
		
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=sum+r*r*r;
			
		}
         if(sum==m)
        	 System.out.println("Number is Armstrong");
         else
        	 System.out.println("Number is Not Armstrong");
	}
            //Armstrong number verified
}
