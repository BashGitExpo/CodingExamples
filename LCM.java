public class LCM {
    public static void main(String[] args) {
        int num1 = 12, num2 = 15;
        System.out.println("LCM: " + (num1 * num2) / findGCD(num1, num2));
    }

    public static int findGCD(int a, int b) {
        return b == 0 ? a : findGCD(b, a % b);
    }
}



