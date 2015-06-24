package org.bg.bpo.register.entities.publicschema;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the owner_addresses database table.
 * 
 */
@Entity
@Table(name="owner_addresses")
@NamedQuery(name="OwnerAddress.findAll", query="SELECT o FROM OwnerAddress o")
public class OwnerAddress implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OwnerAddressPK id;

	private String adowner;

	@Column(name="custom_idowner")
	private Integer customIdowner;

	private String idcountry;

	private String idtown;

	private String nmstate;

	private String nmtown;

	public OwnerAddress() {
	}

	public OwnerAddressPK getId() {
		return this.id;
	}

	public void setId(OwnerAddressPK id) {
		this.id = id;
	}

	public String getAdowner() {
		return this.adowner;
	}

	public void setAdowner(String adowner) {
		this.adowner = adowner;
	}

	public Integer getCustomIdowner() {
		return this.customIdowner;
	}

	public void setCustomIdowner(Integer customIdowner) {
		this.customIdowner = customIdowner;
	}

	public String getIdcountry() {
		return this.idcountry;
	}

	public void setIdcountry(String idcountry) {
		this.idcountry = idcountry;
	}

	public String getIdtown() {
		return this.idtown;
	}

	public void setIdtown(String idtown) {
		this.idtown = idtown;
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

}