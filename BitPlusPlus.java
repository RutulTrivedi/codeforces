import java.util.Scanner;
public class BitPlusPlus{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            sc.nextLine();
            int ans=0;
            
            while(n!=0){
                String op = sc.nextLine();
                if(op.contains("++")) ans++;
                else ans--;
                n--;
            }
            System.out.println(ans);
        }
    }
}