import java.util.Arrays;
import java.util.Scanner;

public class GravityFlip {
    public static void main(String[] args) {
        int[] columns;
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            columns = new int[n];
            for (int i = 0; i < n; i++)
                columns[i] = sc.nextInt();
        }

        Arrays.sort(columns);
        
        for (int height : columns) 
            System.out.print(height + " ");
    }
}