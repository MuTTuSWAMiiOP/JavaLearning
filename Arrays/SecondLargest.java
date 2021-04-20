package Arrays;

import java.util.Scanner;

public class SecondLargest {

	public static void largest(int[] input) {
		int n = input.length;
		int count[] = new int[n];
		int largest = input[0];
		int index = 0;
		for (int i = 0; i < n; i += 1) {
			for (int j = i + 1; j < n; j += 1) {
				if (input[i] < input[j]) {
					largest = input[j];
					index = j;
						count[j] = i;
					break;
				} else {
					continue;
				}
			}
		}

		System.out.println(largest);
		System.out.println(index);

		for (int k = 0; k < n; k += 1) {
			System.out.print(count[k] + " ");
		}

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
		largest(arr);

	}

}
