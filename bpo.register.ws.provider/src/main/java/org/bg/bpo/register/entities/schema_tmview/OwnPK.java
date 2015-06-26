package org.bg.bpo.register.entities.schema_tmview;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the own database table.
 * 
 */
@Embeddable
public class OwnPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private Integer idowner;

	@Column(insertable=false, updatable=false)
	private String idappli;

	private Integer idaddress;

	public OwnPK() {
	}
	public Integer getIdowner() {
		return this.idowner;
	}
	public void setIdowner(Integer idowner) {
		this.idowner = idowner;
	}
	public String getIdappli() {
		return this.idappli;
	}
	public void setIdappli(String idappli) {
		this.idappli = idappli;
	}
	public Integer getIdaddress() {
		return this.idaddress;
	}
	public void setIdaddress(Integer idaddress) {
		this.idaddress = idaddress;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof OwnPK)) {
			return false;
		}
		OwnPK castOther = (OwnPK)other;
		return 
			this.idowner.equals(castOther.idowner)
			&& this.idappli.equals(castOther.idappli)
			&& this.idaddress.equals(castOther.idaddress);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idowner.hashCode();
		hash = hash * prime + this.idappli.hashCode();
		hash = hash * prime + this.idaddress.hashCode();
		
		return hash;
	}
}