import java.util.*;
public class dequeue {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<String>();
        Scanner sc = new Scanner(System.in);
        String el;
        int ch;
        do{
            System.out.println("enter choice\n 1:add first\n2:add last\n 3:delete first\n 4:delete last\n 5:display\n 0:wrong choice\n");
            ch = sc.nextInt();
            switch(ch){
                case 1:{
                    System.out.println("Enter element to add first: ");
                    el = sc.next();
                    dq.addFirst(el);
                    break;
                }
                case 2:{
                    System.out.println("Enter element to add last: ");
                    el = sc.next();
                    dq.addLast(el);
                    break;
                }
                case 3:{
                    System.out.println("Remove element from first: ");
                    dq.removeFirst();
                    System.out.println("After removing first, deque: " + dq);
                    break;
                }
                case 4:{
                    System.out.println("Remove element from last: ");
                    dq.removeLast();
                    System.out.println("After removing last, deque: " + dq);
                    break;
                }
                case 5: System.out.println("Dequeue: " + dq);
                        break;
                case 0: break;
            }
        }while(ch != 0);
    }
}
