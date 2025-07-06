import java.util.Scanner;

public class Calculator{
	public static void main(String args[]){
		// Take three parameters - 1 operator, 2 numbers - perform calculation
		Scanner scanner = new Scanner(System.in); // initialize scanner
		// First number
		System.out.print("Enter number: ");
		double firstNum = scanner.nextDouble();

		// Second number 
		System.out.print("Enter number: ");
		double secondNum = scanner.nextDouble();

		// Operation to peform on first and second numbers
		System.out.println("Select one of the following operations: +, -, *, /, %");
		System.out.print("Operation to perform: ");
		char operation = scanner.next().charAt(0);

		// Store the result of the operation
		Double result;
		String formatResult;

		// Logic to perform calculation - switch statement will indicate which operation to perform on the following numbers
		switch(operation){
		case '+':
			result = firstNum + secondNum;
			formatResult = String.format("%.2f", result);
			System.out.println(formatResult);
			break;
		case '-':
			result = firstNum - secondNum;
			formatResult = String.format("%.2f", result);
			System.out.println(formatResult);
			break;
		case '*':
			result = firstNum * secondNum;
			formatResult = String.format("%.2f", result);
			System.out.println(formatResult);
			break;
		case '/':
			result = firstNum / secondNum;
			formatResult = String.format("%.2f", result);
			System.out.println(formatResult);
			break;
		case '%':
			result = firstNum % secondNum;
			formatResult = String.format("%.2f", result);
			System.out.println(formatResult);
			break;
		default:
			System.out.println("Invalid operation selected. Try again");

		}
	}
}
