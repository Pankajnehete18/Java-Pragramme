package ReverseACompleteString;

public class ReverseACompleteString8 {

	public static void main(String[] args) {
		
		String str="Java Pragramming is very hard";
		
		String[] words=str.split(" ");
		
		String reversestring=" ";
		
		for(String w:words) {
			
			String reverseword=" ";
			
	   for(int i=w.length()-1;i>=0;i--) {
		   
		   reverseword=reverseword+w.charAt(i);
	   }
			reversestring=reversestring+reverseword+" ";
		
		}
	       System.out.println("Reverse of a complete string "+reversestring);
	}

}
