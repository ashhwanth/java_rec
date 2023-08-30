import java.util.Scanner;

interface shape{
    double area();
    double perimeter();
}

class circle implements shape{
    double radius;
    circle(double radius){
        this.radius = radius;
    }
    public double area(){
        return Math.PI * radius * radius;
    }
    public double perimeter(){
        return Math.PI * 2 * radius;
    }
}

class rectangle implements shape{
    double length;
    double width;
    rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public double area() {
        return length * width;
    }
    public double perimeter(){
        return 2 * (length + width);
    }
}

public class interfaceArea {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Calculate Area and Perimeter of \n1.Circle\n2.Rectangle\n3.Exit\nEnter Your Choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1:{
                    System.out.println("Enter Radius of the circle: ");
                    double radius = sc.nextDouble();
                    circle objcir = new circle(radius);
                    System.out.println("Area: " + objcir.area() + "\nPerimeter: " + objcir.perimeter());
                    break;
                }
                case 2:{
                    System.out.println("Enter Lenght and Width of Rectangle: ");
                    double length = sc.nextDouble();
                    double width = sc.nextDouble();
                    rectangle objrec = new rectangle(length, width);
                    System.out.println("Area: " + objrec.area() + "\nPerimeter: " + objrec.perimeter());
                    break;
                }
                case 3:{
                    System.out.println("Press 3 to Exit");
                    break;
                }
                default:{
                    System.out.println("Invalid Choice!");
                    break;
                }
            }
            System.out.println();
        }while(choice != 3);
    }
}
