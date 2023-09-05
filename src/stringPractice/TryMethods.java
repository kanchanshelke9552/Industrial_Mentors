package stringPractice;

public class TryMethods {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Helloo");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.append(" kanchan"));
        sb.setCharAt(5,'W');
        System.out.println(sb);
        System.out.println(sb.insert(5,'w'));
        System.out.println(sb.delete(5,7));                //delet(int start, int end)
        System.out.println(sb.deleteCharAt(12));
        System.out.println(sb.reverse());
        System.out.println(sb.reverse());
        sb.setLength(5);
        System.out.println(sb);

    }
}
