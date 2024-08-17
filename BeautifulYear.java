import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class BeautifulYear{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int currYear = sc.nextInt();
            currYear++;
            
            while(true){
                int temp = currYear;
                Set<Integer> set = new HashSet<>();
                while(temp>0){
                    set.add(temp%10);
                    temp/=10;
                }
                if(set.size()==4){
                    break;
                }
                currYear++;
            }
            
            System.out.println(currYear);
        }
    }
}