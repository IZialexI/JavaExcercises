import java.util.Scanner;
public class IfElse {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Introduzca su edad: ");
		int age = input.nextInt();
		if (age >= 65) {
			System.out.println("Usted está jubilado");
		} else if (age >= 18) {
			System.out.println("Usted es mayor de edad");
		} else {
			System.out.println("Usted es menor de edad");
		}

	}
}
