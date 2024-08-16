import java.util.Scanner;

public class SoldiersAndBananas{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int k = sc.nextInt();
            int n = sc.nextInt();
            int w = sc.nextInt();
            int ans = 0;
            for (int i=1;i<=w;i++) {
                ans += (i*k);
            }
            if(n>=ans){
                System.out.println(0);
            }
            else{
                System.out.println(ans-n);
            }
        }
    }
}