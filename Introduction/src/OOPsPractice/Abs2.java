package OOPsPractice;

public class Abs2 extends Abs1{
	
	void wheel() {
		System.out.println("Car has 4 wheels");
	}
	
	void mirror() {
		System.out.println("Car has 2 mirrors");
	}

	
	public static void main(String[] args) {
	
		Abs1 a = new Abs2();
		a.engine();
		a.wheel();
		a.mirror();
	}

}
