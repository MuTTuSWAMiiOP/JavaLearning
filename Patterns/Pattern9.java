package Patterns;
import java.util.Scanner;
public class Pattern9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int row = sc.nextInt();
		int i = 1;
		while(i <= row)
		{
			int space = row - 1;
			while(space >= i)
			{
				System.out.print(" ");
				space -= 1;
			}
			int j = 1;
			int o = 1;
			while(j <= i)
			{
				System.out.print(j);
				j += 1;
				o += 1;
			}
			int k = i - 1;
			while(k >= 1)
			{
				System.out.print(k);
				k -= 1;
			}
			i += 1;
			System.out.println();
		}
	}

}
