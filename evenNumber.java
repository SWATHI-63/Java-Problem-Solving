import java.util.Scanner;
public class evenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
