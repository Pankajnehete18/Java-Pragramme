package PalindromeString;

public class PalindromeString3 {

	public static void main(String[] args) {
		
		String str="java";
		
		String rev="";
		
		int len=str.length();
		
		String str2=str;
		
		for(int i=len-1;i>=0;i--) {
			
			rev=rev+str.charAt(i);
			
		}
		System.out.println(rev);
        if(rev.equalsIgnoreCase(str2))
        	System.out.println("String is palindrome");
        else
        	System.out.println("String is Not palindrome");
        	
        	
	}

}
