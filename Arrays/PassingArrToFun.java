package Arrays;

import java.util.Scanner;

public class PassingArrToFun {
	public static int[] takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.print("Enter the Elements : ");
		for(int i = 0; i < size; i += 1) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	
	public static void display(int[] newArr) {
		int size = newArr.length;
		System.out.println("The Elements are : ");
		for(int i = 0; i < size; i += 1) {
			System.out.println(newArr[i]);
		}
		greatest(newArr);
	}
	
	public static void greatest(int[] greatestArr) {
		int size = greatestArr.length;
		int max = -34343434;
		for(int i = 0; i < size; i += 1) {
			if(greatestArr[i] > max)
				max = greatestArr[i];
		}
		System.out.println("The greatest Element is : " + max);
		
	}
	
	public static void main(String[] args) {
		int[] userArr = takeInput();
		display(userArr);
	}
}
