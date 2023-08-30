import java.util.Scanner;
public class complex {
    int r, i;
    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real part: ");
        r = sc.nextInt();
        System.out.println("Enter imaginary part: ");
        i = sc.nextInt();
    }
    void display() {
        System.out.println(r + "+" + i + "i");
    }
    public static void main(String[] args) {
        complex c1 = new complex();
        complex c2 = new complex();
        complex c = new complex();
        c1.read();
        c2.read();
        c.r = c1.r + c2.r;
        c.i = c1.i + c2.i;
        System.out.println("After Addition: ");
        c.display();
    }
}
