import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int num1 = input.nextInt();
		System.out.print("Enter the second number: ");
		int num2 = input.nextInt();
		input.close();
		int sum = num1 + num2;
		System.out.println();
		System.out.println("Sum:" +sum);
		
		

	}
}
