package sorting;

import java.util.Scanner;

public class SelectionSorting {

	public static void selectionSorting(int input[]) {
		for (int i = 0; i < input.length - 1; i += 1) {
			int min = input[i];
			int minIndex = i;
			for (int j = i + 1; j < input.length; j += 1) {
				if (min > input[j]) {
					min = input[j];
					minIndex = j;
				}
			}
				if (minIndex != i) {
					int temp = input[i];
					input[i] = input[minIndex];
					input[minIndex] = temp;
					
				}
		}
		for(int k = 0; k < input.length; k += 1) {
		System.out.println(input[k] + " ");
			}
	}

	public static void main(String[] args) {
		int input[] = new int[5];
		System.out.println(input.length);
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i += 1) {
			input[i] = sc.nextInt();
		}
		selectionSorting(input);
//		int arr[] = selectionSorting(input);
//		for (int j = 0; j < arr.length; j += 1) {
//			System.out.println(arr[j] + " ");
//		}

	}
}
