import java.util.Scanner;

public class EvenOdds {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            
            if (k <= (n + 1) / 2) {
                System.out.println(2 * k - 1);
            } else {
                System.out.println(2 * (k - (n + 1) / 2));
            }
        }
    }
}
