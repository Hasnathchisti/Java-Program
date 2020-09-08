import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] carMake = new String [] {"New York", "Seatalle"};
		
		System.out.println(carMake.length);;
				
		
		List <String> newCarMake = new ArrayList<String>(Arrays.asList(carMake));
		
		newCarMake.add("Los Angelos");
		
		
		System.out.println(newCarMake);

	}

}
