import java.util.Scanner;

public class WordCapitalization{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String word = sc.nextLine();
            word = word.substring(0, 1).toUpperCase() + word.substring(1);
            System.out.println(word);
        }
    }
}