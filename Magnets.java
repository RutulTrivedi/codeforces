import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            sc.nextLine();
            
            int count = 1;
            String prev = sc.nextLine();

            for (int i = 1; i < n; i++) {
                String curr = sc.nextLine();
                if (!curr.equals(prev)) {
                    count++;
                }
                prev = curr;
            }
            
            System.out.println(count);
        }
    }
}
