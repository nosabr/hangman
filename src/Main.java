import java.util.Objects;
import java.util.Scanner;

public class Game{
    public static void startgame(){

    }
}


public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);// scanner created

        String secret_word = "hello";
        int secret_word_len = secret_word.length(); // len of the word
        String star_word = "*".repeat(secret_word_len); // word with ****


        System.out.print("[n]ew game or [e]xit?: ");
        String conf = in.next();
        if (Objects.equals(conf, "e")) {
            return; // ??? remove and use functions!
        }

        int attempts = 4;
        while (attempts != 0){
            System.out.println("You have " + attempts + "left.");
            System.out.print("Enter letter: ");
            char letter = in.next().charAt(0); // input letter

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