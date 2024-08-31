import java.util.Scanner;
public class Taxi{    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int one=0,two=0,three=0,four=0;

        for(int i=0;i<n;i++){
            int temp = sc.nextInt();
            switch (temp) {
                case 1: one++; break;
                case 2: two++; break;
                case 3: three++; break;
                default: four++; break;
            }
        }

        int ans = four;

        ans += three;
        one -= three;

        ans += (two/2);
        if(two%2==1){
            ans++;
            one -= 2;
        }

        if(one>0){
            ans += (one+3)/4;
        }
        System.out.println(ans);
    }
}