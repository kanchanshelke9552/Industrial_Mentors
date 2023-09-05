package Classess;
final class IM{
    private int num;

    public IM(int num) {
        this.num = num;
    }
    public IM modify(int num){
        if(this.num==num){
            return this;
        }else {
            return new IM(num);
        }
    }
}
public class Immutuble_Right_ {
    public static void main(String[] args) {
       IM obj1=new IM(20);
        System.out.println(obj1);

        IM obj2=new IM(20);
        System.out.println(obj2);

        obj2.modify(10);
    }
}
