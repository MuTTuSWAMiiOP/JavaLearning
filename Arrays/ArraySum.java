package Arrays;

import java.util.Scanner;

public class ArraySum {
	public static int[] sumArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lenth of Array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the Array Elements : ");
		for (int i = 0; i < size; i += 1) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	public static int sum(int[] arr) {
		int size = arr.length;
		int sum = 0;
		for (int i = 0; i < size; i += 1) {
			sum = sum + arr[i];
		}
		return sum;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Test Cases : ");
		int t = sc.nextInt();
		int[] sum = new int[t];
		for(int i =0 ; i < t; i += 1) {
		int[] userArr = sumArray();
		sum[i] = sum(userArr);
		}
		System.out.println("Sum of Array is : ");
		for (int j = 0; j < t; j += 1) {
			System.out.println(sum[j]);
			
		}
	}
}
