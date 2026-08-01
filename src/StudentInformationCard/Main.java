package StudentInformationCard;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("=====Student Card=====");
        System.out.println("Enter student name");
        String name= input.nextLine();
        System.out.println("Name:" + name);
        System.out.println("Enter student age");
        int age= input.nextInt();
                 input.nextLine();
        System.out.println("Age:" + age);
        System.out.println("Enter student university");
        String university= input.nextLine();
        System.out.println("University:" + university);
        System.out.println("Enter student gpa");
        double gpa= input.nextDouble();
        System.out.println("Gpa:" + gpa);




    }
}
