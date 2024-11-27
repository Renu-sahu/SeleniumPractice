package JavaPrograms;

public class DataTypePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 12;
		int I = 0;
		double d = 123.456;
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(I);
	
		// Type Casting
		
		double d1 = i;
		System.out.println(d1);
		
		int i1 = (int)d;
		System.out.println(i1);
	
		// Operators - 
// Arithmetic operator
		int a, b, c;
		a = 5;
		b = 3;
		c = a%b;
	
		System.out.println(c);
		
	//Before
		System.out.println(++c);
	//After
		System.out.println(c++);
		System.out.println(c);
		
// Assignment Operator
		a= 8;
		a+=2;
		a-=3;
		System.out.println(a);

//Comparison Operator
		//System.out.println(a==b);
		//System.out.println(a<=b);
		//System.out.println(a>=b);
		
		
//Logical Operator
		System.out.println((a>b)&&(a<b));
		System.out.println(!((a>b)||(a<b)));
		
//Bitwise Operator
		
// Concatenation
		int a1 = 5;
		int b1 = 3;
		
		String a2 = "5";		
		String b2 = "3";
		String e = "6";
	//using + symbol	
		int c1 = a1+b1;
		String c2 = a2+b2;
	
	//using concat operator 
		String c3 = a2.concat(b2).concat(e);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		

		
		
		
						
	}

}
