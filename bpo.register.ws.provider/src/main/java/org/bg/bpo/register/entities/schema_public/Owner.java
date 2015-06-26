package org.bg.bpo.register.entities.schema_public;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import org.bg.bpo.register.entities.schema_tmview.Own;


/**
 * The persistent class for the owner database table.
 * 
 */
@Entity
@NamedQuery(name="Owner.findAll", query="SELECT o FROM Owner o")
@Table(name="owner", schema="public")
public class Owner implements Serializable {
	private static final long serialVersionUID = 1L;

	private String adowner;

	private String emailowner;

	private String faxowner;

	private String fnowner;

	private String idcountry;

	@Id
	private Integer idowner;

	private String idtown;

	private String midnowner;

	private String nationown;

	private String nmowner;

	private String nmstate;

	private String nmtown;

	private Integer ntincorp;

	private String telowner;

	private String titowner;
	
	//bi-directional many-to-one association to Own
	@OneToMany(mappedBy="owner")
	private List<Own> owns;

	public Owner() {
	}

	public String getAdowner() {
		return this.adowner;
	}

	public void setAdowner(String adowner) {
		this.adowner = adowner;
	}

	public String getEmailowner() {
		return this.emailowner;
	}

	public void setEmailowner(String emailowner) {
		this.emailowner = emailowner;
	}

	public String getFaxowner() {
		return this.faxowner;
	}

	public void setFaxowner(String faxowner) {
		this.faxowner = faxowner;
	}

	public String getFnowner() {
		return this.fnowner;
	}

	public void setFnowner(String fnowner) {
		this.fnowner = fnowner;
	}

	public String getIdcountry() {
		return this.idcountry;
	}

	public void setIdcountry(String idcountry) {
		this.idcountry = idcountry;
	}

	public Integer getIdowner() {
		return this.idowner;
	}

	public void setIdowner(Integer idowner) {
		this.idowner = idowner;
	}

	public String getIdtown() {
		return this.idtown;
	}

	public void setIdtown(String idtown) {
		this.idtown = idtown;
	}

	public String getMidnowner() {
		return this.midnowner;
	}

	public void setMidnowner(String midnowner) {
		this.midnowner = midnowner;
	}

	public String getNationown() {
		return this.nationown;
	}

	public void setNationown(String nationown) {
		this.nationown = nationown;
	}

	public String getNmowner() {
		return this.nmowner;
	}

	public void setNmowner(String nmowner) {
		this.nmowner = nmowner;
	}

	public String getNmstate() {
		return this.nmstate;
	}

	public void setNmstate(String nmstate) {
		this.nmstate = nmstate;
	}

	public String getNmtown() {
		return this.nmtown;
	}

	public void setNmtown(String nmtown) {
		this.nmtown = nmtown;
	}

	public Integer getNtincorp() {
		return this.ntincorp;
	}

	public void setNtincorp(Integer ntincorp) {
		this.ntincorp = ntincorp;
	}

	public String getTelowner() {
		return this.telowner;
	}

	public void setTelowner(String telowner) {
		this.telowner = telowner;
	}

	public String getTitowner() {
		return this.titowner;
	}

	public void setTitowner(String titowner) {
		this.titowner = titowner;
	}
	
	public List<Own> getOwns() {
		return this.owns;
	}

	public void setOwns(List<Own> owns) {
		this.owns = owns;
	}

	public Own addOwn(Own own) {
		getOwns().add(own);
		own.setOwner(this);

		return own;
	}

	public Own removeOwn(Own own) {
		getOwns().remove(own);
		own.setOwner(null);
		return own;
	}

}