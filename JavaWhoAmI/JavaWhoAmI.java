import java.util.Scanner;
public class JavaWhoAmI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(
			"\nWhat's your name?: "
		);
		final String YOUR_NAME = sc.nextLine();
		System.out.println(
			"\nHow old are you?: "
		);
		int yourAge = sc.nextInt();
		if (yourAge < 18) {
			System.out.println(
				YOUR_NAME +
				" is minor"
			);
		}
		System.out.println(
			"\nHow tall are you?: "
		);
		double yourHeight = sc.nextDouble();
		if (yourHeight > 1.80) {
			System.out.println(
				YOUR_NAME +
				" is tall"
			);
		}
		else if (yourHeight < 1.55) {
			System.out.println(
				"Sorry, who is talking?"
			);
		}
		System.out.println(
			"\nAre you studying? (true/false): "
		);
		boolean isStudying = sc.nextBoolean();
		if (isStudying) {
			System.out.println(
				YOUR_NAME +
				" is studying"
			);
		}
		else {
			System.out.println(
				YOUR_NAME +
				" isn't studying"
			);
		}
		sc.close();
	}
}
