/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evg.login.SessionBean;

import evg.login.Controller.util.JsfUtil;
import evg.login.Dao.TodosDAO;
import evg.login.Entity.Todos;
import evg.login.Util.SessionUtils;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import java.util.Map;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import org.primefaces.component.datatable.DataTable;
import org.primefaces.event.SelectEvent;

@ManagedBean(name = "userData", eager = true)
@SessionScoped
//@ViewScoped 
public class UserData implements Serializable {
    @EJB
    private TodosDAO ejbFacade;   
    private TodosDAO getFacade() {
        return ejbFacade;
    }
    private Todos select;
    
    private static final long serialVersionUID = 1L;
    public Long data;
    private String access_edit = "true";
   
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
//       System.out.println(data);
      select = getFacade().findById(data);
//      System.out.println(select.getId());
      return "one";
   }
   
   public String createTodo() {
      
      return "one";
   }   
   
    public Todos getTodos() {
        return getFacade().findById(data);
    }
    
    public void saveTodos() {
        if (select.getId() != null) {
//            getFacade().update(select);
            System.out.println("not null");
//            System.out.println(select.getId());
        }
        else {
            select = new Todos(); 
//            Date date = new Date();
            select.setId(Long.valueOf(101));
//            select = this.select;
            select = this.select;
//            select.setUsr(SessionUtils.getUserName());
//            select.setDstart(date);
//            getFacade().create(select);
            System.out.println("!null");
            System.out.println(select);
//            System.out.println(select.getId());
        }
        
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
    

    
    
}