package org.bg.bpo.register.dbconnection;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.bg.bpo.register.entities.schema_tmview.Mark;
import org.bg.bpo.register.exception.ResultSetTooBigException;

public class DatabaseConnector {
	private static DatabaseConnector instance = null;
	
	private static final String PERSISTENCE_UNIT_NAME = "bpo.register.ws.provider";
	
	private EntityManagerFactory factory;
	private EntityManager entityManager;
	private QueryMaker queryMaker;
	
	public static DatabaseConnector getInstance() {
		if (instance == null) {
            instance = new DatabaseConnector();
        }
        return instance;
	}
	
	private DatabaseConnector() {
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		entityManager = factory.createEntityManager();
		queryMaker = new QueryMaker(entityManager, 500);
	}
	
	public Mark getMarkByAppNum(String appNumber) {
		return queryMaker.makeMarkNumberQuery(appNumber);
	}
	
	public List<Mark> getMarksByOwnerName(String firstName, String middleName, String lastName) throws ResultSetTooBigException {
		return queryMaker.makeMarkOwnerNameQuery(firstName, middleName, lastName);
	}
	
	public List<Mark> getMarksByAppName(String name) throws ResultSetTooBigException {
		return queryMaker.makeMarkNameQuery(name);
	}
	
	public List<Mark> getMarksByRegNum(int number) throws ResultSetTooBigException {
		return queryMaker.makeMarkRegistrationNumberQuery(number);
	}

	public String getMarkCurrentStatusCodeForMark(Integer lgstmark) {
		return queryMaker.makeMarkCurrentStatusCodeQuery(lgstmark);
	}
	
	public String getImageCategory(String idappli) {
		return queryMaker.makeMarkImageCategoryQuery(idappli);
	}

}
