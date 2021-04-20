package Patterns;
import java.util.Scanner;

public class Pattern2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of Rows : ");
		int k = 1;
		int n = s.nextInt();
		int i = 1;
		while(i <= n) {
			int  j = 1;
			while(j <= i) {
				System.out.print(k);
				k += 1;
				j += 1;
			}
			System.out.println();
			i += 1;
		}
	}

}
