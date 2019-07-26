/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evg.login.Dao;

import evg.login.Entity.VwExpCus;
import static evg.login.Util.JsfUtil.convIn;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

@Stateless
public class VwExpCusDAO {
    @PersistenceContext(unitName = "pers")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }
    
    public List getAll() {
        return em.createNamedQuery("VwExpCus.findAll", VwExpCus.class).getResultList();
    }
    
    public List findByFio(String firstname, String lastname, String thirdname) throws UnsupportedEncodingException {
        String fio = firstname+lastname+thirdname;
        fio = convIn(fio);
        System.out.println(fio+"!");
        return em.createNamedQuery("VwExpCus.findByFio").setParameter("fio",fio).getResultList();
//            return em.createNamedQuery("VwExpCus.findAll", VwExpCus.class).getResultList();
    }
    
    public List<VwExpCus> findCustomers(String firstName, String surname, String thirdname) throws UnsupportedEncodingException {

        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<VwExpCus> query = builder.createQuery(VwExpCus.class);
        Root<VwExpCus> cust = query.from(VwExpCus.class);
        query.select(cust);

        List<Predicate> predicateList = new ArrayList<>();

        Predicate firstNamePredicate, surnamePredicate;

//      имя не нулл и не пусто  
        if ((firstName != null) && (!(firstName.isEmpty()))) {
            firstNamePredicate = builder.like(
                builder.upper(cust.<String>get("fio")), "%"+convIn(firstName).toUpperCase()+"%");
            predicateList.add(firstNamePredicate);
        }
//      фамилия не нулл и не пусто
        if ((surname != null) && (!(surname.isEmpty()))) {
            surnamePredicate = builder.like(
                builder.upper(cust.<String>get("fio")), "%"+convIn(surname).toUpperCase()+"%");
            predicateList.add(surnamePredicate);
        }
//      отчество не нулл и не пусто
        if ((thirdname != null) && (!(thirdname.isEmpty()))) {
            surnamePredicate = builder.like(
                builder.upper(cust.<String>get("fio")), "%"+convIn(thirdname).toUpperCase()+"%");
            predicateList.add(surnamePredicate);
        }        

        Predicate[] predicates = new Predicate[predicateList.size()];
        predicateList.toArray(predicates);
        query.where(predicates);

        return em.createQuery(query).getResultList();
//            System.out.println(query+"!");
//            return null;
    }     
}
