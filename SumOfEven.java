import java.util.Scanner;

public class SumOfEven {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a Number : ");
            int n = sc.nextInt();
            int i = 1;
            int sum = 0;
            while (i <= n) {
                if (i % 2 == 0) {
                    sum += i;
                }
                i++;
            }
            System.out.println(sum);
        }
    }
}
