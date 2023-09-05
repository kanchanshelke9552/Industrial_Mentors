package Classess;


// class is declared final
final class ImmutableDemo {

    // private class members
    private final String name;
    private final int date;

    ImmutableDemo(String name, int date) {
        // class members are initialized using constructor
        this.name = name;
        this.date = date;
    }
    // getter method returns the copy of class members
    public String getName() {
        return name;
    }
    public int getDate() {
        return date;
    }
}
class Main {
    public static void main(String[] args) {

        // create object of Immutable
        ImmutableDemo obj = new ImmutableDemo("kanchan shelke", 2011);

        System.out.println("Name: " + obj.getName());
        System.out.println("Date: " + obj.getDate());

    }
}
