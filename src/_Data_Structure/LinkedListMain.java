package _Data_Structure;

 class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size=0;
    }

    private class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    public void insert(int data){//insert --> insert first--> (50-40-30-20-10) like that
        Node node=new Node(data);
        node.next=head;
        head=node;

        if (tail==null){
            tail=head;
        }
        size+=1;
    }
    public void insertLast(int data){
        if (tail==null){
            insert(data);
            return;
        }
        Node node=new Node(data);
        tail.next=node;
        tail=node;
        size++;
    }
    public void insertAnywere(int data, int pos){
        if (pos==0){
            insert(data);
            return;
        }
        if (pos==size){
            insertLast(data);
            return;
        }
        Node temp=head;
        for (int i=1;i<pos;i++){
            temp=temp.next;
        }
        Node newNode=new Node(data,temp.next);
        temp.next=newNode;
        size++;
    }
    public int RemoveFirst(){
        int data= head.data;
        head=head.next;
        if (head==null){
            tail=null;
        }
        size--;
        return data;
    }
     public int RemoveLast(){
        if (size<=1){
            return RemoveFirst();
        }
        Node secondlast=get(size-2);
        int data= tail.data;
        tail=secondlast;
        tail.next=null;
        return data;
     }
     public int RemoveAnywere(int pos){
        if (pos==0){
            return RemoveFirst();
        }
        if (pos ==size-1){
           return RemoveLast();
        }
        Node prev=get(pos-1);
            int data=prev.next.data;
            prev.next=prev.next.next;
         return data;
     }
     public Node get(int pos){
        Node node=head;
        for (int i=0;i<pos;i++){
            node=node.next;
        }
        return node;
     }
     public Node search(int data){
        Node node=head;
        while (node!=null){
            if (node.data==data){
                return node;
            }
            node=node.next;
        }
        return null;
     }
    public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("end");
    }

    public void removeDuplicates(){
        Node node=head;
        while(node.next!=null){
            if (node.data==node.next.data){
                node.next=node.next.next;
                size--;
            }else{
                node=node.next;
            }
        }
        tail=node;
        tail.next=null;
    }
    public static LL merge(LL list1,LL list2){
        Node first=list1.head;
        Node second=list2.head;

        LL ans=new LL();
        while (first!=null && second!=null){
            if (first.data<second.data){
                ans.insertLast(first.data);
                first=first.next;
            }else{
                ans.insertLast(second.data);
                second=second.next;
            }
        }
        while (first!=null){
            ans.insertLast(first.data);
            first=first.next;
        }
        while(second!=null){
            ans.insertLast(second.data);
            second=second.next;
        }
        return ans;
    }
}

public class LinkedListMain{
    public static void main(String[] args) {
//        LL list=new LL();
//
//        list.insert(10);
//        list.insert(20);
//        list.insert(20);
//        list.insert(30);
//        list.insert(40);
//        list.insert(40);
//        list.insert(40);
//        list.insert(50);
//        System.out.println("linked list : ");
//        list.display();
//        System.out.println("After remove Duplicates : ");
//        list.removeDuplicates();
//        list.display();


//        System.out.println("\nInsert last");
//        list.insertLast(100);
//        list.display();
//
//        System.out.println("\ninsert at 3rd position");
//        list.insertAnywere(200,3);
//        list.display();
//
//        System.out.println("\nremove first");
//        list.RemoveFirst();
//        list.display();
//
//        System.out.println("\nremove last");
//        list.RemoveLast();
//        list.display();
//
//        System.out.println("\nremove at pos 2");
//        list.RemoveAnywere(2);
//        list.display();

       // list.search(49);

        LL list1=new LL();

        list1.insert(10);
        list1.insert(20);
        list1.insert(30);

        System.out.println("linked list 1: ");
        list1.display();

        LL list2=new LL();

        list2.insert(60);
        list2.insert(70);
        list2.insert(80);
        list2.insert(90);
        list2.insert(100);
        System.out.println("\nlinked list 2: ");
        list2.display();

        System.out.println("\nMerged list : ");
         LL ans=LL.merge(list1,list2);
         ans.display();
    }
}

