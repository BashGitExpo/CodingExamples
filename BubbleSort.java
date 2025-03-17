// 7. Bubble Sort Implementation
// Question: Write a Java program to sort an array using bubble sort.

// Answer:


public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 4, 2};
        int n = numbers.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        System.out.print("Sorted array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}

// Explanation: Bubble sort repeatedly steps through the list, compares adjacent elements, 
// and swaps them if they are in the wrong order.