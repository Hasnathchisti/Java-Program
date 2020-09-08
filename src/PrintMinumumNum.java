
public class PrintMinumumNum {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//multidimensional arrays
		
		//print minimum number
		
		int b[][]= {{2,3,1},{4,5,6},{7,8,9}};
		int min = b[0][0];
		for (int i=0;i<3;i++) {
			
			
			for(int j=0; j<3;j++) {
				
				if(b[i][j]<min) {
					min=b[i][j];
				}
				
				
			}
			
	
				
				
		}
		System.out.println(min);
	
	
	
	
	
	
	
	
	
	}
	}
