import java.util.Scanner;

public class WayTooLongWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            int len = s.length();

            if (len > 10) {
                System.out.println(s.charAt(0) + String.valueOf(len - 2) + s.charAt(len - 1));
            } else {
                System.out.println(s);
            }
        }
    }
}
