package org.bg.bpo.register.dbconnection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.bg.bpo.register.entities.schema_tmview.Mark;

public class DatabaseConnector {
	private static DatabaseConnector instance = null;
	
	private static final String PERSISTENCE_UNIT_NAME = "bpo.register.ws.provider";
	
	private EntityManagerFactory factory;
	private EntityManager entityManager;
	
	public static DatabaseConnector getInstance() {
		if (instance == null) {
            instance = new DatabaseConnector();
        }
        return instance;
	}
	
	private DatabaseConnector() {
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		entityManager = factory.createEntityManager();
	}
	
	public Mark getAppNum(String appNumber) {
		QueryMaker queryMaker = new QueryMaker(entityManager);
		return queryMaker.makeAppNum(appNumber);
	}

}
