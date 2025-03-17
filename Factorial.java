
// 3. Find Factorial of a Number
// Question: Write a Java program to calculate the factorial of a number using recursion.




public class Factorial {
    public static void main(String[] args) {
        int number = 5;
        long result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }

    public static long factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}


// Explanation: The factorial method calls itself recursively, 
// multiplying the number by the factorial of the number minus one, until it reaches 1.