import java.util.Objects;
import java.util.Scanner;

public class Game {
    static Scanner scanner = new Scanner(System.in);
    static String Word = "hello";

    public static void endgame(boolean end){
        if (end){
            System.out.println("Good Job!");
        } else {
            System.out.println("Try better next time D:");
            menu();
        }
    }
    public static void startgame (String secret_word){
        int secret_word_len = secret_word.length(); // len of the word
        String star_word = "*".repeat(secret_word_len); // word with ***
        int attemts = 4;
        while (attemts != 0){
            if (star_word.equals(secret_word)){
                endgame(true);
            }
            System.out.println("Secret word: " + star_word);
            System.out.println("You got " + attemts + "attemts.");
            System.out.print("Enter your letter: ");
            char letter = scanner.next().charAt(0);
            /*
            if (secret_word.contains(letter)){

            }*/
        }
        endgame(false);

    }
    public static void menu() {
        System.out.print("Start new game? :[Y/N] " );
        String conf = scanner.next();

        if (Objects.equals(conf, "Y") | Objects.equals(conf, "y")) startgame(Word);

        System.out.println("Thanks for playing!");
    }
}
