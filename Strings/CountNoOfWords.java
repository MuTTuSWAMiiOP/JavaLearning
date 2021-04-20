package Strings;

import java.util.Scanner;

public class CountNoOfWords {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
//		String name = "Hello world this is kishan";
		int count = 0;
		System.out.println(name.length());
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == ' ') {
				count += 1;
			}
		}
		count += 1;
		System.out.println(count);
	}
}
