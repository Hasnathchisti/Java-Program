import java.util.Scanner;

public class LargestOf3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		
		
		
		
		System.out.println("Please enter a number");
		int a= scan.nextInt();
		
		System.out.println("Please enter a number");
		int b= scan.nextInt();
		
		System.out.println("Please enter a number");
		int c= scan.nextInt();
		  
		int largest1= a>b?a:b;// Ternary operator returns true or false value
		int largest2= c>largest1?c:largest1;
		
		System.out.println("largest no is:"+  " "+largest2);
		
		
	}

}
