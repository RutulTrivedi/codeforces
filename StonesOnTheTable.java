import java.util.Scanner;

public class StonesOnTheTable{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            sc.nextLine();
            String stones = sc.nextLine();
            int count = 0;
            
            for(int i=0;i<n-1;i++){
                if(stones.charAt(i) == stones.charAt(i+1))
                    count++;
            }
            
            System.out.println(count);
        }
    }
}