/**
 * Calcula el resultado de una operación con dos números
 * Usa una función para reutilizar el código que pide los valores
 * Ejecuta solo la operación deseada a través de switch
 * Repite el proceso las veces que sea necesario con while
 */
import java.util.Scanner;
public class JavaCalculator {
	public static int askNum(String text, Scanner sc) {
		System.out.print(text);
		int num = sc.nextInt();
		return num;
	}
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int op = 1;
		while (op != 0) {
			int n1 = 0, n2 = 0, total = 0;
			System.out.println("0: Salir");
			System.out.println("1: Suma");
			System.out.println("2: Resta");
			System.out.println("3: Multiplicación");
			System.out.println("4: División");
			op = sc.nextInt();
			if (op != 0) {
				n1 = askNum("Introduce el primer número: ", sc);
				n2 = askNum("Introduce el segundo número: ", sc);
			}
			switch (op) {
				case 0:
					System.out.println("Saliendo...");
					break;
				case 1:
					total = n1 + n2;
					System.out.println(n1 + " + " + n2 + " = " + total);
					break;
				case 2:
					total = n1 - n2;
					System.out.println(n1 + " - " + n2 + " = " + total);
					break;
				case 3:
					total = n1 * n2;
					System.out.println(n1 + " * " + n2 + " = " + total);
					break;
				case 4:
					total = n1 / n2;
					System.out.println(n1 + " / " + n2 + " = " + total);
					break;
				default:
					System.out.println("Selecciona un tipo de operación válido");
					break;
			}
		}
	}
}
