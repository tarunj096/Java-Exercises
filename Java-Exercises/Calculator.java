import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Addition: " + (a + b));
		System.out.println("Subtraction: " + (a - b));
		System.out.println("Multiply: " + (a * b));
		System.out.println("Divide: " + (a / b));
		System.out.println("Remainder (mod): " + (a % b));
		System.out.println("Exponent: " + Math.pow(a, b));

		
		
	}
	
}
