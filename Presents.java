import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] que = new int[n];
            int[] ans = new int[n];
            
            for(int i = 0; i < n; i++){
                que[i] = sc.nextInt();
            }
            
            for(int i = 0; i < n; i++){
                ans[que[i]-1] = i + 1;
            }
            
            for(int i : ans)
                System.out.print(i + " ");
        }
    }
}
