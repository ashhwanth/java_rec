import java.util.Scanner;
public class sortstring {
    public static void main(String[] args) {
        int count;
        String temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of strings: ");
        count = sc.nextInt();
        sc.nextLine();
        String str[] = new String[count];
        System.out.println("Enter Strings: ");
        for(int i = 0; i < count; i++) {
            str[i] = sc.nextLine(); 
        }
        for(int i = 0; i < count; i++) {
            for(int j = i + 1; j < count; j++) {
                if(str[i].compareTo(str[j]) > 0){
                temp = str[i];
                str[i] = str[j];
                str[j] = temp;
                }
            }
        }
        System.out.println("Sorted Strings: ");
        for(int i = 0; i < count; i++) {
            System.out.println(str[i] + ",");
        }
    }
}
