package CountNumberOfDigitsInString;

public class CountNumberOfDigitsInString {

	public static void main(String[] args) {
		
		String str="Java Programming is very Hard";
		
		int count=1;
		
		for(int i=0;i<str.length()-1;i++) {
			
			if((str.charAt(i)==' ') && (str.charAt(i+1)!=' ')) {
				
				count++;
				
			}
		}
		System.out.println("Total count in String :"+count);

	}

}
