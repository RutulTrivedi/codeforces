import java.util.Scanner;

public class Elephant{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            int ans = x/5;
            x %= 5;
            ans += x/4;
            x %= 4;
            ans += x/3;
            x %= 3;
            ans += x/2;
            x %= 2;
            ans += x;
            System.out.println(ans);
        }
    }
}