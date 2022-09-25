package OccuranceOfCharacter;

public class OccuranceOfCharacter {

	public static void main(String[] args) {
		
		String str="Java Programming";
		
		int len=str.length();
		
		int newlen=str.replace("m", "").length();
		int count=len-newlen;
		
		System.out.println("Occurance of m :"+count);
	}

}
