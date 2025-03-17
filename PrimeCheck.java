// 5. Check for Prime Number
// Question: Write a Java program to check if a given number is prime.

public class PrimeCheck {
    public static void main(String[] args) {
        int number = 29;
        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}

// Explanation: The program checks divisibility from 2 up to the square root of the number. 
// If divisible, it's not prime; otherwise, it is.