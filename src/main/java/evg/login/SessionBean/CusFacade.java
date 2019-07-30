package evg.login.SessionBean;

import evg.login.Dao.VwExpCusDAO;
import evg.login.Entity.VwExpCus;
import evg.login.Util.JsfUtil;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "CusData")
@SessionScoped
public class CusFacade implements Serializable{
    @EJB
    private VwExpCusDAO cusDAO;
    private Long id;
    private VwExpCus cus;

    public VwExpCusDAO getCusDAO() {
        return cusDAO;
    }

//    public void setCusDAO(VwExpCusDAO cusDAO) {
//        this.cusDAO = cusDAO;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public VwExpCus getCus() {
        return cus;
    }

    public void setCus(VwExpCus cus) {
        this.cus = cus;
    }
    
    public String showCus() {
      id =  Long.parseLong(JsfUtil.getRequestParameter("cus_id"));
      cus = getCusDAO().findById(id);
      return "onecus";
    }
    
}
