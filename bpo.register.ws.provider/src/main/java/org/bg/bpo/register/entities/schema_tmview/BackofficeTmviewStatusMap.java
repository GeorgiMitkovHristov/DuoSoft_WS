package org.bg.bpo.register.entities.schema_tmview;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the backoffice_tmview_status_map database table.
 * 
 */
@Entity
@Table(name="backoffice_tmview_status_map", schema="tmview")
@NamedQuery(name="BackofficeTmviewStatusMap.findAll", query="SELECT b FROM BackofficeTmviewStatusMap b")
public class BackofficeTmviewStatusMap implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="BACKOFFICE_TMVIEW_STATUS_MAP_ID_GENERATOR", sequenceName="ORDER_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="BACKOFFICE_TMVIEW_STATUS_MAP_ID_GENERATOR")
	private Integer id;

	@Column(name="backoffice_status_id")
	private Integer backofficeStatusId;

	@Column(name="for_deletion")
	private Integer forDeletion;

	@Column(name="tmview_detailed_code")
	private String tmviewDetailedCode;

	@Column(name="tmview_list_code")
	private String tmviewListCode;

	public BackofficeTmviewStatusMap() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getBackofficeStatusId() {
		return this.backofficeStatusId;
	}

	public void setBackofficeStatusId(Integer backofficeStatusId) {
		this.backofficeStatusId = backofficeStatusId;
	}

	public Integer getForDeletion() {
		return this.forDeletion;
	}

	public void setForDeletion(Integer forDeletion) {
		this.forDeletion = forDeletion;
	}

	public String getTmviewDetailedCode() {
		return this.tmviewDetailedCode;
	}

	public void setTmviewDetailedCode(String tmviewDetailedCode) {
		this.tmviewDetailedCode = tmviewDetailedCode;
	}

	public String getTmviewListCode() {
		return this.tmviewListCode;
	}

	public void setTmviewListCode(String tmviewListCode) {
		this.tmviewListCode = tmviewListCode;
	}

}