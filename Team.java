import java.util.Scanner;

public class Team{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int ans = 0;

            while(n!=0){
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();

                if(a+b+c >= 2) ans++;
                n--;
            }
            System.out.println(ans);
        }
    }
}