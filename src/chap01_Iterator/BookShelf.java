package chap01_Iterator;
import java.util.Vector;

public class BookShelf implements Aggregate{
    private Vector<Book> books;
    public  BookShelf(){
        this.books = new Vector<>(0);
    }
    public Book getBookAt(int index){
        return books.get(index);
    }
    public void appendBook(Book book){
        this.books.add(book);
    }
    public int getLength(){
        return this.books.size();
    }
    public Iterator iterator(){
        return new BookShelfIterator(this);
    }
}
