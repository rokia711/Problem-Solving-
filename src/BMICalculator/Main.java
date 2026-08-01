package BMICalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your weight");
        double weight= input.nextDouble();
        System.out.println("Weight=" + weight + " kg");
        System.out.println("Enter your height");
        double  height= input.nextDouble();
        System.out.println("Height=" +  height + " meter");
        double BMI=weight/(height*height);
        System.out.println("BMI=" + BMI);
        if(BMI<18.5){
            System.out.println("Underweight");
        } else if(BMI>18.5 && BMI<25){
            System.out.println("Normal");
        } else if(BMI>25 && BMI<30){
            System.out.println("Overweight");
        }else{
            System.out.println("Obese");
    }
    }
}
