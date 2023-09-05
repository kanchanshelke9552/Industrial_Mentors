package industrial_mentors;

public class StaticExample
{
    // This is a static method
    static void m1()
    {
        System.out.println("method called without object");
    }

    public static void main(String[] args)
    {
        m1();
        m2();
    }
    static void m2(){
        System.out.println("pradip");

    }
    static {
        System.out.println("kanchan");
    }
}

