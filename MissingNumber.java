// 10. Find Missing Number in an Array (1 to N Sequence)
// Question: Write a Java program to find a missing number in an array of 1 to N.

// Answer:


public class MissingNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 5, 6};
        int n = numbers.length + 1;
        int sum = (n * (n + 1)) / 2;

        for (int number : numbers) {
            sum -= number;
        }

        System.out.println("Missing number is: " + sum);
    }
}


// Explanation:

// The program calculates the sum of the first N numbers using the formula n * (n + 1) / 2.
// It subtracts the sum of the given array from this total to find the missing number.