import java.util.Scanner;

public class KefaAndFirstSteps {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int len = 1;
            int maxLen = 1;
            
            for (int i=0;i<n;i++) arr[i] = sc.nextInt();
            
            for (int i=1;i<n;i++){
                if(arr[i]>=arr[i-1])
                    len++;
                else {
                    if(maxLen<len)
                        maxLen = len;
                    len = 1;
                }
            }
            if(maxLen<len) maxLen = len;
            
            System.out.println(maxLen);
        }
    }
}
