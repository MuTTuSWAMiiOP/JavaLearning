package Arrays;

import java.util.Scanner;

public class Sort0And1 {

	public static int[] sorting(int a[]) {
		int temp = 0;
		for (int i = 0; i < a.length; i += 1) {
			for (int j = i + 1; j < a.length; j += 1) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					break;
				} else {
					continue;
				}
			}
		}
		return a;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("SIZE : ");
		int size = sc.nextInt();
		System.out.print("ELEMENTS : ");
		int arr[] = new int[size];
		for (int k = 0; k < size; k += 1) {
			arr[k] = sc.nextInt();
		}
		int input[] = sorting(arr);
		for (int i = 0; i < size; i += 1) {
			System.out.print(input[i] + " ");
		}
	}
}
