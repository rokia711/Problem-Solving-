package StringAnalyzer;

import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    static String sentence;

    public static void readSentence() {
        System.out.print("Enter a Sentence: ");
        sentence = input.nextLine();
    }

    public static void numberOfCharacters() {
        System.out.println("Number of Characters: " + sentence.length());
    }

    public static void numberOfWords() {
        String[] words = sentence.trim().split("\\s+");
        System.out.println("Number of Words: " + words.length);
    }

    public static void numberOfVowels() {

        int count = 0;

        for (int i = 0; i < sentence.length(); i++) {

            char ch = Character.toLowerCase(sentence.charAt(i));

            if (ch == 'a'|| ch == 'i' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Number of Vowels: " + count);
    }

    public static void numberOfConsonants() {

        int count = 0;

        for (int i = 0; i < sentence.length(); i++) {

            char ch = Character.toLowerCase(sentence.charAt(i));

            if (Character.isLetter(ch) &&
                    ch != 'a' &&
                    ch != 'e' &&
                    ch != 'i' &&
                    ch != 'o' &&
                    ch != 'u') {

                count++;
            }
        }

        System.out.println("Number of Consonants: " + count);
    }

    public static void main(String[] args) {

        readSentence();

        numberOfCharacters();

        numberOfWords();

        numberOfVowels();

        numberOfConsonants();
    }
}
