import java.util.Random;
import java.util.Scanner;

/*
Program helping to memorize word spelling with one randomly selected letter hidden.
Version 1.0
*/

//TODO: Import words from csv file
//TODO: Create menu.
//TODO: Hide more letters (level easy, medium, hard)
//TODO: Prepare progress statistics
//TODO: Smart use of select word. Base on previous usages.
//TODO: Save progress to file.
//TODO: Delete well know words from dictionary

public class SpellChecker {
    public static void main(String[] args) {
        String[] words = {"comprehensive", "sophisticated", "encouragements", "handkerchief", "indict"};
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String response;
        int games = 1; //1-3; line 42

        do {
            String word = words[random.nextInt(words.length)];
            String hashWord = word;

            char randomChar = hashWord.charAt(random.nextInt(hashWord.length()));

            hashWord = hashWord.replaceFirst(String.valueOf(randomChar), "*");

            System.out.println("Your random word: " + hashWord);
            System.out.print("Type your guessed word: ");
            response = scanner.nextLine();

            if (word.equalsIgnoreCase(response)) {
                System.out.println("Congratulation! ");
            } else {
                System.out.println("Not right. The correct spelling: " + word);
            }
            games++;
        } while (games <= 3);
        System.out.println("Game over! Your score: ");
    }
}