package Exception_Handling;

public class Demo {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        } finally {
            System.out.println("..........");
        }
        System.out.println("hello");
    }
}
