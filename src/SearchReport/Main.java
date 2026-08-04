package SearchReport;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter array size:");
        int size= input.nextInt();
        int [] numbers=new int[size];
        int number=40;
        boolean found=false;
        int numberOfOccurreences=0;
        System.out.println("Enter an elements:");
        for(int i=0;i<numbers.length;i++){
            numbers[i]= input.nextInt();
            if(numbers[i]==number){
               found=true;
               numberOfOccurreences++;
            }

        } if(found){
            System.out.println("Founed");
        }else{
            System.out.println("Not founed");
        }
        System.out.println(Arrays.binarySearch(numbers,40));
        System.out.println("Number Of Occurreences=" +  numberOfOccurreences);
    }
}
