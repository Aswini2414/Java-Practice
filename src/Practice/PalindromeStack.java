package Practice;
import java.util.*;


public class PalindromeStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "madam";
		Stack<Character> s1 = new Stack();
		for(int i=0;i<name.length();i++) {
			s1.push(name.charAt(i));
		}
		
		boolean isPalindrome = true;
		
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)!=s1.pop()) {
				isPalindrome = false;
			}
		}
		
		if(isPalindrome) {
			System.out.println(name + " " + "is a palindrome");
		}else {
			System.out.println(name + " " + "is not a palindrome");
		}
		
	}

}
