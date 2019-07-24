package evg.login.Controller;

import evg.login.Dao.VwExpCusDAO;
import evg.login.Entity.VwExpCus;
import evg.login.Util.JsfUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named("vwexpcus")
@SessionScoped
public class VwExpCuscontroller implements Serializable{
    @EJB
    private VwExpCusDAO dao;
    
    private List<VwExpCus> cus_list;
    private String first_name;
    private String second_name;
    private String third_name;
    private String doc_ser;
    private String doc_num;
    
    public String getDoc_ser() {
        return doc_ser;
    }

    public void setDoc_ser(String doc_ser) {
        this.doc_ser = doc_ser;
    }

    public String getDoc_num() {
        return doc_num;
    }

    public void setDoc_num(String doc_num) {
        this.doc_num = doc_num;
    }
    
    
    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public String getThird_name() {
        return third_name;
    }

    public void setThird_name(String third_name) {
        this.third_name = third_name;
    }
     
    public VwExpCuscontroller () {
    }
    
    private VwExpCusDAO getDao() {
        return dao;
    }
    
    public List<VwExpCus> getCus_list() {
//        cus_list = getDao().getAll();
        cus_list = new ArrayList();
        return cus_list;
    }

    public void setCus_list(List<VwExpCus> cus_list) {
        this.cus_list = cus_list;
    }
    
    public void SearchByRecs() {
        System.err.println(first_name);
        System.err.println(second_name);
        System.err.println(third_name);
        System.err.println(doc_ser);
        System.err.println(doc_num);
    }

}
