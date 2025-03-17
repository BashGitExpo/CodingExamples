// 9. Find the Second Largest Number in an Array

// Question: Write a Java program to find the second largest number in an array.

// Answer:

public class SecondLargest {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 20, 8, 25, 15};
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > first) {
                second = first;
                first = number;
            } else if (number > second && number != first) {
                second = number;
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("No second largest number found.");
        } else {
            System.out.println("Second largest number is: " + second);
        }
    }
}


// Explanation:

// The program iterates through the array while keeping track of the largest and second-largest numbers.
// If a number is greater than the current largest, the second-largest is updated before replacing the largest.