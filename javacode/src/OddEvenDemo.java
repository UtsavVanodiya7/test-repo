import java.util.Scanner;

public class OddEvenDemo {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();

        if (a % 2 == 0) {
            System.out.println("Even number.");
        } else {
            System.out.println("Odd number.");
        }
    }
}
