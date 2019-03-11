import java.util.Scanner;

public class SearchingArray {
	public static void main(String[] args) {
		int array[] = { 5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47 };
		int num;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number from array: ");
		int input = sc.nextInt();
		sc.close();

		for (num = 0; num < 15; num++) {

			if (input != array[num]) {
				count++;
				if (count > 15) {
					System.out.println("Number is present in array");
				}
			} else if (input == array[num]) {
				System.out.println("Number" + " " + array[num] + " is at " + count + " position.");
			}
		}

	}

}
