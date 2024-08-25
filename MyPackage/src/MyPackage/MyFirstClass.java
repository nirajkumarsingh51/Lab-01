// Pre-lab: Q2
//package MyPackage;
//
//public class MyFirstClass {
//    public static void main(String[] args) {
//        int number = 5; // hardcoded input
//        int factorial = 1;
//        
//        for (int i = 1; i <= number; i++) {
//            factorial *= i;
//        }
//        
//        System.out.println("Factorial of " + number + " is: " + factorial);
//    }
//}

// In-lab: Q1

package MyPackage;

public class MyFirstClass {

    // Method to calculate factorial of a number
    public static long factorial(int x) {
        long fact = 1;
        for (int i = 1; i <= x; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to check if a number is a strong number
    public static boolean isStrong(int x) {
        int original = x;
        int sum = 0;
        
        while (x > 0) {
            int digit = x % 10;
            sum += factorial(digit);
            x /= 10;
        }
        
        // If the sum of the factorials of the digits equals the original number
        return sum == original;
    }

    public static void main(String[] args) {
        int number = 145; // Hardcoded input for strong number
        
        if (isStrong(number)) {
            System.out.println(number + " is a strong number.");
        } else {
            System.out.println(number + " is not a strong number.");
        }
    }
}

