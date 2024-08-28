import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IWannaBeAGuy {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            Set<Integer> data = new HashSet<>();
            
            int p = sc.nextInt();
            while(p!=0){
                int temp = sc.nextInt();
                data.add(temp);
                p--;
            }
            
            int q = sc.nextInt();
            while(q!=0){
                int temp = sc.nextInt();
                data.add(temp);
                q--;
            }
            
            if(data.size()==n) System.out.println("I become the guy.");
            else System.out.println("Oh, my keyboard!");
        }
    }
}