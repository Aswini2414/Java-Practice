import java.util.Enumeration;
import java.util.Vector;

public class Iterators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Enumeration - Interface
		//It is introduced for iterating the legacy collection objects
		//HashTable,Vector,Stack,Dictionary,Properties
		//v1.0
		
		Vector<String> v1 = new Vector<>();
		v1.add("Banana");
		v1.add("Cherry");
		
		Enumeration<String> e = v1.elements();
		//e.hasMoreElements()
		//e.nextElement();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}
