/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evg.login.Controller;

import evg.login.Dao.CusDAO;
import evg.login.Entity.Cus;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named("Customers")
@SessionScoped
public class CustomersController implements Serializable {
    @EJB
    private CusDAO dao;    
    
    private List<Cus> cus_list;
    private Cus select;
    
    public CustomersController () {
    }
    
    private CusDAO getDao() {
        return dao;
    }    

    public List<Cus> getCus_list() {
        cus_list = getDao().getAll();
        return cus_list;
    }

    public void setCus_list(List<Cus> cus_list) {
        this.cus_list = cus_list;
    }

    public Cus getSelect() {
        return select;
    }

    public void setSelect(Cus select) {
        this.select = select;
    }
    
    public void save() {
        getDao().update(select);
    }
    
}
