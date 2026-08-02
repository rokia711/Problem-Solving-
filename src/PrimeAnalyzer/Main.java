package PrimeAnalyzer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter an integer number:");
        int num= input.nextInt();
        boolean isPrime=true;
        for(int i=2;i<num;i++){
            if(num%i==0){
                isPrime=false;
                System.out.println("The number is not prime");
                System.out.println("The smallest divisor=" + i);
                break;
            }
        }
        if(isPrime && num>1){
            System.out.println("The number is prime");
        }if(num<=1){
         System.out.println("The number is not prime");
        }
    }
}
