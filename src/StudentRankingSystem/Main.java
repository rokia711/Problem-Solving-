package StudentRankingSystem;

import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    static String[] names = new String[100];
    static double[] marks = new double[100];
    static int n;

    public static void readStudents() {

        System.out.print("Enter Number of Students: ");
        n = input.nextInt();
        input.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter Student Name: ");
            names[i] = input.nextLine();

            System.out.print("Enter Student Mark: ");
            marks[i] = input.nextDouble();
            input.nextLine();
        }
    }

    public static void topStudent() {

        int index = 0;

        for (int i = 1; i < n; i++) {
            if (marks[i] > marks[index]) {
                index = i;
            }
        }

        System.out.println("Top Student: " + names[index]);
        System.out.println("Mark: " + marks[index]);
    }

    public static void lowestStudent() {

        int index = 0;

        for (int i = 1; i < n; i++) {
            if (marks[i] < marks[index]) {
                index = i;
            }
        }

        System.out.println("Lowest Student: " + names[index]);
        System.out.println("Mark: " + marks[index]);
    }

    public static void classAverage() {

        double sum = 0;

        for (int i = 0; i < n; i++) {
            sum += marks[i];
        }

        System.out.println("Class Average: " + (sum / n));
    }

    public static void passedStudents() {

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (marks[i] >= 50) {
                count++;
            }
        }

        System.out.println("Passed Students: " + count);
    }

    public static void main(String[] args) {

        readStudents();

        topStudent();

        lowestStudent();

        classAverage();

        passedStudents();
    }
}
