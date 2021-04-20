package sorting;

public class BubbleSort {

	public static void bubbleSort(int a[]) {
		for (int i = 0; i < a.length - 1; i += 1) {
			for (int j = 0; j < a.length - 1; j += 1) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		
		
	}

	public static void main(String[] args) {
		int a[] = {6,9,4,8,3,1};
		bubbleSort(a);
		for(int i = 0; i < a.length; i += 1) {
		System.out.print(a[i] + " ");
		}
	}
}
