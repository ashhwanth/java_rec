import java.util.Scanner;

class Fibanocci implements Runnable {
    private int count;
    public Fibanocci(int count){
        this.count = count;
    }
    @Override
    public void run() {
        int first = 0, second = 1;
        System.out.println("Fibanocci Series: \n" + first + "" + second + "");
        for(int i = 0; i < count; i++) {
            int next = first + second;
            System.out.println(next + "");
            first = second;
            second = next;
        }
        System.out.println();
    }
}

class EvenNumbers implements Runnable{
    private int start, end;
    public EvenNumbers (int start , int end) {
        this.start = start;
        this.end = end;
    }
    @Override
    public void run(){
        System.out.println("Even Numbers: ");
        for(int i = start; i < end; i++) {
            if(i % 2 == 0){
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }
}

public class threadss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fibinocci limit: ");
        int count = sc.nextInt();
        Fibanocci fib = new Fibanocci(count);
        Thread fibThread = new Thread(fib);
        System.out.println("Enter a staring and ending number: ");
        int start = sc.nextInt(), end=sc.nextInt();
        EvenNumbers even = new EvenNumbers(start, end);
        Thread evenThread = new Thread(even);
        fibThread.start();
        evenThread.start();
    }   
}
