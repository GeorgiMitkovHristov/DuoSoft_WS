package org.bg.bpo.register.entities.schema_tmview;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the categpict database table.
 * 
 */
@Entity
@NamedQuery(name="Categpict.findAll", query="SELECT c FROM Categpict c")
public class Categpict implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CategpictPK id;

	public Categpict() {
	}

	public CategpictPK getId() {
		return this.id;
	}

	public void setId(CategpictPK id) {
		this.id = id;
	}

}