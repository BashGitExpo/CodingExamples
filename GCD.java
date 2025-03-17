// 16. Find the GCD (Greatest Common Divisor) of Two Numbers
// Question: Write a Java program to find the GCD of two numbers using recursion.

// Answer:


public class GCD {
    public static void main(String[] args) {
        int num1 = 56, num2 = 98;
        System.out.println("GCD: " + findGCD(num1, num2));
    }

    public static int findGCD(int a, int b) {
        return b == 0 ? a : findGCD(b, a % b);
    }
}


// Explanation:

// Uses Euclidean algorithm recursively.