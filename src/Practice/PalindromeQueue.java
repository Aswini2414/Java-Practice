package Practice;
import java.util.*;

public class PalindromeQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "madam";
		ArrayDeque<Character> ad1 = new ArrayDeque<Character>();
		
		for(int i=0; i<name.length();i++) {
			ad1.add(name.charAt(i));
		};
		
		System.out.println(ad1);
		boolean isPalindrome = true;
		
		for(int i=name.length()-1;i>=0;i--) {
			if(name.charAt(i)!=ad1.poll()) {
				isPalindrome = false;
			}
		};
		
		if(isPalindrome) {
			System.out.println(name + " " + "is a palindrome");
		}else {
			System.out.println(name + " " + "is not a palindrome");
		}
		
	}

}
