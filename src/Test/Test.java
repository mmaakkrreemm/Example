package Test;

public class Test {

	// main program
	public static void main(String[] args) {
	 int number = 1;
	 System.out.println("Main program variable number holds the value: " +
	number);
	 addThree(number);
	 System.out.println("Main program variable number holds the value: " +
	number);
	}
	// method
	public static void addThree(int number) {
	 System.out.println("Method parameter number holds the value: " + number);
	 number = number + 3;
	 System.out.println("Method parameter number holds the value: " + number);
	}

}
