import java.util.Scanner;

public class Students {
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
		
		
		int englishavg=(senglish+aenglish+menglish/3);
		System.out.println("Average score in maths is"+" "+englishavg);
		
		int hindiavg=(shindi+ahindi+mhindi)/3;
		System.out.println("Hindi avg is"+" "+hindiavg);
		
		int marathiavg=(smarathi+amarathi+mmarathi)/3;
		System.out.println("science avg is"+ " "+ marathiavg);
		
		int savg=(senglish+shindi+smarathi)/3;
		System.out.println("Average of rahul is"+" "+savg);
		
		int aavg=(aenglish+ahindi+amarathi)/3;
		System.out.println("Average of kenny is"+" "+aavg);
		
		int mavg=(menglish+mhindi+mmarathi)/3;
		System.out.println("Average of xyp9x is"+" "+mavg);
		
	}
	
}
