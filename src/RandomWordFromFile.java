import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class RandomWordFromFile {

    public static String getRandomWordFromFile() {
        try {
            // Read all lines from the file
            List<String> lines = Files.readAllLines(Paths.get("resources/russian_nouns.txt"));
            // Check if the file is not empty
            if (lines.isEmpty()) {
                throw new IllegalArgumentException("File is empty");
            }

            // Generate a random index
            Random random = new Random();
            int randomIndex = random.nextInt(lines.size());

            // Get the word at the random index
            return lines.get(randomIndex);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
