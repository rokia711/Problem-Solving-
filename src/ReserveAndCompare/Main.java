package ReserveAndCompare;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter an integer:");
        int num=input.nextInt();
        int original=num;
        int reserve=0;
        while (num>0){
            int digit=num%10;
            reserve=reserve*10 + digit;
            num=num/10;
        }
        if(original==reserve){
            System.out.println("The original number is equal to it's reserve");
        }else{
            System.out.println("The original number is not equal to it's reserve");
        }
    }
}
