package java_collections;

public class MultithreadingPractice extends Thread{
    public void run(){
        System.out.println("thread task");

    }

    public static void main(String[] args) {
        MultithreadingPractice mt=new MultithreadingPractice();

        mt.start();


    }
}
