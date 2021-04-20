package sorting;

public class InsertionSort {

	public static void insertionSort(int a[]) {
		for(int i = 0; i < a.length - 1; i += 1) {
			int k = i; 
			for(int j = i + 1; j > 0; j -= 1) {
				if(a[j] < a[k]) {
					int temp = a[j];
					a[j] = a[k];
					a[k] = temp;
					k -= 1;
				}
			}
		}
	}

	public static void main(String[] args) {
		int a[] = { 9, 8 , 5, 6,7, 2, 1};
		insertionSort(a);
		for(int i = 0; i < a.length; i += 1) {
			System.out.print(a[i] + " ");
		}
	}

}
