import java.util.Scanner;

class StudentInfo {
    int rollNo;
    String name;
    int age;
    String department;
    float marks;

    StudentInfo(int rollNo, String name, int age, String department, float marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.department = department;
        this.marks = marks;
    }

    void displayStudent() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Department : " + department);
        System.out.println("Mark : " + marks);
        System.out.println();
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = s.nextInt();

        StudentInfo[] students = new StudentInfo[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of Student " + (i + 1));

            System.out.print("Roll No: ");
            int rollNo = s.nextInt();
            s.nextLine();

            System.out.print("Name: ");
            String name = s.nextLine();

            System.out.print("Age: ");
            int age = s.nextInt();
            s.nextLine();

            System.out.print("Department: ");
            String department = s.nextLine();

            System.out.print("Marks: ");
            float marks = s.nextFloat();

            students[i] = new StudentInfo(rollNo, name, age, department, marks);
        }

        System.out.println("\nStudent Details:\n");

        for (int i = 0; i < n; i++) {
            students[i].displayStudent();
        }
    }
}