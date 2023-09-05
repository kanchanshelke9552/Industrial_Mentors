package Java_Interfaces;

interface A {
    void addition();
}
class B {
    public void addition() {
        System.out.println(10+20);
    }
}
class C extends B implements A {
        public static void main(String[] args) {
            A a = new C();
            a.addition();
    }
}