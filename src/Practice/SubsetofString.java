package Practice;

import java.util.Arrays;

public class SubsetofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "leela";
		int temp=0;
		int n=name.length();
		
		String[] arr = new String[(n*(n+1))/2];
		
		for(int i=0;i<name.length();i++) {
			for(int j=i;j<name.length();j++) {
				arr[temp]= name.substring(i,j+1);
				temp++;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
