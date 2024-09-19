package Practice;
import java.util.*;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Life is full of miracles and suprises";
		String[] words = str.split(" ");
		String revStr = "";
		for(int i=words.length-1; i>=0;i--) {
			revStr = revStr + words[i]+" ";
		}
		System.out.println(revStr);

	}

}
