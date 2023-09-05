package Java_Interfaces;

interface First {
    String a = "Kanchan ";
    String methodFirst();
}
interface second{
    String b = "Shelke ";
    String methodsecond();
}
class Third implements First, second {
    public String methodFirst() {
        return a+b;
    }
    public String methodsecond()
    {
        return a+b;
    }
}

public class MainClass {
    public static void main(String[] args) {
        Third r = new Third();

        System.out.println(r.methodFirst());
        System.out.println(r.methodsecond());
    }
}

