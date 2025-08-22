import java.util.Scanner;
// ----------- Single Inheritance Example -----------
class Person {
    String name;
    int age;

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Student extends Person {  // Single Inheritance
    String course;

    void displayStudent() {
        displayPerson();
        System.out.println("Course: " + course);
    }
}

// ----------- Multilevel Inheritance Example -----------
class Employee {
    int empId;
    String empName;

    void displayEmployee() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
    }
}

class Manager extends Employee {  // First level inheritance
    String department;

    void displayManager() {
        displayEmployee();
        System.out.println("Department: " + department);
    }
}

class SeniorManager extends Manager {  // Second level inheritance
    int teamSize;

    void displaySeniorManager() {
        displayManager();
        System.out.println("Team Size: " + teamSize);
    }
}
// ----------- Main Class -----------
public class InheritanceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Single Inheritance Demo ===");
        Student s1 = new Student();

        System.out.print("Enter Student Name: ");
        s1.name = sc.nextLine();

        System.out.print("Enter Age: ");
        s1.age = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Course: ");
        s1.course = sc.nextLine();

        System.out.println("\n--- Student Details ---");
        s1.displayStudent();

        System.out.println("\n=== Multilevel Inheritance Demo ===");
        SeniorManager sm = new SeniorManager();

        System.out.print("Enter Employee ID: ");
        sm.empId = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Employee Name: ");
        sm.empName = sc.nextLine();

        System.out.print("Enter Department: ");
        sm.department = sc.nextLine();

        System.out.print("Enter Team Size: ");
        sm.teamSize = sc.nextInt();

        System.out.println("\n--- Senior Manager Details ---");
        sm.displaySeniorManager();

        sc.close();
    }
}
