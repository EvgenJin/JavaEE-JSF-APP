package evg.login.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="VW_EXP_ZAJ_CTRL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwExpZajCtrl.findAll", query = "SELECT v FROM VwExpZajCtrl v")
    ,@NamedQuery(name = "VwExpZajCtrl.findByUserInsert", query = "SELECT v FROM VwExpZajCtrl v WHERE v.userInsert = :userInsert")
})

public class VwExpZajCtrl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CAT_NAME")
	private String catName;

	private String ccdaoperator;

	@Column(name="CUR_CRD")
	private String curCrd;

	@Column(name="CUS_ID")
	private BigDecimal cusId;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_OUT_KK")
	private Date dateOutKk;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_ZAJ")
	private Date dateZaj;

	@Temporal(TemporalType.DATE)
	private Date dcdaclosed;

	@Temporal(TemporalType.DATE)
	private Date dcdastarted;

	@Column(name="DISC_ZP")
	private String discZp;

	private BigDecimal et;

	private String fio;

        @Id
	private BigDecimal id;

	private BigDecimal mcdatotal;

	private BigDecimal nagrid;

	@Column(name="NAME_PRG")
	private String namePrg;

	@Column(name="NAME_PROG")
	private String nameProg;

	@Column(name="NAME_TARG")
	private String nameTarg;

	private BigDecimal nday;

	private String nkk;

	private BigDecimal nnorm;

	private BigDecimal nostd;

	@Column(name="NOSTD_NOTE")
	private String nostdNote;

	@Column(name="NOSTD_TEXT")
	private String nostdText;

	private String numrst;

	private BigDecimal otd;

	@Column(name="OTD_STORAGE")
	private BigDecimal otdStorage;

	@Column(name="PRG_ID")
	private BigDecimal prgId;

	private BigDecimal prioritet;

	@Column(name="PRIORITET_NAME")
	private String prioritetName;

	private BigDecimal rate;

	@Column(name="SALON_ZASTR")
	private String salonZastr;

	@Temporal(TemporalType.DATE)
	@Column(name="ST_DATE")
	private Date stDate;

	@Column(name="ST_ID")
	private String stId;

	@Column(name="ST_NAME")
	private String stName;

	@Column(name="SUM_CRD")
	private BigDecimal sumCrd;

	@Column(name="USER_CRINSP")
	private String userCrinsp;

	@Column(name="USER_CURATOR")
	private String userCurator;

	@Column(name="USER_FIRST")
	private String userFirst;

	@Column(name="USER_INSERT")
	private String userInsert;

	private String usrins;

	private String usrinsp;

	@Column(name="\"WORK\"")
	private String work;

	@Column(name="WORK_POST")
	private String workPost;

	@Column(name="ZAJ_FROM")
	private String zajFrom;

	public VwExpZajCtrl() {
	}

	public String getCatName() {
		return this.catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public String getCcdaoperator() {
		return this.ccdaoperator;
	}

	public void setCcdaoperator(String ccdaoperator) {
		this.ccdaoperator = ccdaoperator;
	}

	public String getCurCrd() {
		return this.curCrd;
	}

	public void setCurCrd(String curCrd) {
		this.curCrd = curCrd;
	}

	public BigDecimal getCusId() {
		return this.cusId;
	}

	public void setCusId(BigDecimal cusId) {
		this.cusId = cusId;
	}

	public Date getDateOutKk() {
		return this.dateOutKk;
	}

	public void setDateOutKk(Date dateOutKk) {
		this.dateOutKk = dateOutKk;
	}

	public Date getDateZaj() {
		return this.dateZaj;
	}

	public void setDateZaj(Date dateZaj) {
		this.dateZaj = dateZaj;
	}

	public Date getDcdaclosed() {
		return this.dcdaclosed;
	}

	public void setDcdaclosed(Date dcdaclosed) {
		this.dcdaclosed = dcdaclosed;
	}

	public Date getDcdastarted() {
		return this.dcdastarted;
	}

	public void setDcdastarted(Date dcdastarted) {
		this.dcdastarted = dcdastarted;
	}

	public String getDiscZp() {
		return this.discZp;
	}

	public void setDiscZp(String discZp) {
		this.discZp = discZp;
	}

	public BigDecimal getEt() {
		return this.et;
	}

	public void setEt(BigDecimal et) {
		this.et = et;
	}

	public String getFio() {
		return this.fio;
	}

	public void setFio(String fio) {
		this.fio = fio;
	}

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public BigDecimal getMcdatotal() {
		return this.mcdatotal;
	}

	public void setMcdatotal(BigDecimal mcdatotal) {
		this.mcdatotal = mcdatotal;
	}

	public BigDecimal getNagrid() {
		return this.nagrid;
	}

	public void setNagrid(BigDecimal nagrid) {
		this.nagrid = nagrid;
	}

	public String getNamePrg() {
		return this.namePrg;
	}

	public void setNamePrg(String namePrg) {
		this.namePrg = namePrg;
	}

	public String getNameProg() {
		return this.nameProg;
	}

	public void setNameProg(String nameProg) {
		this.nameProg = nameProg;
	}

	public String getNameTarg() {
		return this.nameTarg;
	}

	public void setNameTarg(String nameTarg) {
		this.nameTarg = nameTarg;
	}

	public BigDecimal getNday() {
		return this.nday;
	}

	public void setNday(BigDecimal nday) {
		this.nday = nday;
	}

	public String getNkk() {
		return this.nkk;
	}

	public void setNkk(String nkk) {
		this.nkk = nkk;
	}

	public BigDecimal getNnorm() {
		return this.nnorm;
	}

	public void setNnorm(BigDecimal nnorm) {
		this.nnorm = nnorm;
	}

	public BigDecimal getNostd() {
		return this.nostd;
	}

	public void setNostd(BigDecimal nostd) {
		this.nostd = nostd;
	}

	public String getNostdNote() {
		return this.nostdNote;
	}

	public void setNostdNote(String nostdNote) {
		this.nostdNote = nostdNote;
	}

	public String getNostdText() {
		return this.nostdText;
	}

	public void setNostdText(String nostdText) {
		this.nostdText = nostdText;
	}

	public String getNumrst() {
		return this.numrst;
	}

	public void setNumrst(String numrst) {
		this.numrst = numrst;
	}

	public BigDecimal getOtd() {
		return this.otd;
	}

	public void setOtd(BigDecimal otd) {
		this.otd = otd;
	}

	public BigDecimal getOtdStorage() {
		return this.otdStorage;
	}

	public void setOtdStorage(BigDecimal otdStorage) {
		this.otdStorage = otdStorage;
	}

	public BigDecimal getPrgId() {
		return this.prgId;
	}

	public void setPrgId(BigDecimal prgId) {
		this.prgId = prgId;
	}

	public BigDecimal getPrioritet() {
		return this.prioritet;
	}

	public void setPrioritet(BigDecimal prioritet) {
		this.prioritet = prioritet;
	}

	public String getPrioritetName() {
		return this.prioritetName;
	}

	public void setPrioritetName(String prioritetName) {
		this.prioritetName = prioritetName;
	}

	public BigDecimal getRate() {
		return this.rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public String getSalonZastr() {
		return this.salonZastr;
	}

	public void setSalonZastr(String salonZastr) {
		this.salonZastr = salonZastr;
	}

	public Date getStDate() {
		return this.stDate;
	}

	public void setStDate(Date stDate) {
		this.stDate = stDate;
	}

	public String getStId() {
		return this.stId;
	}

	public void setStId(String stId) {
		this.stId = stId;
	}

	public String getStName() {
		return this.stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public BigDecimal getSumCrd() {
		return this.sumCrd;
	}

	public void setSumCrd(BigDecimal sumCrd) {
		this.sumCrd = sumCrd;
	}

	public String getUserCrinsp() {
		return this.userCrinsp;
	}

	public void setUserCrinsp(String userCrinsp) {
		this.userCrinsp = userCrinsp;
	}

	public String getUserCurator() {
		return this.userCurator;
	}

	public void setUserCurator(String userCurator) {
		this.userCurator = userCurator;
	}

	public String getUserFirst() {
		return this.userFirst;
	}

	public void setUserFirst(String userFirst) {
		this.userFirst = userFirst;
	}

	public String getUserInsert() {
		return this.userInsert;
	}

	public void setUserInsert(String userInsert) {
		this.userInsert = userInsert;
	}

	public String getUsrins() {
		return this.usrins;
	}

	public void setUsrins(String usrins) {
		this.usrins = usrins;
	}

	public String getUsrinsp() {
		return this.usrinsp;
	}

	public void setUsrinsp(String usrinsp) {
		this.usrinsp = usrinsp;
	}

	public String getWork() {
		return this.work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public String getWorkPost() {
		return this.workPost;
	}

	public void setWorkPost(String workPost) {
		this.workPost = workPost;
	}

	public String getZajFrom() {
		return this.zajFrom;
	}

	public void setZajFrom(String zajFrom) {
		this.zajFrom = zajFrom;
	}

}
