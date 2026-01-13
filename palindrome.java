import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String reversedStr = "";

        for (int i = a.length() - 1; i >= 0; i--) {
            reversedStr += a.charAt(i);
        }

        if (a.equals(reversedStr)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}