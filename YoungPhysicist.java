import java.util.Scanner;

public class YoungPhysicist {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int sumX = 0, sumY = 0, sumZ = 0;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                int z = sc.nextInt();
                
                sumX += x;
                sumY += y;
                sumZ += z;
            }   if (sumX == 0 && sumY == 0 && sumZ == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
