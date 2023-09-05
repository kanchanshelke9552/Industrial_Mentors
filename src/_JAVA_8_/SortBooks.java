package _JAVA_8_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Book{
    private int id;
    private String name;
    private int pages;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPages() {
        return pages;
    }
    Book(int id,String name,int pages){
        this.id=id;
        this.name=name;
        this.pages=pages;
    }

    @Override
    public String toString() {
        return "[" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pages=" + pages +
                ']';
    }
}
class BookData{
    public List<Book> getBooks(){
    List<Book> book=new ArrayList<>();
    book.add(new Book(101,"Java",800));
    book.add(new Book(102,"Spring",850));
    book.add(new Book(103,"Hibernate",500));
    book.add(new Book(104,"Webservices",730));
        return book;
}
}
//class MyComparator implements Comparator<Book>{
//
//    @Override
//    public int compare(Book o1, Book o2) {
//        return o1.getName().compareTo(o2.getName());
//    }
//}

public class SortBooks {
    public List<Book> sortBook(){
        List<Book> books=new BookData().getBooks();
//        Collections.sort(books, new Comparator<Book>() {
//            @Override
//            public int compare(Book o1, Book o2) {
//                return o1.getName().compareTo(o2.getName());
//            }

        // By Using Lambda expression
        // (o1, o2) ->o1.getName().compareTo(o2.getName())
         Collections.sort(books,((o1, o2) ->o1.getName().compareTo(o2.getName())));
        //Collections.sort(books,((o1, o2) ->o1.getId().compareTo(o2.getId())));
        return books;
    }

    public static void main(String[] args) {
        System.out.println(new SortBooks().sortBook());
    }
}

