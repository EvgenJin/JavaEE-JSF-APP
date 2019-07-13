package evg.login.SessionBean;

import evg.login.Util.JsfUtil;
import evg.login.Dao.TodosDAO;
import evg.login.Entity.Todos;
import evg.login.Util.SessionUtils;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.Date;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "userData", eager = true)
@SessionScoped
public class UserData implements Serializable {
    private static final long serialVersionUID = 1L;
    public Long data;
    private String access_edit = "true";
    
    @EJB
    private TodosDAO ejbFacade;   
    private TodosDAO getFacade() {
        return ejbFacade;
    }
    
    private Todos select;
    public Todos getSelect() {
        return select;
    }
    public void setSelect(Todos select) {
          this.select = select;
    }
    
    public String getAccess_edit() {
        return this.access_edit;
    }
    public void setAccess_edit(String access_edit) {
        this.access_edit = access_edit;
    }    

    public Long getData() {
        return data;
    } 
    public void setData(Long data) {
       this.data = data;
    }

   public String showResult() {
      data =  Long.parseLong(JsfUtil.getRequestParameter("todo_id"));
      select = getFacade().findById(data);
      return "one";
   }
   
   public String createTodo() {
      select = new Todos();
      return "one";
   }   
   
    public Todos getTodos() {
        return getFacade().findById(data);
    }
    
    public String saveTodos() {
        Date date = new Date();
        select.setUsr(SessionUtils.getUserName());
        select.setDstart(date);
        getFacade().create(select);
        return "list";
    }
    
    public void yohoo() {
//        JsfUtil.addSuccessMessage("YEAH!!!!");
                        FacesContext.getCurrentInstance().addMessage(
                                null
                                , new FacesMessage(FacesMessage.SEVERITY_ERROR
                                                   ,"Не правильное имя пользователя или пароль"
                                                   ,"Проверьте реквизиты"));
    }
    
    public void info() {
//           SEVERITY_INFO SEVERITY_WARN SEVERITY_ERROR SEVERITY_FATAL
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Info", "PrimeFaces Rocks."));
    }
    
    public void procedure () {
        getFacade().getCount();
    }
    
    public void procedure_cur() {
        getFacade().getListByUser();
    }
    
    


    
    
}