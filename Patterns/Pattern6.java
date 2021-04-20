package Patterns;
import java.io.IOException;
//import java.util.Scanner;
public class Pattern6 {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter the number of Rows : ");
//	int row = sc.nextInt();
	int row = 5;
	void kk1()
	{
		int i = 1, p = 0;
		while(i <= row) 
		{
			int s = row - 1;
			while(s >= i)
			{
				System.out.print(" ");
				s -= 1;
			}
			int j = 1;
			while(j <= (i + p)) {
				System.out.print("*");
				j += 1;
			}
			System.out.println();
			i += 1;
			p += 1;
			
		}
	}
	
	void kk2()
	{
		int i = row, p = 4;
		while(i >= 1) 
		{
			int s = 1;
			while(s <= row-i)
			{
				System.out.print(" ");
				s += 1;
			}
			int j = 1;
			while(j <= (i + p)) {
				System.out.print("*");
				j += 1;
			}
			System.out.println();
			i -= 1;
			p -= 1;
			
		}
	}
	
	
	public static void main(String[] args)throws IOException {
		
		Pattern6 p = new Pattern6();
		p.kk1();
		p.kk2();
		p.kk1();
	}

}
