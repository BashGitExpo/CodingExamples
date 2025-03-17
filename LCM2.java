// 17. Find the LCM (Least Common Multiple) of Two Numbers
// Question: Write a Java program to find the LCM of two numbers.

// Answer:


public class LCM2 {
    public static void main(String[] args) {
        int num1 = 12, num2 = 15;
        System.out.println("LCM: " + (num1 * num2) / findGCD(num1, num2));
    }

    public static int findGCD(int a, int b) {
        return b == 0 ? a : findGCD(b, a % b);
    }
}


// Explanation:

// LCM is calculated using the formula LCM(a, b) = (a * b) / GCD(a, b).