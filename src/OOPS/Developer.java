package OOPS;

public class Developer extends Guest {
	
	public void write() {
		super.read();
		System.out.println("write method from developer");
	}
	
	public static void main(String[] args) {
	}
	
	public void read() {
		System.out.println("read mehtod from developer");
	}
}
