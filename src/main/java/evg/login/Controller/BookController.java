package evg.login.Controller;

import evg.login.Dao.BookDAO;
import evg.login.Entity.Book;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named("bookController")
@SessionScoped
public class BookController implements Serializable {

    @EJB
    private BookDAO dao;
    private List<Book> books;
    private Book selected;
    Book book = new Book();
    Integer book_id;

    public BookController() {
    }
    
    public Integer getBookId() {
            return book_id;
    }
    public void setBookId(Integer book_id) {
            this.book_id = book_id;
    }    

    public Book getSelected() {
        return selected;
    }
    
    public void setSelected(Book selected) {
        this.selected = selected;
    }
    
    private BookDAO getDao() {
        return dao;
    }
    
    public Book getBook(Integer id) {
        return dao.findById(id);
    }
    
//    public List<Book> getBooks() {
//        return books;
//    }
    
    public List<Book> getBooks() {
        books = getDao().getAll();
        return books;
    }
    
    public void delete() {
        books.remove(selected);
        selected = null;
    }
    
    public String doLookup() {
            book = dao.findById(book_id);
//            book = dao.findById(book_id);
            return "one";
    }
}
