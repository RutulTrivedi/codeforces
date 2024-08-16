import java.util.Scanner;

public class WrongSubtraction{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            while(k!=0){
                if(n%10 == 0) n /= 10;
                else n--;
                k--;
            }
            System.out.println(n);
        }
    }
}