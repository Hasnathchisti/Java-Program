
public class NoOfEvenAndOddNO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num= 347896;
		
		int evenCount=0;
		int oddCount=0;
		
		while(num>0) {
			
			int remainder= num%10;//eliminate the last digit and stores in a variable
			
			if(remainder%2==0) {
				
				evenCount++;
			}
			else {
				
				oddCount++;
			}
			
			num=num/10;// eliminate the last digit
		}
		
		System.out.println(evenCount);
		System.out.println(oddCount);
		
		
		
	}

}
