package org.bg.bpo.register.db.entities.schema.tmview;

import java.io.Serializable;

import javax.persistence.*;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the mark database table.
 * 
 */
@Entity
@Table(name="mark", schema="tmview")
@NamedQuery(name="Mark.findAll", query="SELECT m FROM Mark m")
public class Mark implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MARK_IDAPPLI_GENERATOR", sequenceName="ORDER_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MARK_IDAPPLI_GENERATOR")
	private String idappli;

	private String colorclaim;

	private String deno;

	private String descmark;

	private String disclaimer;

	@Temporal(TemporalType.DATE)
	private Date dtappli;

	@Temporal(TemporalType.DATE)
	private Date dtexpi;

	@Temporal(TemporalType.DATE)
	private Date dtgrant;

	@Temporal(TemporalType.DATE)
	private Date dtlgstmark;

	@Temporal(TemporalType.DATE)
	private Date dtopposition;

	private String idcountry;

	private String idlocation;

	private String idmark;

	@Column(name="k_mark")
	private Integer kMark;

	private Integer kdmark;

	private Integer langdeno;

	private Integer lgstmark;

	private Integer ntmark;

	private String st13id;

	private String translat;

	private String translit;

	private Integer tyappli;

	private String tymark;

	//bi-directional many-to-one association to Classmark
	@OneToMany(mappedBy="mark")
	private List<Classmark> classmarks;

	//bi-directional one-to-one association to Picture
	@OneToOne
	@JoinColumn(name="idappli", insertable=false, updatable=false)
	private Picture picture;

	//bi-directional many-to-one association to Priority
	@OneToMany(mappedBy="mark")
	private List<Priority> priorities;

	//bi-directional many-to-one association to Publication
	@OneToMany(mappedBy="mark")
	private List<Publication> publications;
	
	//bi-directional many-to-one association to Own
	@OneToMany(mappedBy="mark")
	private List<Own> owns;

	//bi-directional many-to-one association to Own
	@OneToMany(mappedBy="mark")
	private List<Represent> represents;
	
	public Mark() {
	}

	public String getIdappli() {
		return this.idappli;
	}

	public void setIdappli(String idappli) {
		this.idappli = idappli;
	}

	public String getColorclaim() {
		return this.colorclaim;
	}

	public void setColorclaim(String colorclaim) {
		this.colorclaim = colorclaim;
	}

	public String getDeno() {
		return this.deno;
	}

	public void setDeno(String deno) {
		this.deno = deno;
	}

	public String getDescmark() {
		return this.descmark;
	}

	public void setDescmark(String descmark) {
		this.descmark = descmark;
	}

	public String getDisclaimer() {
		return this.disclaimer;
	}

	public void setDisclaimer(String disclaimer) {
		this.disclaimer = disclaimer;
	}

	public Date getDtappli() {
		return this.dtappli;
	}

	public void setDtappli(Date dtappli) {
		this.dtappli = dtappli;
	}

	public Date getDtexpi() {
		return this.dtexpi;
	}

	public void setDtexpi(Date dtexpi) {
		this.dtexpi = dtexpi;
	}

	public Date getDtgrant() {
		return this.dtgrant;
	}

	public void setDtgrant(Date dtgrant) {
		this.dtgrant = dtgrant;
	}

	public Date getDtlgstmark() {
		return this.dtlgstmark;
	}

	public void setDtlgstmark(Date dtlgstmark) {
		this.dtlgstmark = dtlgstmark;
	}

	public Date getDtopposition() {
		return this.dtopposition;
	}

	public void setDtopposition(Date dtopposition) {
		this.dtopposition = dtopposition;
	}

	public String getIdcountry() {
		return this.idcountry;
	}

	public void setIdcountry(String idcountry) {
		this.idcountry = idcountry;
	}

	public String getIdlocation() {
		return this.idlocation;
	}

	public void setIdlocation(String idlocation) {
		this.idlocation = idlocation;
	}

	public String getIdmark() {
		return this.idmark;
	}

	public void setIdmark(String idmark) {
		this.idmark = idmark;
	}

	public Integer getKMark() {
		return this.kMark;
	}

	public void setKMark(Integer kMark) {
		this.kMark = kMark;
	}

	public Integer getKdmark() {
		return this.kdmark;
	}

	public void setKdmark(Integer kdmark) {
		this.kdmark = kdmark;
	}

	public Integer getLangdeno() {
		return this.langdeno;
	}

	public void setLangdeno(Integer langdeno) {
		this.langdeno = langdeno;
	}

	public Integer getLgstmark() {
		return this.lgstmark;
	}

	public void setLgstmark(Integer lgstmark) {
		this.lgstmark = lgstmark;
	}

	public Integer getNtmark() {
		return this.ntmark;
	}

	public void setNtmark(Integer ntmark) {
		this.ntmark = ntmark;
	}

	public String getSt13id() {
		return this.st13id;
	}

	public void setSt13id(String st13id) {
		this.st13id = st13id;
	}

	public String getTranslat() {
		return this.translat;
	}

	public void setTranslat(String translat) {
		this.translat = translat;
	}

	public String getTranslit() {
		return this.translit;
	}

	public void setTranslit(String translit) {
		this.translit = translit;
	}

	public Integer getTyappli() {
		return this.tyappli;
	}

	public void setTyappli(Integer tyappli) {
		this.tyappli = tyappli;
	}

	public String getTymark() {
		return this.tymark;
	}

	public void setTymark(String tymark) {
		this.tymark = tymark;
	}

	public List<Classmark> getClassmarks() {
		return this.classmarks;
	}

	public void setClassmarks(List<Classmark> classmarks) {
		this.classmarks = classmarks;
	}

	public Classmark addClassmark(Classmark classmark) {
		getClassmarks().add(classmark);
		classmark.setMark(this);

		return classmark;
	}

	public Classmark removeClassmark(Classmark classmark) {
		getClassmarks().remove(classmark);
		classmark.setMark(null);

		return classmark;
	}

	public Picture getPicture() {
		return this.picture;
	}

	public void setPicture(Picture picture) {
		this.picture = picture;
	}

	public List<Priority> getPriorities() {
		return this.priorities;
	}

	public void setPriorities(List<Priority> priorities) {
		this.priorities = priorities;
	}

	public Priority addPriority(Priority priority) {
		getPriorities().add(priority);
		priority.setMark(this);

		return priority;
	}

	public Priority removePriority(Priority priority) {
		getPriorities().remove(priority);
		priority.setMark(null);

		return priority;
	}

	public List<Publication> getPublications() {
		return this.publications;
	}

	public void setPublications(List<Publication> publications) {
		this.publications = publications;
	}

	public Publication addPublication(Publication publication) {
		getPublications().add(publication);
		publication.setMark(this);

		return publication;
	}

	public Publication removePublication(Publication publication) {
		getPublications().remove(publication);
		publication.setMark(null);

		return publication;
	}
	
	public List<Own> getOwns() {
		return this.owns;
	}

	public void setOwns(List<Own> owns) {
		this.owns = owns;
	}

	public Own addOwn(Own own) {
		getOwns().add(own);
		own.setMark(this);

		return own;
	}

	public Own removeOwn(Own own) {
		getOwns().remove(own);
		own.setMark(null);
		return own;
	}

	public List<Represent> getRepresents() {
		return this.represents;
	}

	public void setRepresents(List<Represent> represents) {
		this.represents = represents;
	}

	public Represent addRepresent(Represent represent) {
		getRepresents().add(represent);
		represent.setMark(this);

		return represent;
	}

	public Represent removeRepresent(Represent represent) {
		getRepresents().remove(represent);
		represent.setMark(null);
		return represent;
	}
}