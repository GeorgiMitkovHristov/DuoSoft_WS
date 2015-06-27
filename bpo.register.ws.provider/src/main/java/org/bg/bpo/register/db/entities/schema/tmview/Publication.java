package org.bg.bpo.register.db.entities.schema.tmview;

import java.io.Serializable;

import javax.persistence.*;

import java.util.Date;


/**
 * The persistent class for the publication database table.
 * 
 */
@Entity
@Table(name="publication", schema="tmview")
@NamedQuery(name="Publication.findAll", query="SELECT p FROM Publication p")
public class Publication implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private PublicationPK id;

	@Temporal(TemporalType.DATE)
	private Date dttopubli;

	private Integer nogazette;

	private String nosect;

	private Integer odhisto;

	private String rmpubli;

	private String typubli;

	private Integer urgent;

	private Integer yygazette;

	//bi-directional many-to-one association to Mark
	@ManyToOne
	@JoinColumn(name="idappli")
	private Mark mark;

	public Publication() {
	}

	public Date getDttopubli() {
		return this.dttopubli;
	}

	public void setDttopubli(Date dttopubli) {
		this.dttopubli = dttopubli;
	}

	public Integer getNogazette() {
		return this.nogazette;
	}

	public void setNogazette(Integer nogazette) {
		this.nogazette = nogazette;
	}

	public String getNosect() {
		return this.nosect;
	}

	public void setNosect(String nosect) {
		this.nosect = nosect;
	}

	public Integer getOdhisto() {
		return this.odhisto;
	}

	public void setOdhisto(Integer odhisto) {
		this.odhisto = odhisto;
	}

	public String getRmpubli() {
		return this.rmpubli;
	}

	public void setRmpubli(String rmpubli) {
		this.rmpubli = rmpubli;
	}

	public String getTypubli() {
		return this.typubli;
	}

	public void setTypubli(String typubli) {
		this.typubli = typubli;
	}

	public Integer getUrgent() {
		return this.urgent;
	}

	public void setUrgent(Integer urgent) {
		this.urgent = urgent;
	}

	public Integer getYygazette() {
		return this.yygazette;
	}

	public void setYygazette(Integer yygazette) {
		this.yygazette = yygazette;
	}

	public Mark getMark() {
		return this.mark;
	}

	public void setMark(Mark mark) {
		this.mark = mark;
	}

}