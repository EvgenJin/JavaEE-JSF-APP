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
    private String access_edit = "true";
    private String dul;

    public String getAccess_edit() {
        return access_edit;
    }

    public void setAccess_edit(String access_edit) {
        this.access_edit = access_edit;
    }

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
    
    public String getDul() {
        dul = "Серия " + cus.getDocSer()+ " Номер " + cus.getDocNum() + " выдан " + cus.getDocWho() +" "+ cus.getDocWhen() +" код подр "+ cus.getDocPodr();
        return dul;
    }

    public void setDul(String dul) {
        this.dul = dul;
    }
    
    public String showCus() {
      id =  Long.parseLong(JsfUtil.getRequestParameter("cus_id"));
      cus = getCusDAO().findById(id);
      return "onecus";
    }
    
}
