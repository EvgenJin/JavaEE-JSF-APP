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
      FacesContext fc = FacesContext.getCurrentInstance();
      Map<String,String> params = fc.getExternalContext().getRequestParameterMap();
      data =  Long.parseLong(params.get("username"));
      select = getFacade().findById(data);
      return "one";
   }
   
    public Todos getTodos() {
        return getFacade().findById(data);
    }
    
    public void saveTodos() {
        System.out.println(this.select.getTask());
        getFacade().update(select);
    }
    
    
}