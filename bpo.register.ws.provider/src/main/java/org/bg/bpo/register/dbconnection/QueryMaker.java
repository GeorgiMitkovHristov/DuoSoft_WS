package org.bg.bpo.register.dbconnection;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.persistence.metamodel.EntityType;
import javax.persistence.metamodel.Metamodel;
import javax.persistence.metamodel.SingularAttribute;

import org.bg.bpo.register.entities.schema_tmview.Mark;

public class QueryMaker {
	private EntityManager entityManager;
	private CriteriaBuilder criteriaBuilder;

	public QueryMaker(EntityManager entityManager) {
		this.entityManager = entityManager;
		criteriaBuilder = entityManager.getCriteriaBuilder();
	}

	public Mark makeMarkNumberQuery(String appNumber) {
		return entityManager.find(Mark.class, appNumber);
	}
	
	public List<Mark> makeMarkRegistrationNumberQuery(int number) {
		CriteriaQuery<Mark> criteria = criteriaBuilder.createQuery(Mark.class);
		Metamodel model = entityManager.getMetamodel();
		EntityType<Mark> Mark_ = model.entity(Mark.class);
		Root<Mark> markRoot = criteria.from(Mark.class);
		criteria.select(markRoot);
		criteria.where(criteriaBuilder.equal(markRoot.get(Mark_.getDeclaredSingularAttribute("idmark")), number));
		return entityManager.createQuery(criteria).getResultList();
	}
	
	public List<Mark> makeMarkOwnerNameQuery(String firstName, String middleName, String lastName) {
		return null;
	}
	
	public List<Mark> makeMarkNameQuery(String name) {
		CriteriaQuery<Mark> criteria = criteriaBuilder.createQuery(Mark.class);
		Metamodel model = entityManager.getMetamodel();
		EntityType<Mark> Mark_ = model.entity(Mark.class);
		Root<Mark> markRoot = criteria.from(Mark.class);
		criteria.select(markRoot);
		criteria.where(criteriaBuilder.equal(markRoot.get(Mark_.getDeclaredSingularAttribute("deno")), name));
		return entityManager.createQuery(criteria).getResultList();
	}
}
