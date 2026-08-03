package GuessTheSecretNumber;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random=new Random();
        int randomNumber=random.nextInt(100)+1;
        int attempts=0;
        System.out.println("Guess number between 1 t0 100:");
        int number=input.nextInt();
        while (number!=randomNumber){
            attempts++;
          if(number>randomNumber){
              System.out.println("Too High");
          } else if (number<randomNumber) {
              System.out.println("Too Low");
          }number= input.nextInt();
        }  System.out.println("Attempts=" + attempts);
    }
}