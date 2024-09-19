package Practice;

public class Factorial {
	static int fact =1;
	public static void main(String[] args) {
		System.out.println(factorial(5));
	}
	
	public static int factorial(int num) {
		for(int i=1; i<=num; i++) {
			fact = fact*i;
		};
		
		return fact;
	}
}
