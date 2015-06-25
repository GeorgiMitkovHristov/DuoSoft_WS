package org.bg.bpo.register.dbconnection;

import javax.persistence.EntityManager;

import org.bg.bpo.register.entities.schema_tmview.Mark;

public class QueryMaker {
	private EntityManager entityManager;

	public QueryMaker(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public Mark makeAppNum(String appNumber) {
		return entityManager.find(Mark.class, appNumber);
	}
}
