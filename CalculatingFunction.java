import java.util.Scanner;

public class CalculatingFunction{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            long n = sc.nextLong();
            long ans = n%2==0 ? n/2 : -((n+1)/2);
            System.out.println(ans);
        }
    }
}