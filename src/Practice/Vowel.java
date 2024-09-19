package Practice;
import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the letter: ");
		char letter = scanner.next().charAt(0);
		
		switch(letter) {
			case 'A','E','I','O','U','a','e','i','o','u':
			System.out.println(letter + "is a vowel");
			break;
			default:
				System.out.println(letter + "is not a vowel,it's a consonant");
		}
		

	}

}
