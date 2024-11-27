package OOPsPractice;

 class EncapPrac1{

	private long acc_no;
	private String name;
	private float amount;

	// Getter and Setter for account number
	public long getAcc_no() {
		return acc_no;
	}

	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}

	// Getter and Setter for name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Getter and Setter for amount with validation
	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		if (amount > 0) {
			this.amount = amount;
		} else {
			System.out.println("Invalid amount: Amount should be greater than 0.");
		}
	}
}

// Test class
public class EncapTest1 {

	public static void main(String[] args) {

		EncapPrac1 e = new EncapPrac1();
		e.setAcc_no(1234545678L);  // Use 'L' suffix for long literals
		e.setAmount(101.0f);        // Trying to set a negative amount (will trigger the error message)
		e.setName("Renu");
		
		System.out.println("Name: " + e.getName() + ", Amount: " + e.getAmount());
	}
}
