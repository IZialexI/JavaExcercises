import java.util.Scanner;
public class JavaWhoAmI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Who are you?: ");
		final String YOUR_NAME = sc.nextLine();
		if (YOUR_NAME.equals("Zia")) {
			System.out.print("Father?");
		}
		System.out.print("\nHow old are you?: ");
		int yourAge = sc.nextInt();
		if (yourAge < 18) {
			System.out.print(YOUR_NAME + " is minor");
		}
		System.out.print("\nHow tall are you?: ");
		double yourHeight = sc.nextDouble();
		if (yourHeight < 1.60) {
			System.out.print("Sorry, who is talking?");
		}
		System.out.print("\nAre you studying? (true/false): ");
		boolean isStudying = sc.nextBoolean();
		if (isStudying) {
			System.out.print("Keep it up");
		} else {
		       System.out.print("You can do it");
		}
 		sc.close();		
	}
}
