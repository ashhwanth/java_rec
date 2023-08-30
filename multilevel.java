import java.util.Scanner;
class Employee{
    int empid, salary;
    String name, address;
    Employee(int id, String name, int salary, String address) {
        this.empid = id;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}
class Teacher extends Employee {
    String department,subject;
    Teacher(int id, String name, int salary, String address, String department, String subject) {
        super(id, name, salary, address);
        this.department = department;
        this.subject = subject;
    }
    void display() {
        System.out.println("Employee ID: " + empid + "\tName: " + name + "\tSalary: " + salary + "\tAddress: " + address);
        System.out.println("Department: " + this.department + "\tSubject: j" + this.subject);
    }
}
class functions{
    Scanner sc = new Scanner(System.in);
    Teacher[] objects;
    void insert() {
        System.out.println("Enter the number of teachers: ");
        int n = sc.nextInt();
        objects = new Teacher[n];
        for(int i = 0; i < objects.length; i++) {
            System.out.println("Enter the details: ");
            System.out.println("Enter the Employee ID, Name, Salary and Address: ");
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            int salary = sc.nextInt();
            sc.nextLine();
            String address = sc.nextLine();
            System.out.println("Enter the Department and subjects taugth: ");
            String department = sc.nextLine();
            String subject = sc.nextLine();
            objects[i] = new Teacher(id, name, salary, address, department, subject);
        }
    }
    void display() {
        for(int i = 0; i < objects.length; i++) {
            objects[i].display();
        }
    }
}

public class multilevel {
    public static void main(String[] args) {
        functions object = new functions();
        object.insert();
        object.display();
    }
}
