import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AntonAndLetters {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String letters = sc.nextLine();
            Set<Character> set = new HashSet<>();

            for (int i=0;i<letters.length();i++) {
                char c = letters.charAt(i);
                if (c>='a' && c<='z')
                    set.add(c);
            }
            System.out.println(set.size());
        }
    }
}
