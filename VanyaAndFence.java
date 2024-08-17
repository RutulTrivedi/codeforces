import java.util.Scanner;

public class VanyaAndFence{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int h = sc.nextInt();
            int error = 0;
            
            for(int i=0;i<n;i++){
                int curr = sc.nextInt();
                if(curr>h) error++;
            }
            
            int ans = (error*2) + (n-error);
            System.out.println(ans);
        }
    }
}