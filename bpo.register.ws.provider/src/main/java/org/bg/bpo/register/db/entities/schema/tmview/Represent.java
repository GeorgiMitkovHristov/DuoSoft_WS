package org.bg.bpo.register.db.entities.schema.tmview;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

import org.bg.bpo.register.db.entities.schema.publik.Agent;
import org.bg.bpo.register.db.entities.schema.publik.AgentAddress;


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

	//bi-directional many-to-one association to Mark
	@ManyToOne
	@JoinColumn(name="idappli", insertable=false, updatable=false)
	private Mark mark;
	
	@ManyToOne
	@JoinColumn(name="idagent", insertable=false, updatable=false)
	private Agent agent;
	
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="idagent", referencedColumnName="idagent", insertable=false, updatable=false),
		@JoinColumn(name="idaddress", referencedColumnName="idaddress", insertable=false, updatable=false)
	})
	private AgentAddress agentAddress;
	
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

	public Mark getMark() {
		return this.mark;
	}

	public void setMark(Mark mark) {
		this.mark = mark;
	}
	
	public Agent getAgent() {
		return this.agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	public AgentAddress getAgentAddress() {
		return this.agentAddress;
	}

	public void setAgentAddress(AgentAddress agentAddress) {
		this.agentAddress = agentAddress;
	}
}