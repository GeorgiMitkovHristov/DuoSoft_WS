package org.bg.bpo.register.db.entities.schema.tmview;

import java.io.Serializable;

import javax.persistence.*;

import java.util.Date;


/**
 * The persistent class for the picture database table.
 * 
 */
@Entity
@Table(name="picture", schema="tmview")
@NamedQuery(name="Picture.findAll", query="SELECT p FROM Picture p")
public class Picture implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PICTURE_IDAPPLI_GENERATOR", sequenceName="ORDER_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PICTURE_IDAPPLI_GENERATOR")
	private String idappli;

	private Integer cdcolor;

	private String desccolor;

	@Temporal(TemporalType.DATE)
	private Date dtscan;

	private String formatfile;

	private byte[] picture;

	//bi-directional one-to-one association to Mark
	@OneToOne(mappedBy="picture")
	private Mark mark;

	public Picture() {
	}

	public String getIdappli() {
		return this.idappli;
	}

	public void setIdappli(String idappli) {
		this.idappli = idappli;
	}

	public Integer getCdcolor() {
		return this.cdcolor;
	}

	public void setCdcolor(Integer cdcolor) {
		this.cdcolor = cdcolor;
	}

	public String getDesccolor() {
		return this.desccolor;
	}

	public void setDesccolor(String desccolor) {
		this.desccolor = desccolor;
	}

	public Date getDtscan() {
		return this.dtscan;
	}

	public void setDtscan(Date dtscan) {
		this.dtscan = dtscan;
	}

	public String getFormatfile() {
		return this.formatfile;
	}

	public void setFormatfile(String formatfile) {
		this.formatfile = formatfile;
	}

	public byte[] getPicture() {
		return this.picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}

	public Mark getMark() {
		return this.mark;
	}

	public void setMark(Mark mark) {
		this.mark = mark;
	}

}