import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HorseshoeOnTheOtherHoof {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int color1 = scanner.nextInt();
        int color2 = scanner.nextInt();
        int color3 = scanner.nextInt();
        int color4 = scanner.nextInt();
        
        Set<Integer> uniqueColors = new HashSet<>();
        uniqueColors.add(color1);
        uniqueColors.add(color2);
        uniqueColors.add(color3);
        uniqueColors.add(color4);
        
        int neededColors = 4 - uniqueColors.size();
        
        System.out.println(neededColors);
    }
}
