package Patterns;
import java.util.Scanner;
public class Pattern8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int i = 1, k = 0;
		while(i <= row)
		{
			int j = i;
			while(j <= i + k)
			{
				System.out.print(j);
				j += 1;
				
			}
			i += 1;
			System.out.println();
			k += 1;
		}
	}

}
