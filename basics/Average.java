import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int m1, m2, m3;
		System.out.println("Enter the name of Student: ");
		name = sc.nextLine();
		System.out.println("Enter the marks : ");
		m1 = sc.nextInt();
		m2 = sc.nextInt();
		m3 = sc.nextInt();
		char n = name.charAt(0);
		int avg = (m1 + m2 + m3)/3;
		System.out.println(n);
		System.out.println(avg);
		
		
	}

}
