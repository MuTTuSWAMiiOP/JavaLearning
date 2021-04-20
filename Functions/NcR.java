package Functions;

import java.util.Scanner;

public class NcR {
		public static int num(int n) {
			int fact = 1;
			for (int i = 1; i <= n; i += 1) {
				fact = fact * i;
			}
			return fact;
		}
		
		public static int den1(int r) {
			int fact = 1;
			for (int i = 1; i <= r; i += 1) {
				fact = fact * i;
			}
			return fact;
		}
		
		public static int den2(int n) {
			int fact = 1;
			for (int i = 1; i <= n; i += 1) {
				fact = fact * i;
			}
			return fact;
		}
		
		public static void result(int n, int r) {
			int num = num(n);
			int den1 =den1(r);
			int den2 = den2(n - r);
			System.out.println("\nThe Factorial of N is :" + num);
			System.out.println("The Factorial of R is : "+ den1);
			System.out.println("The Factorial of [N-R] is : "+ den2);
			int result = num/(den1 * den2);
			System.out.println("The Result is : "+ result);
		}
	
		public static void main(String[] args) {
			Scanner var = new Scanner(System.in);
			System.out.print("Enter The value of N : ");
			int n = var.nextInt();
			System.out.print("Enter The value of r : ");
			int r = var.nextInt();
			result(n, r);
			
		}
}
