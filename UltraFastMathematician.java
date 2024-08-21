import java.util.Scanner;

public class UltraFastMathematician {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str1 = sc.next();
            String str2 = sc.next();
            
            StringBuilder ans = new StringBuilder();
            
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) == str2.charAt(i)) {
                    ans.append("0");
                } else {
                    ans.append("1");
                }
            }
            
            System.out.println(ans.toString());
        }
    }
}
