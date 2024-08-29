import java.util.Scanner;

public class Expression {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int result1 = a + b + c;
            int result2 = a * b * c;
            int result3 = (a + b) * c;
            int result4 = a * (b + c);
            int result5 = a * b + c;
            int result6 = a + b * c;

            int ans = Math.max(result1, Math.max(result2, Math.max(result3,
                            Math.max(result4, Math.max(result5, result6)))));

            System.out.println(ans);
        }
    }
}
