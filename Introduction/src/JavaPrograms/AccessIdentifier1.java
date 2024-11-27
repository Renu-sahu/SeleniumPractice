package JavaPrograms;

public class AccessIdentifier1 {

	static int a = 5;
	static public String s = "Test";
	static private String s2 = "Java";
	static protected String s3 = "Practice";
	
	public static void main(String[] args) {
	
	System.out.println(a);
	System.out.println(s);
	System.out.println(s2);
	System.out.println(s3);
	}

}

class A extends AccessIdentifier1 {
	
	void test() {
	System.out.println(a);
	System.out.println(s);
	System.out.println(s2);
	System.out.println(s3);
	}
}