package OccuranceOfCharacter;

public class OccuranceOfCharacter6 {

	public static void main(String[] args) {
		
		String str="Java Programming";
		int len=str.length();
		int newlength=str.replace("m","").length();
		
		int count=len-newlength;
		
		System.out.println("Occurance of character m :"+count);

	}

}
