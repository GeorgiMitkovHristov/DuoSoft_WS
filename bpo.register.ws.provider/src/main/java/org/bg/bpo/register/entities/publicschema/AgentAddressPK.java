package org.bg.bpo.register.entities.publicschema;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the agent_addresses database table.
 * 
 */
@Embeddable
public class AgentAddressPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private Integer idagent;

	private Integer idaddress;

	public AgentAddressPK() {
	}
	public Integer getIdagent() {
		return this.idagent;
	}
	public void setIdagent(Integer idagent) {
		this.idagent = idagent;
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
		if (!(other instanceof AgentAddressPK)) {
			return false;
		}
		AgentAddressPK castOther = (AgentAddressPK)other;
		return 
			this.idagent.equals(castOther.idagent)
			&& this.idaddress.equals(castOther.idaddress);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idagent.hashCode();
		hash = hash * prime + this.idaddress.hashCode();
		
		return hash;
	}
}