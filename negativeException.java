import java.util.Scanner;

class calculate{
    void calculate(int n){
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[n];
        int num, sum = 0;
        for(int i = 0; i < n; i++) {
            System.out.printf("Enter number %d: ", (i+1));
            num = sc.nextInt();
            if(num < 0){
                try {
                    throw new Exception();
                } catch (Exception e) {
                    // TODO: handle exception
                    System.out.println("Cannot insert a negative number!");
                }
                i--;
            }else{
                arr[i] = num;
                sum = sum + arr[i];
            }
        }
        System.out.printf("Average of %d numbers is %d", n, (sum/n));
    }
}

public class negativeException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calculate obj = new calculate();
        System.out.println("Enter limit of numbers to input: ");
        int n = sc.nextInt();
        obj.calculate(n);
    }
}
