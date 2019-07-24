package evg.login.Entity;

import static evg.login.Util.JsfUtil.convOut;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the VW_EXP_CUS database table.
 * 
 */
@Entity
@Table(name="VW_EXP_CUS")
@NamedQuery(name="VwExpCus.findAll", query="SELECT v FROM VwExpCus v where v.id <= 200000")
public class VwExpCus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ADDR_BIRTH")
	private String addrBirth;

	@Column(name="ARMY_NUM")
	private BigDecimal armyNum;

	private String cadduser;

	@Column(name="CB_SMS")
	private String cbSms;

	private String childr;

	@Column(name="CHILDR_NUM")
	private BigDecimal childrNum;

	private BigDecimal country;

	private String cusinn;

	@Temporal(TemporalType.DATE)
	private Date dadddate;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_BEG_WORK")
	private Date dateBegWork;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_BEG_WORK_LAST")
	private Date dateBegWorkLast;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_DEATH")
	private Date dateDeath;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_DEATH_RECEIP")
	private Date dateDeathReceip;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_REG")
	private Date dateReg;

	@Temporal(TemporalType.DATE)
	private Date dbirth;

	@Column(name="DEATH_CERT")
	private String deathCert;

	@Temporal(TemporalType.DATE)
	@Column(name="DEATH_CERT_DATE")
	private Date deathCertDate;

	@Temporal(TemporalType.DATE)
	@Column(name="DOC_END")
	private Date docEnd;

	@Column(name="DOC_NUM")
	private String docNum;

	@Column(name="DOC_PLACE")
	private String docPlace;

	@Column(name="DOC_PODR")
	private String docPodr;

	@Column(name="DOC_SER")
	private String docSer;

	@Column(name="DOC_TYPE")
	private BigDecimal docType;

	@Temporal(TemporalType.DATE)
	@Column(name="DOC_WHEN")
	private Date docWhen;

	@Column(name="DOC_WHO")
	private String docWho;

	private BigDecimal educ;

	@Column(name="EXP_CAT")
	private BigDecimal expCat;

	@Column(name="EXP_CAT_DEP")
	private BigDecimal expCatDep;

	@Column(name="EXP_CAT_P")
	private BigDecimal expCatP;

	@Column(name="EXP_OKATO")
	private String expOkato;

	@Column(name="EXP_PFR")
	private String expPfr;

	private BigDecimal family;

	@Column(name="FAMILY_CERT")
	private String familyCert;

	@Column(name="FAMST_ID")
	private BigDecimal famstId;

	private String fio;

	@Column(name="FIO_FIND")
	private String fioFind;

	private BigDecimal gscnum;

	private BigDecimal icusnum;

        @Id
	private BigDecimal id;

	@Column(name="IKAR_ID")
	private BigDecimal ikarId;

	@Column(name="IKAR_SRC")
	private String ikarSrc;

	private String inn;

	@Column(name="IS_BUSINESS")
	private BigDecimal isBusiness;

	@Column(name="IS_WORKCARD")
	private BigDecimal isWorkcard;

	private BigDecimal kompromat;

	@Column(name="KUB_REF")
	private BigDecimal kubRef;

	@Column(name="MAIDEN_NAME")
	private String maidenName;

	private BigDecimal nr;

	private String place1;

	private String place2;

	private String sex;

	private String sost;

	private BigDecimal subsidy;

	private String tel;

	private String tel4sms;

	@Column(name="\"WORK\"")
	private String work;

	@Temporal(TemporalType.DATE)
	@Column(name="WORK_BOOK_DATE")
	private Date workBookDate;

	@Column(name="WORK_BOOK_NUM")
	private String workBookNum;

	@Column(name="WORK_BOOK_SER")
	private String workBookSer;

	@Column(name="WORK_INN")
	private String workInn;

	@Column(name="WORK_POST")
	private String workPost;

	public VwExpCus() {
	}

	public String getAddrBirth() {
		return this.addrBirth;
	}

	public void setAddrBirth(String addrBirth) {
		this.addrBirth = addrBirth;
	}

	public BigDecimal getArmyNum() {
		return this.armyNum;
	}

	public void setArmyNum(BigDecimal armyNum) {
		this.armyNum = armyNum;
	}

	public String getCadduser() {
		return this.cadduser;
	}

	public void setCadduser(String cadduser) {
		this.cadduser = cadduser;
	}

	public String getCbSms() {
		return this.cbSms;
	}

	public void setCbSms(String cbSms) {
		this.cbSms = cbSms;
	}

	public String getChildr() {
		return this.childr;
	}

	public void setChildr(String childr) {
		this.childr = childr;
	}

	public BigDecimal getChildrNum() {
		return this.childrNum;
	}

	public void setChildrNum(BigDecimal childrNum) {
		this.childrNum = childrNum;
	}

	public BigDecimal getCountry() {
		return this.country;
	}

	public void setCountry(BigDecimal country) {
		this.country = country;
	}

	public String getCusinn() {
		return this.cusinn;
	}

	public void setCusinn(String cusinn) {
		this.cusinn = cusinn;
	}

	public Date getDadddate() {
		return this.dadddate;
	}

	public void setDadddate(Date dadddate) {
		this.dadddate = dadddate;
	}

	public Date getDateBegWork() {
		return this.dateBegWork;
	}

	public void setDateBegWork(Date dateBegWork) {
		this.dateBegWork = dateBegWork;
	}

	public Date getDateBegWorkLast() {
		return this.dateBegWorkLast;
	}

	public void setDateBegWorkLast(Date dateBegWorkLast) {
		this.dateBegWorkLast = dateBegWorkLast;
	}

	public Date getDateDeath() {
		return this.dateDeath;
	}

	public void setDateDeath(Date dateDeath) {
		this.dateDeath = dateDeath;
	}

	public Date getDateDeathReceip() {
		return this.dateDeathReceip;
	}

	public void setDateDeathReceip(Date dateDeathReceip) {
		this.dateDeathReceip = dateDeathReceip;
	}

	public Date getDateReg() {
		return this.dateReg;
	}

	public void setDateReg(Date dateReg) {
		this.dateReg = dateReg;
	}

	public Date getDbirth() {
		return this.dbirth;
	}

	public void setDbirth(Date dbirth) {
		this.dbirth = dbirth;
	}

	public String getDeathCert() {
		return this.deathCert;
	}

	public void setDeathCert(String deathCert) {
		this.deathCert = deathCert;
	}

	public Date getDeathCertDate() {
		return this.deathCertDate;
	}

	public void setDeathCertDate(Date deathCertDate) {
		this.deathCertDate = deathCertDate;
	}

	public Date getDocEnd() {
		return this.docEnd;
	}

	public void setDocEnd(Date docEnd) {
		this.docEnd = docEnd;
	}

	public String getDocNum() {
		return this.docNum;
	}

	public void setDocNum(String docNum) {
		this.docNum = docNum;
	}

	public String getDocPlace() {
		return this.docPlace;
	}

	public void setDocPlace(String docPlace) {
		this.docPlace = docPlace;
	}

	public String getDocPodr() {
		return this.docPodr;
	}

	public void setDocPodr(String docPodr) {
		this.docPodr = docPodr;
	}

	public String getDocSer() {
		return this.docSer;
	}

	public void setDocSer(String docSer) {
		this.docSer = docSer;
	}

	public BigDecimal getDocType() {
		return this.docType;
	}

	public void setDocType(BigDecimal docType) {
		this.docType = docType;
	}

	public Date getDocWhen() {
		return this.docWhen;
	}

	public void setDocWhen(Date docWhen) {
		this.docWhen = docWhen;
	}

	public String getDocWho() {
		return this.docWho;
	}

	public void setDocWho(String docWho) {
		this.docWho = docWho;
	}

	public BigDecimal getEduc() {
		return this.educ;
	}

	public void setEduc(BigDecimal educ) {
		this.educ = educ;
	}

	public BigDecimal getExpCat() {
		return this.expCat;
	}

	public void setExpCat(BigDecimal expCat) {
		this.expCat = expCat;
	}

	public BigDecimal getExpCatDep() {
		return this.expCatDep;
	}

	public void setExpCatDep(BigDecimal expCatDep) {
		this.expCatDep = expCatDep;
	}

	public BigDecimal getExpCatP() {
		return this.expCatP;
	}

	public void setExpCatP(BigDecimal expCatP) {
		this.expCatP = expCatP;
	}

	public String getExpOkato() {
		return this.expOkato;
	}

	public void setExpOkato(String expOkato) {
		this.expOkato = expOkato;
	}

	public String getExpPfr() {
		return this.expPfr;
	}

	public void setExpPfr(String expPfr) {
		this.expPfr = expPfr;
	}

	public BigDecimal getFamily() {
		return this.family;
	}

	public void setFamily(BigDecimal family) {
		this.family = family;
	}

	public String getFamilyCert() {
		return this.familyCert;
	}

	public void setFamilyCert(String familyCert) {
		this.familyCert = familyCert;
	}

	public BigDecimal getFamstId() {
		return this.famstId;
	}

	public void setFamstId(BigDecimal famstId) {
		this.famstId = famstId;
	}

	public String getFio() throws UnsupportedEncodingException {
		return convOut(this.fio);
	}

	public void setFio(String fio) {
		this.fio = fio;
	}

	public String getFioFind() {
		return this.fioFind;
	}

	public void setFioFind(String fioFind) {
		this.fioFind = fioFind;
	}

	public BigDecimal getGscnum() {
		return this.gscnum;
	}

	public void setGscnum(BigDecimal gscnum) {
		this.gscnum = gscnum;
	}

	public BigDecimal getIcusnum() {
		return this.icusnum;
	}

	public void setIcusnum(BigDecimal icusnum) {
		this.icusnum = icusnum;
	}

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public BigDecimal getIkarId() {
		return this.ikarId;
	}

	public void setIkarId(BigDecimal ikarId) {
		this.ikarId = ikarId;
	}

	public String getIkarSrc() {
		return this.ikarSrc;
	}

	public void setIkarSrc(String ikarSrc) {
		this.ikarSrc = ikarSrc;
	}

	public String getInn() {
		return this.inn;
	}

	public void setInn(String inn) {
		this.inn = inn;
	}

	public BigDecimal getIsBusiness() {
		return this.isBusiness;
	}

	public void setIsBusiness(BigDecimal isBusiness) {
		this.isBusiness = isBusiness;
	}

	public BigDecimal getIsWorkcard() {
		return this.isWorkcard;
	}

	public void setIsWorkcard(BigDecimal isWorkcard) {
		this.isWorkcard = isWorkcard;
	}

	public BigDecimal getKompromat() {
		return this.kompromat;
	}

	public void setKompromat(BigDecimal kompromat) {
		this.kompromat = kompromat;
	}

	public BigDecimal getKubRef() {
		return this.kubRef;
	}

	public void setKubRef(BigDecimal kubRef) {
		this.kubRef = kubRef;
	}

	public String getMaidenName() {
		return this.maidenName;
	}

	public void setMaidenName(String maidenName) {
		this.maidenName = maidenName;
	}

	public BigDecimal getNr() {
		return this.nr;
	}

	public void setNr(BigDecimal nr) {
		this.nr = nr;
	}

	public String getPlace1() {
		return this.place1;
	}

	public void setPlace1(String place1) {
		this.place1 = place1;
	}

	public String getPlace2() {
		return this.place2;
	}

	public void setPlace2(String place2) {
		this.place2 = place2;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getSost() {
		return this.sost;
	}

	public void setSost(String sost) {
		this.sost = sost;
	}

	public BigDecimal getSubsidy() {
		return this.subsidy;
	}

	public void setSubsidy(BigDecimal subsidy) {
		this.subsidy = subsidy;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getTel4sms() {
		return this.tel4sms;
	}

	public void setTel4sms(String tel4sms) {
		this.tel4sms = tel4sms;
	}

	public String getWork() {
		return this.work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public Date getWorkBookDate() {
		return this.workBookDate;
	}

	public void setWorkBookDate(Date workBookDate) {
		this.workBookDate = workBookDate;
	}

	public String getWorkBookNum() {
		return this.workBookNum;
	}

	public void setWorkBookNum(String workBookNum) {
		this.workBookNum = workBookNum;
	}

	public String getWorkBookSer() {
		return this.workBookSer;
	}

	public void setWorkBookSer(String workBookSer) {
		this.workBookSer = workBookSer;
	}

	public String getWorkInn() {
		return this.workInn;
	}

	public void setWorkInn(String workInn) {
		this.workInn = workInn;
	}

	public String getWorkPost() {
		return this.workPost;
	}

	public void setWorkPost(String workPost) {
		this.workPost = workPost;
	}

}