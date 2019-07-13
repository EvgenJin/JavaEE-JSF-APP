package evg.login.Dao;

import evg.login.Entity.VwUsr;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class VwUsrDAO {
    @PersistenceContext(unitName = "pers")
    private EntityManager em;
    protected EntityManager getEntityManager() {
        return em;
    }
    
    public List getAll() {
        return em.createNamedQuery("VwUsr.findAll", VwUsr.class).getResultList();
    }
         
    public VwUsr findByUser(String user) {
        return (VwUsr) em.createNamedQuery("VwUsr.findByCusrlogname").setParameter("cusrlogname",user).getSingleResult();
    }
}
