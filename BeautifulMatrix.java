import java.util.Scanner;

public class BeautifulMatrix{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int row = 0, col = 0;
            int[][] matrix = new int[5][5];
            for(int i=0;i<5;i++){
                for(int j=0;j<5;j++){
                    matrix[i][j] = sc.nextInt();
                    if(matrix[i][j] == 1){
                        row = i;
                        col = j;
                    }
                }
            }   int ans = Math.abs(row-2) + Math.abs(col-2);
            System.out.println(ans);
        }
    }
}