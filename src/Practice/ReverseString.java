package Practice;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name ="kaveri";
		String reverseName = "";
		
		for(int i=name.length()-1; i>=0;i--) {
			reverseName = reverseName + name.charAt(i);
		};
		
		System.out.println(reverseName);

	}

}
