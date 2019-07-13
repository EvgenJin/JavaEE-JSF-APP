package evg.login.SessionBean;

import evg.login.Dao.VwExpZajCtrlDAO;
import evg.login.Dao.VwUsrDAO;
import evg.login.Entity.VwExpZajCtrl;
import evg.login.Entity.VwUsr;
import evg.login.Util.SessionUtils;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "usr", eager = true)
@SessionScoped
public class UsrFacade implements Serializable{
    private static final long serialVersionUID = 1L;
    @EJB
    private VwUsrDAO ejbFacade;
    @EJB
    private VwExpZajCtrlDAO vwExpZajCtrlDAO;
    
    private VwUsrDAO getFacade() {
        return ejbFacade;
    }
    private VwExpZajCtrlDAO getCtrl() {
        return vwExpZajCtrlDAO;
    }
    
    private VwUsr select;
    public VwUsr getSelect() {
        return select;
    }
    public void setSelect(VwUsr select) {
          this.select = select;
    }
    
    public String user;
    public String getData() {
        return user;
    } 
    public void setData(String user) {
       this.user = user;
    }
    
    public String showResult() {
       user = SessionUtils.getUserName().toUpperCase();
       select = getFacade().findByUser(user);
       return "user";
    }
    
    private List<VwExpZajCtrl> ctrl_list;
    public List<VwExpZajCtrl> getTodos_list() {
        ctrl_list = getCtrl().getAllByUser();
        return ctrl_list;
    }    
}
