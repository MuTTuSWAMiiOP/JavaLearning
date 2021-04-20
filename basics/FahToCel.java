import java.util.Scanner;
public class FahToCel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double fah;
		double cel;
		System.out.println("Enter the Temprature in Faherenhite : ");
		fah = sc.nextDouble();
		cel = (5 * (fah - 32))/9;
		System.out.println("The Tempratur in Celcious is : " + cel + " degree celcius");
		
	}

}
