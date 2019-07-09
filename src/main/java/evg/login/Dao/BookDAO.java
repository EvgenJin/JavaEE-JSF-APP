/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evg.login.Dao;

import evg.login.Entity.Book;
import java.math.BigDecimal;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author admin
 */
@Stateless
public class BookDAO {
    
    
//    public BookDAO () {
//    }
    
//    public BookDAO(EntityManager em) {
//      this.em = em;
//    }
    
    @PersistenceContext(unitName = "pers")
    private EntityManager em;
    
    protected EntityManager getEntityManager() {
        return em;
    }
    
    public List getAll() {
        return em.createNamedQuery("Book.findAll", Book.class).getResultList();
    }
    
    public Book findById(Integer id) {
        return em.find(Book.class, id);
    }

    public void update(Book book) {
        em.merge(book);
    }

    public void create(Book book) {
        em.persist(book);
    }

    public void delete(Book book) {
        if (!em.contains(book)) {
            book = em.merge(book);
        }

        em.remove(book);
    }    

    public Book findById(BigDecimal id) {
        return em.find(Book.class, id);
    }
}
