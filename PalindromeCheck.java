// 2. Check for Palindrome
// Question: Write a Java program to check if a given string is a palindrome.


public class PalindromeCheck {
    public static void main(String[] args) {
        String original = "madam";
        String reversed = new StringBuilder(original).reverse().toString();
        if (original.equals(reversed)) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}


// Explanation: The program reverses the input string and compares it to the original. 
// If they are identical, the string is a palindrome.