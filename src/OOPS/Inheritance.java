package OOPS;

public class Inheritance {

	public static void main(String[] args) {
		
		Guest g = new Guest();
		
		g.read();
		
		Developer d= new Developer();
		d.write();
		
		Admin a = new Admin();
		a.manage();

	}

}
