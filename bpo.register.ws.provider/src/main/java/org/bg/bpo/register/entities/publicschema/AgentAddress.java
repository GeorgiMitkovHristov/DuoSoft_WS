package org.bg.bpo.register.entities.publicschema;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the agent_addresses database table.
 * 
 */
@Entity
@Table(name="agent_addresses", schema="public")
@NamedQuery(name="AgentAddress.findAll", query="SELECT a FROM AgentAddress a")
public class AgentAddress implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AgentAddressPK id;

	private String adagent;

	@Column(name="custom_idagent")
	private Integer customIdagent;

	private String idcountry;

	private String idtown;

	private String nmstate;

	private String nmtown;

	public AgentAddress() {
	}

	public AgentAddressPK getId() {
		return this.id;
	}

	public void setId(AgentAddressPK id) {
		this.id = id;
	}

	public String getAdagent() {
		return this.adagent;
	}

	public void setAdagent(String adagent) {
		this.adagent = adagent;
	}

	public Integer getCustomIdagent() {
		return this.customIdagent;
	}

	public void setCustomIdagent(Integer customIdagent) {
		this.customIdagent = customIdagent;
	}

	public String getIdcountry() {
		return this.idcountry;
	}

	public void setIdcountry(String idcountry) {
		this.idcountry = idcountry;
	}

	public String getIdtown() {
		return this.idtown;
	}

	public void setIdtown(String idtown) {
		this.idtown = idtown;
	}

	public String getNmstate() {
		return this.nmstate;
	}

	public void setNmstate(String nmstate) {
		this.nmstate = nmstate;
	}

	public String getNmtown() {
		return this.nmtown;
	}

	public void setNmtown(String nmtown) {
		this.nmtown = nmtown;
	}

}