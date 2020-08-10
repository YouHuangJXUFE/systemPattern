package iterator;

import iterator.classes.Book;
import iterator.classes.BookShelf;
import iterator.inter.Iterator;

public class command {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(5);

        bookShelf.appendBook(new Book("设计模式基础"));
        bookShelf.appendBook(new Book("菊与刀"));
        bookShelf.appendBook(new Book("GitHub技术解析"));
        bookShelf.appendBook(new Book("共享经济"));

        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()){
            Book book = (Book)iterator.next();
            System.out.println(book.getName());
        }
    }
}
