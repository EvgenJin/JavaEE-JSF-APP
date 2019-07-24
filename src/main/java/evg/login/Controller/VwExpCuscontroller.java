package evg.login.Controller;

import evg.login.Dao.VwExpCusDAO;
import evg.login.Entity.VwExpCus;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named("vwexpcus")
@SessionScoped
public class VwExpCuscontroller implements Serializable{
    @EJB
    private VwExpCusDAO dao;
    
    private List<VwExpCus> cus_list;
   
    public VwExpCuscontroller () {
    }
    
    private VwExpCusDAO getDao() {
        return dao;
    }
    
    public List<VwExpCus> getCus_list() {
        cus_list = getDao().getAll();
        return cus_list;
    }

    public void setCus_list(List<VwExpCus> cus_list) {
        this.cus_list = cus_list;
    }    
}
