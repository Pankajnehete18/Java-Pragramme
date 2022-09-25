package PalindromeString;

public class PalindromeString1 {

	public static void main(String[] args) {
		
		String str="aabbaa";
		String str2=str;
		
		String rev="";
		int len=str.length();
		
		for(int i=len-1;i>=0;i--) {
			
			rev=rev+str.charAt(i);
			
		}
		
		   if(rev.equals(str2))
		   System.out.println("String is Palindrome");
		     else
		   System.out.println("String is not Palindrome");	 
	}

}
