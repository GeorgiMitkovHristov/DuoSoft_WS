package org.bg.bpo.register.db.entities.schema.tmview;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the country database table.
 * 
 */
@Entity
@NamedQuery(name="Country.findAll", query="SELECT c FROM Country c")
public class Country implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String idcountry;

	private Integer adrformat;

	private String engnmcountry;

	private Integer epcmember;

	private Integer madridagree;

	private String nmcountry;

	private Integer paylevel;

	private Integer pctmember;

	public Country() {
	}

	public String getIdcountry() {
		return this.idcountry;
	}

	public void setIdcountry(String idcountry) {
		this.idcountry = idcountry;
	}

	public Integer getAdrformat() {
		return this.adrformat;
	}

	public void setAdrformat(Integer adrformat) {
		this.adrformat = adrformat;
	}

	public String getEngnmcountry() {
		return this.engnmcountry;
	}

	public void setEngnmcountry(String engnmcountry) {
		this.engnmcountry = engnmcountry;
	}

	public Integer getEpcmember() {
		return this.epcmember;
	}

	public void setEpcmember(Integer epcmember) {
		this.epcmember = epcmember;
	}

	public Integer getMadridagree() {
		return this.madridagree;
	}

	public void setMadridagree(Integer madridagree) {
		this.madridagree = madridagree;
	}

	public String getNmcountry() {
		return this.nmcountry;
	}

	public void setNmcountry(String nmcountry) {
		this.nmcountry = nmcountry;
	}

	public Integer getPaylevel() {
		return this.paylevel;
	}

	public void setPaylevel(Integer paylevel) {
		this.paylevel = paylevel;
	}

	public Integer getPctmember() {
		return this.pctmember;
	}

	public void setPctmember(Integer pctmember) {
		this.pctmember = pctmember;
	}

}