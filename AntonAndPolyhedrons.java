import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AntonAndPolyhedrons {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Map<String, Integer> map = new HashMap<>();
            map.put("Tetrahedron", 4);
            map.put("Cube", 6);
            map.put("Octahedron", 8);
            map.put("Dodecahedron", 12);
            map.put("Icosahedron", 20);
            
            int n = sc.nextInt();
            sc.nextLine();
            int count = 0;
            while(n!=0){
                String shape = sc.nextLine();
                count += map.get(shape);
                n--;
            }
            System.out.println(count);
        }
    }    
}