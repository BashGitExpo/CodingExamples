// 6. Find the Largest Element in an Array
// Question: Write a Java program to find the largest element in an array.


public class LargestInArray {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8};
        int largest = numbers[0];

        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            }
        }

        System.out.println("Largest number is: " + largest);
    }
}


// Explanation: The program iterates through the array, 
// comparing each element to the current largest value, updating it when a larger value is found.