package org.bg.bpo.register.db.entities.schema.tmview;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the priority database table.
 * 
 */
@Embeddable
public class PublicationPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private String idappli;

	private Integer odhisto;

	public PublicationPK() {
	}
	
	public String getIdappli() {
		return this.idappli;
	}
	public void setIdappli(String idappli) {
		this.idappli = idappli;
	}
	public Integer getOdhisto() {
		return this.odhisto;
	}
	public void setOdhisto(Integer odhisto) {
		this.odhisto = odhisto;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PublicationPK)) {
			return false;
		}
		PublicationPK castOther = (PublicationPK)other;
		return 
			this.idappli.equals(castOther.idappli)
			&& this.odhisto.equals(castOther.odhisto);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idappli.hashCode();
		hash = hash * prime + this.odhisto.hashCode();
		
		return hash;
	}
}