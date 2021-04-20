package Arrays;

public class IntersectionArray {
	public static void main(String[] args) {
		int dup = -33433;
		int count = 0;
		int a[] = { 1, 2, 3, 4, 5 };
		int b[] = { 2, 4, 3, 3, 1 };
		for (int i = 0; i < a.length; i += 1) {
			for (int j = 0; j < b.length; j += 1) {
				if (a[i] == b[j]) {
					dup = a[i];
					System.out.print(dup + " ");
					count += 1;
					break;
				} else {
					continue;
				}
			}
		}
		System.out.println();
		System.out.println(count);
	}
}
