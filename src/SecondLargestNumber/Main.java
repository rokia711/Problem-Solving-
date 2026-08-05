package SecondLargestNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter array size:");
        int size= input.nextInt();
        int [] numbers=new int[size];
        System.out.println("Enter an numbers:");
        numbers[0]= input.nextInt();
        int largestNumber=numbers[0];
        int secondLargestNumber=numbers[0];
        for(int i=1;i<numbers.length;i++){
            numbers[i]= input.nextInt();
            if(numbers[i]>largestNumber){
                secondLargestNumber=largestNumber;
                largestNumber=numbers[i];

            } else if (numbers[i]>secondLargestNumber&&numbers[i]!=largestNumber) {
                secondLargestNumber=numbers[i];
            }
        }System.out.println("Largest Number=" + largestNumber);
        System.out.println("Second Largest Number=" + secondLargestNumber);
    }
}
