import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String secret_word = "hello";
        int secret_word_len = secret_word.length();
        String word;
        System.out.print("[n]ew game or [e]xit?: ");
        String conf = in.next();
        if (Objects.equals(conf, "e")) {
            return;
        }
        int attempts = 4;
        while (attempts != 0){
            System.out.println("You have " + attempts + "left.");

        }
    }
}

/*

System.out.println("_____");
System.out.println("|/  |");
System.out.println("|   O");
System.out.println("|  /||");
System.out.println("|   |");
System.out.println("|");
_____
|/  |
|   O
|  /||
|   |
|

 */