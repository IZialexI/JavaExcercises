import java.util.Scanner;
public class JavaScanners {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("What's your name?: ");
		final String YOUR_NAME = sc.nextLine();
		System.out.print("\nHow old are you?: ");
		int yourAge = sc.nextInt();
		System.out.print("\nHow tall are you?: ");
		double yourHeight = sc.nextDouble();
		System.out.print("\nAre you still studying?: ");
		boolean isStudying = sc.nextBoolean();
		System.out.println(
				"\nName: " + YOUR_NAME +
				"\nAge: " + yourAge +
				"\nHeight: " + yourHeight +
				"\nIs studying?: " + isStudying
				);
		sc.close();
	}
}
