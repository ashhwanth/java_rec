import java.util.Scanner;
public class cpu {
    double price;
    
    class processor {
        int no_of_cores;
        String manufacture;
    }

    static class RAM {
        int memory;
        String manufacture;
    }

    public static void main(String[] args) {
        cpu cpu1 = new cpu();
        cpu.processor prs = cpu1.new processor();
        cpu.RAM ram = new cpu.RAM();
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter price of the cpu: ");
        cpu1.price = sc.nextDouble();
        System.out.println("Enter the num of cores of cpu: ");
        prs.no_of_cores = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name of the manufacture: ");
        prs.manufacture = sc.nextLine();
        System.out.println("Enter the memory of the ram: ");
        ram.memory = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the manufacture of ram: ");
        ram.manufacture = sc.nextLine();

        System.out.println("---CPU Details---");
        System.out.println("Price: " + cpu1.price);
        System.out.println("Number of cores: " + prs.no_of_cores);
        System.out.println("Manufacture: " + prs.manufacture);
        System.out.println("Memory: " + ram.memory);
        System.out.println("Ram Manufacture: " + ram.manufacture);
    }
}
