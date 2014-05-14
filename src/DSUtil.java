import java.util.Random;


public class DSUtil {
	
	 static private Random value = new Random();// Random class object 

	// Swap two objects in an array 
	 public static void swap(Object[] array, int p1, int p2) { 
	 Object temp = array[p1]; 
	 array[p1] = array[p2]; 
	 array[p2] = temp; 
	 } 
	 
	 
}
