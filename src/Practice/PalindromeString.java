package Practice;
import java.util.*;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "krishna";
		char[] arr = name.toCharArray();
		Stack<Character> s1 = new Stack();
		Stack<Character> s2 = new Stack();
		
		for(char letter : arr) {
			s1.push(letter);
		}
		
		System.out.println(s1);
		
		for(int i=s1.size()-1;i>=0;i--) {
			s2.push(s1.get(i));
		}
		
		System.out.println(s2);
		if(s1.equals(s2)) {
			System.out.println(name +" "+ "is a palindrome.");
		}else {
			System.out.println(name+" "+"is not a palindrome.");
		}

	}

}
