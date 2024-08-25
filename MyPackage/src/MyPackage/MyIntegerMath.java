package MyPackage;

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
