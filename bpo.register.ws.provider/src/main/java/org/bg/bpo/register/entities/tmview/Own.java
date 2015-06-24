package org.bg.bpo.register.entities.tmview;

import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the own database table.
 * 
 */
@Entity
@NamedQuery(name="Own.findAll", query="SELECT o FROM Own o")
@Table(name="own", schema="tmview")
public class Own implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OwnPK id;

	private Integer odowner;

	//bi-directional many-to-one association to Mark
	@ManyToOne
	@JoinColumn(name="idappli")
	private Mark mark;

	public Own() {
	}

	public OwnPK getId() {
		return this.id;
	}

	public void setId(OwnPK id) {
		this.id = id;
	}

	public Integer getOdowner() {
		return this.odowner;
	}

	public void setOdowner(Integer odowner) {
		this.odowner = odowner;
	}

	public Mark getMark() {
		return this.mark;
	}

	public void setMark(Mark mark) {
		this.mark = mark;
	}

}