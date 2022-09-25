package ReverseACompleteString;

public class ReverseACompleteString6 {

	public static void main(String[] args) {
		
		String str="Java Programming is very Easy";
		
		String[] words=str.split(" ");
		
		String reversestring=" ";
		
		for(String w:words) {
			
			String reverseword=" ";
			
		for(int i=w.length()-1;i>=0;i--) {
			
			reverseword=reverseword+w.charAt(i);
		}
		
		   reversestring=reverseword+reversestring+" ";
		}
           System.out.println(reversestring);
	}

}
