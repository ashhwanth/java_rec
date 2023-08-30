import java.util.Scanner;
public class employeearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int eno, n, i, j = 0;
        String name;
        double salary;
        System.out.println("Enter the number of Employees: ");
        n = sc.nextInt();
        employee[] emparr = new employee[10];
        for(i = 0; i < n; i++) {
            System.out.println("Enter details of employee" + (i + 1));
            System.out.println("Enumber: ");
            eno = sc.nextInt();
            sc.nextLine();
            System.out.println("Name: ");
            name = sc.nextLine();
            System.out.println("Salary: ");
            salary = sc.nextDouble();
            emparr[i] = new employee(eno, name, salary);
        }
        System.out.println("Enter the eno to search: ");
        eno = sc.nextInt();
        for(i = 0; i < n; i++) {
            if(emparr[i].enumber == eno) {
                System.out.println("Name: " + emparr[i].ename + "\tSalary: " + emparr[i].esalary);
                j = 1;
                break;
            }
        }
        if(j != 1) {
            System.out.println(eno + " Not Found!");
        }
    }
}

class employee{
    int enumber;
    String ename;
    double esalary;
    employee(int eno, String ename, double esalary) {
        this.enumber = eno;
        this.ename = ename;
        this.esalary = esalary;
    }
}
