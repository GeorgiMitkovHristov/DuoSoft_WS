package org.bg.bpo.register.dbconnection;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.persistence.metamodel.EntityType;
import javax.persistence.metamodel.Metamodel;

import org.bg.bpo.register.entities.schema_public.Owner;
import org.bg.bpo.register.entities.schema_tmview.BackofficeTmviewStatusMap;
import org.bg.bpo.register.entities.schema_tmview.Categpict;
import org.bg.bpo.register.entities.schema_tmview.Mark;
import org.bg.bpo.register.entities.schema_tmview.Own;
import org.bg.bpo.register.exception.ResultSetTooBigException;
import org.jdal.dao.jpa.JpaUtils;

public class QueryMaker {
	private EntityManager entityManager;
	private CriteriaBuilder criteriaBuilder;
	private final long resultSetSizeThreshold;

	public QueryMaker(EntityManager entityManager, long size) {
		this.entityManager = entityManager;
		criteriaBuilder = entityManager.getCriteriaBuilder();
		resultSetSizeThreshold = size;
	}

	public Mark makeMarkNumberQuery(String appNumber) {
		return entityManager.find(Mark.class, appNumber);
	}
	
	public List<Mark> makeMarkRegistrationNumberQuery(int number) throws ResultSetTooBigException {
		CriteriaQuery<Mark> criteria = criteriaBuilder.createQuery(Mark.class);
		Metamodel model = entityManager.getMetamodel();
		EntityType<Mark> Mark_ = model.entity(Mark.class);
		Root<Mark> markRoot = criteria.from(Mark.class);
		criteria.select(markRoot);
		criteria.where(criteriaBuilder.equal(markRoot.get(Mark_.getDeclaredSingularAttribute("idmark")), number));
		return executeQuery(criteria);
	}
	
	public List<Mark> makeMarkOwnerNameQuery(String firstName, String middleName, String lastName) throws ResultSetTooBigException {
		CriteriaQuery<Mark> criteria = criteriaBuilder.createQuery(Mark.class);
		Root<Mark> markRoot = criteria.from(Mark.class);
		Metamodel model = entityManager.getMetamodel();
		EntityType<Owner> Owner_ = model.entity(Owner.class);
		
		Join<Mark, Own> own = markRoot.join("idappli");
		Join<Own, Owner> owner = own.join("idowner");
		
		Predicate lastNamePredicate = criteriaBuilder.equal(owner.get(Owner_.getDeclaredSingularAttribute("nmowner")), lastName);
		Predicate middleNamePredicate = criteriaBuilder.equal(owner.get(Owner_.getDeclaredSingularAttribute("midnowner")), middleName);
		Predicate firstNamePredicate = criteriaBuilder.equal(owner.get(Owner_.getDeclaredSingularAttribute("fnowner")), firstName);
		
		int mask = resolvePredicate(firstName, middleName, lastName);
		switch (mask) {
			case 0:
				break;
			case 1:
				criteria.where(lastNamePredicate);
				break;
			case 2:
				criteria.where(middleNamePredicate);
				break;
			case 3:
				criteria.where(criteriaBuilder.or(lastNamePredicate, middleNamePredicate));
				break;
			case 4:
				criteria.where(firstNamePredicate);
				break;
			case 5:
				criteria.where(criteriaBuilder.or(lastNamePredicate, firstNamePredicate));
				break;
			case 6:
				criteria.where(criteriaBuilder.or(firstNamePredicate, middleNamePredicate));
				break;
			case 7:
				criteria.where(criteriaBuilder.or(lastNamePredicate,middleNamePredicate, firstNamePredicate));
				break;
		}
		
		return executeQuery(criteria);
	}
	
	public List<Mark> makeMarkNameQuery(String name) throws ResultSetTooBigException {
		CriteriaQuery<Mark> criteria = criteriaBuilder.createQuery(Mark.class);
		Metamodel model = entityManager.getMetamodel();
		EntityType<Mark> Mark_ = model.entity(Mark.class);
		Root<Mark> markRoot = criteria.from(Mark.class);
		criteria.select(markRoot);
		criteria.where(criteriaBuilder.equal(markRoot.get(Mark_.getDeclaredSingularAttribute("deno")), name));
		return executeQuery(criteria);
	}
	
	private int resolvePredicate(String firstName, String middleName, String lastName) {
		int mask = 0;
		if (firstName.length() > 0) {
			mask |= 4;
		}
		if (middleName.length() > 0) {
			mask |= 2;
		}
		if (lastName.length() > 0) {
			mask |= 1;
		}
		return mask;
	}
	
	private List<Mark> executeQuery(CriteriaQuery<Mark> query) throws ResultSetTooBigException {
		final long count = determineResultSize(query);
		if (count >= resultSetSizeThreshold) {
			throw new ResultSetTooBigException();
		}
		return entityManager.createQuery(query).getResultList();
	}

	private long determineResultSize(CriteriaQuery<Mark> query) {
		return JpaUtils.count(entityManager, query);
	}

	public String makeMarkImageCategoryQuery(String idappli) {
		CriteriaQuery<Categpict> criteria = criteriaBuilder.createQuery(Categpict.class);
		Metamodel model = entityManager.getMetamodel();
		EntityType<Categpict> Cat_ = model.entity(Categpict.class);
		Root<Categpict> catRoot = criteria.from(Categpict.class);
		criteria.select(catRoot);
		criteria.where(criteriaBuilder.equal(catRoot.get(Cat_.getDeclaredSingularAttribute("idappli")), idappli));
		return entityManager.createQuery(criteria).getResultList().get(0).getId().getIdcategory();
	}
	
	public String makeMarkCurrentStatusCodeQuery(Integer lgstmark) {
		CriteriaQuery<BackofficeTmviewStatusMap> criteria = criteriaBuilder.createQuery(BackofficeTmviewStatusMap.class);
		Metamodel model = entityManager.getMetamodel();
		EntityType<BackofficeTmviewStatusMap> Map_ = model.entity(BackofficeTmviewStatusMap.class);
		Root<BackofficeTmviewStatusMap> mapRoot = criteria.from(BackofficeTmviewStatusMap.class);
		criteria.select(mapRoot);
		criteria.where(criteriaBuilder.equal(mapRoot.get(Map_.getDeclaredSingularAttribute("backoffice_status_id")), lgstmark));
		return entityManager.createQuery(criteria).getResultList().get(0).getTmviewDetailedCode();
	}
}
