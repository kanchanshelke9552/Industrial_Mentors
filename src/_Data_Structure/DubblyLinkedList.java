package _Data_Structure;

class DLL {
    Node head;
    private class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }
    public void insertFirst(int data){
        Node node=new Node(data);
        node.next=head;
        node.prev=null;
        if (head!=null){
            head.prev=node;
        }
        head=node;
    }

    public void insertLast(int data){
        Node node=new Node(data);
        Node last=head;
        if (head==null){
            node.prev=null;
            head=node;
            return;
        }
        while (last.next!=null){
            last=last.next;
        }
        last.next=node;
        node.prev=last;
    }

    public void display(){
        Node node=head;
        Node last=null;
        while (node!=null){
            System.out.print(node.data+" -> ");
            last=node;
            node=node.next;
        }
        System.out.println("End");
        System.out.println("Reverse Order.......");
        while (last!=null){
            System.out.print(last.data+" -> ");
            last=last.prev;
        }
        System.out.println("Start");
    }
}

public class DubblyLinkedList{
    public static void main(String[] args) {
          DLL dlist=new DLL();
          dlist.insertFirst(10);
          dlist.insertFirst(20);
          dlist.insertFirst(30);
          dlist.insertFirst(40);
          dlist.insertFirst(50);
          dlist.insertLast(700);

          dlist.display();
    }
}
