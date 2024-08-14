import java.util.Scanner;

public class NextRound{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] scores = new int[n];

            for(int i=0;i<n;i++)
                scores[i] = sc.nextInt();
            
            int kthScore = scores[k-1];
            int ans = 0;

            for(int i=0;i<n;i++){
                if(scores[i]>=kthScore && scores[i]>0) ans++;
            }
            System.out.println(ans);
        }
    }
}