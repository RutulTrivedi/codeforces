import java.util.Scanner;
public class HitTheLottery{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long n = sc.nextLong();
            int count = 0;
            
            if(n>=100){
                count += (n/100);
                n %= 100;
            }
            if(n>=20){
                count += (n/20);
                n %= 20;
            }
            if(n>=10){
                count += (n/10);
                n %= 10;
            }
            if(n>=5){
                count += (n/5);
                n %= 5;
            }
            if(n>0)
                count += n;
            
            System.out.println(count);
        }
    }
}