public class Patterns {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("   ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k + "  ");
            }
            int start = n - 1;
            for (int l = 1; l <= i - 1; l++) {
                System.out.print(start + "  ");
                start--;
            }
            System.out.println();
        }
    }
}
