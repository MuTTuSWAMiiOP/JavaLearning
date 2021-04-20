package sorting;

public class InsertionSort2 {
	
	public static void sort(int a[]) {
		for(int i = 0; i < a.length; i += 1) {
			int index = i;
			while(index > 0 && a[index - 1] >= a[index]) {
				int temp = a[index - 1];
				a[index - 1] = a[index];
				a[index] = temp;
				index -= 1;
			}
		}
	}
	
	public static void main(String[] args) {
		int a[] = {3,8,2,7,9,1};
		sort(a);
		for(int i = 0; i < a.length; i += 1) {
			System.out.print(a[i] + " ");
		}
	}
}
