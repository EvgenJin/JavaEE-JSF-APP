/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evg.login.Dao;

import evg.login.Entity.Cus;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class CusDAO {
    
    @PersistenceContext(unitName = "pers")
    private EntityManager em;
    
    protected EntityManager getEntityManager() {
        return em;
    }
    
    public List getAll() {
        return em.createNamedQuery("Cus.findAll", Cus.class).getResultList();
    }
    
    public void update(Cus cus) {
        em.merge(cus);
    }    
    
}
