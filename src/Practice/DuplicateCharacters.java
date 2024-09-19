package Practice;
import java.util.*;
import java.util.Map.Entry;

public class DuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name ="madam";
		char[] arr = name.toCharArray();
		Map<Character,Integer> m1 = new HashMap();
		
		for(char letter : arr) {
			if(m1.get(letter)==null) {
				m1.put(letter,1);
			}else {
				m1.put(letter,m1.get(letter)+1);
			}
		}
		
		System.out.println(m1);
		
		Set<Entry<Character,Integer>>entries = m1.entrySet();
		for(Entry<Character,Integer> entry : entries) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+">>>>>"+entry.getValue());
			}
		}

	}

}
