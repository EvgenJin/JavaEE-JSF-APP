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
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

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
    
    public List getListByUser() {
        StoredProcedureQuery query = em
        .createStoredProcedureQuery("SYSTEM.test_pkg.todosByUser")
        .registerStoredProcedureParameter(1,String.class,ParameterMode.IN)
        .registerStoredProcedureParameter(2,Class.class,ParameterMode.REF_CURSOR)
        .setParameter(1,"evgen");
        query.execute();
        List<Object[]> postComments = query.getResultList();
        System.out.println(postComments);
        return postComments;
    }
    
    public void getCount() {
        StoredProcedureQuery query = em
        .createStoredProcedureQuery("SYSTEM.test_pkg.count_todos")
        .registerStoredProcedureParameter(1,String.class,ParameterMode.IN)
        .registerStoredProcedureParameter(2,Integer.class,ParameterMode.OUT)
        .setParameter(1,"evgen");
        query.execute();
        Integer commentCount = (Integer) query.getOutputParameterValue(2);
        System.out.println(commentCount);
    }
    
    
}
