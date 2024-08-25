package strongnumber;

public class MyFirstClass {

	 public int factorial(int n) {
	        int fact = 1;
	        for (int i = 1; i <= n; i++) {
	            fact *= i;
	        }
	        return fact;
	    }

	    // Method to check if a number is a Strong Number
	    public boolean isStrong(int number) {
	        int originalNumber = number;
	        int sum = 0;

	        while (number > 0) {
	            int digit = number % 10; // Get the last digit of the number
	            sum += factorial(digit); // Add factorial of the digit to the sum
	            number /= 10; // Remove the last digit from the number
	        }

	        // Check if the sum of factorials of digits is equal to the original number
	        return sum == originalNumber;
	    }

	    // Main method for testing
	    public static void main(String[] args) {
	        MyFirstClass myClass = new MyFirstClass();

	        int testNumber = 145; // You can change this number to test with different inputs
	        boolean isStrongNumber = myClass.isStrong(testNumber);

	        System.out.println("Is " + testNumber + " a strong number? " + isStrongNumber);
		// TODO Auto-generated method stub

	}

}



