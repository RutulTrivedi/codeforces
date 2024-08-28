import java.util.Scanner;

public class DivisibilityProblems {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int remainder = a % b;
                int result = (remainder == 0) ? 0 : b - remainder;

                System.out.println(result);
            }
        }
    }
}
