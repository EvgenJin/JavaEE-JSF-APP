package evg.login.Entity;

import static evg.login.Util.JsfUtil.*;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name="VW_USR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwUsr.findAll", query = "SELECT t FROM VwUsr t")   
    ,@NamedQuery(name = "VwUsr.findByCusrlogname", query = "SELECT t FROM VwUsr t WHERE t.cusrlogname = :cusrlogname")
})

public class VwUsr implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ADDR_EMAIL")
	private String addrEmail;

	@Column(name="ADDR_LOTUS")
	private String addrLotus;

	private String ctabnum;

	private String cusrdivision;
        
        @Id
	private String cusrlogname;

	private String cusrname;

	private String cusrora;

	private String cusrplace;

	private String cusrposition;

	private String cusrstate;

	@Temporal(TemporalType.DATE)
	private Date dusrend;

	@Temporal(TemporalType.DATE)
	private Date dusrstart;

	private BigDecimal iusrbranch;

	private BigDecimal iusrdep;

	private BigDecimal iusrfilial;
        
	private BigDecimal iusrot2;

	public VwUsr() {
	}

	public String getAddrEmail() throws UnsupportedEncodingException {
		return convOut(this.addrEmail);
	}

	public void setAddrEmail(String addrEmail) {
		this.addrEmail = addrEmail;
	}

	public String getAddrLotus() {
		return this.addrLotus;
	}

	public void setAddrLotus(String addrLotus) {
		this.addrLotus = addrLotus;
	}

	public String getCtabnum() {
		return this.ctabnum;
	}

	public void setCtabnum(String ctabnum) {
		this.ctabnum = ctabnum;
	}

	public String getCusrdivision() {
		return this.cusrdivision;
	}

	public void setCusrdivision(String cusrdivision) {
		this.cusrdivision = cusrdivision;
	}

	public String getCusrlogname() {
		return this.cusrlogname;
	}

	public void setCusrlogname(String cusrlogname) {
		this.cusrlogname = cusrlogname;
	}

	public String getCusrname() throws UnsupportedEncodingException {
		return convOut(this.cusrname);
	}

	public void setCusrname(String cusrname) {
		this.cusrname = cusrname;
	}

	public String getCusrora() throws UnsupportedEncodingException {
		return convOut(this.cusrora);
	}

	public void setCusrora(String cusrora) {
		this.cusrora = cusrora;
	}

	public String getCusrplace() throws UnsupportedEncodingException {
		return convOut(this.cusrplace);
	}

	public void setCusrplace(String cusrplace) {
		this.cusrplace = cusrplace;
	}

	public String getCusrposition() throws UnsupportedEncodingException {
		return convOut(this.cusrposition);
	}

	public void setCusrposition(String cusrposition) {
		this.cusrposition = cusrposition;
	}

	public String getCusrstate() throws UnsupportedEncodingException {
		return convOut(this.cusrstate);
	}

	public void setCusrstate(String cusrstate) {
		this.cusrstate = cusrstate;
	}

	public Date getDusrend() {
		return this.dusrend;
	}

	public void setDusrend(Date dusrend) {
		this.dusrend = dusrend;
	}

	public Date getDusrstart() {
		return this.dusrstart;
	}

	public void setDusrstart(Date dusrstart) {
		this.dusrstart = dusrstart;
	}

	public BigDecimal getIusrbranch() {
		return this.iusrbranch;
	}

	public void setIusrbranch(BigDecimal iusrbranch) {
		this.iusrbranch = iusrbranch;
	}

	public BigDecimal getIusrdep() {
		return this.iusrdep;
	}

	public void setIusrdep(BigDecimal iusrdep) {
		this.iusrdep = iusrdep;
	}

	public BigDecimal getIusrfilial() {
		return this.iusrfilial;
	}

	public void setIusrfilial(BigDecimal iusrfilial) {
		this.iusrfilial = iusrfilial;
	}

	public BigDecimal getIusrot2() {
		return this.iusrot2;
	}

	public void setIusrot2(BigDecimal iusrot2) {
		this.iusrot2 = iusrot2;
	}

}
