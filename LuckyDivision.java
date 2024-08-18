import java.util.Scanner;

public class LuckyDivision{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            
            if(isLuckyNumber(n)){
                System.out.println("YES");
                return;
            }
            
            int[] numbers = {4,7,44,47,74,77,444,447,474,477,744,747,774,777};
            
            for(int num : numbers){
                if(n%num == 0){
                    System.out.println("YES");
                    return;
                }
            }
            
            System.out.println("NO");
        }
    }

    private static boolean isLuckyNumber(int n){
        String str = Integer.toString(n);

        for(char ch : str.toCharArray())
            if(ch != '4' && ch != '7') return false;

        return true;
    }
}