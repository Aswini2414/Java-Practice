package Practice;

import java.util.Arrays;

public class Complex {
	
	double real;
	double imaginary;
	
	public Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	};
	
	public static Complex AddComplex(Complex c1, Complex c2) {
//		double[] res = new double[2];
//		res[0] = c1.real+c2.real;
//		res[1] = c1.imaginary+c2.imaginary;
		
		Complex temp = new Complex(0,0);
		temp.real = c1.real + c2.real;
		temp.imaginary = c1.imaginary + c2.imaginary;
		
		return temp;
	}
	
	public static void main(String[] args) {
		Complex c1 = new Complex(2,1);
		Complex c2 = new Complex(3,1);
		Complex res = AddComplex(c1,c2);
//		System.out.println(Arrays.toString(AddComplex(c1,c2)));
		System.out.println(res.real + "+" + res.imaginary + "i");
		
	}
}
