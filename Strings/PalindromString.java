package Strings;

import java.util.Scanner;

public class PalindromString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		str = str.toLowerCase();
		boolean dup = true;
		for(int i = 0; i < str.length()/2; i += 1) {
			if(str.charAt(i) != str.charAt(str.length()- i - 1))
			{
				dup = false;
				break;
			}
		}
		if (dup) {
			System.out.println("string is palindrom");
		}
		else {
			System.out.println("string is not palindrom");
		}
	}
	

}
