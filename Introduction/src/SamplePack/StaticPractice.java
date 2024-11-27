package SamplePack;

public class StaticPractice {
	
	int rollnumber;
	String name;
	static String college = "IIT";
	
	StaticPractice(int r, String n){
		
		rollnumber =r;
		name = n;
	}
	
	void test() {
		System.out.println(rollnumber + " "+ name + " "+ college);
	}

	public static void main(String[] args) {
		
StaticPractice SP1 = new StaticPractice(1, "Renu");
StaticPractice SP2 = new StaticPractice(2, "Viju");

SP1.test();
SP2.test();
		
	}
}
