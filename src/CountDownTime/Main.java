package CountDownTime;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int num= input.nextInt();
        for(int i=num;i>=0;i--){
            System.out.println(i);
        }
        System.out.println("Blast Off!");
    }
}
