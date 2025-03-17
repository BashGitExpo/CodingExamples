// 11. Find Duplicate Elements in an Array
// Question: Write a Java program to find duplicate elements in an array.

// Answer:


import java.util.HashSet;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 5, 3, 8, 2};
        HashSet<Integer> set = new HashSet<>();
        System.out.print("Duplicate elements: ");

        for (int number : numbers) {
            if (!set.add(number)) {
                System.out.print(number + " ");
            }
        }
    }
}


// Explanation:

// The program uses a HashSet to track seen numbers.
// If add() returns false, it means the number is a duplicate.