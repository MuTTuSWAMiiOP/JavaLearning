package Strings;

public class StringPrefix {
	
	public static void stringPrefix(String s1) {
//		for(int i = 0; i < s1.length(); i += 1) {
//			for(int j = 0; j <= i; j += 1) {
//				System.out.print(s1.charAt(j));
//			}
//			System.out.println();
//		}
		for (int i = 0; i < s1.length(); i++) {
			System.out.println(s1.substring(0, i + 1));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcde";
		stringPrefix(str);
	}

}
