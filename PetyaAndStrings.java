import java.util.Scanner;

public class PetyaAndStrings{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            int ans = s1.compareToIgnoreCase(s2);
            if(ans<0) System.out.println(-1);
            else if(ans>0) System.out.println(1);
            else System.out.println(0);
        } 
    }
}