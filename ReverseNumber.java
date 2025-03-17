

// 15. Reverse a Number
// Question: Write a Java program to reverse an integer.

// Answer:


public class ReverseNumber {
    public static void main(String[] args) {
        int number = 12345;
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        System.out.println("Reversed number: " + reversed);
    }
}


// Explanation:

// Extracts digits from the end of the number and builds the reversed number iteratively.