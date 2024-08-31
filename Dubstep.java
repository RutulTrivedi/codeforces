import java.util.Scanner;
public class Dubstep {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String song = sc.nextLine();

            song = song.replace("WUB"," ");
            song = song.trim();
            song = song.replaceAll("\\s"," ");
            System.out.println(song);
        }
    }
}