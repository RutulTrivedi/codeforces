import java.util.Scanner;

public class Drinks{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            double ans = 0;
            
            for(int i=0;i<n;i++){
                int temp = sc.nextInt();
                ans += (temp/100.0);
            }
            
            ans /= n;
            
            ans *= 100;
            
            System.out.println(ans);
        }
    }
}