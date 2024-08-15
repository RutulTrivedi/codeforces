import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            String op = sc.nextLine();
            char[] arr = new char[op.length()/2+1];
            int idx = 0;

            for (int i = 0; i < op.length(); i+=2) arr[idx++] = op.charAt(i);

            Arrays.sort(arr);
            op = "";

            for (int i = 0; i < arr.length; i++)
                if(i==arr.length-1) op+=arr[i];
                else op+= arr[i]+"+";

            System.out.println(op);
        }
    }
}