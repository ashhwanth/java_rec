import java.util.Scanner;
class operator {
    int area(int side) {
        return side * side;
    }
    double area(float radius) {
        return 3.14 * radius * radius;
    }
    int area(int length, int breadth) {
        return length * breadth;
    }
}
public class overload {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        operator obj1 = new operator();
        int choice;
        System.out.println("OPTIONS: \n1.Area of Circle(use float)\n2.Area of Square\n3.Area of Rectangle\n0.Exit");
        do{
            System.out.println("Enter the Choice: ");
            choice = sc.nextInt();
            switch(choice) {
                case 1: {
                    System.out.println("Enter the radius: ");
                    float radius = sc.nextFloat();
                    System.out.println("Area: " + obj1.area(radius));
                    break;
                }
                case 2: {
                    System.out.println("Enter the side: ");
                    int side = sc.nextInt();
                    System.out.println("Area: " + obj1.area(side));
                    break;
                }
                case 3: {
                    System.out.println("Enter the lenght and breadth: ");
                    int length = sc.nextInt();
                    int breadth = sc.nextInt();
                    System.out.println("Area: " + obj1.area(length, breadth));
                    break;
                }
            }
        }while(choice != 0);
    }
}
