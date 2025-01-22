import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = null;
        String name = "";
        int id = 0;
        double grade = 0.0;

        while (true) {
            System.out.println("\nMenu: ");
            System.out.println("1. Add Student Information");
            System.out.println("2. Display Student Information");
            System.out.println("3. Change Student Grade");
            System.out.println("4. Exit");
            System.out.print("\nEnter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Get Student Information
                    System.out.print("\nEnter Student Name: ");
                    name = sc.next();

                    System.out.print("Enter Student ID: ");
                    id = sc.nextInt();

                    System.out.print("Enter Student Grade: ");
                    grade = sc.nextDouble();

                    // Student Object
                    student = new Student(name, id, grade);

                case 2:
                    // Get Student Information
                    if (student != null) {
                        student.displayInfo();
                    } else {
                        System.out.println("No Student Information Found...");
                    }
                    break;

                case 3:
                    // Update Student Grade
                    if (student != null) {
                        System.out.print("Enter New Student Grade: ");
                        grade = sc.nextDouble();
                        student = new Student(name, id, grade);
                    } else {
                        System.out.println("No Student Information Found...\n");
                    }
                    break;

                case 4:
                    // Exit Program
                    return;

                default:
                    System.out.println("Invalid Choice...");
                    break;
            }
        }
    }
}
