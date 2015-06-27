package org.bg.bpo.register.db.entities.schema.publik;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the owner_addresses database table.
 * 
 */
@Embeddable
public class OwnerAddressPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private Integer idowner;

	private Integer idaddress;

	public OwnerAddressPK() {
	}
	public Integer getIdowner() {
		return this.idowner;
	}
	public void setIdowner(Integer idowner) {
		this.idowner = idowner;
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
		if (!(other instanceof OwnerAddressPK)) {
			return false;
		}
		OwnerAddressPK castOther = (OwnerAddressPK)other;
		return 
			this.idowner.equals(castOther.idowner)
			&& this.idaddress.equals(castOther.idaddress);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idowner.hashCode();
		hash = hash * prime + this.idaddress.hashCode();
		
		return hash;
	}
}