/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evg.login.SessionBean;

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
    private TodosFacade ejbFacade;   
    private TodosFacade getFacade() {
        return ejbFacade;
    }    
    
   private static final long serialVersionUID = 1L;
   public Long data;
   
   private Todos select;
   
    public Todos getSelect() {
        select = getFacade().find(data);
        return select;
    }

    public void setSelected(Todos select) {
        this.select = select;
    }   

//   public Integer getData() {
//      return Integer.parseInt(data);
//   }
   public Long getData() {
       return data;
   } 
   
//   public String getData() {
//      return data;
//   }   

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
        return getFacade().find(data);
    }   
}