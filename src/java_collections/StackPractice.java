package java_collections;

import java.util.Stack;

public class StackPractice {
    public static void main(String[] args){
        Stack<Integer> s=new Stack<>();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        System.out.println(s);

        System.out.println("top most element of stack is = "+s.peek());

        System.out.println(s.pop());

        System.out.println(s);
    }
}
