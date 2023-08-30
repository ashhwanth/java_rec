import java.util.*;
public class stack {
    public static void main(String[] args) {
        Stack <String> stack = new Stack<String>();
        Scanner sc = new Scanner(System.in);
        int choice;
        String el;
        do{
            System.out.println("Enter Choice \n1.Push\n2.Pop\n3.Display\n4.Enter 0 to Exit");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:{
                    System.out.println("Enter element to insert: \n");
                    el = sc.nextLine();
                    stack.push(el);
                    break;
                }
                case 2:{
                    String poppedElement = stack.pop();
                    System.out.println("Popped Element: \n" + poppedElement);
                    break;
                }
                case 3:{
                    System.out.println("Stack: " + stack);
                    break;
                }
                case 4: break;
            }
        }while(choice != 0);
    }
}
