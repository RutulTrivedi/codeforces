import java.util.Scanner;

public class Translation{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String lang1 = sc.nextLine();
            String lang2 = sc.nextLine();
            int len1 = lang1.length();
            int len2 = lang2.length();
            
            if(len1 != len2){
                System.out.println("NO");
            }
            else{
                for(int i=0;i<len1;i++){
                    if(lang1.charAt(i) != lang2.charAt(len2-1-i)){
                        System.out.println("NO");
                        return;
                    }
                }
                System.out.println("YES");
            }
        }
    }
}