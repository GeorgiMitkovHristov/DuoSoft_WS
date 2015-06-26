package org.bg.bpo.register.entities.schema_tmview;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the represent database table.
 * 
 */
@Entity
@NamedQuery(name="Represent.findAll", query="SELECT r FROM Represent r")
public class Represent implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer idaddress;

	private Integer idagent;
	
	@Id
	private String idappli;

	private Integer odagent;

	public Represent() {
	}

	public Integer getIdaddress() {
		return this.idaddress;
	}

	public void setIdaddress(Integer idaddress) {
		this.idaddress = idaddress;
	}

	public Integer getIdagent() {
		return this.idagent;
	}

	public void setIdagent(Integer idagent) {
		this.idagent = idagent;
	}

	public String getIdappli() {
		return this.idappli;
	}

	public void setIdappli(String idappli) {
		this.idappli = idappli;
	}

	public Integer getOdagent() {
		return this.odagent;
	}

	public void setOdagent(Integer odagent) {
		this.odagent = odagent;
	}

}