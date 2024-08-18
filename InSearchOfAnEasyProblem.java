import java.util.Scanner;

public class InSearchOfAnEasyProblem{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int sum = 0;
            
            for(int i=0;i<n;i++){
                int temp = sc.nextInt();
                sum += temp;
            }
            
            if(sum == 0)
                System.out.println("EASY");
            else
                System.out.println("HARD");
        }
    }
}