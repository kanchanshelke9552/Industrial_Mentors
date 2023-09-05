package ReflctionApi;

import java.lang.reflect.Method;

class Ref{
    int a=10;
    void show(){

    }
    void display(){

    }
}
public class Person {
    public static void main(String[] args) {
        Ref r=new Ref();
        Class c=r.getClass();
        String name=c.getName();
        System.out.println("Class name : "+name);

        Method meth[]=c.getDeclaredMethods();
        for (Method m:meth){
            System.out.println("Method name : "+m);
        }

    }
}
