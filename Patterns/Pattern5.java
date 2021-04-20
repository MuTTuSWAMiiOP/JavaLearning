package Patterns;
import java.util.Scanner;
public class Pattern5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int i = 1;
		while(i <= row) {
			int j = 1;
			while(j <= i) {
				System.out.print("*");
				j += 1;
			}
			System.out.println();
			i += 1;
		}
	}

}
