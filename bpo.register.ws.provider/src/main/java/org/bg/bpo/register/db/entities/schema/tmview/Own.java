package org.bg.bpo.register.db.entities.schema.tmview;

import java.io.Serializable;

import javax.persistence.*;

import org.bg.bpo.register.db.entities.schema.publik.Owner;
import org.bg.bpo.register.db.entities.schema.publik.OwnerAddress;


/**
 * The persistent class for the own database table.
 * 
 */
@Entity
@NamedQuery(name="Own.findAll", query="SELECT o FROM Own o")
@Table(name="own", schema="tmview")
public class Own implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OwnPK id;

	private Integer odowner;

	//bi-directional many-to-one association to Mark
	@ManyToOne
	@JoinColumn(name="idappli")
	private Mark mark;
	
	@ManyToOne
	@JoinColumn(name="idowner")
	private Owner owner;

	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="idowner", referencedColumnName="idowner", updatable=false, insertable=false),
		@JoinColumn(name="idaddress", referencedColumnName="idaddress", updatable=false, insertable=false)
	})
	private OwnerAddress ownerAddress;
	
	public Own() {
	}

	public OwnPK getId() {
		return this.id;
	}

	public void setId(OwnPK id) {
		this.id = id;
	}

	public Integer getOdowner() {
		return this.odowner;
	}

	public void setOdowner(Integer odowner) {
		this.odowner = odowner;
	}

	public Mark getMark() {
		return this.mark;
	}

	public void setMark(Mark mark) {
		this.mark = mark;
	}
	
	public Owner getOwner() {
		return this.owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public OwnerAddress getOwnerAddress() {
		return this.ownerAddress;
	}

	public void setOwnerAddress(OwnerAddress ownerAddress) {
		this.ownerAddress = ownerAddress;
	}
}