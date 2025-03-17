
// 1. Reverse a String in Java
// Question: Write a Java program to reverse a given string.

public class ReverseString {
    public static void main(String[] args) {
        String original = "Reshma";
        String reversed = new StringBuilder(original).reverse().toString();
        System.out.println("Reversed String: " + reversed);
    }
}


// Explanation: This program utilizes the StringBuilder class, which has a built-in reverse() method, 
// making it efficient for reversing strings.