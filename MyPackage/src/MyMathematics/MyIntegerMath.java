// In-lab: 02,03

//package MyMathematics;
//
//public class MyIntegerMath {
//
//    // Method to calculate factorial of a number
//    public static long factorial(int x) {
//        long fact = 1;
//        for (int i = 1; i <= x; i++) {
//            fact *= i;
//        }
//        return fact;
//    }
//
//    // Method to check if a number is a strong number
//    public static boolean isStrong(int x) {
//        int original = x;
//        int sum = 0;
//        
//        while (x > 0) {
//            int digit = x % 10;
//            sum += factorial(digit);
//            x /= 10;
//        }
//        
//        return sum == original;
//    }
//}


// post-lab: 02

package MyMathematics;

public class MyIntegerMath {

    // Method to count the number of digits in a number
    public static int countDigits(int x) {
        return String.valueOf(x).length();
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int x) {
        int numberOfDigits = countDigits(x);
        int sum = 0;
        int temp = x;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numberOfDigits);
            temp /= 10;
        }

        return sum == x;
    }
}
