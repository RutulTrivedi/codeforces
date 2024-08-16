import java.util.Scanner;

public class BearAndBigBrother{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int ans = 0;
            while(a<=b){
                ans++;
                a = 3*a;
                b = 2*b;
            }
            System.out.println(ans);
        }
    }
}