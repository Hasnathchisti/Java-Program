import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //using algorithm
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a Number");
		
		int num= scan.nextInt();
		
		/*(int reverse= 0;
		
		while(num !=0) {
			
			reverse= reverse*10 + num%10;
			num=num/10;
		}
		
		System.out.println("Reverse number is:" + " "+ reverse);*/
		
		
		
		
		//using stringbuffer class method
		
		
		/*StringBuffer buffer= new StringBuffer(String.valueOf(num));
		StringBuffer rev= buffer.reverse();
		System.out.println("Reverse number is:" + " "+ rev);*/
		
		
		
		//using string builder class
		
		StringBuilder builder= new StringBuilder();
		
		StringBuilder revr= builder.append(num);
		
		revr.reverse();
		
		System.out.println("Reverse number is:" + " "+ revr);
		
		
		
		
		
		
	}

}
