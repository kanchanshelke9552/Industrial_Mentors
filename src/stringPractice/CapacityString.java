package stringPractice;

public class CapacityString {
    public static void main(String[] args) {
       // String s="i want to become java developer ";

       StringBuffer sb=new StringBuffer(1000);
      // System.out.println(sb.capacity());
       sb.append("kanchan").trimToSize();
        System.out.println(sb.capacity());

//       StringBuffer sb1=new StringBuffer("kanchan");
//
//        System.out.println( sb.equals(sb1));

        StringBuffer sb1=new StringBuffer("ABCDE ");
        System.out.println(sb1.capacity());
        // here capacity is 21 because of one imp constructor --> Stringbuffer(string str)
//                                                                 means sb1.length()+16
//                                                                          5+16 = 21

        sb.ensureCapacity(1000);
        System.out.println(sb.capacity());
        sb.trimToSize();
        System.out.println(sb.capacity());
    }
}
