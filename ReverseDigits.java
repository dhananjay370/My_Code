public class ReverseDigits {
    public static void main(String[] args) {
        int n = 543;
        int reverseDigits = 0;
        while (n != 0) {
            int digit = n % 10;
            reverseDigits = (reverseDigits * 10) + digit;
            n = n / 10;
        }
        System.out.println(reverseDigits);
    }
}