/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evg.login.Entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author admin
 */
@Entity
@Table(name = "CUS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cus.findAll", query = "SELECT c FROM Cus c")
    , @NamedQuery(name = "Cus.findById", query = "SELECT c FROM Cus c WHERE c.id = :id")
    , @NamedQuery(name = "Cus.findBySurname", query = "SELECT c FROM Cus c WHERE c.surname = :surname")
    , @NamedQuery(name = "Cus.findByName", query = "SELECT c FROM Cus c WHERE c.name = :name")
    , @NamedQuery(name = "Cus.findByMidlename", query = "SELECT c FROM Cus c WHERE c.midlename = :midlename")
    , @NamedQuery(name = "Cus.findBySex", query = "SELECT c FROM Cus c WHERE c.sex = :sex")
    , @NamedQuery(name = "Cus.findByMobilephone", query = "SELECT c FROM Cus c WHERE c.mobilephone = :mobilephone")
    , @NamedQuery(name = "Cus.findByEmail", query = "SELECT c FROM Cus c WHERE c.email = :email")
    , @NamedQuery(name = "Cus.findByGorod", query = "SELECT c FROM Cus c WHERE c.gorod = :gorod")
    , @NamedQuery(name = "Cus.findByDateborn", query = "SELECT c FROM Cus c WHERE c.dateborn = :dateborn")
    , @NamedQuery(name = "Cus.findByNPasporta", query = "SELECT c FROM Cus c WHERE c.nPasporta = :nPasporta")
    , @NamedQuery(name = "Cus.findByPasKogdaVidan", query = "SELECT c FROM Cus c WHERE c.pasKogdaVidan = :pasKogdaVidan")
    , @NamedQuery(name = "Cus.findByPasKemVidan", query = "SELECT c FROM Cus c WHERE c.pasKemVidan = :pasKemVidan")
    , @NamedQuery(name = "Cus.findByPasKodPodr", query = "SELECT c FROM Cus c WHERE c.pasKodPodr = :pasKodPodr")
    , @NamedQuery(name = "Cus.findByBorncity", query = "SELECT c FROM Cus c WHERE c.borncity = :borncity")
    , @NamedQuery(name = "Cus.findByRealGorod", query = "SELECT c FROM Cus c WHERE c.realGorod = :realGorod")
    , @NamedQuery(name = "Cus.findByRealUlica", query = "SELECT c FROM Cus c WHERE c.realUlica = :realUlica")
    , @NamedQuery(name = "Cus.findByRealDom", query = "SELECT c FROM Cus c WHERE c.realDom = :realDom")
    , @NamedQuery(name = "Cus.findByRealCorp", query = "SELECT c FROM Cus c WHERE c.realCorp = :realCorp")
    , @NamedQuery(name = "Cus.findByRealKvartira", query = "SELECT c FROM Cus c WHERE c.realKvartira = :realKvartira")
    , @NamedQuery(name = "Cus.findByTelcode", query = "SELECT c FROM Cus c WHERE c.telcode = :telcode")
    , @NamedQuery(name = "Cus.findByTel", query = "SELECT c FROM Cus c WHERE c.tel = :tel")
    , @NamedQuery(name = "Cus.findByRealGorod2", query = "SELECT c FROM Cus c WHERE c.realGorod2 = :realGorod2")
    , @NamedQuery(name = "Cus.findByRealUlica2", query = "SELECT c FROM Cus c WHERE c.realUlica2 = :realUlica2")
    , @NamedQuery(name = "Cus.findByRealDom2", query = "SELECT c FROM Cus c WHERE c.realDom2 = :realDom2")
    , @NamedQuery(name = "Cus.findByRealCorp2", query = "SELECT c FROM Cus c WHERE c.realCorp2 = :realCorp2")
    , @NamedQuery(name = "Cus.findByRealKvartira2", query = "SELECT c FROM Cus c WHERE c.realKvartira2 = :realKvartira2")
    , @NamedQuery(name = "Cus.findByNeedsum", query = "SELECT c FROM Cus c WHERE c.needsum = :needsum")
    , @NamedQuery(name = "Cus.findByNeedday", query = "SELECT c FROM Cus c WHERE c.needday = :needday")
    , @NamedQuery(name = "Cus.findByDatezaym", query = "SELECT c FROM Cus c WHERE c.datezaym = :datezaym")
    , @NamedQuery(name = "Cus.findByIp", query = "SELECT c FROM Cus c WHERE c.ip = :ip")
    , @NamedQuery(name = "Cus.findByIwork", query = "SELECT c FROM Cus c WHERE c.iwork = :iwork")
    , @NamedQuery(name = "Cus.findByWherework", query = "SELECT c FROM Cus c WHERE c.wherework = :wherework")
    , @NamedQuery(name = "Cus.findByFiort", query = "SELECT c FROM Cus c WHERE c.fiort = :fiort")
    , @NamedQuery(name = "Cus.findByReshenieSb", query = "SELECT c FROM Cus c WHERE c.reshenieSb = :reshenieSb")
    , @NamedQuery(name = "Cus.findByComments", query = "SELECT c FROM Cus c WHERE c.comments = :comments")
    , @NamedQuery(name = "Cus.findByDateTimeReshenie", query = "SELECT c FROM Cus c WHERE c.dateTimeReshenie = :dateTimeReshenie")})
