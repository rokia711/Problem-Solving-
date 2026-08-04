package ArrayAnalyzer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter array size:");
        int size= input.nextInt();
        int [] elements=new int[size];
        System.out.println("Enter the elements:");
        elements[0]=input.nextInt();
        int sum=  elements[0];
        int highest=elements[0];
        int smallest=elements[0];
        for(int i=1;i<elements.length;i++){
            elements[i]=input.nextInt();

            sum+=elements[i];
            if(elements[i]>highest){
                highest=elements[i];

            } else if (elements[i]<smallest) {
                smallest=elements[i];

            }
        }  System.out.println("Sum=" + sum);
        System.out.println("Average=" + sum/ (double)elements.length);
        System.out.println("Highest element=" + highest);
        System.out.println("Smallest element=" + smallest);
    }
}
