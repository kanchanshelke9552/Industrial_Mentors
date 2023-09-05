package industrial_mentors;

public class MeOverloding {
    public static void main(String[] args) {
        main("kanchan");
        main(10);
        main(new String[]{" kanchan ", " babasaheb ", " shelke "},3.14f);
    }

    public static void main(String name) {
        System.out.println(name);
    }

    public static void main(int no) {
        System.out.println("number = "+no);
    }

    public static void main(String str[],float pi) {
        for(String s:str){
            System.out.println(s);
        }
        System.out.println("value pf pi :"+pi);
    }
}
