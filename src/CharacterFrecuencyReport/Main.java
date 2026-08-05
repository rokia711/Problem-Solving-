package CharacterFrecuencyReport;

import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);
    static String text;

    public static void readString() {
        System.out.print("Enter a String: ");
        text = input.nextLine();
    }

    public static void displayCharacters() {

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);
            boolean found = false;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                    found = true;
                    break;
                }
            }

            if (!found) {

                int count = 0;

                for (int j = 0; j < text.length(); j++) {
                    if (text.charAt(j) == ch) {
                        count++;
                    }
                }

                System.out.println(ch + " : " + count);
            }
        }
    }

    public static void main(String[] args) {

        readString();

        displayCharacters();
    }
}
