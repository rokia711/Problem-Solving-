package AtmSimulator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double Balance = 10000;
        int choice;
        double amount;
        do {
            System.out.println("====Menu====");
            System.out.println("Your balance= " + Balance);
            System.out.println("Choose an option: ");
            System.out.println("1.Deposit ");
            System.out.println("2.Withdraw ");
            System.out.println("3.Check Balance");
            System.out.println("4.Exit ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the deposit amount:");
                    amount = input.nextDouble();
                    Balance += amount;
                    System.out.println("New Balance=" + Balance);
                    break;
                case 2:
                    System.out.println("Enter the withdraw amount:");
                    amount = input.nextDouble();
                    if (amount > Balance) {
                        System.out.println("You cannot withdraw more than your balance");
                    } else {
                        Balance -= amount;
                        System.out.println("New Balance=" + Balance);
                    }
                    break;
                case 3:
                    System.out.println("Your current balance=" + Balance);
                    break;
                case 4:
                    System.out.println("Thank you for using our system");
                    break;
                default:
                    System.out.println("Invalid");
            }
        } while (choice != 4) ;
        }
    }

