/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evg.login.Dao;

import evg.login.Entity.Todos;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.spi.PersistenceUnitTransactionType;
import static org.eclipse.persistence.config.PersistenceUnitProperties.*;
import org.eclipse.persistence.config.TargetServer;
//        TRANSACTION_TYPE;

import static org.eclipse.persistence.config.PersistenceUnitProperties.*;

@Stateless
public class TodoDAO {
    
//  protected EntityManager em;

//    public TodoDAO() {
//    }
//
//    public TodoDAO(EntityManager em) {
//      this.em = em;
//    }    
   
    @PersistenceContext(unitName = "employee")
    private EntityManager em;
    
    protected EntityManager getEntityManager() {
        return em;
    }

    public List getAll() {
    Map properties = new HashMap();
    properties.put(TRANSACTION_TYPE, PersistenceUnitTransactionType.RESOURCE_LOCAL.name());
    properties.put(JDBC_DRIVER, "oracle.jdbc.OracleDriver");
    properties.put(JDBC_URL, "jdbc:oracle:thin:@10.26.232.216:1521:card");
    properties.put(JDBC_USER, "zc");
    properties.put(JDBC_PASSWORD, "gtpltw21");
    properties.put(JDBC_READ_CONNECTIONS_MIN, "1");
    properties.put(JDBC_WRITE_CONNECTIONS_MIN, "1");
    // Configure logging. FINE ensures all SQL is shown
    properties.put(LOGGING_LEVEL, "FINE");
    // Ensure that no server-platform is configured
    properties.put(TARGET_SERVER, TargetServer.None);    
//    EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProfessorService")
    EntityManagerFactory emf =  Persistence.createEntityManagerFactory("jpablogPUnit", properties);    
//    EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProfessorService");
    EntityManager emz = emf.createEntityManager();        
        
        
        
        
        return emz.createNamedQuery("Todo.findAll", Todos.class).getResultList();
    }

    public Todos findById(Integer id) {
        return em.find(Todos.class, id);
    }

    public void update(Todos todo) {
        em.merge(todo);
    }

    public void create(Todos todo) {
        em.persist(todo);
    }

    public void delete(Todos todo) {
        if (!em.contains(todo)) {
            todo = em.merge(todo);
        }

        em.remove(todo);
    }
}
