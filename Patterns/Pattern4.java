package Patterns;
import java.util.Scanner;
public class Pattern4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Row : ");
		int n = sc.nextInt();
		int i = n;
		while (i >= 1) {
			int s = 1;
			while (s <= (n-i))
			{
				System.out.print(" ");
				s += 1;
			}
			int j = 1;
			while(j <= i) {
				System.out.print("*");
				j += 1;
			}
			System.out.println();
			i -= 1;
		}
	}

}
