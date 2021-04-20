package Arrays;

import java.util.Scanner;

public class sumPairArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("SIZE : ");
		int size = sc.nextInt();
		System.out.print("ELEMENTS : ");
		int arr[] = new int[size];
		for (int k = 0; k < size; k += 1) {
			arr[k] = sc.nextInt();
		}
		System.out.print("INTEGER : ");
		int x = sc.nextInt();
		int count = 0;

		for (int i = 0; i < size; i += 1) {
			for (int j = i +1; j < size; j += 1) {
				if (arr[i] + arr[j] == x) {
					count += 1;
					break;
				} else {
					continue;
				}
			}

		}
		System.out.println(count);

	}
}
