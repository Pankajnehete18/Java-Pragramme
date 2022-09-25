package PalindromeString;

public class PalindromeString2 {

	public static void main(String[] args) {

       String str="aba";
       String str2=str;
       
       String rev="";
       int len=str.length();
       
       for(int i=len-1;i>=0;i--) {
    	   
    	   rev=rev+str.charAt(i);
       }
       
           if(str2.equals(rev))
        	System.out.println("String is Palindrome");
           else
        	System.out.println("String is not Palindrome");
        	   
	}

}
