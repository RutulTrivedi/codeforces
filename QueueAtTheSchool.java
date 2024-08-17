import java.util.Scanner;

public class QueueAtTheSchool{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int t = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            char[] queue = s.toCharArray();
            
            for(int j=0;j<t;j++){
                for(int i=0;i<n-1;i++){
                    if(queue[i] == 'B' && queue[i+1] == 'G'){
                        queue[i] = 'G';
                        queue[i+1] = 'B';
                        i++;
                    }
                }
            }
            
            System.out.println(new String(queue));
        }
    }
}