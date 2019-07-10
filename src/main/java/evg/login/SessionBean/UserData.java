/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evg.login.SessionBean;

import evg.login.Dao.TodosDAO;
import evg.login.Entity.Todos;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import java.util.Map;

import java.io.Serializable;
import javax.ejb.EJB;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "userData", eager = true)
@SessionScoped
public class UserData implements Serializable {
    @EJB
//    private TodosFacade ejbFacade;   
    private TodosDAO ejbFacade;   
    private TodosDAO getFacade() {
        return ejbFacade;
    }
    
    public void setFacade(TodosDAO ejbFacade) {
        this.ejbFacade = ejbFacade;
    }
    
   private static final long serialVersionUID = 1L;
   public Long data;
   
   private Todos select;
   
   private String access_edit = "true";
   
    public Todos getSelect() {
        select = getFacade().findById(data);
        return select;
    }

    public void setSelect(Todos select) {
          this.select.setId(select.getId());
          this.select.setDend(select.getDend());
          this.select.setDescription(select.getDescription());
          this.select.setDstart(select.getDstart());
          this.select.setState(select.getState());
          this.select.setTask(select.getTask());
          this.select.setUsr(select.getUsr());
//          this.select = select;
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
      FacesContext fc = FacesContext.getCurrentInstance();
      Map<String,String> params = 
         fc.getExternalContext().getRequestParameterMap();
      data =  Long.parseLong(params.get("username")); 
      return "one";
   }
   
    public Todos getTodos() {
        return getFacade().findById(data);
    }
    
    public void saveTodos() {
        System.out.println(select.getTask());
        getFacade().update(select);
    }
    
    
}