package org.bg.bpo.register.db.entities.schema.tmview;

import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the classmark database table.
 * 
 */
@Entity
@Table(name="classmark", schema="tmview")
@NamedQuery(name="Classmark.findAll", query="SELECT c FROM Classmark c")
public class Classmark implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private ClassmarkPK id;

	private Integer idclass;

	private Integer odcancel;

	private String specif;

	private Integer stclass;

	//bi-directional many-to-one association to Mark
	@ManyToOne
	@JoinColumn(name="idappli")
	private Mark mark;

	public Classmark() {
	}

	public Integer getIdclass() {
		return this.idclass;
	}

	public void setIdclass(Integer idclass) {
		this.idclass = idclass;
	}

	public Integer getOdcancel() {
		return this.odcancel;
	}

	public void setOdcancel(Integer odcancel) {
		this.odcancel = odcancel;
	}

	public String getSpecif() {
		return this.specif;
	}

	public void setSpecif(String specif) {
		this.specif = specif;
	}

	public Integer getStclass() {
		return this.stclass;
	}

	public void setStclass(Integer stclass) {
		this.stclass = stclass;
	}

	public Mark getMark() {
		return this.mark;
	}

	public void setMark(Mark mark) {
		this.mark = mark;
	}

}