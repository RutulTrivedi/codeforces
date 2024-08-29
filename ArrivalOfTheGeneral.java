import java.util.Scanner;

public class ArrivalOfTheGeneral {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] heights = new int[n];

            for (int i = 0; i < n; i++)
                heights[i] = sc.nextInt();

            int maxIndex = 0;
            int minIndex = 0;

            for (int i=1;i<n;i++) {
                if (heights[i]>heights[maxIndex])
                    maxIndex = i;
                if (heights[i]<=heights[minIndex])
                    minIndex = i;
            }
            int moves = maxIndex + (n-1-minIndex);

            if (maxIndex > minIndex) moves -= 1;

            System.out.println(moves);
        }
    }
}
