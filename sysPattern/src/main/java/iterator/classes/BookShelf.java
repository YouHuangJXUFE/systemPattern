package iterator.classes;

import iterator.inter.Aggregate;
import iterator.inter.Iterator;

public class BookShelf implements Aggregate {
    private Book[] books;
    private Integer last = 0;

    // 决定书架的大小
    public BookShelf(Integer maxSize) {
        this.books = new Book[maxSize];
    }

    // 获得这个编号的书
    public Book getBookAt(Integer index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    public Integer getLength() {
        return last;
    }

    public Iterator iterator(){
        return new BookShelfIterator(this);
    }
}
