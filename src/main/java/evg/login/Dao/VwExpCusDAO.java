/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evg.login.Dao;

import evg.login.Entity.VwExpCus;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class VwExpCusDAO {
    @PersistenceContext(unitName = "pers")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }
    
    public List getAll() {
        return em.createNamedQuery("VwExpCus.findAll", VwExpCus.class).getResultList();
    }    
}
