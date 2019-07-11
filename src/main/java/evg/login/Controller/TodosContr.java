/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evg.login.Controller;

import evg.login.Dao.TodosDAO;
import evg.login.Entity.Todos;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named("todoContr")
@SessionScoped
public class TodosContr implements Serializable {
    
    @EJB
    private TodosDAO dao;
    private List<Todos> todos_list;
    private Todos select;
    Todos todos = new Todos();
    Integer todos_id;

    public TodosContr() {
    }
    
  
    public Todos getSelect() {
        return select;
    }
    
    public void setSelect(Todos select) {
        this.select = select;
    }
    
    private TodosDAO getDao() {
        return dao;
    }
    
    public Todos getTodos(Long id) {
        return dao.findById(id);
    }
    
      
    public List<Todos> getTodos_list() {
        todos_list = getDao().getAll();
        return todos_list;
    }
    
    public void delete() {
        todos_list.remove(select);
        select = null;
        getDao().delete(select);
    }
    
    public void saveTodos() {
        getDao().update(select);
    }
    
}
