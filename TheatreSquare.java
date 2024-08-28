import java.util.Scanner;

public class TheatreSquare{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long n = sc.nextLong();
            long m = sc.nextLong();
            long a = sc.nextLong();

            long ans = (long) Math.ceil((double)n/a) * (long) Math.ceil((double)m/a);
            System.out.println(ans);
        }
    }
}