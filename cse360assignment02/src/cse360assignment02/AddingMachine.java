package cse360assignment02;

public class AddingMachine {
	private int total;
	private String history;
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	public int getTotal () {
		return total;
	}
  
	public void add (int value) {
		total = total + value;
		history = history + " + " + value;
	}

	public void subtract (int value) {
		total = total - value;
		history = history + " - " + value;
	}

	public String toString () {
		return history;
	}

	public void clear() {
		history = "0";
	}
	
	public static void main(String[] args) {
		AddingMachine cal = new AddingMachine();
		cal.add(4);
		cal.subtract(2);
		cal.add(5);
		System.out.print(cal.toString());
	}
}