package Practice;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1 = "heart";
		String name2 = "earth";
		
		boolean isAnagram = false;
		
		if(name1.length()==name2.length()) {
			isAnagram = false;
		}
		
		char[] arrName1 = name1.toCharArray();
		char[] arrName2 = name2.toCharArray();
		
		Arrays.sort(arrName1);
		Arrays.sort(arrName2);
		System.out.println(arrName1);
		System.out.println(arrName2);
		
		System.out.println(Arrays.equals(arrName1, arrName2));
		}

}
