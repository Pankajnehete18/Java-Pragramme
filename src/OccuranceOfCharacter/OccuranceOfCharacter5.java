package OccuranceOfCharacter;

public class OccuranceOfCharacter5 {

	public static void main(String[] args) {
		
		String str="Java";
		
		int len=str.length();
		int newlength=str.replace("a", "").length();
		
		int count=len-newlength;
		
		System.out.println("Occurance of character a "+count);

	}

}
