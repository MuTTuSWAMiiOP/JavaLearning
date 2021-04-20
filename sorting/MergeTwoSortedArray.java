package sorting;

public class MergeTwoSortedArray {

	public static int[] mergeSort(int a[], int b[]) {
		int i = 0;
		int j = 0;
		int k = 0;
		int c[] = new int[a.length + b.length];
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				c[k] = a[i];
				i += 1;
				k += 1;
			} else {
				c[k] = b[j];
				j += 1;
				k += 1;
			}
		}
		while (i < a.length) {
			c[k] = a[i];
			i += 1;
			k += 1;
		}
		while (j < b.length) {
			c[k] = a[j];
			j += 1;
			k += 1;
		}

		return c;
	}

	public static void main(String[] args) {
		int a[] = { 2, 6, 9, 15 };
		int b[] = { 1, 2, 3, 5 };
		int c[] = mergeSort(a, b);
		for (int r = 0; r < c.length; r += 1) {
			System.out.print(c[r] + " ");
		}
		System.out.println();

	}

}
