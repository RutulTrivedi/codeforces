import java.util.Scanner;

public class DominoPiling{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            System.out.println((m*n)/2);
        }
    }
}