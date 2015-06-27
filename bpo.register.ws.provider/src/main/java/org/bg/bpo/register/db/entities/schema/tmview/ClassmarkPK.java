package org.bg.bpo.register.db.entities.schema.tmview;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the priority database table.
 * 
 */
@Embeddable
public class ClassmarkPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private String idappli;

	private Integer idclass;

	public ClassmarkPK() {
	}
	public String getIdappli() {
		return this.idappli;
	}
	public void setIdappli(String idappli) {
		this.idappli = idappli;
	}
	public Integer getIdclass() {
		return this.idclass;
	}
	public void setIdclass(Integer idclass) {
		this.idclass = idclass;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ClassmarkPK)) {
			return false;
		}
		ClassmarkPK castOther = (ClassmarkPK)other;
		return 
			this.idappli.equals(castOther.idappli)
			&& this.idclass.equals(castOther.idclass);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idappli.hashCode();
		hash = hash * prime + this.idclass.hashCode();
		
		return hash;
	}
}