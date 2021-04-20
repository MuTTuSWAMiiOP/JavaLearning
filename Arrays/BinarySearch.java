package Arrays;

import java.util.Scanner;

public class BinarySearch {

	public static int sorting(int arr[], int x) {
		Scanner sc = new Scanner(System.in);

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
//			if () {
			int mid = (start + end) / 2;
			if (arr[mid] == x) {
				return mid;

			} else if (x < arr[mid]) {
				end = mid - 1;

			} else if (x > arr[mid]) {
				start = mid + 1;
			}
		}
		return -1;
	}

//	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i += 1) {
			arr[i] = sc.nextInt();
		}

		int t = sc.nextInt();
		int sorted[] = new int[t];
		for (int c = 0; c < t; c += 1) {
			int x = sc.nextInt();
			sorted[c] = sorting(arr, x);
		}
		int k = 0;
		while(k < t) {
			System.out.println(sorted[k]);
			k += 1;
		}

	}

}
// First i am taking size of array then an array name arr[] and then the no of test cases
// I then created another array named sorted[] to store the result of sorting() which will return one value.
// I took one interger x then used called by value to pass the integer and array at 0th position of sorted array, which will hold
// the value return by sorting()
// lastly i used loop to print content of sorted[]
