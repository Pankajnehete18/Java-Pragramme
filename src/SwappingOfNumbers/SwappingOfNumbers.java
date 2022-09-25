package SwappingOfNumbers;

public class SwappingOfNumbers {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		System.out.println("Before Swapping of :"+a+" "+b);
		//logic (1)
		//int t=a;
		//a=b;
		//b=t;
		
		//logic (2)
		a=a+b;
		b=a-b;
		a=a-b;

		System.out.println("After Swapping of :"+a+" "+b);
		
		

	}

}
