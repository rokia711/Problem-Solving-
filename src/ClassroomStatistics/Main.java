package ClassroomStatistics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter marks for 10 students:");
        double sum = 0;
        double highest = 0;
        double lowest = 0;
        int passed = 0;
        for (int i = 1; i <= 10; i++) {
            double marks = input.nextDouble();
            System.out.println("Mark of student" + i + "=" + marks);
            sum += marks;
            if (marks > highest) {
                highest=marks;
            }
            if (marks < lowest) {
                lowest=marks;
            }
            if (marks >= 50) {
                passed++;
            }

        }  double average=sum/10;
        System.out.println("Highest mark=" + highest);
        System.out.println("Lowest mark=" + lowest );
        System.out.println("Average=" + average );
        System.out.println("Number of passed studets=" + passed);
    }
}
