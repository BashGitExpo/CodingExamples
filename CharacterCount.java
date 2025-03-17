// 14. Count Occurrences of Each Character in a String
// Question: Write a Java program to count the occurrences of each character in a string.

// Answer:


import java.util.HashMap;

public class CharacterCount {
    public static void main(String[] args) {
        String str = "programming";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        System.out.println(map);
    }
}

// Explanation:

// Uses a HashMap to store character counts.