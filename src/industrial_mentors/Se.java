package industrial_mentors;

public class Se {
    static {
        System.out.println("Static Block");
    }

    {
        System.out.println("Initialization Block");
    }

    Se(){
        System.out.println("Constructor");
    }

    public static void main(String[] args){
        System.out.println("Main Method");
    }
}
