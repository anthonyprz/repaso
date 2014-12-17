import java.util.ArrayList;
import java.util.Collections;

public class Arraylist{

	public static void main(String[] args) {
		
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		lista.add(9);
		lista.add(1);
		lista.add(8);
		lista.add(2);
		lista.add(5);
		
	Collections.sort(lista);
	System.out.println(lista);
	}
	
}