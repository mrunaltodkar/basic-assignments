import java.util.Scanner;

public class Students1 {
	public static void main(String[] args) {
		System.out.println("How much Sarang score in english, hindi and marathi respectively");
		Scanner sc=new Scanner(System.in);
		int senglish=sc.nextInt();
		int shindi=sc.nextInt();
		int smarathi=sc.nextInt();
		
		System.out.println("How much Avinash score in english, hindi and marathi respectively");
		int aenglish=sc.nextInt();
		int ahindi=sc.nextInt();
		int amarathi=sc.nextInt();
		
		System.out.println("How much Mayur score in english, hindi and marathi respectively");
		int menglish=sc.nextInt();
		int mhindi=sc.nextInt();
		int mmarathi=sc.nextInt();
		sc.close();
		
		System.out.println("English average score is " + average(senglish,aenglish,menglish));
		System.out.println("Hindi average score is " + average(shindi,ahindi,mhindi));
		System.out.println("Marathi average score is " + average(amarathi,amarathi,mmarathi));
		
	}
	public static int average(int a, int b, int c) {
		int sum=(a+b+c)/3;
		return sum;
	}
	
}
