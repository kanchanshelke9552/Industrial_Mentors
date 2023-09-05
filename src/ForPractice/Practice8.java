package ForPractice;

public class Practice8 {
    int square(int num){
        return num * num;
    }
    public static void main(String[] args)
    {
        Practice8 t = new Practice8();
        int squareOfNumber = t.square(2);
        System.out.println("Square of 2: " +squareOfNumber);

        int square = t.square(5);
        System.out.println("Square of 5: " +square);

        System.out.println(t.square(4));


    }
}
