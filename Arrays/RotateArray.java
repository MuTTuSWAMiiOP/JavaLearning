package Arrays;

import java.util.Scanner;

public class RotateArray {

	public static int[] rotation(int[] input) {
		Scanner sc = new Scanner(System.in);
		int temp = 0, k = 0;
		int n = input.length - 1;
		System.out.println("ROTATION BY THE VALUE : ");
		int d = sc.nextInt();
		for (int i = d; i > 0; i -= 1) {
				temp = input[i-1];
				input[i-1] = input[n-k];
				input[n - k] = temp;
				k += 1;
		}
		return input;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("SIZE : ");
		int size = sc.nextInt();
		System.out.print("ELEMENTS : ");
		int arr[] = new int[size];
		for (int i = 0; i < size; i += 1) {
			arr[i] = sc.nextInt();
		}
		int input[] = rotation(arr);

		for (int j = 0; j < size; j += 1)
			System.out.print(input[j] + " ");
	}
}
