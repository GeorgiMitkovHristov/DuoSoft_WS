package org.bg.bpo.register.entities.schema_tmview;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the priority database table.
 * 
 */
@Embeddable
public class PriorityPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private String idappli;

	private Integer odprio;

	public PriorityPK() {
	}
	public String getIdappli() {
		return this.idappli;
	}
	public void setIdappli(String idappli) {
		this.idappli = idappli;
	}
	public Integer getOdprio() {
		return this.odprio;
	}
	public void setOdprio(Integer odprio) {
		this.odprio = odprio;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PriorityPK)) {
			return false;
		}
		PriorityPK castOther = (PriorityPK)other;
		return 
			this.idappli.equals(castOther.idappli)
			&& this.odprio.equals(castOther.odprio);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idappli.hashCode();
		hash = hash * prime + this.odprio.hashCode();
		
		return hash;
	}
}