import java.util.*;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> arrlist = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        String el;
        int ch;
        do{
            System.out.println("Enter Choice\n1.Add\n2.Size\n3.Search by index\n4.Find INdex\n5.Search\n6.Remove\n7Remove by index\n8.Display\n9.Clear\n0:Wrong Choice\n");
            ch = sc.nextInt();
            switch(ch){
                case 1:{
                    System.out.println("Enter element to insert: ");
                    el = sc.next();
                    arrlist.add(el);
                    break;
                }
                case 2:{
                    System.out.println("Size of the arraylist: " + arrlist.size());
                    break;
                }
                case 3:{
                    System.out.println("Enter index of element to search: ");
                    int index = sc.nextInt();
                    System.out.println("Element at index " + index + "is: " + arrlist.get(index));
                    break;
                }
                case 4:{
                    System.out.println("Enter the element: ");
                    el = sc.next();
                    int index = arrlist.indexOf(el);
                    System.out.println("Index of " + el + "is: " + index);
                    break;
                }
                case 5:{
                    System.out.println("Enter the element: ");
                    el = sc.next();
                    boolean contains = arrlist.contains(el);
                    System.out.println("contains " + el + " ? " + contains);
                    break;
                }
                case 6:{
                    System.out.println("Enter the element to remove: ");
                    el = sc.next();
                    boolean removed = arrlist.remove(el);
                    System.out.println("After removing " + el + " arraylist: " + removed);
                    break;
                }
                case 7:{
                    System.out.println("Enter the index to remove the element: ");
                    int index = sc.nextInt();
                    arrlist.remove(index);
                    System.out.println("After removing the element, arraylist: " + arrlist);
                    break;
                }
                case 8:{
                    System.out.println("Arraylist: " + arrlist);
                    break;
                }
                case 9:{
                    arrlist.clear();
                    System.out.println("Cleared");
                    break;
                }
                case 0: break;
            }
        }while(ch != 0);
    }
}
