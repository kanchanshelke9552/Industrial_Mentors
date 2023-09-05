package java_collections.Tasks_IM;

import java.util.*;

public class SortBooks {
    public static void main(String[] args) {
        List<Books> book = new ArrayList<>();
        book.add(new Books(101, "Java", 800));
        book.add(new Books(102, "Spring", 850));
        book.add(new Books(103, "Hibernate", 500));
        book.add(new Books(104, "Webservices", 730));


        Collections.sort(book,((o1, o2) -> o1.getName().compareTo(o2.getName())));

        for (Books b:book){
            System.out.println(b.getId()+" "+b.getName()+" "+b.getPages());
        }

//        Collections.sort(book, new Comparator<Books>() {
//            @Override
//            public int compare(Books o1, Books o2) {
//                return o1.getId()-o2.getId();
//            }
//        });

        Collections.sort(book,((o1, o2) -> o1.getId()-(o2.getId())));
//
//       Collections.sort(book,(o1, o2) -> o1.getId().);

    }
}
