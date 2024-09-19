package Practice;

public class DivideStringToN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name ="Leela";
		int n=2;
		int part = name.length()/n;
		int extraChars = name.length()%n;
		int start =0;
		
		for(int i=0;i<n;i++) {
			int end = start + part+(i<extraChars?1:0);
			System.out.println("part"+(i+1)+" "+name.substring(start,end));
			start= end;
		}

	}

}
