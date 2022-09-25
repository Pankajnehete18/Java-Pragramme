package StringSubstring;

public class StringSubstring1 {

	public static void main(String[] args) {
		
		String str="Ganpati Bappa Moraya";
		String str1="ganpati bappa moraya";
		String str2=new String("Ganpati Bappa Moraya");
		
		System.out.println(str.contains("Ganpati"));
		
		System.out.println(str.substring(0, 5));
		
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		
		System.out.println(str.equals(str2));
		
		System.out.println(str1.equals(str2));

	}

}
