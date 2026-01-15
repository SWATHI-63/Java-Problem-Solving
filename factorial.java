import java.util.Scanner;

public class factorial {
    public static int computeFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * computeFactorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        System.out.println(result);
    }
}
