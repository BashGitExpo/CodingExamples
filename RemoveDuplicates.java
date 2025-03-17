// 8. Remove Duplicates from ArrayList
// Question: Write a Java program to remove duplicates from an ArrayList.

// Answer:


import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5));
        Set<Integer> set = new LinkedHashSet<>(list);
        list.clear();
        list.addAll(set);

        System.out.println("ArrayList after removing duplicates: " + list);
    }
}


// Explanation: Converting the ArrayList 
// to a LinkedHashSet removes duplicates while maintaining insertion order.