import java.util.Scanner;

public class GeorgeAndAccomodation{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int count = 0;
            
            for(int i=0;i<n;i++){
                int occupied = sc.nextInt();
                int capacity = sc.nextInt();
                
                if(capacity - occupied > 1) count++;
            }
            
            System.out.println(count);
        }
    }
}