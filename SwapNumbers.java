// 12. Swap Two Numbers Without Using a Third Variable
// Question: Write a Java program to swap two numbers without using a third variable.

// Answer:


public class SwapNumbers {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}


// Explanation:

// The swapping is done using arithmetic operations to avoid using a third variable.