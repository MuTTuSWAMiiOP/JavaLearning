package Arrays;
public class Output1 {
	public static void change(int input[]) {
		input = new int[5];
		input[0] = 15;
	}

	public static void main(String args[]) {
		int arr[] = new int[5];
		System.out.println(arr[1]);
		change(arr);
		System.out.println(arr[0]);
	}
}