package Arrays;

public class SwapPair {
	public static void main(String[] args) {
		int[] input = { 1, 2, 3, 4, 5, 6};
		for (int i = 0; i < input.length; i += 1) {
			if (i % 2 == 0) {
				System.out.print(input[i+1] + " ");
			}
			else {
				System.out.print(input[i-1] + " ");
			}
		}

	}
}
