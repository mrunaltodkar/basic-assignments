
public class Amstrong {

	public static void main (String [] args) 
	             { 
	          
	                    for (int i = 100 ; i <= 1000 ; i++) 
	                     { 
	                                int num = i; 
	                                int d = 0; 
	                                int s = 0;

	                                while (num > 0) 
	                                 { 
	                                             d = num % 10; 
	                                             s = s + (d * d * d); 
	                                             num = num / 10; 
	                                 } 
	                                 if (i == s) 
	                                  { 
	                                             System.out.println (i + " is Armstrong number"); 
	                                   } 
	                      } 
	            }
	
}
