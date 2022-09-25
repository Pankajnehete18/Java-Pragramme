package OccuranceOfCharacter;

public class OccuranceOfCharacter2 {

	public static void main(String[] args) {
		
		String str="Java programming is Hard";
		
		int len=str.length();
		int newlength=str.replace("a", "").length();
		
		int count=len-newlength;
		
		System.out.println("Occurance of a is "+count);
	}

}
