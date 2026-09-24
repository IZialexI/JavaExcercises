import java.util.Scanner;
public class JavaSimpleCaseMenu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println ("Simple calculator:\n1: +\n2: -");
		int op = sc.nextInt();
		switch (op) {
			case 1:
				System.out.println("+");
				break;
			case 2:
				System.out.println("-");
				break;
			default:
				System.out.println("Invalid option");
				break;
		}
		sc.close();
	}
}
