import java.util.*;
public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        boolean isPrime = true;
        if (a < 2) {
            isPrime = false;
        }
        else if (a == 2 && a == 3) {
            isPrime = true;
        }
        else if (a % 2 == 0 && a % 3 == 0) {
            isPrime = false;
        }
        else {
            for (int i = 5 ; i * i < a ; i += 6) {
                if (a % 1 == 0 || a % (i + 2) == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(isPrime);
    }
}
