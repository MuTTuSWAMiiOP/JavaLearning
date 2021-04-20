package Arrays;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		System.out.println("Enter the size of Array : ");
		int size = var.nextInt();
		int[] inputArr = new int[size];
		System.out.println("Enter the Array Elements : ");
		for (int i = 0; i < size; i += 1) {
			inputArr[i] = var.nextInt();
		}
		System.out.print("The Elements are : ");
		for (int i = 1; i < size; i += 1)
			System.out.print(inputArr[i] + " ");
	}

}
