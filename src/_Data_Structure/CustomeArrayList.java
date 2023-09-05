package _Data_Structure;

// Generics
// Generic used to specify specific type of of data to a entity(class, interface, method)
// We need an arraylist which will accept both primitive and non-primitive data types
// for that we will use generics.

import java.util.Arrays;

public class CustomeArrayList{
    public static void main(String[] args){
        CustomArrayList list = new CustomArrayList();
        list.addElement(5);
        list.addElement(7);
        list.addElement(9);
        list.addElement(8);
        list.addElement(55);
        list.addElement(73);
        list.addElement(94);
        list.addElement(85);
        list.addElement(34);
        list.addElement(98);
        list.addElement(76);
        list.removeElement(34);
        list.removeElement(73);
        System.out.println(list);

    }
}

class CustomArrayList<T>{

    private static final int default_capacity = 10;
    private Object[] default_array;
    int size;

    public CustomArrayList(){
        default_array = new Object[default_capacity];
        size =0;
    }
    public void increaseCapacity(){
        int new_capacity = default_capacity*2;
        Object[] new_array = new Object[new_capacity];
        for(int i =0; i<size;i++){
            new_array[i] = default_array[i];
        }
        default_array = new_array;
    }
    public void addElement(T element){
        if(size == default_array.length){
            increaseCapacity();
        }
        default_array[size] = element;
        size++;
    }
    public T getElement(int index){
        if(index<0 || index>=size){
            throw new IndexOutOfBoundsException();
        }
        return (T)default_array[index];
    }
    public void removeElement(T element){
        for(int i =0; i<size;i++){
            if(default_array[i].equals(element)){
                removeAtIndex(i);
            }
        }
    }
    public void removeAtIndex(int index){
        if(index<0 || index >=size){
            throw new IndexOutOfBoundsException();
        }
        for(int i =index;i<size-1;i++){
            default_array[i]=default_array[i+1];
        }
        default_array[size-1] =null;
        size--;

    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "default_array=" + Arrays.toString(default_array) +
                ", size=" + size +
                '}';
    }
}
