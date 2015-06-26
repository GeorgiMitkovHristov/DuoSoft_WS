package org.bg.bpo.register.entities.schema_tmview;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the categpict database table.
 * 
 */
@Embeddable
public class CategpictPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String idappli;

	private String idcategory;

	public CategpictPK() {
	}
	public String getIdappli() {
		return this.idappli;
	}
	public void setIdappli(String idappli) {
		this.idappli = idappli;
	}
	public String getIdcategory() {
		return this.idcategory;
	}
	public void setIdcategory(String idcategory) {
		this.idcategory = idcategory;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CategpictPK)) {
			return false;
		}
		CategpictPK castOther = (CategpictPK)other;
		return 
			this.idappli.equals(castOther.idappli)
			&& this.idcategory.equals(castOther.idcategory);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idappli.hashCode();
		hash = hash * prime + this.idcategory.hashCode();
		
		return hash;
	}
}