public class Cus implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
    @Size(max = 26)
    @Column(name = "SURNAME")
    private String surname;
    @Size(max = 26)
    @Column(name = "NAME")
    private String name;
    @Size(max = 26)
    @Column(name = "MIDLENAME")
    private String midlename;
    @Size(max = 26)
    @Column(name = "SEX")
    private String sex;
    @Column(name = "MOBILEPHONE")
    private BigInteger mobilephone;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Недопустимый адрес электронной почты")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 128)
    @Column(name = "EMAIL")
    private String email;
    @Size(max = 26)
    @Column(name = "GOROD")
    private String gorod;
    @Size(max = 26)
    @Column(name = "DATEBORN")
    private String dateborn;
    @Column(name = "N_PASPORTA")
    private BigInteger nPasporta;
    @Size(max = 26)
    @Column(name = "PAS_KOGDA_VIDAN")
    private String pasKogdaVidan;
    @Size(max = 128)
    @Column(name = "PAS_KEM_VIDAN")
    private String pasKemVidan;
    @Column(name = "PAS_KOD_PODR")
    private BigInteger pasKodPodr;
    @Size(max = 128)
    @Column(name = "BORNCITY")
    private String borncity;
    @Size(max = 26)
    @Column(name = "REAL_GOROD")
    private String realGorod;
    @Size(max = 26)
    @Column(name = "REAL_ULICA")
    private String realUlica;
    @Size(max = 26)
    @Column(name = "REAL_DOM")
    private String realDom;
    @Size(max = 26)
    @Column(name = "REAL_CORP")
    private String realCorp;
    @Size(max = 26)
    @Column(name = "REAL_KVARTIRA")
    private String realKvartira;
    @Column(name = "TELCODE")
    private BigInteger telcode;
    @Column(name = "TEL")
    private BigInteger tel;
    @Size(max = 26)
    @Column(name = "REAL_GOROD2")
    private String realGorod2;
    @Size(max = 26)
    @Column(name = "REAL_ULICA2")
    private String realUlica2;
    @Size(max = 26)
    @Column(name = "REAL_DOM2")
    private String realDom2;
    @Size(max = 26)
    @Column(name = "REAL_CORP2")
    private String realCorp2;
    @Size(max = 26)
    @Column(name = "REAL_KVARTIRA2")
    private String realKvartira2;
    @Column(name = "NEEDSUM")
    private BigInteger needsum;
    @Column(name = "NEEDDAY")
    private BigInteger needday;
    @Column(name = "DATEZAYM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datezaym;
    @Size(max = 128)
    @Column(name = "IP")
    private String ip;
    @Column(name = "IWORK")
    private BigInteger iwork;
    @Size(max = 128)
    @Column(name = "WHEREWORK")
    private String wherework;
    @Size(max = 128)
    @Column(name = "FIORT")
    private String fiort;
    @Size(max = 26)
    @Column(name = "RESHENIE_SB")
    private String reshenieSb;
    @Size(max = 128)
    @Column(name = "COMMENTS")
    private String comments;
    @Column(name = "DATE_TIME_RESHENIE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTimeReshenie;
    
    public Cus() {
    }

    public Cus(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMidlename() {
        return midlename;
    }

    public void setMidlename(String midlename) {
        this.midlename = midlename;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public BigInteger getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(BigInteger mobilephone) {
        this.mobilephone = mobilephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGorod() {
        return gorod;
    }

    public void setGorod(String gorod) {
        this.gorod = gorod;
    }

    public String getDateborn() {
        return dateborn;
    }

    public void setDateborn(String dateborn) {
        this.dateborn = dateborn;
    }

    public BigInteger getNPasporta() {
        return nPasporta;
    }

    public void setNPasporta(BigInteger nPasporta) {
        this.nPasporta = nPasporta;
    }

    public String getPasKogdaVidan() {
        return pasKogdaVidan;
    }

    public void setPasKogdaVidan(String pasKogdaVidan) {
        this.pasKogdaVidan = pasKogdaVidan;
    }

    public String getPasKemVidan() {
        return pasKemVidan;
    }

    public void setPasKemVidan(String pasKemVidan) {
        this.pasKemVidan = pasKemVidan;
    }

    public BigInteger getPasKodPodr() {
        return pasKodPodr;
    }

    public void setPasKodPodr(BigInteger pasKodPodr) {
        this.pasKodPodr = pasKodPodr;
    }

    public String getBorncity() {
        return borncity;
    }

    public void setBorncity(String borncity) {
        this.borncity = borncity;
    }

    public String getRealGorod() {
        return realGorod;
    }

    public void setRealGorod(String realGorod) {
        this.realGorod = realGorod;
    }

    public String getRealUlica() {
        return realUlica;
    }

    public void setRealUlica(String realUlica) {
        this.realUlica = realUlica;
    }

    public String getRealDom() {
        return realDom;
    }

    public void setRealDom(String realDom) {
        this.realDom = realDom;
    }

    public String getRealCorp() {
        return realCorp;
    }

    public void setRealCorp(String realCorp) {
        this.realCorp = realCorp;
    }

    public String getRealKvartira() {
        return realKvartira;
    }

    public void setRealKvartira(String realKvartira) {
        this.realKvartira = realKvartira;
    }

    public BigInteger getTelcode() {
        return telcode;
    }

    public void setTelcode(BigInteger telcode) {
        this.telcode = telcode;
    }

    public BigInteger getTel() {
        return tel;
    }

    public void setTel(BigInteger tel) {
        this.tel = tel;
    }

    public String getRealGorod2() {
        return realGorod2;
    }

    public void setRealGorod2(String realGorod2) {
        this.realGorod2 = realGorod2;
    }

    public String getRealUlica2() {
        return realUlica2;
    }

    public void setRealUlica2(String realUlica2) {
        this.realUlica2 = realUlica2;
    }

    public String getRealDom2() {
        return realDom2;
    }

    public void setRealDom2(String realDom2) {
        this.realDom2 = realDom2;
    }

    public String getRealCorp2() {
        return realCorp2;
    }

    public void setRealCorp2(String realCorp2) {
        this.realCorp2 = realCorp2;
    }

    public String getRealKvartira2() {
        return realKvartira2;
    }

    public void setRealKvartira2(String realKvartira2) {
        this.realKvartira2 = realKvartira2;
    }

    public BigInteger getNeedsum() {
        return needsum;
    }

    public void setNeedsum(BigInteger needsum) {
        this.needsum = needsum;
    }

    public BigInteger getNeedday() {
        return needday;
    }

    public void setNeedday(BigInteger needday) {
        this.needday = needday;
    }

    public Date getDatezaym() {
        return datezaym;
    }

    public void setDatezaym(Date datezaym) {
        this.datezaym = datezaym;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public BigInteger getIwork() {
        return iwork;
    }

    public void setIwork(BigInteger iwork) {
        this.iwork = iwork;
    }

    public String getWherework() {
        return wherework;
    }

    public void setWherework(String wherework) {
        this.wherework = wherework;
    }

    public String getFiort() {
        return fiort;
    }

    public void setFiort(String fiort) {
        this.fiort = fiort;
    }

    public String getReshenieSb() {
        return reshenieSb;
    }

    public void setReshenieSb(String reshenieSb) {
        this.reshenieSb = reshenieSb;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Date getDateTimeReshenie() {
        return dateTimeReshenie;
    }

    public void setDateTimeReshenie(Date dateTimeReshenie) {
        this.dateTimeReshenie = dateTimeReshenie;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cus)) {
            return false;
        }
        Cus other = (Cus) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "evg.login.Entity.Cus[ id=" + id + " ]";
    }
       
}
