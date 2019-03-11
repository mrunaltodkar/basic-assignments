import java.util.Scanner;

public class Amstrong_number {

	public static void main(String[] args) {
		System.out.println("Enter any number:");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();
		int number = input;
		int exp = input;
		double sum = 0;
		int count = 0;

		while (exp > 0) {
			count++;
			exp = exp / 10;
		}

		while (number != 0) {
			sum = sum + Math.pow(number % 10, count);
			number = number / 10;
		}

		if (input == sum) {
			System.out.println("It is armstrong");
		} else {
			System.out.println("Nope. Not armstrong.");
		}

	}

}
