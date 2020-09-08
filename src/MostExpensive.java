import java.util.ArrayList;

public class MostExpensive{
  
  public static void main(String[] args) {
    
    ArrayList<Double> expenses = new ArrayList<Double>();
    expenses.add(10.57);
    expenses.add(63.99);
    expenses.add(74.46);
    expenses.add(81.37);
    
    double mostExpensive = 0;
    
    // Iterate over expenses
    for (double n : expenses) {
      System.out.println(n);
      if (n > mostExpensive) {
        System.out.println(mostExpensive);
        mostExpensive = n;
      }
    
      
    }
    
    System.out.println(mostExpensive);
    
    
    //int make =1;
    for(int i=1;i<=100;i++) {
    	System.out.println(i);
    }
    
    
    
  }


	   
	  
	}
  
  


