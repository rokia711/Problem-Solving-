package SumChallenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter an integer number:");
        int N=input.nextInt();
        int sumOfEven=0;
        int sumOfOdd=0;
        for(int i=1;i<=N;i++){
            if(i%2==0){
                sumOfEven+=i;
            } else{
            sumOfOdd+=i;
            }

        } System.out.println("Sum of even=" + sumOfEven);
        System.out.println("Sum of odd=" + sumOfOdd);
    }
}
