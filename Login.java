import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		int countLoginattempts = 0;
		String name = "Mrunal";
		String password = "Todkar";
		for (int count = 0; count < 3; count++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter login ID:");
			String inputId = sc.nextLine();
			System.out.println("Enter password:");
			String inputPassword = sc.nextLine();

			if (name.equalsIgnoreCase(inputId) && password.equalsIgnoreCase(inputPassword)) {
				System.out.println("Welcome " + name);
				break;
			}

			else {
				countLoginattempts++;
			}

		}
		if (countLoginattempts >= 3) {
			System.out.println("Contact your ADMIN!!!");
			System.exit(0);
		}

	}
}
