import java.util.Scanner;

public class Marks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of SOL:");
		int sql = sc.nextInt();
		System.out.println("Enter marks of Java:");
		int java = sc.nextInt();
		System.out.println("Enter marks of Python:");
		int python = sc.nextInt();
		sc.close();
		if (sql > 60 && java > 60 && python > 60) {
			System.out.println("Congratulations you are passed");
		} else if ((java > 60 && sql > 60) || (java > 60 && python > 60) || (sql > 60 && python > 60)) {
			System.out.println("Okay!!! You are promoted");
		} else {
			System.out.println("Sorry... You are failed");
		}
	}

}
