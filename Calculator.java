import java.util.Scanner;

public class Calculator{
	public static void main(String args[]){
		// Take three parameters - 1 operator, 2 numbers - perform calculation
		Scanner scanner = new Scanner(System.in); // initialize scanner
		// First number
		System.out.print("Enter first number: ");
		double firstNum = scanner.nextDouble();

		// Second number 
		System.out.print("Enter second number: ");
		double secondNum = scanner.nextDouble();

		// Operation to peform on first and second numbers
		System.out.println("Select one of the following operations: +, -, *, /, %");
		System.out.print("Operation to perform: ");
		char operation = scanner.next().charAt(0);

		// Store the result of the operation
		Double result = null;

		// Logic to perform calculation - switch statement will indicate which operation to perform on the following numbers
		switch(operation){
		case '+':
			result = firstNum + secondNum;
			System.out.println(result);
			break;
		case '-':
			result = firstNum - secondNum;
			System.out.println(result);
			break;
		case '*':
			result = firstNum * secondNum;
			System.out.println(result);
			break;
		case '/':
			if(secondNum ==0){
				System.out.println("Error: Cannot divide by zero.");
				break;
			}
			result = firstNum / secondNum;
			System.out.println(result);
			break;
		case '%':
			result = firstNum % secondNum;
			System.out.println(result);
			break;
		default:
			System.out.println("Invalid operation selected. Try again");

		} if(result != null){
			System.out.printf("%.2f%n", result);
		}
	}
}
