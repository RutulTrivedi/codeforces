import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String players = sc.nextLine();
            for (int i=0;i<=players.length()-7;i++) {
                String team = players.substring(i,i+7);
                if (team.equals("0000000") || team.equals("1111111")) {
                    System.out.println("YES");
                    return;
                }
            }
            System.out.println("NO");
        }
    }
}
