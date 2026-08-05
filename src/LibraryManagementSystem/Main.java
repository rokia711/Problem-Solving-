package LibraryManagementSystem;

import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    static String[] books = new String[100];
    static boolean[] available = new boolean[100];

    static int count = 0;

    public static void addBook() {
        input.nextLine();

        System.out.print("Enter Book Name: ");
        books[count] = input.nextLine();

        available[count] = true;

        count++;

        System.out.println("Book Added Successfully");
    }

    public static void borrowBook() {

        input.nextLine();

        System.out.print("Enter Book Name: ");
        String book = input.nextLine();

        for (int i = 0; i < count; i++) {

            if (books[i].equalsIgnoreCase(book)) {

                if (available[i]) {
                    available[i] = false;
                    System.out.println("Book Borrowed Successfully");
                } else {
                    System.out.println("Book Is Already Borrowed");
                }

                return;
            }
        }

        System.out.println("Book Not Found");
    }

    public static void returnBook() {

        input.nextLine();

        System.out.print("Enter Book Name: ");
        String book = input.nextLine();

        for (int i = 0; i < count; i++) {

            if (books[i].equalsIgnoreCase(book)) {

                if (!available[i]) {
                    available[i] = true;
                    System.out.println("Book Returned Successfully");
                } else {
                    System.out.println("Book Is Already Available");
                }

                return;
            }
        }

        System.out.println("Book Not Found");
    }

    public static void displayBooks() {

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (available[i]) {
                System.out.println(books[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Available Books");
        }
    }

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n1. Add Book");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Display Available Books");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    addBook();
                    break;

                case 2:
                    borrowBook();
                    break;

                case 3:
                    returnBook();
                    break;

                case 4:
                    displayBooks();
                    break;

                case 5:
                    System.out.println("Thank You");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 5);

    }
}
