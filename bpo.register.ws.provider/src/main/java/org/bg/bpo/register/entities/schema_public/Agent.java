package org.bg.bpo.register.entities.schema_public;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the agent database table.
 * 
 */
@Entity
@Table(name="agent", schema="public")
@NamedQuery(name="Agent.findAll", query="SELECT a FROM Agent a")
public class Agent implements Serializable {
	private static final long serialVersionUID = 1L;

	private String adagent;

	private Integer dmspecia;

	private String emailagent;

	private String faxagent;

	private String fnagent;

	@Id
	private Integer idagent;

	private String idcountry;

	private String idtown;

	private Integer kdagent;

	private String midnagent;

	private String natioagent;

	private String nmagent;

	private String nmstate;

	private String nmtown;

	private String telagent;

	private String titagent;

	public Agent() {
	}

	public String getAdagent() {
		return this.adagent;
	}

	public void setAdagent(String adagent) {
		this.adagent = adagent;
	}

	public Integer getDmspecia() {
		return this.dmspecia;
	}

	public void setDmspecia(Integer dmspecia) {
		this.dmspecia = dmspecia;
	}

	public String getEmailagent() {
		return this.emailagent;
	}

	public void setEmailagent(String emailagent) {
		this.emailagent = emailagent;
	}

	public String getFaxagent() {
		return this.faxagent;
	}

	public void setFaxagent(String faxagent) {
		this.faxagent = faxagent;
	}

	public String getFnagent() {
		return this.fnagent;
	}

	public void setFnagent(String fnagent) {
		this.fnagent = fnagent;
	}

	public Integer getIdagent() {
		return this.idagent;
	}

	public void setIdagent(Integer idagent) {
		this.idagent = idagent;
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

	public Integer getKdagent() {
		return this.kdagent;
	}

	public void setKdagent(Integer kdagent) {
		this.kdagent = kdagent;
	}

	public String getMidnagent() {
		return this.midnagent;
	}

	public void setMidnagent(String midnagent) {
		this.midnagent = midnagent;
	}

	public String getNatioagent() {
		return this.natioagent;
	}

	public void setNatioagent(String natioagent) {
		this.natioagent = natioagent;
	}

	public String getNmagent() {
		return this.nmagent;
	}

	public void setNmagent(String nmagent) {
		this.nmagent = nmagent;
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

	public String getTelagent() {
		return this.telagent;
	}

	public void setTelagent(String telagent) {
		this.telagent = telagent;
	}

	public String getTitagent() {
		return this.titagent;
	}

	public void setTitagent(String titagent) {
		this.titagent = titagent;
	}

}