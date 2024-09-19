package Practice;

import java.util.Scanner;
import java.util.Arrays;

public class BinaryAddition {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the first binary number: ");
		long x = scanner.nextLong();
		
		System.out.println("Enter the second binary number: ");
		long y = scanner.nextLong();
		
//		int b1 = Integer.parseInt(x);
//		int b2 = Integer.parseInt(y);
//		
//		int b3 = b1+b2;
//		
//		System.out.println(Integer.toBinaryString(b3));
		
		long[] sum = new long[20]; 
		int i=0;
		int remainder =0;
		
		while(x!=0 || y!=0) {
			sum[i++] = (x%10+y%10+remainder)%2;
			remainder = (int)(x%10+y%10+remainder)/2;
			x=x/10;
			y=y/10;
		};
//		System.out.println(i+"i value");
		
		if(remainder!=0) {
			sum[i++] = remainder;
		}
//		System.out.println(i+"i value");
		--i;
//		System.out.println(--i);
		System.out.println(Arrays.toString(sum));
		while(i>=0) {
			System.out.print(sum[i--]);
		}
		
		scanner.close();
		
		
	}
}
