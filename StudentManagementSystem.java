import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    String grade;

    Student(int rollNo, String name, String grade) {
        this.rollNo = rollNo;
        this.name = name;
        this.grade = grade;
    }
}

public class StudentManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Roll No: ");
                    int roll = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Grade: ");
                    String grade = sc.nextLine();

                    students.add(new Student(roll, name, grade));
                    System.out.println("Student Added Successfully.");
                    break;

                case 2:
                    for (Student s : students) {
                        System.out.println("Roll: " + s.rollNo + ", Name: " + s.name + ", Grade: " + s.grade);
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll No to search: ");
                    int searchRoll = sc.nextInt();
                    boolean found = false;

                    for (Student s : students) {
                        if (s.rollNo == searchRoll) {
                            System.out.println("Student Found: " + s.name + ", Grade: " + s.grade);
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 4);

        sc.close();
    }
}