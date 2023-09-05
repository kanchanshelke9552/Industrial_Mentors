package _Data_Structure;

import java.util.Scanner;

public class BineryTree {
    static Scanner sc=null;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root = CreateTree();
        boolean b=true;
        System.out.println("1. Print Inorder :");
        System.out.println("2. Print preorder :");
        System.out.println("3. Print postorder :");
        System.out.println("4. Exit :");
        while (b) {
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                   inOrder(root);
                   System.out.println();
                break;

                case 2:
                  preOrder(root);
                  System.out.println();
                break;

                case 3:
                postOrder(root);
                System.out.println();
                break;

                case 4:
                    b=false;
                    break;
            }
        }
    }
    static Node CreateTree(){
        Node root=null;
        System.out.println("Enter Data : ");
        int data=sc.nextInt();
        if (data==-1) return null;
        root=new Node(data);

        System.out.println("Enter Data for left  of : "+data);
        root.left=CreateTree();

        System.out.println("Enter Data for right  of : "+data);
        root.right=CreateTree();
        return root;
    }

    static void inOrder(Node root){
        if (root==null) return;

        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);

    }
    static void preOrder(Node root){
        if (root==null) return;

        System.out.print(+root.data+" ");
        inOrder(root.left);
        inOrder(root.right);
    }
    static void postOrder(Node root){
        if (root==null) return;

        inOrder(root.left);
        inOrder(root.right);
        System.out.print(root.data+" ");
    }
}
class Node{
    Node left,right;
    int data;
    public Node(int data) {
        this.data = data;
    }

}
