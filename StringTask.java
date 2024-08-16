import java.util.Scanner;

public class StringTask{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            String input = sc.nextLine();
            char[] ch = input.toLowerCase().toCharArray();
            String vowels = "aoyeui";
            String ans = "";
            
            for(char c : ch){
                if(!vowels.contains(Character.toString(c))){
                    ans += "."+c;
                }
            }
            
            System.out.print(ans);
        }
    }
}