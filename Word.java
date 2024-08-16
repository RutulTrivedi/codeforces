import java.util.Scanner;

public class Word{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            int lowerCount = 0;
            int len = str.length();
            
            for(int i=0;i<len;i++){
                char ch = str.charAt(i);
                if(ch>64 && ch<92){
                    lowerCount++;
                }
            }
            
            int upperCount = len - lowerCount;
            
            if(lowerCount == upperCount)
                System.out.println(str.toLowerCase());
            else if(lowerCount > upperCount)
                System.out.println(str.toUpperCase());
            else
                System.out.println(str.toLowerCase());
        }
    }
}