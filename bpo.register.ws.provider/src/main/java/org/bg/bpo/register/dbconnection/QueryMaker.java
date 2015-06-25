package org.bg.bpo.register.dbconnection;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;

import org.bg.bpo.register.entities.schema_tmview.Mark;

public class QueryMaker {
	private EntityManager entityManager;
	private CriteriaBuilder criteriaBuilder;

	public QueryMaker(EntityManager entityManager) {
		this.entityManager = entityManager;
		criteriaBuilder = entityManager.getCriteriaBuilder();
	}

	public Mark makeAppNumQuery(String appNumber) {
		entityManager.getCriteriaBuilder();
		return entityManager.find(Mark.class, appNumber);
	}
	
	public List<Mark> makeAppRegNumQuery(int number) {
		return null;
	}
	
	public List<Mark> makeOwnerNameQuery(String firstName, String middleName, String lastName) {
		return null;
	}
	
	public List<Mark> makeAppNameQuery(String name) {
		return null;
	}
}
