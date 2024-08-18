import java.util.Scanner;

public class ChatRoom{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            String target = "hello";
            int idx = 0;
            
            for(int i=0;i<s.length();i++){
                if(s.charAt(i) == target.charAt(idx))
                    idx++;
                if(idx == target.length())
                    break;
            }
            
            if(idx == target.length())
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}