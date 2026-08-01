package ATMPinVerification;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int correctPin=1234;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter PIN:");
        int PIN=input.nextInt();
        if (PIN==correctPin){
            System.out.println("Access Granted");
        }else{
            System.out.println("Invalid PIN");
        }
    }
}
