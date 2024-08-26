import java.util.Scanner;

public class Hulk{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            if(n==1){
                System.out.println("I hate it");
            }
            else{
                String curr = "I hate ";
                
                for(int i=0;i<n-1;i++){
                    if(i%2==0) curr = curr + "that I love ";
                    else curr = curr + "that I hate ";
                }
                curr = curr + "it";
                System.out.println(curr);
            }
        }
    }
}