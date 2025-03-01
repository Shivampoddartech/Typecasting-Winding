package typeCasting;

public class Demo {
	public static void main(String[] args) {

		// Winding

		int a = 10;
		double b = a;
		System.out.println(a + " " + b);

		System.out.println("----------");

		int c = 3600;
		float d = c;
		System.out.println(c + " " + d);

		// NARROWING

		double e = 10.50;
		int f = (int) e;
		System.out.println(e + " " + f);

		// Example Of Narrowing
	}
}
/*
 * what is type casting - A Process of converting one Data Type To Another Data
 * Type Is Called Type casting There Are Two Type 1 is permeative And 2 Is
 * nonPrematve 1 Permeative --- Permeative have two Type Narrowing And Second is
 * Winding Winding is a process to convert small type to big type like byte
 * short int long float double Narrowing is a process to convert big type to
 * small type is called Narrowing example is double float long int short byte
 * 
 */