package Practice;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = new String[] {"doll","banana","cherry","apple"};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0; j<arr.length-1-i;j++) {
				if(arr[j].compareTo(arr[j+1])>0) {
					String temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
