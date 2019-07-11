/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evg.login.Dao;

import evg.login.Entity.Todos;
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
public class TodosDAO {
    @PersistenceContext(unitName = "pers")
    private EntityManager em;
    
    protected EntityManager getEntityManager() {
        return em;
    }
    
    public List getAll() {
        return em.createNamedQuery("Todos.findAll", Todos.class).getResultList();
    }
    
    public Todos findById(Integer id) {
        return em.find(Todos.class, id);
    }

    public void update(Todos todos) {
        em.merge(todos);
    }

    public void create(Todos todos) {
        em.persist(todos);
    }

    public void delete(Todos todos) {
//        if (!em.contains(todos)) {
            todos = em.merge(todos);
//        }
        em.remove(todos);
    }    

    public Todos findById(Long id) {
        return em.find(Todos.class, id);
    }    
}
