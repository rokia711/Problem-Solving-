package RestaurantBill;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 3 meals price:");
       double meal1Price= input.nextDouble();
       System.out.println("meal1Price=" + meal1Price + " pounds");
        double meal2Price= input.nextDouble();
        System.out.println("meal2Price=" + meal2Price + " pounds");
        double meal3Price= input.nextDouble();
        System.out.println("meal3Price=" + meal3Price + " pounds");
        double sum=meal1Price+meal2Price+meal3Price;
        System.out.println("Total price=" + sum + " pounds");
        double vat=0.14*sum;
        System.out.println("Vat=" + vat + " pounds" );
        double finalPrice=sum+vat;
        System.out.println("Final price=" + finalPrice + " pounds" );
    }
}
