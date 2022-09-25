package CountNumberOfDigitsInString;

public class CountNumberOfDigitsInString1 {

	public static void main(String[] args) {
		
		String str="Java Pragramming is very hard";
		
		int count=1;
		
		for(int i=0;i<str.length()-1;i++) {
			
			if((str.charAt(i)==' ')&& str.charAt(i+1)!=' ') {
				
				count++;
			}
		}
	
		System.out.println("Number of words in given String is :"+count);
	
	}

}
