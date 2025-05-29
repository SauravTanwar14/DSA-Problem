package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Book {

    public static void main(String[] args) {
        List<BookLibrary> list = new ArrayList<BookLibrary>();
        BookLibrary b1=new BookLibrary(101,"Let us C","Yashwant Kanetkar","BPB",8);  
        BookLibrary b2=new BookLibrary(102,"Data Communications and Networking","Forouzan","Mc Graw Hill",4);  
        BookLibrary b3=new BookLibrary(103,"Operating System","Galvin","Wiley",6);  

        list.add(b1);
        list.add(b2);
        list.add(b3);

        for (BookLibrary b : list) {
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }

   
}

class BookLibrary{
    int id;
    String name, author, publisher;
    int quantity;

    public BookLibrary(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
