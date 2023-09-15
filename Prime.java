import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int flag = 0;
            System.out.print("Enter number check whether prime or not : ");
            int num = sc.nextInt();
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    System.out.println(num + " Number not prime!");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(num + " Number is Prime.");
            }
        }
    }
}
