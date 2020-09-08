
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//using string concatenation 
		
		
		String str= "madam";
		
		int length = str.length();// length is 4
		
		String reverse= ""; // empty variable
		
		for(int i= length-1; i>=0;i--)// length-1 since index starts at 0 
			
			{
			reverse= reverse+ str.charAt(i);
			
		}
		
		System.out.println(reverse);
		
		//using character array
		
		/*char[] a =str.toCharArray();
		
		int len= a.length;
		
		String rev= " ";
		
		for(int i=len-1;i>=0;i--) {
			
			
			rev= rev+ a[i];
			
		}
	
		System.out.println(rev);*/
		
		if(str.equals(reverse)) {
			
			System.out.println("Its a palindrome");
			
		}
		
		else {
			
			System.out.println("not a palindrome");
		}
	}

}
