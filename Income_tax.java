import java.util.Scanner;

public class Income_tax {
	public static void main(String[] args) {
		System.out.println("What is your annual salary?");
		Scanner sc= new Scanner(System.in);
		int income=sc.nextInt();
		sc.close();
		if(income>500000)
		{
			System.out.println("Income tax is:"+ (3*income)/10);
		}
		else if(income<500000&&income>300001)
		{
			System.out.println("Income tax is :" + income/5);
		}
		else if(income>180001&&income<300000)
		{
			System.out.println("Income taax is :" + income/10);
		}
		else
			System.out.println("Congratulations no tax");
	}

}