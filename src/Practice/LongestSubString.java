package Practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="abac";
		char[] arr = name.toCharArray();
		int longestSubStringLength =0;
		String longestSubString = null;
		
		Map<Character,Integer> m1 = new LinkedHashMap<>();
		
		for(int i=0; i<arr.length;i++) {
			if(!m1.containsKey(arr[i])) {
				m1.put(arr[i],i);
			}else {
				i=m1.get(arr[i]);
				m1.clear();
			}
		}
		
		if(m1.size()>longestSubStringLength) {
			longestSubStringLength = m1.size();
			longestSubString = m1.keySet().toString();
		}
		
		System.out.println(longestSubStringLength);
		System.out.println(longestSubString);
		System.out.println(m1);

		
	}

}
