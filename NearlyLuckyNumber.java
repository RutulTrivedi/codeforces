import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long number = sc.nextLong();
            int count = 0;
            
            while (number != 0) {
                long r = number % 10;
                if (r == 4 || r == 7) {
                    count++;
                }
                number /= 10;
            }

            if (count == 4 || count == 7) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
