package OOPsPractice;

//Method Overloading

public class Poly1 {

	public static void main(String[] args) {
		
		testA("Renu", 10);

	}

	static void testA() {
		System.out.println("A");
	}
	static void testA(int b) {
		System.out.println("B = "+b);
	}
	static void testA(String s) {
		System.out.println("C = "+s);
	}
	static void testA(String s, int a) {
		System.out.println("C = "+s+" "+a);
	}
	
}
