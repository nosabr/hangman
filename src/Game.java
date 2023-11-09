import java.util.Objects;
import java.util.Scanner;

public class Game {
    static Scanner scanner = new Scanner(System.in);
    static String Word = "hello";

    public static void endgame(boolean end){
        if (end){
            System.out.println("Good Job!");
        } else {
            hang(0);
            System.out.println("Try better next time D:");
        }
    }
    public static boolean check(char letter, String secret_word){
        if(secret_word.indexOf(letter) == -1){
            System.out.println("You missed!");
            return false;
        } else {
            System.out.println("You found it!");
            return true;
        }
    }
    public static char input(String star_word){
        System.out.print("Enter your letter: ");
        char letter = scanner.next().charAt(0);
        if (star_word.indexOf(letter) != -1) {
            System.out.println("You already found that letter, try again!");
            letter = input(star_word);
        }
        return letter;
    }
    public static String right(char letter, String star_word, String secret_word){
        StringBuilder updated_star_word = new StringBuilder(star_word);
        for(int i = 0; i < secret_word.length(); i++){
            if(secret_word.charAt(i)== letter){
                updated_star_word.setCharAt(i, letter);
            }
        }
        return updated_star_word.toString();
    }
    public static void hang(int attempts){
        if (attempts == 4){
            System.out.println("_____");
            System.out.println("|/  ");
            System.out.println("|   ");
            System.out.println("|  ");
            System.out.println("|   ");
            System.out.println("|");
        }
        if (attempts == 3){
            System.out.println("_____");
            System.out.println("|/  |");
            System.out.println("|   ");
            System.out.println("|  ");
            System.out.println("|   ");
            System.out.println("|");
        }
        if (attempts == 2){
            System.out.println("_____");
            System.out.println("|/  |");
            System.out.println("|   O");
            System.out.println("|  ");
            System.out.println("|   ");
            System.out.println("|");
        }
        if (attempts == 1){
            System.out.println("_____");
            System.out.println("|/  |");
            System.out.println("|   O");
            System.out.println("|  /||");
            System.out.println("|   ");
            System.out.println("|");
        }
        if (attempts == 0){
            System.out.println("_____");
            System.out.println("|/  |");
            System.out.println("|   O");
            System.out.println("|  /||");
            System.out.println("|   |");
            System.out.println("|");
        }
    }


    public static void startgame (String secret_word){
        int secret_word_len = secret_word.length(); // len of the word
        String star_word = "*".repeat(secret_word_len); // word with ***
        hang(4);
        boolean end = false;
        int attempts = 4;
        while (attempts != 0){
            if (star_word.equals(secret_word)){
                end = true;
                break;
            }
            System.out.println("Secret word: " + star_word);
            System.out.println("You got " + attempts + " attempts.");
            System.out.print("Enter your letter: ");
            char letter = input(star_word);
            if (check(letter, secret_word)){
                star_word = right(letter,star_word, secret_word);
                // zapusk right string function
            } else {
                attempts -= 1;
                hang(attempts);
            }
        }
        endgame(end);
    }
    public static void menu() {
        System.out.print("Start new game? :[Y/N] " );
        String conf = scanner.next();
        if (Objects.equals(conf, "Y") | Objects.equals(conf, "y")) startgame(Word);
        else return;
        System.out.println("Thanks for playing!");
        menu();
    }
}
