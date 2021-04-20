package Arrays;

import java.util.Scanner;

public class UniqueElement {

	public static void perform(int input[]) {
		int unique1 = -2342;
		int count = 0;
		System.out.print("The unique elements are : ");
		for (int i = 0; i < input.length; i += 1) {
				if (unique1 != input[i]) {
					unique1 = input[i];
					System.out.print(unique1 + " ");
					count += 1;
				}
				
		}
		
		System.out.println("Total unique Element : " +count);
	}

	public static void testCases(int t, int input[]) {
		
	}

	public static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter Array Elements : ");
		for (int i = 0; i < size; i += 1) {
			arr[i] = sc.nextInt();
		}
		perform(arr);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("TEST CASES : ");
		int t = sc.nextInt();
		for (int i = 0; i < t; i += 1)
			input();
		
	}
}
