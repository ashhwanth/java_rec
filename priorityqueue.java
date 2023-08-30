import java.util.*;

public class priorityqueue {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        Scanner sc = new Scanner(System.in);
        String el;
        int ch;
        do {
            System.out.println("---Enter Choice---\n1.Add\n2.Remove\n3.Display\n4.Head\n5.Poll\n0:wrong choice\n");
            ch = sc.nextInt();
            switch (ch) {
                case 1: {
                    System.out.println("Enter element to insert: \n");
                    el = sc.next();
                    queue.add(el);
                    break;
                }
                case 2: {
                    System.out.println("Enter element to remove: \n");
                    el = sc.next();
                    queue.remove(el);
                    break;
                }
                case 3:{
                        System.out.println("Priority Queue: " + queue);
                        break;
                    }
                case 4: {
                    System.out.println("Head of the queue: " + queue.peek());
                    break;
                }
                case 5:
                    queue.poll();
                    break;
                case 0:
                    break;
            }
        } while (ch != 0);
    }
}
