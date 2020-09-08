import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter a Number");
		int num= scan.nextInt();
		
		
		int count=0;
		
		if(num>1) {
			
			for(int i=1;i<=num;i++) {
				
				if(num %i ==0) 
					
					count++;
			}
					
					if(count==2) {
						
						System.out.println("Its a prime number");
					}
					
					else {
						
						System.out.println("Its not a prime number");
					}
				}
		else {
			
			System.out.println("Its not a prime number");
		}
			
			
		}
	
		
		
	}
	
	
	


