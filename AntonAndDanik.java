import java.util.Scanner;

public class AntonAndDanik{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            sc.nextLine();
            String games = sc.nextLine();
            int[] counters = new int[2];
            counters[0] = 0;
            counters[1] = 0;
            
            for (int i=0;i<n;i++) {
                if(games.charAt(i) == 'A') counters[0]++;
                else counters[1]++;
            }
            
            if(counters[0]>counters[1]) System.out.println("Anton");
            else if(counters[0]<counters[1]) System.out.println("Danik");
            else System.out.println("Friendship");
        }
    }
}