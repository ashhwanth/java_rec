import java.util.Scanner;

class product{
    String pcode, pname;
    int price;
    
    product() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product code: ");
        this.pcode = sc.nextLine();
        System.out.println("Enter product name: ");
        this.pname = sc.nextLine();
        System.out.println("Enter product price: ");
        this.price = sc.nextInt();
    }
    public static void main(String arg[]) {
        System.out.println("Enter product1 details: ");
        product p1 = new product();
        System.out.println("Enter product2 details: ");
        product p2 = new product();
        System.out.println("Enter product3 details: ");
        product p3 = new product();
        if(p1.price < p2.price && p1.price < p3.price) {
            System.out.println("product 1 is lowest");
        }else if(p2.price < p1.price && p2.price < p3.price) {
            System.out.println("Product 2 is lowest");
        }else {
            System.out.println("Product 3 is lowest");
        }
        }
}