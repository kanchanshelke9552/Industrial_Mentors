package java_collections.Tasks;
final class Imm{
    private int num;

    public Imm(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Imm{" +
                "num=" + num +
                '}';
    }

    public Imm changeValue(int no){
        if (num==no){
            return this;
        }else{
            return new Imm(num);
        }
    }
}
public class ImmutableTask {
    public static void main(String[] args) {
       Imm i=new Imm(10);
       Imm i2=i;
        System.out.println(i.hashCode());
        System.out.println(i2.hashCode());
       i=i.changeValue(20);
        System.out.println(i.hashCode());
        System.out.println(i2.hashCode());
        System.out.println(i);
        System.out.println(i2);


    }

}
