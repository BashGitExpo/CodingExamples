// 4. Fibonacci Series Using Iteration
// Question: Write a Java program to print the first N numbers in the Fibonacci series using iteration.


public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: " + a + " " + b);

        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
    }
}

// Explanation: The program initializes the first two numbers of the Fibonacci series and uses a loop to 
// calculate the subsequent numbers by summing the previous two.