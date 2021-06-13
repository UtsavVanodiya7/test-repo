import java.util.Scanner;

public class PalindromeDemo {
    public static void main(String[] args) {
        String string = new Scanner(System.in).next();

        if (new StringBuilder(string).reverse().toString().equalsIgnoreCase(string)) {
            System.out.println(string + " is plaindrome.");
        } else {
            System.out.println(string + " is not plaindrome.");
        }
    }
}
