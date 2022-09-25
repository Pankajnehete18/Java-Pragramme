package ReverseAString;

public class ReverseAString {

	public static void main(String[] args) {
		
		String str="Java";
		int len=str.length();
		String rev="";
		
		
		for(int i=len-1;i>=0;i--) {
		
		rev=rev+str.charAt(i);
		
	}
        System.out.println("Reverse of a String :"+rev);
}
}