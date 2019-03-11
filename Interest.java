import java.util.Scanner;

public class Interest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principal:");
		int Principal = sc.nextInt();
		System.out.println("Enetr the rate:");
		int Rate = sc.nextInt();
		System.out.println("Enter the time:");
		int Time = sc.nextInt();
		sc.close();
		System.out.println("Simple interest for the supplied value is:" + Principal * Rate * Time);
		int radd = (Rate / 100) + 1;
		double ci = Principal * (Math.pow(radd, Time) - 1);
		System.out.println("Compound interest for the supplied value is:" + ci);
	}
}
