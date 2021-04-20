package Strings;

public class CharacterOfStringInSeparateLine {
	
	public static void separateCharacters(String str) {
		for(int i = 0; i < str.length(); i += 1) {
			System.out.println(str.charAt(i));
		}
	}
	public static void main(String[] args) {
		String str = "kishan";
		separateCharacters(str);
	}

}
