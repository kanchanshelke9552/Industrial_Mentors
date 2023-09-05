package _Data_Structure;

import java.util.Scanner;

public class LinkedListl{
    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static Node head = null;

    public void createLL(Node data) {
//        Node n1 = new Node(10);
//        Node n2 = new Node(20);
//        Node n3 = new Node(30);
//        Node n4 = new Node(40);
//        Node n5 = new Node(50);
//
//        head = n1;
//        head.next = n2;
//        n2.next = n3;
//        n3.next = n4;
//        n4.next = n5;
//        n5.next = null;
        //Create a new node


    }

    Scanner sc = new Scanner(System.in);
    int size = 0;

    public int lengthLL() {
        if (head == null) {
            System.out.println("no any LinkedList Found");
        }
        Node current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
      //  System.out.println("length : " + size);
        return size;
    }

    public void displayLL() {
        Node current = head;
        System.out.println("Your LinkedList : ");
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void insertLL() {
        System.out.println("Enter position for insert : ");
        int pos = sc.nextInt();
        System.out.println("enter new Element : ");
        int data = sc.nextInt();

        if (pos <= lengthLL()) {
            Node newNode = new Node(data);
            if (pos == 0) {
                newNode = head;
                head = newNode;
                return;
            }
            Node previous = head;
            for (int i = 0; i < pos - 1; i++) {
                previous = previous.next;
            }
            newNode.next = previous.next;
            previous.next = newNode;
            System.out.println("element inserted...");
        } else {
            System.out.println("Linkedlist not found..!");
        }
    }

    public void removeLL() {
        System.out.println("enter position for remove element : ");
        int pos = sc.nextInt();
        if (pos <= size) {
            if (pos == 0) {
                head = head.next;
            }

            Node previous = head;
            for (int i = 0; i < pos - 1; i++) {
                previous = previous.next;
            }
            previous.next = previous.next.next;
            System.out.println("element removed...");
        } else {
            System.out.println("linkedlist not found..!");
        }
    }


    public static void main(String[] args) {
        LinkedListl ll = new LinkedListl();
        ll.menu();

//        ll.createLL();
//        ll.displayLL();
//        ll.lengthLL();
//        ll.insertLL();
//        System.out.println("after insert");
//        ll.displayLL();
//        ll.removeLL();
//        System.out.println("after remove");
//        ll.displayLL();

    }
  public void menu(){
      LinkedListl ll = new LinkedListl();
    Scanner scanner = new Scanner(System.in);
    boolean b = true;
    int choice = 0;

    while(b) {
        System.out.println("\n1. Create Linked List");
        System.out.println("2. Insert New Element");
        System.out.println("3. Remove any element");
        System.out.println("4. display LinkedList");
        System.out.println("5. length of your LinkedList");
        System.out.println("6. Exit");
        System.out.print("\nEnter your choice: ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
               // ll.createLL();
                break;
            case 2:
                ll.insertLL();
                break;
            case 3:
                ll.removeLL();
                ll.displayLL();
                break;
            case 4:
                ll.displayLL();
                break;
            case 5:
                ll.lengthLL();
                break;
            case 6:
                b = false;
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
    }
   }
}

