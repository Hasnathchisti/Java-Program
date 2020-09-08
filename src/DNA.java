
public class DNA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
			       //  -. .-.   .-. .-.   .
			    //    \   \ /   \   \ / 
			    //   / \   \   / \   \  
			    //  ~   `-~ `-`   `-~ `-

			    String dna1= "ATGCGATACGCTTGA";
			    String dna2 = "ATGCGATACGTGA";
			    String dna3 = "ATTAATATGTACTGA";
			    String dna= dna2 ;
			    System.out.println(dna.length());
			   int start= dna.indexOf("ATG");
			   System.out.println("Start: "+ start);
			   int stop= dna.indexOf("TGA");
			   System.out.println("Stop: "+ stop);
			   if (start == 0 && stop == 12 && (stop - start) % 3 == 0) {

			  System.out.println("Condition 1 and 2 are satisfied.");
			  String protein = dna.substring(start, stop+3); 
			  System.out.println("Protein: " + protein);

			}
			else {

			    System.out.println("No protein.");

			}

			  }





			  
			  
			  
			  
			   

			
		
		
		
		
		

	}
	
	
	
	


