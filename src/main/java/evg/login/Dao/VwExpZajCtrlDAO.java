package evg.login.Dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class VwExpZajCtrlDAO {
    @PersistenceContext(unitName = "pers")
    private EntityManager em;
    protected EntityManager getEntityManager() {
        return em;
    }
    
    public List getAllByUser() {
        return em.createNamedQuery("VwExpZajCtrl.findByUserInsert").setParameter("userInsert","ESHAHOV").getResultList();
    }
}
