/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evg.login.Controller;

import evg.login.Dao.BookDAO;
import evg.login.Entity.Book;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@SessionScoped
public class Car implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private BigDecimal id;
    @EJB
    private BookDAO dao;
    private Book book;
//    Book book = new Book();
    
    public Book getBook(BigDecimal id) {
           return null;
    }

    
    public void setBook(Book book) {
        this.book = book;
    }
}
