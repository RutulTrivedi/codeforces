import java.util.Scanner;

public class Tram{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int ans = 0;
            int curr = 0;
            
            for(int i=0;i<n;i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                curr = curr -a +b;
                ans = Math.max(ans,curr);
            }
            
            System.out.println(ans);
        }
    }
}