package ReverseAString;

public class ReverseAString5 {

	public static void main(String[] args) {
		
		
		String str="Java";
		
		String rev=" ";
		int len=str.length();
		
		for(int i=len-1;i>=0;i--) {
			
			rev=rev+str.charAt(i);
		}	
			System.out.println(rev);
		}
		

	}


