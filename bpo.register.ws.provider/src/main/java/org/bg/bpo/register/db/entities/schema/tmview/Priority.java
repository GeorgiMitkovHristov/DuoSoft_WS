package org.bg.bpo.register.db.entities.schema.tmview;

import java.io.Serializable;

import javax.persistence.*;

import java.util.Date;


/**
 * The persistent class for the priority database table.
 * 
 */
@Entity
@Table(name="priority", schema="tmview")
@NamedQuery(name="Priority.findAll", query="SELECT p FROM Priority p")
public class Priority implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PriorityPK id;

	@Temporal(TemporalType.DATE)
	private Date dtprio;

	private String idcountry;

	private String noprio;

	private String rmprio;

	private Integer stprio;

	private Integer typrio;

	//bi-directional many-to-one association to Mark
	@ManyToOne
	@JoinColumn(name="idappli")
	private Mark mark;

	public Priority() {
	}

	public PriorityPK getId() {
		return this.id;
	}

	public void setId(PriorityPK id) {
		this.id = id;
	}

	public Date getDtprio() {
		return this.dtprio;
	}

	public void setDtprio(Date dtprio) {
		this.dtprio = dtprio;
	}

	public String getIdcountry() {
		return this.idcountry;
	}

	public void setIdcountry(String idcountry) {
		this.idcountry = idcountry;
	}

	public String getNoprio() {
		return this.noprio;
	}

	public void setNoprio(String noprio) {
		this.noprio = noprio;
	}

	public String getRmprio() {
		return this.rmprio;
	}

	public void setRmprio(String rmprio) {
		this.rmprio = rmprio;
	}

	public Integer getStprio() {
		return this.stprio;
	}

	public void setStprio(Integer stprio) {
		this.stprio = stprio;
	}

	public Integer getTyprio() {
		return this.typrio;
	}

	public void setTyprio(Integer typrio) {
		this.typrio = typrio;
	}

	public Mark getMark() {
		return this.mark;
	}

	public void setMark(Mark mark) {
		this.mark = mark;
	}

}