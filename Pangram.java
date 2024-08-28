import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangram {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            sc.nextLine();

            String str = sc.nextLine();
            str = str.toLowerCase();
            Set<Character> alphabets = new HashSet<>();
            
            for(int i=0;i<n;i++)
                alphabets.add(str.charAt(i));
            
            if(alphabets.size()==26) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}