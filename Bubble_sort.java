
public class Bubble_sort {
	public static void main(String[] args) {
		int array[] = { 5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47 };
		for (int number = 0; number < 15; number++) {
			for (int number2 = 0; number2 < 14; number2++) {
				if (array[number2] > array[number2 + 1]) {
					int temp = array[number2];
					array[number2] = array[number2 + 1];
					array[number2 + 1] = temp;

				}

			}

		}
		for (int display = 0; display < 15; display++) {
			System.out.print(array[display] + " ");
		}
	}
}
