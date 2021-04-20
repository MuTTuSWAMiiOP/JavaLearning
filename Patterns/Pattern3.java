package Patterns;
import java.util.Scanner;
public class Pattern3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Row : ");
		int n = sc.nextInt();
		int i = 1;
		int k = 0;
		
		while (i <= n) {
			int s = 1;
			while (s <= (n-i))
			{
				System.out.print(" ");
				s += 1;
			}
			int j =1;
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
