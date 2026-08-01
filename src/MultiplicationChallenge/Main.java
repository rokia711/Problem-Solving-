package MultiplicationChallenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer number:");
        int num=input.nextInt();
        int multi=1;
        int sum=0;
        for(int i=1;i<=12;i++) {
            multi = i * num;
            System.out.println(i + "*" + num + "=" + multi);
            sum+=multi;
            System.out.println("Sum=" + sum);
        }
    }
}

