package OccuranceOfCharacter;

public class OccuranceofCharacter3 {

	public static void main(String[] args) {
		
		String str="Java Programming is Hard";
		
		int len=str.length();
		int newlength=str.replace("a", "").length();
		
		int totalcount=len-newlength;
		
		System.out.println("Occurance of cheractr a :"+totalcount);
		
		
        


	}

}
